package fr.inria.diverse.melange.lib

import com.google.inject.ImplementedBy
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data

@ImplementedBy(PackageMergeMerger)
interface EcoreMerger {
	/**
	 * Note: assuming that receiving and merged are valid wrt Ecore
	 */
	def EPackage merge(EPackage receiving, EPackage merged) throws EcoreMergerException
}

class PackageMergeMerger implements EcoreMerger {
	@Inject extension EcoreExtensions
	List<Conflict> conflicts

	/**
	 * Ignore generics
	 * Ignore constraints
	 */
	override merge(EPackage receiving, EPackage merged) throws EcoreMergerException {
		conflicts = newArrayList
		val resulting = EcoreUtil::copy(receiving)

		if (receiving == merged || receiving.nsURI == merged.nsURI)
			addConflict(receiving, merged, "Cannot merge packages with same URI")
		if (receiving.allSubPkgs.contains(merged))
			addConflict(receiving, merged, "Receiving package cannot contain merged package")
		if (merged.allSubPkgs.contains(receiving))
			addConflict(receiving, merged, "Merged package cannot contain receiving package")
		// FIXME: No cross-ref from one to the other, but costly...

		if (receiving.doMatch(merged))
			receiving.doMerge(merged)

		if (!conflicts.empty)
			throw new EcoreMergerException(conflicts.join(", "))

		return resulting
	}

	private def dispatch boolean doMatch(ENamedElement rcv, ENamedElement merged) {
		return false
	}

	private def dispatch boolean doMatch(EPackage rcv, EPackage merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EClass rcv, EClass merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EDataType rcv, EDataType merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EEnum rcv, EEnum merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EAttribute rcv, EAttribute merged) {
		return rcv.name == merged.name && rcv.unique == merged.unique
	}

	private def dispatch boolean doMatch(EReference rcv, EReference merged) {
		return rcv.name == merged.name && rcv.unique == merged.unique
	}

	private def dispatch boolean doMatch(EOperation rcv, EOperation merged) {
		return rcv.name == merged.name && rcv.unique == merged.unique
	}

	private def dispatch boolean doMatch(EParameter rcv, EParameter merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EAnnotation rcv, EAnnotation merged) {
		return false // TODO
	}

	private def dispatch void doMerge(EPackage rcv, EPackage merged) {
		doCollectionsMerge(rcv.EClassifiers, merged.EClassifiers)
		doCollectionsMerge(rcv.ESubpackages, merged.ESubpackages)
	}

	private def dispatch void doMerge(EClass rcv, EClass merged) {
		// TODO: What about superTypes?
		rcv.abstract = rcv.abstract && merged.abstract
		rcv.interface = rcv.interface && merged.interface
		doCollectionsMerge(rcv.EStructuralFeatures, merged.EStructuralFeatures)
		doCollectionsMerge(rcv.EOperations, merged.EOperations)
	}

	private def dispatch void doMerge(EDataType rcv, EDataType merged) {
	}

	private def dispatch void doMerge(EEnum rcv, EEnum merged) {
	}

	private def dispatch void doMerge(EAttribute rcv, EAttribute merged) {
		rcv.derived = rcv.derived || merged.derived
		rcv.changeable = rcv.changeable && merged.changeable
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.ordered || merged.unique
		rcv.lowerBound = #[rcv.lowerBound, merged.lowerBound].min
		rcv.upperBound = maxBound(rcv.upperBound, merged.upperBound)
	}

	private def dispatch void doMerge(EReference rcv, EReference merged) {
		rcv.derived = rcv.derived || merged.derived
		rcv.changeable = rcv.changeable && merged.changeable
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.ordered || merged.unique
		rcv.lowerBound = #[rcv.lowerBound, merged.lowerBound].min
		rcv.upperBound = maxBound(rcv.upperBound, merged.upperBound)
	}

	private def dispatch void doMerge(EOperation rcv, EOperation merged) {
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.ordered || merged.unique
	}

	private def dispatch void doMerge(EParameter rcv, EParameter merged) {
	}

	private def dispatch void doMerge(EAnnotation rcv, EAnnotation merged) {
	}

	private def <T extends ENamedElement> void doCollectionsMerge(List<T> rcv, List<T> merged) {
		merged.forEach[m |
			val match = rcv.findFirst[r | r.doMatch(m)]

			if (match !== null)
				match.doMerge(m)
			else
				rcv.add(m)
		]
	}

	private def int maxBound(int a, int b) {
		return
			if (a == -1 || b == -1) -1
			else #[a, b].max
	}

	private def void addConflict(ENamedElement rcv, ENamedElement merged, String message) {
		conflicts += new Conflict(rcv, merged, message)
	}

	@Data
	static class Conflict {
		EObject receiving
		EObject merged
		String message
	}
}

class EcoreMergerException extends Exception {
	new(String message) {
		super(message)
	}
}
