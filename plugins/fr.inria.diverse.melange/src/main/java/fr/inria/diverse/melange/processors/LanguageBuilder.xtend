package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.ast.ASTHelper
import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import java.util.List
import java.util.ArrayList
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Merge
import org.eclipse.emf.ecore.EPackage
import java.util.Map
import java.util.HashMap
import fr.inria.diverse.melange.metamodel.melange.Ecore
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.algebra.EmfCompareAlgebra
import fr.inria.diverse.melange.utils.EPackageProvider

/**
 * This class build languages by merging differents parts declared in each language definitions
 */
class LanguageBuilder extends DispatchMelangeProcessor{
	
	@Inject extension ASTHelper
	@Inject ModelUtils modelUtils
	@Inject EmfCompareAlgebra algebra
	@Inject AspectsWeaver aspectWeaver
	@Inject EPackageProvider packageProvider
	
	/**
	 * Store root EPackage for each built languages 
	 */
	Map<Metamodel,EPackage> registry
	
	def dispatch void preProcess(ModelTypingSpace root) {
		
		registry = new HashMap<Metamodel,EPackage>()
		
		root.metamodels.forEach[language |
			build(language, new ArrayList<Metamodel>())
		]
	}
	
	/**
	 * Build {@link language} and register the root EPackage.
	 * {@link history} store languages waiting for this build.
	 */
	private def build(Metamodel language, List<Metamodel> history){

		history.add(language)

		var EPackage base = null

		/****************************
		 * STEP 1: merge ecore files
		 ****************************/
		val ecores = language.units.filter(Ecore)
		val first = ecores?.get(0)
		if(first != null){
			val ecoreBase = modelUtils.loadPkg(first.ecoreUri)
			ecores.drop(1).forEach[ ecore |
				val ecoreRoot = modelUtils.loadPkg(first.ecoreUri)
				if(ecoreRoot != null){
					algebra.merge(ecoreRoot,ecoreBase)
				}
			]
			base = ecoreBase
		}
		
		/****************************
		 * STEP 2: merge inherited languages
		 ****************************/
		
		/****************************
		 * STEP 3: merge languages
		 ****************************/
		val merges = language.units.filter(Merge)
		val firstMerge = merges?.get(0)
		if(firstMerge != null){
			val mergeBase = getRootPackage(firstMerge.language,history)
			merges.drop(1).forEach[ nextMerge |
				val mergeRoot = getRootPackage(nextMerge.language,history)
				if(mergeRoot != null){
					algebra.merge(mergeRoot,mergeBase)
				}
			]
			if(base !== null && mergeBase !== null){
				algebra.merge(mergeBase,base)
			}
			else{
				base = mergeBase
			}
		}
		
		if(base === null){
			//TODO: raise an error, language not well defined
		}
		
		/****************************
		 * STEP 4: merge aspects
		 ****************************/
		aspectWeaver.preProcess(language)
		
		if(base !== null){
			registry.put(language, base)
			packageProvider.registerPackages(language,base)
		}
		
		history.remove(language)
	} 
	
	/**
	 * Check if {@link language} is a dependency of an other language
	 * and has this language as dependency at the same time
	 */
	private def boolean isWithCycle(Metamodel language, List<Metamodel> history){
		
		val List<Metamodel> dependencies = new ArrayList<Metamodel>()
		language.units.filter(Inheritance).forEach[inherit |
			dependencies.add(inherit.superMetamodel)
		]
		language.units.filter(Merge).forEach[merge |
			dependencies.add(merge.language)
		]
		
		return dependencies.exists[dep | history.contains(dep)]
	}
	
	/**
	 * Get the root EPackage of {@link language}.
	 */
	private def EPackage getRootPackage(Metamodel language, List<Metamodel> history){
		
		var EPackage res = registry.get(language)
		
		if(res == null) {
			if(isWithCycle(language, history)){
				//TODO: raise error
			}
			else{
				build(language,history)
				registry.get(language)
			}
		}
		
		return res
	}
}