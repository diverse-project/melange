package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import com.google.inject.Injector
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import java.util.List
import java.util.Stack
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IFolder

class AspectCopier2{
	
	@Inject ModelUtils modelUtils
	@Inject AspectRenamer renamer
	@Inject EclipseProjectHelper eclipseHelper
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension AspectExtensions aspectExtension
	@Inject Injector injector
	
	def SetMultimap<String,String> copyAspect(Language l, Language targetLang, Stack<List<PackageBinding>> stack){
		// Map package.uniqueId to emfFqn
		val SetMultimap<String,String> mappings = HashMultimap.create
	
		/*
		 * 1. Copy aspects from dependencies
		 */
		l.operators.filter(LanguageOperator).forEach[depLang|
			if(depLang instanceof Inheritance){
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack)
				//Store possible package renaming from depLang
				mappings.putAll(deepMapping)
			}
			else if(depLang instanceof Slice){
				stack.push(depLang.mappingRules)
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack)
				stack.pop
				//Store possible package renaming from depLang
				deepMapping.keySet.forEach[pkgName|
					val emfPkgs = deepMapping.get(pkgName)
					val newPkgName = pkgName.renameWith(depLang.mappingRules)
					mappings.putAll(newPkgName,emfPkgs)
				]
			}
			else if(depLang instanceof Merge){
				stack.push(depLang.mappingRules)
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack)
				stack.pop
				//Store possible package renaming from depLang
				deepMapping.keySet.forEach[pkgName|
					val emfPkgs = deepMapping.get(pkgName)
					val newPkgName = pkgName.renameWith(depLang.mappingRules)
					mappings.putAll(newPkgName,emfPkgs)
				]
			}
		]
		
		/*
		 * 2. Compute possible package renaming
		 */
		mappings.putAll(l.mappingFromSyntax)
		mappings.putAll(l.mappingFromLanguageOp)
	
		/*
		 * 3. Copy aspects from 'with'
		 */
		copyLocalAspects(l,targetLang,mappings,stack)
	
		
		return mappings
	}
	
	/**
	 * Get package renaming from 'with' operators
	 */
	def mappingFromSyntax(Language sourceLang){
		val res = HashMultimap.create
		sourceLang.operators.filter(Import).forEach[ecore |
			//TODO: use EPackageProvider
			val genModelUri = ecore.genmodelUris.head
				?: ecore.ecoreUri.substring(0, ecore.ecoreUri.lastIndexOf(".")) + ".genmodel"
					
			val genmodel = modelUtils.loadGenmodel(genModelUri)
			
			genmodel.allGenPkgs.forEach[genPkg|
				val emfFqn = genPkg.qualifiedPackageName
				val packageFqn = genPkg.getEcorePackage.uniqueId.renameWith(ecore.mappingRules)
				res.put(packageFqn,emfFqn)
			]
		]
		return res
	}

	/**
	 * Get package renaming from 'merge', 'slice' and 'inherits' operators
	 */
	def mappingFromLanguageOp(Language sourceLanguage){
		val res = HashMultimap.create
		sourceLanguage.operators.filter(LanguageOperator).forEach[
			res.putAll(mappingFromLanguageOp)
		]
		return res
	}

	/**
	 * Get package renaming from {@link op}
	 */
	def mappingFromLanguageOp(LanguageOperator op){
		//TODO: get also namespaces from op's Import
		val res = HashMultimap.create
			op.owningLanguage.syntax.pkgs.forEach[pkg|
				val emfFqn = op.owningLanguage.fullyQualifiedName.toLowerCase + "." + pkg.uniqueId
				val packageFqn =
					switch(op){
						Inheritance : {
								pkg.uniqueId
								}
						Slice : {
								pkg.uniqueId.renameWith(op.mappingRules)
								}
						Merge : {
								pkg.uniqueId.renameWith(op.mappingRules)
								}
					}
				res.put(packageFqn,emfFqn)
			]
		return res
	}
	
	def String renameWith(String pkgFqn, List<PackageBinding> rules){
		val firstMatch = rules.findFirst[from == pkgFqn]
		if(firstMatch !== null)
			return firstMatch.to
		return pkgFqn
	}
	
	/**
	 * Copy aspects declared in {@link currentLang} into the project of {@link targetLang} 
	 */
	def void copyLocalAspects(Language currentLang, Language targetLang, SetMultimap<String,String> mapping, Stack<List<PackageBinding>> stack){
		val localAspRef = currentLang.localSemantics.map[aspectTypeRef]

		/*
		 * 1. Find files
		 */
		val List<IFile> toBeCopied = newArrayList
		val ws = ResourcesPlugin.workspace.root
		ws.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					val firstMatch = localAspRef.findFirst[ref|
						val pattern1 = ref.identifier.replace(".", "/") + ".java"
						val pattern2 = ref.contextFqn.replace(".", "/") + ".java"
						val pattern3 = ref.propertiesFqn.replace(".", "/") + ".java"
	
						return resource.locationURI.path.endsWith(pattern1)
							|| resource.locationURI.path.endsWith(pattern2)
							|| resource.locationURI.path.endsWith(pattern3)
					]
					if (firstMatch !== null){
						toBeCopied.add(resource)
					}
					return false
				}
				return true
			}
		})
	
		/*
		 * 2. Copy
		 */
		val targetProject = ws.getProject(targetLang.externalRuntimeName)
		val targetAspectFolder = targetProject.getFolder("src-gen/" + targetLang.aspectsNamespace.replace(".", "/"))
		targetAspectFolder.createFolder
		toBeCopied.forEach[file|
			val destFile = targetAspectFolder.getFile(file.name)
			destFile.create(file.contents, true, null)
		]
		
		/*
		 * 3. Rename
		 */
		val finalRenaming = stack.flatten
		val toRemove = newArrayList
		val toAdd = newArrayList
		
		// a. Renaming rules: add prefix to 'from'
		mapping.keySet.forEach[pkgName|
			val possibleEmfNames = mapping.get(pkgName)
			val firstMatch = finalRenaming.findFirst[from == pkgName]
			if(firstMatch !== null){
				possibleEmfNames.forEach[emfName |
					val copy = EcoreUtil.copy(firstMatch)
					copy.from = emfName
					toAdd.add(copy)
				]
				toRemove.add(firstMatch)
			}
			else{
				possibleEmfNames.forEach[emfName |
					val PackageBinding newRule = MelangePackage.eINSTANCE.EFactoryInstance.create(MelangePackage.eINSTANCE.packageBinding) as PackageBinding
					newRule.from = emfName
					newRule.to = pkgName
					toAdd.add(newRule)
				]
			}
		]
		finalRenaming.removeAll(toRemove)
		finalRenaming.addAll(toAdd)
		
		// b. Renaming rules: add prefix to 'to'
		finalRenaming.forEach[rule|
			rule.to = targetLang.fullyQualifiedName.toLowerCase + "." + rule.to
		]
		
		// c. Apply renaming rules on copied aspects
		val renamingManager = new RenamingRuleManager(finalRenaming,currentLang.localSemantics,aspectExtension)
		renamer.processRenaming(currentLang.localSemantics, targetLang, newArrayList(renamingManager))
	}
	
	def getContextFqn(JvmTypeReference aspRef){
		val prefix = aspRef.identifier.replaceAll("\\.", "/")
		val targetCls = aspRef.simpleAspectAnnotationValue
		return '''«prefix»«targetCls»AspectContext'''
	}

	def getPropertiesFqn(JvmTypeReference aspRef){
		val prefix = aspRef.identifier.replaceAll("\\.", "/")
		val targetCls = aspRef.simpleAspectAnnotationValue
		return '''«prefix»«targetCls»AspectProperties'''
	}
	
	/**
	 * Merge sequentially all stages of the {@link stack} to get the
	 * final transitive renaming
	 */
	def List<PackageBinding> flatten(Stack<List<PackageBinding>> stack){
		val res = newArrayList
		stack.reverseView.forEach[rules |
			res.apply(rules)
		]
		return res
	}
	
	/**
	 * Merge {@link newRules} in {@link base} to have a transitive renaming
	 */
	def void apply(List<PackageBinding> base, List<PackageBinding> newRules){
		newRules.forEach[newRule|
			//Rename pkgs
			val toRename = base.filter[to.startsWith(newRule.from)]
			toRename.forEach[ baseRule |
				baseRule.to.replaceFirst(newRule.from,newRule.to)
			]
			
			//Update pkg content
			val toUpdate = base.findFirst[to == newRule.to]
			if(toUpdate !== null){
				newRule.classes.forEach[newCls|
					val clsRename = toUpdate.classes.findFirst[to == newCls.from]
					if(clsRename !== null){
						//Rename classe
						clsRename.to = newCls.to
						
						//Update classe content
						newCls.properties.forEach[newProp|
							val propRename = clsRename.properties.findFirst[to == newProp.from]
							if(propRename !== null){
								//Rename property
								propRename.to = newProp.to
							}
							else{
								//Add property
								clsRename.properties.add(newProp)
							}
						]
					}
					else{
						//Add classe
						toUpdate.classes.add(newCls)
					}
				]
			}
			
			//Add new rules
			if(toRename.isEmpty){
				base.add(newRule)
			}
		]
	}
	
	def void createFolder(IFolder folder){
		val parent = folder.parent
		if(parent instanceof IFolder)
			createFolder(parent)
		if(!folder.exists)
			folder.create(false,true,null)
	}
}