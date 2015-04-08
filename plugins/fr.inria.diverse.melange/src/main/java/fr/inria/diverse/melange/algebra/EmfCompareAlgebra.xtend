package fr.inria.diverse.melange.algebra

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature

/**
 * This class merges the EPackage built from an Aspect into the targeted Metaclass
 */
class EmfCompareAlgebra implements ModelTypeAlgebra
{
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject MatchingHelper matchingHelper

	override isSubtypeOf(ModelType mt1, ModelType mt2) {
		return matchingHelper.match(mt1.pkgs, mt2.pkgs)
	}

	override isTypedBy(Metamodel mm, ModelType mt) {
		return mm.exactType.isSubtypeOf(mt)
	}

	override weaveAspect(Metamodel mm, Aspect aspect) {
		val base = mm.pkgs.findFirst[
			EClassifiers.filter(EClass).exists[
				name == aspect.aspectedClass.name
			]
		]

		val scope = new DefaultComparisonScope(aspect.ecoreFragment, base, null)
		val comparison = customEMFCompare.compare(scope)

		val mergedDiffs = comparison.differences.filter[
			   (kind == DifferenceKind.ADD
			// FIXME: Closure of requires references
			|| requires.exists[kind == DifferenceKind.ADD])
		]

		val mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance
		val merger = new BatchMerger(mergerRegistry)
		merger.copyAllLeftToRight(mergedDiffs, null)
	}

	private def EMFCompare getCustomEMFCompare() {
		val fallbackMatcher = DefaultMatchEngine::createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE)
		val nameMatcher = new IdentifierEObjectMatcher(fallbackMatcher, [o |
			if (o instanceof EPackage || o instanceof EClass || o instanceof EOperation || o instanceof EStructuralFeature)
				(o as ENamedElement).uniqueId
			else null
		])
		val comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory)
		val matchEngine = new DefaultMatchEngine(nameMatcher, comparisonFactory)
		val registry = EMFCompareRCPPlugin.getDefault.getMatchEngineFactoryRegistry
		val engineFactory = new MatchEngineFactoryImpl(nameMatcher, comparisonFactory) {
			override getMatchEngine() {
				return matchEngine
			}
		}
		engineFactory.ranking = 20 // Must be > 10
		registry.add(engineFactory)
		return EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build
	}
}
