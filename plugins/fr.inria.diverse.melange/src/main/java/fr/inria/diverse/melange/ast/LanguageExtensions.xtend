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

class LanguageExtensions
{
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension AspectExtensions aspectExtension
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension EclipseProjectHelper
	@Inject extension NamingHelper
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

	def List<Aspect> allSemantics(Language l) {
		val tmp = newArrayList
		
		tmp += l.superLanguages.map[allSemantics].flatten
		tmp +=
			l.operators.map[op |
				if (op instanceof Slice)
					op.targetLanguage.allSemantics
				else if (op instanceof Merge)
					op.targetLanguage.allSemantics
				else
					newArrayList
			].flatten
		tmp += l.semantics

		val res = newArrayList
		tmp.forEach[a1 |
			if (!res.exists[Aspect a2 | a2.aspectTypeRef.identifier == a1.aspectTypeRef.identifier])
				res += a1
		]
		return res.reverse
	}

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
	 * Copy aspects defined on {@link l} into generated project <br>
	 * Return a list of created Aspects with type references to the copied classes
	 */
	def List<Aspect> createExternalAspects(Language l) {
		val res = newArrayList
		val classesAlreadyWeaved = newArrayList
		val newRootName = l.syntax.packageFqn.toQualifiedName.skipLast(1).toString
		
		//Copy sem
		res += simpleCopyAsp(l,l.semantics,classesAlreadyWeaved,null)
		//Copy+rename op
		l.operators.forEach[op |
				var List<Aspect> aspects = null
				var List<PackageBinding> renamingRules = null
				if (op instanceof Slice){
					aspects = (op as Slice).targetLanguage.semantics
					renamingRules= (op as Slice).mappingRules
				} 
				else if (op instanceof Merge){
					aspects = (op as Merge).targetLanguage.semantics
					renamingRules= (op as Merge).mappingRules
				}
				
				if(aspects != null){
					val rulesManager = new RenamingRuleManager(renamingRules, aspects, newRootName, aspectExtension)
					res += simpleCopyAsp(l,aspects,classesAlreadyWeaved,rulesManager)
				}
			]
		//Copy super lang
		res += simpleCopyAsp(l,l.superLanguages.map[semantics].flatten,classesAlreadyWeaved,null)
		
		return res
	}
	
	/**
	 * Copy aspects defined on {@link l} into generated project <br>
	 * Return a list of created Aspects with type references to the copied classes
	 */
	private def List<Aspect> simpleCopyAsp(Language l, Iterable<Aspect> aspects, List<String> classesAlreadyWeaved,RenamingRuleManager rulesManager){
		val res = newArrayList
		
		//Copy aspects files
		aspects.forEach[asp |
			if (asp.isComplete) {
				if (asp.aspectTypeRef.canBeCopiedFor(l.syntax)) {
					
					var className = asp.aspectedClass.name
					var classFqName = asp.aspectedClass.fullyQualifiedName
					val renaming = rulesManager?.getClassRule(classFqName.toString)
					if(renaming != null) className = renaming.value.substring(renaming.value.lastIndexOf(".")+1)
					
					if(!classesAlreadyWeaved.contains(className) && (l.syntax.findClass(className) !== null)){
						classesAlreadyWeaved.add(className)
						copier.copyAspectTo(asp, l)
					}
				}
			}
		]
		
		//Apply renaming rules on copied files
		renamer.processRenaming(aspects.toList,l,rulesManager)
		
		//Update the semantic
		val typeRefBuilder = builderFactory.create(l.eResource.resourceSet)
		val targetAspectNamespace = l.aspectTargetNamespace
		aspects.forEach[asp |
			val targetClass = asp.aspectedClass.name
	    	val targetFqName = asp.aspectedClass.fullyQualifiedName.toString
	    	val rule = rulesManager.getClassRule(targetFqName)
	    	val newClass = 
	    		if(rule !== null){
		    		rule.value.toQualifiedName.lastSegment
	    		}
	    		else{
	    			targetClass
	    		}
	    	val eClazz = l.syntax.findClass(newClass)
	    	res += MelangeFactory.eINSTANCE.createAspect => [
					aspectedClass = eClazz
					aspectTypeRef = typeRefBuilder.typeRef(targetAspectNamespace+"."+newClass+"Aspect")
				]
		]
		
		l.semantics += res
		return res
	}

	def boolean hasExternalAspects(Language l) {
		return !l.allAspects.filter[!isDefinedOver(l.syntax) && canBeCopiedFor(l.syntax)].empty
	}
}
