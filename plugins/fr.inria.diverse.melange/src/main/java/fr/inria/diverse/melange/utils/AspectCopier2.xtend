package fr.inria.diverse.melange.utils

import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
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
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceVisitor
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.common.types.JvmDeclaredType

class AspectCopier2 {
	
	@Inject ModelUtils modelUtils
	@Inject AspectRenamer renamer
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension AspectExtensions aspectExtension
	@Inject ModelTypingSpaceBuilder modelTypingSpaceBuilder
	
	/**
	 * Copy all aspects from {@link sourceLang} into the Eclipse
	 * project of {@link targetLang}
	 */
	def SetMultimap<String,String> copyAspect(Language sourceLang, Language targetLang) {
		copyAspect(sourceLang,targetLang,new Stack,null)
	}
	
	private def SetMultimap<String,String> copyAspect(Language l, Language targetLang, Stack<List<PackageBinding>> stack, List<EClass> sliceClasses) {
		// Map package.uniqueId to emfFqn
		val SetMultimap<String,String> realPkgNames = HashMultimap.create
	
		/*
		 * 1. Copy aspects from dependencies
		 */
		l.operators.filter(LanguageOperator).forEach[depLang|
			if(depLang instanceof Inheritance){
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack,sliceClasses)
				//Store possible package renaming from depLang
				realPkgNames.putAll(deepMapping)
			}
			else if(depLang instanceof Slice){
				stack.push(depLang.mappingRules)
				val opBuilders = modelTypingSpaceBuilder.findBuilder(l).subBuilders
				val sliceBuilder = opBuilders.findFirst[source == depLang]
				val opSliceClasses = sliceBuilder.model.map[allClasses].flatten.toList
				val renamedSlice = intersection(sliceClasses,opSliceClasses)
				val newSlice = reverseRenaming(renamedSlice, depLang.targetLanguage, depLang.mappingRules)
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack,newSlice)
				stack.pop
				//Store possible package renaming from depLang
				deepMapping.keySet.forEach[pkgName|
					val emfPkgs = deepMapping.get(pkgName)
					val newPkgName = pkgName.renameWith(depLang.mappingRules)
					realPkgNames.putAll(newPkgName,emfPkgs)
				]
			}
			else if(depLang instanceof Merge){
				stack.push(depLang.mappingRules)
				val deepMapping = copyAspect(depLang.targetLanguage,targetLang,stack,sliceClasses)
				stack.pop
				//Store possible package renaming from depLang
				deepMapping.keySet.forEach[pkgName|
					val emfPkgs = deepMapping.get(pkgName)
					val newPkgName = pkgName.renameWith(depLang.mappingRules)
					realPkgNames.putAll(newPkgName,emfPkgs)
				]
			}
		]
		
		/*
		 * 2. Compute possible package renaming
		 */
		realPkgNames.putAll(l.mappingFromSyntax)
		realPkgNames.putAll(l.mappingFromLanguageOp)
	
		/*
		 * 3. Copy aspects from 'with'
		 */
		copyLocalAspects(l,targetLang,realPkgNames,stack,sliceClasses)
	
		
		return realPkgNames
	}
	
	/**
	 * Get package renaming from 'with' operators.
	 * 
	 * Return the associations of EPackage with generated Java Class
	 * (use full qualified names)
	 */
	private def SetMultimap<String,String> mappingFromSyntax(Language sourceLang) {
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
	 * Get package renaming from 'merge', 'slice' and 'inherits' operators.
	 * 
	 * Return the associations of EPackage with generated Java Class
	 * (use full qualified names)
	 */
	private def SetMultimap<String,String> mappingFromLanguageOp(Language sourceLanguage) {
		val res = HashMultimap.create
		sourceLanguage.operators.filter(LanguageOperator).forEach[
			res.putAll(mappingFromLanguageOp)
		]
		return res
	}

	/**
	 * Get package renaming from {@link op}.
	 * 
	 * Return the associations of EPackage with generated Java Class
	 * (use full qualified names)
	 */
	private def SetMultimap<String,String> mappingFromLanguageOp(LanguageOperator op) {
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
	
	/**
	 * Return the new name for the EPackage {@link pkFng}.
	 * If nothing match in {@link rules}, return {@link pkFng}.
	 */
	private def String renameWith(String pkgFqn, List<PackageBinding> rules) {
		val firstMatch = rules.findFirst[from == pkgFqn]
		if(firstMatch !== null)
			return firstMatch.to
		return pkgFqn
	}
	
	/**
	 * Copy aspects declared in {@link currentLang} into the project of {@link targetLang} 
	 */
	private def void copyLocalAspects(Language currentLang, Language targetLang, SetMultimap<String,String> realPkgNames, Stack<List<PackageBinding>> stack, List<EClass> sliceClasses) {
		
		val localAspSliced = 
			if(sliceClasses !== null)
				currentLang.localSemantics
				.filter[asp |
					sliceClasses.exists[fullyQualifiedName == asp.aspectedClass?.fullyQualifiedName]
				].toList
			else
				currentLang.localSemantics
			
		val localWeaveRef = localAspSliced.map[source.aspectTypeRef]

		/*
		 * 1. Find files
		 */
		val List<IFile> toBeCopied = newArrayList
		val ws = ResourcesPlugin.workspace.root
		ws.accept(new IResourceVisitor {
			override visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					val firstMatch = localWeaveRef.findFirst[ref|
						val pattern1 = ref.identifier.replace(".", "/") + ".java"
						val pattern2 = ref.contextFqn.replace(".", "/") + ".java"
						val pattern3 = ref.propertiesFqn.replace(".", "/") + ".java"
	
						return resource.locationURI.path.endsWith("src-gen/"+pattern1)
							|| resource.locationURI.path.endsWith("src-gen/"+pattern2)
							|| resource.locationURI.path.endsWith("src-gen/"+pattern3)
							|| resource.locationURI.path.endsWith("xtend-gen/"+pattern1)
							|| resource.locationURI.path.endsWith("xtend-gen/"+pattern2)
							|| resource.locationURI.path.endsWith("xtend-gen/"+pattern3)
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
		realPkgNames.keySet.forEach[pkgName|
			val possibleEmfNames = realPkgNames.get(pkgName)
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
		
		// c. Get namespaces of aspects that may be used by local aspects
		val sourceAspectNs = currentLang
			.allDependencies
			.map[localSemantics]
			.flatten
			.map[(source.aspectTypeRef.type as JvmDeclaredType).packageName]
			.toSet
		
		// d. Apply renaming rules on copied aspects
		val renamingManager = new RenamingRuleManager(finalRenaming,localAspSliced,aspectExtension)
		renamer.processRenaming(localAspSliced, targetLang, sourceAspectNs, newArrayList(renamingManager))
	}
	
	private def String getContextFqn(JvmTypeReference aspRef) {
		val prefix = aspRef.identifier.replaceAll("\\.", "/")
		val targetCls = aspRef.simpleAspectAnnotationValue
		return '''«prefix»«targetCls»AspectContext'''
	}

	private def String getPropertiesFqn(JvmTypeReference aspRef) {
		val prefix = aspRef.identifier.replaceAll("\\.", "/")
		val targetCls = aspRef.simpleAspectAnnotationValue
		return '''«prefix»«targetCls»AspectProperties'''
	}
	
	/**
	 * Merge sequentially all stages of the {@link stack} to get the
	 * final transitive renaming
	 */
	static def List<PackageBinding> flatten(Stack<List<PackageBinding>> stack) {
		val res = newArrayList
		stack.reverseView.forEach[rules |
			res.apply(rules)
		]
		return res
	}
	
	/**
	 * Merge {@link newRules} in {@link base} to have a transitive renaming
	 */
	static private def void apply(List<PackageBinding> base, List<PackageBinding> newRules) {
		newRules
		.sortBy[from.length].reverseView // look long names first
		.forEach[newRule|
			//Rename pkgs
			val toRename = base.filter[
	             to == newRule.from
	             || to.startsWith(newRule.from+".")
	         ]
			toRename.forEach[ baseRule |
				baseRule.to = baseRule.to.replaceFirst(newRule.from,newRule.to)
			]
			
			//Update pkg content
			val toUpdate = base.findFirst[to == newRule.to]
			if(toUpdate !== null){
				newRule.classes.forEach[newCls|
					val clsRename = toUpdate.classes.findFirst[to == newCls.from]
					if(clsRename !== null){
						//Rename class
						clsRename.to = newCls.to
						
						//Update class content
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
						//Add class
						toUpdate.classes.add(newCls)
					}
				]
			}
			
			//Add new rules
			if(toRename.isEmpty){
				base.add(EcoreUtil::copy(newRule))
			}
		]
	}
	
	private def void createFolder(IFolder folder) {
		val parent = folder.parent
		if(parent instanceof IFolder)
			createFolder(parent)
		if(!folder.exists)
			folder.create(false,true,null)
	}
	
	/*
	 * Return the subset of l2 contained in l1
	 * Return l2 if l1 is null
	 * l1 is in the post mapping space
	 * l2 is in the pre mapping space 
	 */
	private def List<EClass> intersection(List<EClass> l1, List<EClass> l2) {
		if(l1 === null) return l2
		
		val res = newArrayList
		res.addAll(
			l2.filter[cls2|
				l1.exists[cls1 |
					cls1.uniqueId == cls2.uniqueId
				]
			]
		)
		return res
	}
	
	/**
	 * Return classes from {@link origin} corresponding to {@link classes} through {@link mapping}
	 */
	private def List<EClass> reverseRenaming(List<EClass> classes, Language origin, List<PackageBinding> mapping) {
		val res = newArrayList
		val originPool = origin.syntax.allClasses
		
		classes.forEach[cls |
			val pkg = cls.EPackage.uniqueId
			val pkgRule = mapping.findFirst[pkgRule | pkgRule.to == pkg]
			val clsRule = pkgRule?.classes?.findFirst[clsRule | clsRule.to == cls.name]
			val realClsName = 
				if(clsRule !== null)
					pkgRule.from +"." + clsRule.from
				else if(pkgRule !== null)
					pkgRule.from +"." + cls.name
				else
					cls.uniqueId
			
			val originCls = originPool.findFirst[originCls |
				originCls.uniqueId == realClsName
			]
			if(originCls !== null)
				res.add(originCls)
			
		]
				
		return res
	}
}