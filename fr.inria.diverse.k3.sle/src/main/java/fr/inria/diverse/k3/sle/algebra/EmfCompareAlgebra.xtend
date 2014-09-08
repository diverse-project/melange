package fr.inria.diverse.k3.sle.algebra

import fr.inria.diverse.k3.sle.metamodel.k3sle.Aspect
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.EMFCompare

import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger

import org.eclipse.emf.compare.scope.DefaultComparisonScope

import org.eclipse.emf.ecore.EClass
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.lib.MatchingHelper
import com.google.inject.Inject

class EmfCompareAlgebra implements ModelTypeAlgebra
{
	@Inject MatchingHelper matchingHelper

	override isSubtypeOf(ModelType mt1, ModelType mt2) {
		matchingHelper.match(mt1.pkgs, mt2.pkgs)
	}

	override isTypedBy(Metamodel mm, ModelType mt) {
		mm.exactType.isSubtypeOf(mt)
	}

	override weaveAspect(Metamodel mm, Aspect aspect) {
		val base = mm.pkgs.findFirst[
			EClassifiers.filter(EClass).exists[
				name == aspect.aspectedClass.name
			]
		]

		val scope = new DefaultComparisonScope(aspect, base, null)
		val comparison = EMFCompare.builder.build.compare(scope)

		val mergedDiffs = comparison.differences.filter[
			   kind == DifferenceKind.ADD
			|| requires.exists[kind == DifferenceKind.ADD]
		]

		val mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance
		val merger = new BatchMerger(mergerRegistry)
		merger.copyAllLeftToRight(mergedDiffs, null)
	}
}
