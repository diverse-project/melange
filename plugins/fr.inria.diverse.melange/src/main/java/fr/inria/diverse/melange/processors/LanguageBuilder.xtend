package fr.inria.diverse.melange.processors

import org.eclipse.emf.ecore.EObject
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
import fr.inria.diverse.melange.ast.ModelingElementExtensions

/**
 * This class build languages by merging differents parts declared in each language definitions
 */
class LanguageBuilder extends DispatchMelangeProcessor{
	
	@Inject extension ASTHelper
	@Inject ModelUtils modelUtils
	@Inject EmfCompareAlgebra algebra
	@Inject extension ModelingElementExtensions
	@Inject AspectsWeaver aspectWeaver
	
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
	 * Build {@link language}.
	 * {@link history} store languages waiting for this build 
	 */
	private def void build(Metamodel language, List<Metamodel> history){
		
		if(isWithCycle(language, history)){
			//TODO: raise error
		}
		
		if(registry.get(language) != null){
			//TODO: language is already built
		}

		history.add(language)

		var EPackage base = null

		//Step 1: merge ecore files
		val ecores = language.units.filter(Ecore)
		val first = ecores?.get(0)
		if(first != null){
			val ecoreBase = modelUtils.loadPkg(first.ecoreUri) //TODO: use EPackageProvider
			ecores.drop(1).forEach[ ecore |
				val ecoreRoot = modelUtils.loadPkg(first.ecoreUri) //TODO: use EPackageProvider
				if(ecoreRoot != null){
					algebra.merge(ecoreRoot,ecoreBase)
				}
			]
			base = ecoreBase
		}
		//Step 2: merge inherited language
		
		//Step 3: merge languages
		val merges = language.units.filter(Merge)
		val firstMerge = merges?.get(0)
		if(firstMerge != null){
			val mergeBase = if(registry.get(firstMerge.language) != null){
								registry.get(firstMerge.language)
							}
							else {
								build(firstMerge.language,history)
								firstMerge.language.pkgs.findFirst[ESuperPackage === null]
							}
			merges.drop(1).forEach[ merge |
				val mergeRoot = if(registry.get(merge.language) != null){
									registry.get(merge.language)
								}
								else {
									build(merge.language,history)
									merge.language.pkgs.findFirst[ESuperPackage === null]
								}
				if(mergeRoot != null){
					algebra.merge(mergeRoot,mergeBase)
				}
			]
			if(base !== null && mergeBase !== null){
				algebra.merge(mergeBase,base)
			}
		}
		
		//Step 4: merge aspects
		aspectWeaver.preProcess(language)
		
		if(base != null){
			registry.put(language, base)
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
}