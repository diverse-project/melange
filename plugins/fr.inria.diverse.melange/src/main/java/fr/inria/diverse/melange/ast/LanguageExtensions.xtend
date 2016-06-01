package fr.inria.diverse.melange.ast

import com.google.inject.Inject
import fr.inria.diverse.melange.builder.ModelTypingSpaceBuilder
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
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
import com.google.common.collect.HashMultimap
import com.google.common.collect.SetMultimap
import fr.inria.diverse.melange.metamodel.melange.Mapping

/**
 * A collection of utilities around {@link Language}s
 */
class LanguageExtensions
{
	@Inject extension ASTHelper
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension NamingHelper
	@Inject extension AspectExtensions aspectExtension
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameConverter
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	@Inject AspectCopier copier
	@Inject AspectRenamer renamer
	@Inject JvmTypesBuilder typesBuilder
	@Inject JvmTypeReferenceBuilder.Factory builderFactory
	@Inject MatchingHelper matchingHelper
	@Inject ModelTypingSpaceBuilder modelTypingSpaceBuilder

	static final String ASPECT_MAIN_ANNOTATION =
		"fr.inria.diverse.k3.al.annotationprocessor.Main"

	/**
	 * Checks whether {@link l} or one of its dependencies (languages it depends
	 * on) cannot be built
	 */
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

	/**
	 * Returns the set of immediate super-languages of {@link l}, excluding
	 * {@link l}
	 */
	def Set<Language> getSuperLanguages(Language l) {
		return l.operators.filter(Inheritance).map[targetLanguage].toSet
	}

	/**
	 * Returns the transitive set of all the super-languages of {@link l},
	 * excluding {@link l}
	 */
	def Set<Language> getAllSuperLanguages(Language l) {
		val ret = newHashSet

		ret += l.superLanguages
		ret += l.superLanguages.map[allSuperLanguages].flatten

		return ret
	}

	/**
	 * Returns the set of all {@link Language}s {@code l} depends on, ie. all
	 * the languages from which it is derived through {@link Inheritance},
	 * {@link Merge}, or {@link Slice}
	 */
	def Set<Language> getAllDependencies(Language l) {
		val ret = newHashSet

		ret += l.operators.filter(LanguageOperator).map[targetLanguage]
		ret += l.operators.filter(LanguageOperator)
				.map[targetLanguage.allDependencies].flatten

		return ret
	}

	/**
	 * Checks whether the given {@link Language} {@code l} is correctly defined
	 * and can be processed
	 */
	def boolean isValid(Language l) {
		return
			   !l.name.nullOrEmpty
			&& l.syntax !== null
			&& l.syntax.isValid
			&& l.semantics.forall[isValid]
	}
	
	/**
	 * Checks whether the given {@link Language} {@code l} is correctly defined
	 * and can be typed
	 */
	def boolean isTypable(Language l) {
		return
			   !l.name.nullOrEmpty
			&& l.syntax !== null
			&& !l.syntax.pkgs.filterNull.empty
			&& l.semantics.forall[isValid]
	}

	/**
	 * Checks whether the given {@link Language} {@code l} has a valid syntax
	 * definition (either directly defined or inherited it from one of its
	 * dependencies).
	 */
	def boolean hasSyntax(Language l) {
		return
			   !l.operators.filter(Import).empty
			|| l.allDependencies.exists[hasSyntax]
	}

	/**
	 * Returns the list of all {@link JvmTypeReference}s pointing to the aspects
	 * woven on the {@link Language} {@code l}, ordered by priority, without
	 * duplicates.
	 * 
	 * The priority order is:
	 * <ul>
	 *   <li>Aspects explicitly defined in {@code l} declaration, in
	 *   top->bottom order</li>
	 *   <li>From {@link Merge} and {@link Slice} relations, in top->bottom
	 *   order</li>
	 *   <li>From {@link Inheritance} relations, in the left->right order</li>
	 * </ul>
	 */
	def List<JvmTypeReference> getAllAspects(Language l) {
		val res = newHashSet

		res += l.operators.filter(Weave)
				.filter[aspectWildcardImport === null].map[aspectTypeRef]
		res +=
			l.operators.map[op |
				if (op instanceof Slice)
					op.targetLanguage.allAspects
				else if (op instanceof Merge)
					op.targetLanguage.allAspects
				else
					newArrayList
			].flatten
		res += l.operators.filter(Inheritance)
				.map[targetLanguage.allAspects].flatten

		return res.toList
	}

	/**
	 * Makes no sense to me :) Comment that later on :/
	 */
	//TODO: merge with createExternalAspect()
	def List<Aspect> allSemantics(Language l) {
		// Aspects were re-ordered when they were copied
		if (l.generatedByMelange)
			return l.semantics
		else {
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
	 * Returns the list of {@link Aspect}s created from {@link Weave} operators.
	 * The order is the same as in the {@link Language} declaration
	 */
	def List<Aspect> getLocalSemantics(Language l) {
		return
			l.operators
			.filter(Weave)
			.map[w |
				// Direct reference imports
				if (w.aspectWildcardImport === null) {
					l.semantics.filter[asp |
						asp.aspectTypeRef.simpleName == w.aspectTypeRef.simpleName
					]
				}
				// Wildcard imports
				else {
					val wildcardImportNS = w.aspectWildcardImport.substring(0,
						w.aspectWildcardImport.length - 2)
					l.semantics.filter[asp |
						asp.aspectTypeRef.simpleName.startsWith(wildcardImportNS)
					]
				}
			].flatten.toList
	}

	/**
	 * Returns the set of {@link Aspect}s of the {@link Language} {@code l}
	 * that are woven on the {@link EClass} {@code cls} of its syntax, or on
	 * one of its super-classes.
	 */
	def Set<Aspect> findAspectsOn(Language l, EClass cls) {
		return
			l.allSemantics
			.filter[asp |
				!asp.aspectedClass?.name.nullOrEmpty
				&& (
				   asp.aspectedClass?.fullyQualifiedName == cls.fullyQualifiedName
				|| cls.EAllSuperTypes.exists[asp.aspectedClass?.fullyQualifiedName == fullyQualifiedName]
				)
			].toSet
	}

	/**
	 * Checks whether the given {@link Language} {@code l} implements the
	 * interface described by the {@link ModelType} {@code mt}.
	 * 
	 * @see MatchingHelper#match
	 */
	def boolean doesImplement(Language l, ModelType mt) {
		return
			matchingHelper.match(
				l.syntax.pkgs.toList,
				mt.pkgs.toList,
				l.mappings.findFirst[to == mt])
	}

	/**
	 * Checks whether the given {@link Language} {@code l} has an adapter
	 * for the {@link EClassifier} {@code cls} towards the {@link ModelType}
	 * {@code mt}, ie. whether {@code l} implements {@code mt} and {@code cls}
	 * is common to {@code l} and {@code mt}.
	 */
	def boolean hasAdapterFor(Language l, ModelType mt, EClassifier cls) {
		return l.hasAdapterFor(mt, cls.uniqueId)
	}

	/**
	 * Checks whether the given {@link Language} {@code l} has an adapter
	 * for the {@link EClassifier} whose name is {@code find} towards the
	 * {@link ModelType} {@code mt}, ie. whether {@code l} implements {@code mt}
	 * and {@code find} is common to {@code l} and {@code mt}.
	 * 
	 * @param find
	 * 		Simple or qualified EClass name
	 */
	def boolean hasAdapterFor(Language l, ModelType mt, String find) {
		val syntaxFind = l.syntax.findClass(find)

		return
			   l.^implements.exists[name == mt.name]
			&& syntaxFind !== null
			&& mt.findClass(find) !== null
			&& syntaxFind.abstractable
	}

	/**
	 * Generates and serializes the Ecore file defining the syntax of the
	 * {@link Language} {@code l}.
	 * 
	 * @see #getExternalEcoreUri
	 * @see #getExternalPackageUri
	 */
	def void createExternalEcore(Language l) {
		l.syntax.createEcore(l.externalEcoreUri, l.externalPackageUri, false)
	}

	/**
	 * Generates and serializes the Genmodel file defining the syntax of the
	 * {@link Language} {@code l}.
	 * 
	 * @see #getExternalEcoreUri
	 * @see #getExternalGenmodelUri
	 * @see #getExternalPackageUri
	 */
	def void createExternalGenmodel(Language l) {
		l.syntax.createGenmodel(l.externalEcoreUri, l.externalGenmodelUri,
			l.externalGenerationPath)
	}

	/**
	 * Get the name of the project that will contain all the runtime of
	 * the given {@link Language} {@code l} (Ecore, Genmodel, Java runtime, etc.)
	 */
	def String getExternalRuntimeName(Language l) {
		return l.fullyQualifiedName.toLowerCase.toString
	}

	/**
	 * Returns the URI of the {@link Language} {@code l} once it is generated.
	 * The returned URI is of the form {@code http://$languageNameInLowerCase/}.
	 */
	def String getExternalPackageUri(Language l) {
		return '''http://«l.name.toLowerCase»/'''
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

	def String getExternalEcoreUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».ecore'''
	}

	def String getExternalGenmodelUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName»/model/«l.name».genmodel'''
	}

	/**
	 * Returns the fully qualified name of the package that contains all
	 * the (possibly type-group-copied) aspects of the {@link Language} {@code l}
	 */
	def String getAspectsNamespace(Language l) {
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
	 * Checks whether the runtime of the given {@link Language} {@code l} must
	 * be generated by Melange, ie. if it consists of multiple syntax imports or
	 * if it is constructed from others {@link Language}s.  
	 */
	def boolean isGeneratedByMelange(Language l) {
		return
			   l.operators.filter(Import).size > 1
			|| !l.operators.filter(LanguageOperator).empty
	}

	/**
	 * Checks whether the runtime project for the {@link Language} {@code l}
	 * has already been generated, ie. if we can find its project, Ecore/Genmodel
	 * files and Java code.
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
			if (
				   project.getFile(l.externalEcorePath).exists
				&& project.getFile(l.externalGenmodelPath).exists
				&& project.getFolder(l.externalGenerationPath + fqn).exists
			)
				return true
			else return false
		} else
			return true
	}

	/**
	 * Copy (and possibly transform) all the aspects defined on the
	 * {@link Language} {@code l} into its runtime project and update
	 * {@code l}'s semantics with the newly generated aspects. 
	 */
	// TODO: Many obscure things here, please simplify/explain :)
	def void createExternalAspects(Language l) {
		val newRootName = l.syntax.rootPackageNamespace

		// Copy the local semantics of the language and remove previous pointers
		val withAspects = l.localSemantics
		l.copyAspects(withAspects.reverseView, #[]/*l.getAllRulesManagers*/)
		l.semantics.removeAll(withAspects)

		// Same thing for the aspects inherited from the language's dependencies
		// (Merge and Slice) operators.
		// Possibly applying renaming rules on operators along the way
		l.operators.reverseView.forEach[op |
			var List<Aspect> aspects = null
			var Language superlang = null
			var List<PackageBinding> renamingRules = null

			if (op instanceof Slice) {
				val targetLang = op.targetLanguage
				superlang = op.owningLanguage
				renamingRules = op.mappingRules

				val opBuilders =
					modelTypingSpaceBuilder.findBuilder(superlang).subBuilders
				val sliceBuilder = opBuilders.findFirst[source == op]
				val sliceClasses = sliceBuilder.model.map[allClasses].flatten

				aspects =
					targetLang.semantics
					.filter[asp |
						sliceClasses.exists[name == asp.aspectedClass.name]
					].toList
			}

			else if (op instanceof Merge) {
				aspects = op.targetLanguage.semantics
				superlang = op.owningLanguage
				renamingRules = op.mappingRules
			}

			if (aspects !== null && superlang !== null) {
//					val orderedAspects = 
//						if(superlang.isGeneratedByMelange){
//							aspects
//						}
//						else{
//							aspects.reverseView
//						}
				val rulesManager = new RenamingRuleManager(renamingRules,
					aspects, newRootName, aspectExtension)
				l.copyAspects(aspects, #[rulesManager])
			}
		]

		// Same thing for the aspect inherited from the super-languages
		// (ie. Inheritance operator)
		l.superLanguages.toList.reverseView.forEach[superLang |
			val orderedAspects = 
				if (superLang.isGeneratedByMelange)
					superLang.semantics
				else
					superLang.semantics.reverseView

			l.copyAspects(orderedAspects, #[])
		]
	}

	/**
	 * Copy the list of {@link Aspect} {@code aspects} into the {@link Language}
	 * {@code l}, while applying the renaming rules defined in {@code ruleManagers}
	 */
	// TODO: Many obscure things here, please simplify/explain :)
	private def void copyAspects(Language l, Iterable<Aspect> aspects,
			List<RenamingRuleManager> ruleManagers) {
		if (aspects.empty)
			return

		val typeRefBuilder = builderFactory.create(l.eResource.resourceSet)
		val targetEmfNamespaces = l.syntax.rootPackageNamespaces
		val targetAspectNamespace = l.aspectsNamespace
		val targetProjectName = l.externalRuntimeName
		val SetMultimap<String, String> sourceEmfNamespaces = HashMultimap.create
		val rawEmfNamespaces =
			// Aspects coming from the Weave operator ('with' keyword)
			if (l == aspects.filter[hasAspectAnnotation].head?.owningLanguage)
				l.collectTargetedPackages
			// Prefixed root package
			else
				aspects.head.owningLanguage.syntax.rootPackageNamespaces
		// rename source packages to map with target packages
		rawEmfNamespaces.keySet.forEach[pkg|
			val rule = ruleManagers.head?.sourceBinding?.findFirst[from == pkg]
			if(rule !== null)
				sourceEmfNamespaces.putAll(rule.to,rawEmfNamespaces.get(pkg))
		]

		// Exclude local aspects
		val externalAsp = newArrayList
		if (aspects.head.owningLanguage == l) {
			val allAspRef = l.allAspects.toSet
			val localTypeRef = aspects.map[aspectTypeRef].toList.filterNull
			externalAsp += allAspRef.filter[ref |
				!localTypeRef.exists[ref.qualifiedName == qualifiedName]
			]
		}

		// Copy aspects code
		val copiedAspect = newArrayList
		
		aspects
		.filter[isValid && aspectTypeRef.canBeCopiedFor(l.syntax)]
		.forEach[asp |
			val classFqName = asp.aspectedClass?.fullyQualifiedName?.toString
			val renaming = ruleManagers
				.map[getClassRule(classFqName)].filterNull.head

			var className = classFqName
			if (renaming !== null)
				className = renaming.value
			
			if (l.syntax.findClass(className) !== null
				|| !asp.hasAspectAnnotation) {
				val asp4Request = #[asp.aspectTypeRef].toSet
				asp4Request += externalAsp
				copiedAspect += asp

				val request = new AspectCopier.AspectCopierRequest(
					asp4Request,
					sourceEmfNamespaces,
					targetEmfNamespaces,
					targetAspectNamespace,
					targetProjectName
				)

				copier.copy(l, request)
			}
		]

		// Apply renaming rules on copied files
		if (!ruleManagers.empty)
			renamer.processRenaming(copiedAspect, l, ruleManagers)

		// Update the current semantics
		val newAspects = newArrayList
		copiedAspect.forEach[asp |
			val targetFqName = asp.aspectedClass?.fullyQualifiedName?.toString
	    	val rule = ruleManagers.map[getClassRule(targetFqName)].filterNull.head
	    	val newClass = 
	    		if (rule !== null)
		    		rule.value
	    		else
	    			targetFqName

	    	val aspName = asp.aspectTypeRef.simpleName
	    	val eClazz = l.syntax.findClass(newClass)

	    	newAspects += MelangeFactory.eINSTANCE.createAspect => [
				aspectedClass = eClazz
				aspectTypeRef = typeRefBuilder.typeRef(
					'''«targetAspectNamespace».«aspName»''')
				ecoreFragment = EcoreUtil::copy(asp.ecoreFragment)
			]

			l.semantics += newAspects
		]
	}

	/**
	 * Returns the list of all {@link RenamingRuleManager} applied to the
	 * {@link Language} {@link l}, possibly gathered from its dependencies.
	 */
	def List<RenamingRuleManager> getAllRulesManagers(Language l) {
		return
			l.operators.filter(LanguageOperator).map[op |
				val newRootName = op.targetLanguage.syntax.rootPackageNamespace
				if (op instanceof Slice)
					if (!op.mappingRules.empty)
						new RenamingRuleManager(op.mappingRules, #[], newRootName, aspectExtension)
				else if (op instanceof Merge)
					if (!op.mappingRules.empty)
						new RenamingRuleManager(op.mappingRules, #[], newRootName, aspectExtension)
			].filterNull.toList
	}

	/**
	 * Returns the transitive set of namespaces defined by the {@link Language}
	 * {@code l} (ie. all the EMF namespaces generated from its syntax or the
	 * syntax of one of its dependencies).
	 */
	def SetMultimap<String,String> collectTargetedPackages(Language l) {
		// Collection of syntaxPackageName -> javaPackageName*
		val SetMultimap<String, String> res = HashMultimap.create

		l.operators.filter(Import)
			.map[allGenPkgs]
			.flatten
			.filter[getEcorePackage.ESuperPackage === null]
			.forEach[
				res.put(it.getEcorePackage.uniqueId,packageNamespace)
				
			]
		l.syntax.allGenPkgs.filter[getEcorePackage.ESuperPackage === null]
			.forEach[
				res.put(it.getEcorePackage.uniqueId,packageNamespace)
			]
		l.allDependencies.map[syntax.allGenPkgs.filter[getEcorePackage.ESuperPackage === null]]
			.flatten.forEach[
				res.put(it.getEcorePackage.uniqueId,packageNamespace)
			]

		return res
	}

	/**
	 * Checks whether the given {@link Language} {@code l} contains {@link Aspect}s
	 * that are not directly defined on its own syntax and must be copied.
	 */
	def boolean hasExternalAspects(Language l) {
		return
			!l.allAspects
			.filter[!isDefinedOver(l.syntax) && canBeCopiedFor(l.syntax)]
			.empty
	}

	/**
	 * For each {@link Language} in the {@link ModelTypingSpace} {@code root},
	 * gather {@link Aspect}s from all its dependencies to form its complete
	 * semantics.
	 */
	def void makeAllSemantics(ModelTypingSpace root) {
		root.clearSemantics

		val processed = newArrayList
		root.languages
			.filter[isGeneratedByMelange]
			.filter[!processed.contains(it)]
			.forEach[lang |
				lang.makeAllSemantics(processed)
				lang.ensureUniqueAspects
			]
	}

	/**
	 * For each {@link Language} in the {@link ModelTypingSpace} {@code root},
	 * clear all its semantics and only keep those from the {@link Weave} operator.
	 */
	def void clearSemantics(ModelTypingSpace root) {
		root.languages.forEach[lang |
			val localAspects = lang.localSemantics
			lang.semantics.clear
			lang.semantics += localAspects
		]
	}

	private def void makeAllSemantics(Language language, List<Language> processed) {
		if (!processed.contains(language)) {
			processed += language

			language.allDependencies
			.filter[!processed.contains(it) && generatedByMelange]
			.forEach[superLang |
				superLang.makeAllSemantics(processed)
			]

			language.makeAllSemantics
		}
	}

	/**
	 * Gathers the semantics of all the dependencies of the {@link Language}
	 * {@code language}, copy the appropriate {@link Aspect}s and update the
	 * local semantics of {@code language} to point to the copied aspects.
	 * <br>
	 * Note: assumes that the semantics of each of the dependencies of
	 * {@code language} has been built.
	 */
	private def void makeAllSemantics(Language language) {
		// Update local aspects (ie. woven with the 'with' keyword)
		language.updateLocalAspects
		
		// Merge & Slice operators
		language.operators.reverseView
		.filter(LanguageOperator)
		.filter[it instanceof Merge || it instanceof Slice]
		.forEach[op |
			op.targetLanguage.orderedAspects.forEach[asp |
				val localAspectedClass = findClassWithMapping(asp,op)
				val newAsp = MelangeFactory.eINSTANCE.createAspect => [
					aspectedClass = localAspectedClass
					aspectTypeRef = typesBuilder.cloneWithProxies(asp.aspectTypeRef)
					ecoreFragment = EcoreUtil::copy(asp.ecoreFragment)
				]

				language.semantics += newAsp
				newAsp.tryUpdateAspect
			]
		]

		// Inheritance operator
		language.superLanguages.toList.reverseView.forEach[superLang |
			superLang.orderedAspects.forEach[asp |
				val localAspectedClass = language.syntax.findClass(asp.aspectedClass?.fullyQualifiedName.toString)
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
	 * Ensure that a language doesn't contain multiple times the same aspect
	 * (eg. in the case of multiple inheritance/overriding)
	 */
	private def void ensureUniqueAspects(Language language) {
		val noDuplicates = newLinkedHashMap
		language.semantics.forEach[asp |
			noDuplicates.put(asp.aspectTypeRef.identifier, asp)
		]

		language.semantics.clear
		language.semantics += noDuplicates.values
	}

	/**
	 * Get {@link Aspect}s from the {@link Language} {@code language} ordered
	 * by their overriding priority.
	 */
	private def List<Aspect> getOrderedAspects(Language language) {
		// FIXME: Seems weird to me :/
		return 
			if (language.isGeneratedByMelange)
				language.semantics
			else
				language.semantics.reverseView
	}
	
	/**
	 * Try to update each of the local {@link Aspect}s of the {@link Language}
	 * {@code language} to point to their generated equivalent.
	 */
	private def void updateLocalAspects(Language language) {
		language.localSemantics.reverseView.forEach[tryUpdateAspect]
	}

	/**
	 * Get a {@link JvmTypeReference} to the copied class corresponding to
	 * {@code aspectSimpleName} in the project generated for the
	 * {@link Language} {@code language}, or null if it cannot be found.
	 */
	def JvmTypeReference getCopiedAspectRefFor(Language language, String aspectSimpleName) {
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		val newRef = typeRefBuilder.typeRef(
			'''«language.aspectsNamespace».«aspectSimpleName»''')

		return
			if (newRef instanceof JvmUnknownTypeReference)
				null
			else
				newRef
	}

	/**
	 * Return the set of {@link JvmOperation} tagged with @Main found
	 * in {@code language}'s {@link Aspect}s.
	 */
	def Set<JvmOperation> getEntryPoints(Language language) {
		return
			language.allSemantics
	        .map[aspectTypeRef.type]
	        .filter(JvmDeclaredType)
	        .map[declaredOperations]
	        .flatten
	        .filter[annotations.exists[annotation.qualifiedName == ASPECT_MAIN_ANNOTATION]]
	        .toSet
	}
	
	/**
	 * Search in {@link op}.owningLanguage for the class on which {@link asp}
	 * is weaved, taking in account the mapping
	 * 
	 * @param asp An aspect from op.targetLanguage
	 * @param op A Merge or Slice operator
	 */
	def EClass findClassWithMapping(Aspect asp, LanguageOperator op){
		
		var classFqName = asp.aspectedClass?.fullyQualifiedName.toString

		val ruleManager = createRenamingManager(op)
		if(ruleManager !== null){
			val renaming = ruleManager.getClassRule(classFqName)
			if (renaming !== null)
				classFqName = renaming.value
		}
		
		return 
			op
			.owningLanguage
			.syntax
			.findClass(classFqName)
	}
	
	/**
	 * Return null if {@link op} has no mapping
	 */
	def RenamingRuleManager createRenamingManager(LanguageOperator op){
		val newRootName = op.owningLanguage.syntax.rootPackageNamespace
		val rules = 
			if(op instanceof Merge)
				op.mappingRules
			else if(op instanceof Slice)
				op.mappingRules
				
		if(rules.isNullOrEmpty)
			return null
		else
			return new RenamingRuleManager(rules,	#[], newRootName, aspectExtension)
	}
	
	/**
	 * Returns mappings from syntax, merge & slice operators
	 */
	def List<PackageBinding> collectMappings(Language l){
		val res = newArrayList
		res.addAll(l.operators.filter(Import).map[mappingRules].flatten)
		res.addAll(l.operators.filter(Merge).map[mappingRules].flatten)
		res.addAll(l.operators.filter(Slice).map[mappingRules].flatten)
		return res
	}
	
	def String rename(String qualifiedClsName,  List<PackageBinding> rules){
		if(qualifiedClsName == null || !qualifiedClsName.contains("."))
			return qualifiedClsName
			
		val pkgName = qualifiedClsName.substring(0,qualifiedClsName.lastIndexOf("."))
		val simpleName = qualifiedClsName.substring(qualifiedClsName.lastIndexOf(".")+1)
		
		val candidateRules = rules.filter[pkgName.endsWith(from)]
		val res = candidateRules.findFirst[classes.exists[from == simpleName]]
		if(res !== null){
			return res.to + "." + res.classes.findFirst[from == simpleName].to
		}
		else if(!candidateRules.isEmpty){
			return candidateRules.head.to + "." + simpleName
		}
		
		return qualifiedClsName
	}
}
