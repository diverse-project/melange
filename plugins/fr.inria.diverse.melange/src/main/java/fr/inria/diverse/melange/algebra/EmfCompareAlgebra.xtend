package fr.inria.diverse.melange.algebra

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ModelingElementExtensions

import fr.inria.diverse.melange.lib.MatchingHelper

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType

import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.EMFCompare

import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger

import org.eclipse.emf.compare.scope.DefaultComparisonScope

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EcorePackage

/**
 * This class merges the EPackage built from an Aspect into the targeted Metaclass
 */
class EmfCompareAlgebra implements ModelTypeAlgebra
{
	@Inject extension ModelingElementExtensions
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
		val comparison = EMFCompare.builder().build.compare(scope)

		val mergedDiffs = comparison.differences.filter[
			   (kind == DifferenceKind.ADD
			|| requires.exists[kind == DifferenceKind.ADD])
			&&
			if (match.left instanceof ENamedElement && match.right instanceof ENamedElement)
				match.left.eGet(EcorePackage.Literals.ENAMED_ELEMENT__NAME) == match.right.eGet(EcorePackage.Literals.ENAMED_ELEMENT__NAME)
			else true
		]

		val mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance
		val merger = new BatchMerger(mergerRegistry)
		merger.copyAllLeftToRight(mergedDiffs, null)
	}
}
