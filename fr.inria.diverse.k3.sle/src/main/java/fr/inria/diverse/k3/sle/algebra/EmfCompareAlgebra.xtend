package fr.inria.diverse.k3.sle.algebra

import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.EMFCompare

import org.eclipse.emf.compare.merge.BatchMerger
import org.eclipse.emf.compare.merge.IMerger

import org.eclipse.emf.compare.scope.DefaultComparisonScope

import org.eclipse.emf.ecore.EPackage

class EmfCompareAlgebra implements ModelTypeAlgebra
{
	override weaveAspect(EPackage base, EPackage aspect) {
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
