package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.utils.AspectCopier
import fr.inria.diverse.melange.utils.AspectRenamer
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import fr.inria.diverse.melange.utils.RenamingRuleManager
import fr.inria.diverse.melange.metamodel.melange.Weave
import org.eclipse.emf.common.util.URI
import java.util.ArrayList

class LanguageExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension AspectExtensions aspectExtension
	@Inject extension ModelTypeExtensions
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	@Inject ModelTypeAlgebra algebra
	@Inject AspectCopier copier
	@Inject AspectRenamer renamer
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	def List<Language> getSuperLanguages(Language l) {
		return l.operators.filter(Inheritance).map[targetLanguage].toList
	}

	def List<Language> getAllSuperLanguages(Language l) {
		val ret = newArrayList
		ret += l.superLanguages
		ret += l.operators.filter(Inheritance).map[targetLanguage.allSuperLanguages].flatten
		return ret
	}

	def boolean getIsComplete(Language l) {
		return l.name !== null && l.syntax !== null && l.syntax.isComplete && l.semantics.forall[isComplete]
	}

	/**
	 * Get all aspects defined on the language.
	 * The priority order is: <br>
	 * 1) Aspects explicitly defined in the definition of {@link l}, in top->bottom order <br>
	 * 2) From Merge relations, in top->bottom order
	 * 3) From Inheritance relations, in the left->right order <br>
	 */
	def List<JvmTypeReference> allAspects(Language l) {
		val res = newArrayList

		res += l.operators.filter(Inheritance).map[targetLanguage.allAspects].flatten		
		res +=
			l.operators.map[op |
				if (op instanceof Slice)
					op.targetLanguage.allAspects
				else if (op instanceof Merge)
					op.targetLanguage.allAspects
				else
					newArrayList
			].flatten
		res += l.operators.filter(Weave).map[aspectTypeRef]

		return res.reverse
	}
	
	//TODO: merge with createExternalAspect()
	def List<Aspect> allSemantics(Language l) {
		
		if(l.generatedByMelange){ //Aspects were ordered when they were copied
			return l.semantics
		}
		else{
			val res = newArrayList
			l.semantics.reverseView.forEach[a1 |
				if (!res.exists[Aspect a2 | a2.aspectTypeRef.identifier == a1.aspectTypeRef.identifier]
					&& (!a1.hasAspectAnnotation || l.syntax.pkgs.head.allClasses.exists[cls | cls.name == a1.aspectedClass.name]))
				{
					res += a1
				}
			]
			return res
		}
	}

//	def List<Aspect> allSemantics(Language l) {
//		val tmp = newArrayList
//		
//		tmp += l.superLanguages.map[allSemantics].flatten
//		tmp +=
//			l.operators.map[op |
//				if (op instanceof Slice)
//					op.targetLanguage.allSemantics
//				else if (op instanceof Merge)
//					op.targetLanguage.allSemantics
//				else
//					newArrayList
//			].flatten
//		tmp += l.semantics
//
//		val res = newArrayList
//		tmp.forEach[a1 |
//			if (!res.exists[Aspect a2 | a2.aspectTypeRef.identifier == a1.aspectTypeRef.identifier]
//				&& (!a1.hasAspectAnnotation || l.syntax.pkgs.head.allClasses.exists[cls | cls.name == a1.aspectedClass.name])
//			)
//				res += a1
//		]
//		return res.reverse
//	}

	def Iterable<Aspect> findAspectsOn(Language l, EClass cls) {
		return
			l.allSemantics.filter[asp |
				asp.aspectedClass?.name !== null
				&& (
				   asp.aspectedClass.name == cls.name
				|| cls.EAllSuperTypes.exists[asp.aspectedClass.name == name]
				)
			]
	}

	def boolean isTypedBy(Language l, ModelType mt) {
		return algebra.isTypedBy(l, mt)
	}

	def boolean hasSuperLanguage(Language l) {
		return l.operators.filter(Inheritance).exists[targetLanguage !== null]
	}

	def boolean hasAdapterFor(Language l, ModelType mt, EClassifier cls) {
		return l.hasAdapterFor(mt, cls.name)
	}

	def boolean hasAdapterFor(Language l, ModelType mt, String find) {
		val syntaxFind = l.syntax.allClasses.findFirst[name == find]

		return
		   l.^implements.exists[name == mt.name]
		&& syntaxFind !== null
		&& mt.allClasses.exists[name == find]
		&& syntaxFind.abstractable
	}

	def boolean isUml(Language l, EClassifier cls) {
		return l.syntax.pkgs.findFirst[EClassifiers.exists[name == cls.name]] == "uml"
	}

	def String getExternalPackageUri(Language l) {
		return '''http://«l.name.toLowerCase»/'''
	}

	def void createLocalEcore(Language l) {
		l.syntax.createEcore(l.localEcoreUri, l.externalPackageUri)
	}

	def void createLocalGenmodel(Language l) {
		l.syntax.createGenmodel(l.localEcoreUri, l.localGenmodelUri, l.localGenerationPath)
	}

	def void createExternalEcore(Language l) {
		l.syntax.createEcore(l.externalEcoreUri, l.externalPackageUri)
	}

	def void createExternalGenmodel(Language l) {
		l.syntax.createGenmodel(l.externalEcoreUri, l.externalGenmodelUri, l.externalGenerationPath)
	}

	def String getLocalEcorePath(Language l) {
		return '''../«l.eResource.project.name»/model-gen/«l.name».ecore'''
	}

	def String getLocalGenmodelPath(Language l) {
		return '''../«l.eResource.project.name»/model-gen/«l.name».genmodel'''
	}

	def String getLocalGenerationPath(Language l) {
		return '''../«l.eResource.project.name»/emf-gen/'''
	}

	def String getExternalEcorePath(Language l) {
		return '''../«l.externalRuntimeName»/model/«l.name».ecore'''
	}

	def String getExternalGenmodelPath(Language l) {
		return '''../«l.externalRuntimeName»/model/«l.name».genmodel'''
	}

	def String getExternalGenerationPath(Language l) {
		return '''../«l.externalRuntimeName»/src/'''
	}

	def String getLocalEcoreUri(Language l) {
		return '''platform:/resource/«l.eResource.project.name»/model-gen/«l.name».ecore'''
	}

	def String getLocalGenmodelUri(Language l) {
		return '''platform:/resource/«l.eResource.project.name»/model-gen/«l.name».genmodel'''
	}

	def String getExternalEcoreUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».ecore'''
	}

	def String getExternalGenmodelUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».genmodel'''
	}

	def String getAspectTargetNamespace(Language l) {
		return l.fullyQualifiedName.append("aspects").toLowerCase.toString
//		val postfix =
//			if (sourceAspectNamespace.segmentCount > 1
//				&& #["aspect", "aspects", "k3dsa"].contains(sourceAspectNamespace.lastSegment))
//				sourceAspectNamespace.lastSegment
//			else
//				"aspects"
//
//		if (sourceAspectNamespace.segmentCount > 2)
//			return sourceAspectNamespace.skipLast(2).append(l.name.toLowerCase).append(postfix)
//		else
//			return sourceAspectNamespace.skipLast(1).append(l.name.toLowerCase).append(postfix)
	}

	/**
	 * Get the name of the project containing Java classes reifying the metamodel {@link mm}
	 */
	def String getExternalRuntimeName(Language l) {
		return l.fullyQualifiedName.toLowerCase.toString
//		return l.name + "_Gen"
//		if (l.syntax.ecoreUri !== null) {
//			val originalProjectName = URI::createURI(l.syntax.ecoreUri).segment(1)
//
//			return originalProjectName
//		}
//		else{
//			return l.name + "_Gen"
//		}
//		 else if (mm.inheritanceRelation.superMetamodel.ecoreUri !== null) {
//			val originalProjectName = URI::createURI(mm.inheritanceRelation.superMetamodel.ecoreUri).segment(1)
//			
//			// compute a name as smartly as possible and try to follow the user naming convention
//			if (originalProjectName.toQualifiedName.segmentCount == 1){
//				return mm.name.toLowerCase
//			} else { 
//				if(originalProjectName.toQualifiedName.lastSegment.equals("model")){
//					return originalProjectName.toQualifiedName.skipLast(1).append(mm.name.toLowerCase).append("model").toString
//				} else {
//					return originalProjectName.toQualifiedName.append(mm.name.toLowerCase).toString
//				}
//				
//			}
//		}
	}

	def String getExternalAspectsRuntimeName(Language l) {
		val externalRuntimeName = l.externalRuntimeName.toQualifiedName
		if ("model" == externalRuntimeName.lastSegment)
			return externalRuntimeName.skipLast(1).append("aspects").toString
		else
			return externalRuntimeName.append("aspects").toString
	}

	/**
	 * Returns true if {@link l} must be generated by Melange.
	 */
	def boolean isGeneratedByMelange(Language l) {
		return
			   !l.operators.filter(Inheritance).empty
			|| !l.operators.filter(Merge).empty
			|| !l.operators.filter(Slice).empty
			|| l.operators.filter(Import).size > 1
	}

	/**
	 * Return true if ecore, genmodel & generated EMF packages can be found
	 * for the language {@link l}.
	 */
	def boolean getRuntimeHasBeenGenerated(Language l) {
		if (l.isGeneratedByMelange) {
			val segments = newArrayList
			val gp = l.syntax.genmodels.head?.genPackages?.head
			val project = l.eResource.project

			if (gp === null || project === null)
				return false

			if (gp.basePackage !== null && gp.basePackage.length > 0)
				segments += gp.basePackage
			if (gp.prefix !== null && gp.prefix.length > 0)
				segments += gp.prefix

			val fqn = QualifiedName::create(segments).toLowerCase.toString.replace(".", "/")
			if ((
				   project.getFile(l.localEcorePath).exists
				&& project.getFile(l.localGenmodelPath).exists
				&& project.getFolder(l.localGenerationPath + fqn).exists
			) || (
				   project.getFile(l.externalEcorePath).exists
				&& project.getFile(l.externalGenmodelPath).exists
				&& project.getFolder(l.externalGenerationPath + fqn).exists
			))
				return true
			else return false
		} else
			return true
	}

	/**
	 * Copy aspects defined on {@link l} into generated project
	 * and update {@link l}'s semantic with new Aspects 
	 */
	def void createExternalAspects(Language l) {
		val classesAlreadyWeaved = newArrayList
		val newRootName = l.syntax.packageFqn.toQualifiedName.skipLast(1).toString
		
		//Copy sem
		val toRemove = new ArrayList(l.semantics) 
		copyAspects(l,l.semantics.reverseView,classesAlreadyWeaved,null)
		l.semantics.removeAll(toRemove)
		
		//Copy+rename op
		l.operators.reverseView.forEach[op |
				var List<Aspect> aspects = null
				var Language superlang = null
				var List<PackageBinding> renamingRules = null
				if (op instanceof Slice){
					aspects = (op as Slice).targetLanguage.semantics
					superlang = (op as Slice).owningLanguage
					renamingRules= (op as Slice).mappingRules
				} 
				else if (op instanceof Merge){
					aspects = (op as Merge).targetLanguage.semantics
					superlang = (op as Merge).owningLanguage
					renamingRules = (op as Merge).mappingRules
				}
				
				if(aspects != null && superlang != null){
					val orderedAspects = 
						if(superlang.isGeneratedByMelange){
							aspects
						}
						else{
							aspects.reverseView
						}
					val rulesManager = new RenamingRuleManager(renamingRules, aspects, newRootName, aspectExtension)
					copyAspects(l,aspects,classesAlreadyWeaved,rulesManager)
				}
			]
		//Copy super lang
		l.superLanguages.reverseView.forEach[superLang|
			val orderedAspects = 
				if(superLang.isGeneratedByMelange){
					superLang.semantics
				}
				else{
					superLang.semantics.reverseView
				}
			copyAspects(l,orderedAspects,classesAlreadyWeaved,null)
		]
	}
	
	/**
	 * Copy aspects defined on {@link l} into generated project
	 * and apply renaming rules on them
	 */
	private def void copyAspects(Language l, Iterable<Aspect> aspects, List<String> classesAlreadyWeaved,RenamingRuleManager rulesManager){
		
		if(aspects.isEmpty){
			return
		}
		
		val typeRefBuilder = builderFactory.create(l.eResource.resourceSet)
		val targetEmfNamespace = l.syntax.packageFqn.toQualifiedName.skipLast(1).toString
		val targetAspectNamespace = l.aspectTargetNamespace
		val targetProjectName = l.externalRuntimeName
		val sourceEmfNamespaces =
			if(l == aspects.head.owningLanguage){ //aspects come from 'With' operators
				aspects.head.aspectTypeRef.targetedNamespace.toString
			}
			else{
				aspects.head.owningLanguage.syntax.packageFqn.toQualifiedName.skipLast(1).toString //prefixed root package
			}
		
		
		//Copy aspects files
		val copiedAspect = newArrayList
		aspects.forEach[asp |
			if (asp.isComplete) {
				if (asp.aspectTypeRef.canBeCopiedFor(l.syntax)) {
					
					var className = asp.aspectedClass.name
					var classFqName = asp.aspectedClass.fullyQualifiedName
					val renaming = rulesManager?.getClassRule(classFqName.toString)
					if(renaming != null) className = renaming.value.substring(renaming.value.lastIndexOf(".")+1)
					
					if(!classesAlreadyWeaved.contains(className) && (l.syntax.findClass(className) !== null)){
						classesAlreadyWeaved.add(className)
						copiedAspect += asp
						val request = new AspectCopier.AspectCopierRequest(
							#[asp.aspectTypeRef].toSet,
							#[sourceEmfNamespaces].toSet,
							targetEmfNamespace,
							targetAspectNamespace,
							targetProjectName
						)
						copier.copy(l,request)
					}
				}
			}
		]
		
		//Apply renaming rules on copied files
		if(rulesManager !== null){
			renamer.processRenaming(copiedAspect,l,rulesManager)
		}
		
		//Update the semantic
		val newAspects = newArrayList
		copiedAspect.forEach[asp |
			val targetClass = asp.aspectedClass.name
	    	val targetFqName = asp.aspectedClass.fullyQualifiedName.toString
	    	val rule = rulesManager?.getClassRule(targetFqName)
	    	val newClass = 
	    		if(rule !== null){
		    		rule.value.toQualifiedName.lastSegment
	    		}
	    		else{
	    			targetClass
	    		}
	    	val aspName = asp.aspectTypeRef.simpleName
	    	val eClazz = l.syntax.findClass(newClass)
	    	newAspects += MelangeFactory.eINSTANCE.createAspect => [
					aspectedClass = eClazz
					aspectTypeRef = typeRefBuilder.typeRef(targetAspectNamespace+"."+aspName)
					ecoreFragment = asp.ecoreFragment
				]
		]
		
		l.semantics += newAspects
	}

	def Set<String> collectTargetedPackages(Language l) {
		val res = newHashSet

		res += l.operators.filter(Inheritance).map[targetLanguage.collectTargetedPackages].flatten		
		res +=
			l.operators.map[op |
				if (op instanceof Slice)
					op.targetLanguage.collectTargetedPackages
				else if (op instanceof Merge)
					op.targetLanguage.collectTargetedPackages
				else
					newArrayList
			].flatten

		res += l.syntax.pkgs.map[pkg | l.syntax.getGenPackageFor(pkg)].filterNull.map[fqn]

		return res
	}

	def boolean hasExternalAspects(Language l) {
		return !l.allAspects.filter[!isDefinedOver(l.syntax) && canBeCopiedFor(l.syntax)].empty
	}
}
