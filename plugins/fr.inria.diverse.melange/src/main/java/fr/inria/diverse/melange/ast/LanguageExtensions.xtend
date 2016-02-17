package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.ModelTypeAlgebra
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.PackageBinding
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import fr.inria.diverse.melange.utils.AspectCopier
import fr.inria.diverse.melange.utils.AspectRenamer
import fr.inria.diverse.melange.utils.RenamingRuleManager
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmUnknownTypeReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.validation.EObjectDiagnosticImpl
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

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
	@Inject JvmTypesBuilder typesBuilder
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	@Inject ModelTypingSpaceBuilder modelTypingSpaceBuilder

	def boolean isInError(Language l) {
		val langs = newArrayList
		langs += l
		langs += l.allDependencies

		return langs.exists[lang |
			lang.eResource.errors.filter(EObjectDiagnosticImpl).exists[
				problematicObject.isContainedBy(lang)
			]
		]
	}

	def List<Language> getSuperLanguages(Language l) {
		return l.operators.filter(Inheritance).map[targetLanguage].toList
	}

	def List<Language> getAllSuperLanguages(Language l) {
		val ret = newArrayList
		ret += l.superLanguages
		ret += l.operators.filter(Inheritance).map[targetLanguage.allSuperLanguages].flatten
		return ret
	}
	
	def Set<Language> getAllDependencies(Language l) {
		val ret = newHashSet
		ret += l.operators.filter(LanguageOperator).map[targetLanguage]
		ret += l.operators.filter(LanguageOperator).map[targetLanguage.allDependencies].flatten
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
		res += l.operators.filter(Weave).filter[aspectWildcardImport === null].map[aspectTypeRef]

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
					&& (!a1.hasAspectAnnotation || l.syntax.pkgs.head.allClasses.exists[cls | cls.name == a1.aspectedClass?.name]))
				{
					res += a1
				}
			]
			return res
		}
	}
	
	/**
	 * Return Aspects created from With Operators,
	 * the order is the same as With Operators
	 */
	def List<Aspect> getLocalSemantics(Language l){
		val res = newArrayList

		//Simple imports
		l.operators.filter(Weave).filter[aspectWildcardImport === null].forEach [ op |
			val withAsp = l.semantics.findFirst [ asp |
				asp.aspectTypeRef.simpleName == op.aspectTypeRef.simpleName
			]
			if (withAsp !== null) {
				res += withAsp
			}
		]

		//Wildcard imports
		l.operators.filter(Weave).filter[aspectWildcardImport !== null].forEach [ op |
			val wildcardImportNS = op.aspectWildcardImport.substring(0,
				op.aspectWildcardImport.length - 2)
			val withAsps = l.semantics.filter [ asp |
				asp.aspectTypeRef.simpleName.startsWith(wildcardImportNS)
			]
			res += withAsps
		]

		return res
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
				   asp.aspectedClass?.name == cls.name
				|| cls.EAllSuperTypes.exists[asp.aspectedClass?.name == name]
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
		l.syntax.createEcore(l.localEcoreUri, l.externalPackageUri, false)
	}

	def void createLocalGenmodel(Language l) {
		l.syntax.createGenmodel(l.localEcoreUri, l.localGenmodelUri, l.localGenerationPath)
	}

	def void createExternalEcore(Language l) {
		l.syntax.createEcore(l.externalEcoreUri, l.externalPackageUri, false)
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
		val newRootName = l.syntax.packageFqn.toQualifiedName.skipLast(1).toString
		
		
		//Copy sem
		val withAspects = l.getLocalSemantics
		copyAspects(l,withAspects.reverseView,#[]/*l.getAllRulesManagers*/)
		l.semantics.removeAll(withAspects)
		
		//Copy+rename op
		l.operators.reverseView.forEach[op |
				var List<Aspect> aspects = null
				var Language superlang = null
				var List<PackageBinding> renamingRules = null
				if (op instanceof Slice){
					val targetLang = (op as Slice).targetLanguage
					superlang = (op as Slice).owningLanguage
					renamingRules = (op as Slice).mappingRules
					
					val opBuilders = modelTypingSpaceBuilder.findBuilder(superlang).subBuilders
					val sliceBuilder = opBuilders.findFirst[source == op]
					val sliceClasses = sliceBuilder.model.allClasses
					
					aspects = targetLang.semantics
						.filter[asp | sliceClasses.exists[name == asp.aspectedClass.name]].toList
					
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
					copyAspects(l,aspects,#[rulesManager])
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
			copyAspects(l,orderedAspects,#[])
		]
	}
	
	/**
	 * Copy aspects defined on {@link l} into generated project
	 * and apply renaming rules on them
	 */
	private def void copyAspects(Language l, Iterable<Aspect> aspects, List<RenamingRuleManager> rulesManagers){
		
		if(aspects.isEmpty){
			return
		}
		
		val typeRefBuilder = builderFactory.create(l.eResource.resourceSet)
		val targetEmfNamespace = l.syntax.packageFqn.toQualifiedName.skipLast(1).toString
		val targetAspectNamespace = l.aspectTargetNamespace
		val targetProjectName = l.externalRuntimeName
		val sourceEmfNamespaces =
			if(l == aspects.filter[hasAspectAnnotation].head?.owningLanguage){ //aspects come from 'With' operators
				l.collectTargetedPackages
//				#[aspects.filter[hasAspectAnnotation].head.aspectTypeRef.targetedNamespace.toString].toSet
			}
			else{
				#[aspects.head.owningLanguage.syntax.packageFqn.toQualifiedName.skipLast(1).toString].toSet //prefixed root package
			}
		
		
		//Exclude local aspects
		val externalAsp = newArrayList
		if(aspects.head.owningLanguage === l){
			val allAspRef = l.allAspects.toSet
			val localTypeRef = aspects.map[aspectTypeRef].toList.filterNull
			externalAsp += allAspRef.filter[ref | !localTypeRef.exists[ref.qualifiedName == qualifiedName]]
		}
		//Copy aspects files
		val copiedAspect = newArrayList
		aspects.forEach[asp |
			if (asp.isComplete) {
				if (asp.aspectTypeRef.canBeCopiedFor(l.syntax)) {
					
					var className = asp.aspectedClass?.name
					var classFqName = asp.aspectedClass?.fullyQualifiedName
					val classNameTmp = className
					val renaming = rulesManagers.map[getClassRule(classNameTmp?.toString)].filterNull.head
					if(renaming != null) className = renaming.value.substring(renaming.value.lastIndexOf(".")+1)
					
					if(l.syntax.findClass(className) !== null || !asp.hasAspectAnnotation){
						copiedAspect += asp
						val asp4Request = #[asp.aspectTypeRef].toSet
						asp4Request.addAll(externalAsp)
						val request = new AspectCopier.AspectCopierRequest(
							asp4Request,
							sourceEmfNamespaces,
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
		if(!rulesManagers.isEmpty){
			renamer.processRenaming(copiedAspect,l,rulesManagers)
		}
		
		//Update the semantic
		val newAspects = newArrayList
		copiedAspect.forEach[asp |
			val targetClass = asp.aspectedClass?.name
	    	val targetFqName = asp.aspectedClass?.fullyQualifiedName?.toString
	    	val rule = rulesManagers.map[getClassRule(targetFqName)].filterNull.head
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
					ecoreFragment = EcoreUtil.copy(asp.ecoreFragment)
				]
			l.semantics += newAspects
		]
	}
	
	def getAllRulesManagers(Language l){
		val rulesManagers = newArrayList
		l.operators.forEach[op |
			var List<PackageBinding> renamingRules = null
			var Language opLang = null
			if (op instanceof Slice){
				renamingRules = op.mappingRules
				opLang = op.targetLanguage
			}
			else if (op instanceof Merge){
				renamingRules = op.mappingRules
				opLang = op.targetLanguage
			}
			if(renamingRules !== null){
				val newRootName = opLang.syntax.packageFqn.toQualifiedName.skipLast(1).toString
				rulesManagers += new RenamingRuleManager(renamingRules, #[], newRootName, aspectExtension)
			}
		]
		return rulesManagers
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
	
	
	
	/**
	 * For each Language, gather Aspects from all dependencies to form
	 * the complete semantic.
	 */
	def void makeAllSemantics(ModelTypingSpace root){
		root.clearSemantics
		
		val processed = newArrayList
		val languages = root.elements.filter(Language)
		languages.filter[isGeneratedByMelange].filter[!processed.contains(it)].forEach[lang |
			lang.makeAllSemantic(processed)
		]
	}
	
	/**
	 * For each Language, remove all Aspects except those from With Operators
	 */
	def void clearSemantics(ModelTypingSpace root){
		root.elements.filter(Language).forEach[lang |
			val localAspects = lang.localSemantics
			lang.semantics.clear
			lang.semantics += localAspects
		]
	}
	
	private def void makeAllSemantic(Language language, List<Language> processed){
		if(!processed.contains(language)){
			processed += language
			
			val dependencies = language.operators.filter(LanguageOperator).map[targetLanguage].filter[isGeneratedByMelange]
			dependencies.filter[!processed.contains(it)].forEach[superLang |
				superLang.makeAllSemantic(processed)
			]
			makeAllSemantic(language)
		}
	}
	
	/**
	 * Create Aspects based on semantics from Operators' Languages and update
	 * With Operators' semantics to target copied Aspects classes.<br>
	 * 
	 * Note: assume semantics from {@link language} dependencies are made.
	 */
	private def void makeAllSemantic(Language language) {
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		//with
		language.updateLocalAspects
		
		//merge & slice
		language.operators.reverseView.filter[it instanceof Merge || it instanceof Slice].forEach[op|
			var superLang = (op as LanguageOperator).targetLanguage
			superLang.getOrderedAspects.forEach[asp |
				val localAspectedClass = language.syntax.findClass(asp.aspectedClass?.name)//TODO: renaming here
				val newAsp = MelangeFactory.eINSTANCE.createAspect => [
					aspectedClass = localAspectedClass
					aspectTypeRef = typesBuilder.cloneWithProxies(asp.aspectTypeRef)
					ecoreFragment = EcoreUtil.copy(asp.ecoreFragment)
				]
				language.semantics += newAsp
				newAsp.tryUpdateAspect
			]
		]
		//inherits
		language.getSuperLanguages.reverseView.forEach[superLang |
			superLang.getOrderedAspects.forEach[asp |
				val localAspectedClass = language.syntax.findClass(asp.aspectedClass?.name)
				val newAsp =  MelangeFactory.eINSTANCE.createAspect => [
					aspectedClass = localAspectedClass
					aspectTypeRef = typesBuilder.cloneWithProxies(asp.aspectTypeRef)
					ecoreFragment = EcoreUtil.copy(asp.ecoreFragment)
				]
				language.semantics += newAsp
				newAsp.tryUpdateAspect
			]
		]
	}
	
	/**
	 * Get Aspects from {@link language} in the overriding order.
	 * (ie: the first override its followings)
	 */
	private def List<Aspect> getOrderedAspects(Language language){
		return 
			if(language.isGeneratedByMelange){
				language.semantics
			}
			else{
				language.semantics.reverseView
			}
	}
	
	/**
	 * For Aspects from With Operator, try to change targeted classes
	 * to point copied aspects classes.
	 * Do nothing if we can't find these classes
	 */
	private def void updateLocalAspects(Language language){
		language.localSemantics.reverseView.forEach[asp|
			asp.tryUpdateAspect
		]
	}
	
	/**
	 * Try update asp.aspectTypeRef to reference copied aspect
	 */
	private def void tryUpdateAspect(Aspect asp){
		var language = asp.owningLanguage
		val newRef = language.getCopiedAspectRef(asp.aspectTypeRef.simpleName)
		if(newRef !== null){
			asp.aspectTypeRef = newRef
		}
	}
	
	/**
	 * Get a reference to the copied class corresponding to {@link aspectSimpleName}
	 * in the project generated for {@link language}.
	 * 
	 * Return null if not found
	 */
	private def getCopiedAspectRef(Language language, String aspectSimpleName){
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		val newRef = typeRefBuilder.typeRef(language.aspectTargetNamespace+"."+aspectSimpleName)
		if(newRef instanceof JvmUnknownTypeReference){
			return null
		}
		return newRef
	}
	
	/**
	 * Return the list of methods tagged with @Main found
	 * in {@link language}'s Aspects
	 */
	public def Set<JvmOperation> getEntryPoints(Language language){
		return
			language.allSemantics
			        .map[aspectTypeRef.type]
			        .filter(JvmDeclaredType)
			        .map[declaredOperations]
			        .flatten
			        .filter[op | op.annotations.exists[annotation.qualifiedName == "fr.inria.diverse.k3.al.annotationprocessor.Main"]]
			        .toSet
	}
}
