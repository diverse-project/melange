package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.algebra.EmfCompareAlgebra
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.lib.slicing.ecore.StrictEcore
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.utils.EPackageProvider
import java.io.IOException
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * This class build languages by merging differents parts declared in each language definitions
 * and generates new ecore & genmodel if needed
 */
class LanguageBuilder extends DispatchMelangeProcessor{
	
	@Inject extension ASTHelper
	@Inject ModelUtils modelUtils
	@Inject EmfCompareAlgebra algebra
	@Inject AspectsWeaver aspectWeaver
	@Inject EPackageProvider packageProvider
	@Inject extension LanguageExtensions
	
	/**
	 * Store root EPackage for each built languages 
	 */
	Map<Language, EPackage> registry
	
	def dispatch void preProcess(ModelTypingSpace root, boolean isPreLinkingPhase) {
		registry = newHashMap
		
		root.languages.forEach[language |
			build(language, newArrayList)
		]
	}
	
	/**
	 * Build {@link language} and register the root EPackage.
	 * {@link history} store languages waiting for this build.
	 */
	private def build(Language language, List<Language> history){
		
		var EPackage res = registry.get(language)
		if(res !== null) return res

		history.add(language)

		var EPackage base = null
		var needNewEcore = false

		/****************************
		 * STEP 1: merge ecore files
		 ****************************/
		val ecores = language.operators.filter(Import)
		if(ecores.size == 1){
			language.syntax.ecoreUri = ecores.get(0).ecoreUri
			language.syntax.genmodelUris.addAll(ecores.get(0).genmodelUris)
			base = modelUtils.loadPkg(ecores.get(0).ecoreUri)
		}
		else if(ecores.size > 1){
			needNewEcore = true
			val firstEcore = ecores.get(0)
			val ecoreBase = modelUtils.loadPkg(firstEcore.ecoreUri)

			ecores.drop(1).forEach[ nextEcore |
				val ecoreUnit = modelUtils.loadPkg(nextEcore.ecoreUri)
				EcoreUtil.resolveAll(ecoreUnit) //Need to solve crossref because EMF Compare don't
				algebra.merge(ecoreUnit,ecoreBase)
			]
			base = ecoreBase
		}
		
		/****************************
		 * STEP 2: merge inherited languages
		 ****************************/
		 val inherits = language.operators.filter(Inheritance)
		 if(inherits.size > 0){
			needNewEcore = true
			val firstInherit = inherits.get(0)
			val inheritBase = EcoreUtil::copy(getRootPackage(firstInherit.superLanguage,history))
			EcoreUtil.resolveAll(inheritBase)
			
			inherits.drop(1).forEach[ nextInherit |
				val inheritUnit = getRootPackage(nextInherit.superLanguage,history)
				EcoreUtil.resolveAll(inheritUnit)
				algebra.merge(inheritUnit,inheritBase)
			]
			
			if(base !== null && inheritBase !== null){
				algebra.merge(inheritBase,base)
			}
			else if(base === null && inheritBase !== null){
				base = inheritBase
			}
		}
		
		/****************************
		 * STEP 3: merge languages
		 ****************************/
		val merges = language.operators.filter(Merge)
		if(merges.size > 0){
			needNewEcore = true
			val firstMerge = merges.get(0)
			val mergeBase = EcoreUtil::copy(getRootPackage(firstMerge.mergedLanguage,history))
			EcoreUtil.resolveAll(mergeBase)

			merges.drop(1).forEach[ nextMerge |
				val mergeUnit = getRootPackage(nextMerge.mergedLanguage,history)
				EcoreUtil.resolveAll(mergeUnit)
				algebra.merge(mergeUnit,mergeBase)
			]
			
			if(base !== null && mergeBase !== null){
				algebra.merge(mergeBase,base)
			}
			else if(base === null && mergeBase !== null){
				base = mergeBase
			}
		}
		
		/****************************
		 * STEP 4: merge sliced languages
		 ****************************/
		 val slices = language.operators.filter(Slice)
		 if(slices.size > 0){
		 	needNewEcore = true
		 	val firstSlice = slices.get(0)
			val sliceBase = applySlice(firstSlice, history)
			
			slices.drop(1).forEach[ nextSlice |
				val sliceUnit = applySlice(nextSlice, history)
				algebra.merge(sliceUnit, sliceBase)
			]
			
			if(base !== null && sliceBase !== null){
				algebra.merge(sliceBase,base)
			}
			else if(base === null && sliceBase !== null){
				base = sliceBase
			}
		 }
		 
		
		if(base === null){
			//TODO: raise an error, language not well defined
		}
		

		/****************************
		 * STEP 5: 
		 ****************************/
		if(base !== null){
			registry.put(language, base)
		}
		
		if(needNewEcore){
//			pkgs.add(base)
//			createEcore(pkgs, language.localEcoreUri, null) //should be refactored
//			language.ecoreUri = language.localEcoreUri
//			language.createLocalGenmodel
//			language.genmodelUris += language.getLocalGenmodelUri

			language.syntax.ecoreUri = language.externalEcoreUri
			language.syntax.genmodelUris += language.externalGenmodelUri
		}
		
		packageProvider.registerPackages(language.syntax, base)
		 
		/****************************
		 * STEP 5: merge aspects
		 ****************************/
		aspectWeaver.preProcess(language, false)
		
		return history.remove(language)
	} 
	
	/**
	 * Check if {@link language} is a dependency of an other language
	 * and has this language as dependency at the same time
	 */
	private def boolean isWithCycle(Language language, List<Language> history){
		
		val dependencies = newArrayList
		language.operators.filter(Inheritance).forEach[inherit |
			dependencies.add(inherit.superLanguage)
		]
		language.operators.filter(Merge).forEach[merge |
			dependencies.add(merge.mergedLanguage)
		]
		
		return dependencies.exists[dep | history.contains(dep)]
	}
	
	/**
	 * Get the root EPackage of {@link language}.
	 */
	private def EPackage getRootPackage(Language language, List<Language> history){
		var EPackage res = registry.get(language)
		
		if (res === null && language !== null) {
			if(isWithCycle(language, history)){
				//TODO: raise error
			}
			else{
				build(language,history)
				res = registry.get(language)
			}
		}
		
		return res
	}
	
	/**
 	 * Copy/Past from ModelingElementExtension
 	 */
	static def EPackage createEcore(List<EPackage> pkgs, String uri, String pkgUri) {
		val resSet = new ResourceSetImpl
		val res = resSet.createResource(URI::createURI(uri))
		val rootPkg = pkgs.head

		if (pkgUri !== null)
			rootPkg.nsURI = pkgUri

		val copy = EcoreUtil::copyAll(pkgs)

		// FIXME:
		copy.forEach[pkg |
			EcoreUtil.ExternalCrossReferencer.find(pkg).forEach[o, s |
				s.forEach[ss |
					if (ss.EStructuralFeature !== null && !ss.EStructuralFeature.derived && !ss.EStructuralFeature.many) {
						if (o instanceof EClassifier) {
							val corresponding = copy.map[EClassifiers].flatten.findFirst[name == o.name]
							if (corresponding !== null)
								ss.EObject.eSet(ss.EStructuralFeature, corresponding)
						} else if (o instanceof EReference) {
							if (o.EOpposite !== null) {
								val correspondingCls = copy.map[EClassifiers].flatten.findFirst[name == o.EContainingClass.name] as EClass
								val correspondingRef = correspondingCls.EReferences.findFirst[name == o.name]

								if (correspondingRef !== null)
									ss.EObject.eSet(ss.EStructuralFeature, correspondingRef)
							}
						}
					}
				]
			]
		]

		res.contents += copy

//		new Job("Serializing Ecore") {
//			override run(IProgressMonitor monitor) {
				try {
					res.save(null)
				} catch (IOException e) {
					e.printStackTrace
				}

//				return Status.OK_STATUS
//			}
//		}.schedule

		return rootPkg
	}
	
	/**
	 * Search in {@link rootPackage} for EClass named as in {@link classes}
	 */
	private def List<EModelElement> getClasses(EPackage rootPackage, List<String> classes){
		//TODO: manage sub packages
		val res = new ArrayList<EModelElement>()
		
		rootPackage.EClassifiers.filter(EClass).forEach[cl|
			if(classes.contains(cl.name)) res.add(cl)
		]
		
		return res
	}
	
	/**
	 * Return a copy of the part of language defined in {@link slice}
	 */
	private def EPackage applySlice(Slice slice, List<Language> history){
		val sliceBase = EcoreUtil::copy(getRootPackage(slice.slicedLanguage,history))
		EcoreUtil.resolveAll(sliceBase)
		
		val roots = getClasses(sliceBase, slice.roots)
		val slicer = new StrictEcore(roots,sliceBase,false,"ecore",false)
		slicer.slice
		
		val res = slicer.getclonedElts.filter(EPackage).filter[eContainer===null].head
		EcoreUtil.resolveAll(slice)
		
		return res
	}
}