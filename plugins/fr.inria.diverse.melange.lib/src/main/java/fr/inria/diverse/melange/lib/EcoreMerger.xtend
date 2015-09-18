package fr.inria.diverse.melange.lib

import com.google.inject.ImplementedBy
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data

@ImplementedBy(PackageMergeMerger)
interface EcoreMerger {
	/**
	 * Note: assuming that receiving and merged are valid wrt Ecore
	 */
	def EPackage merge(EPackage receiving, EPackage merged)
	def List<EPackage> merge(List<EPackage> receiving, List<EPackage> merged)
	def List<Conflict> getConflicts()

	@Data
	static class Conflict {
		EObject receiving
		EObject merged
		EReference feature
		String message
		Diagnostic emfDiagnostic
	}
}

/**
 * Inspired from UML2.5 PackageMerge specification,
 * as refined by Dingel et al.
 * "Understanding and improving UML package merge"
 * 
 *   - Receiving package and resulting package are *different*. The
 *     receiving package does not play a dual role. Thus, the constraints
 *     on cycle detection do not make sense.
 *   - Ignores generics
 *   - Ignores constraints
 *   - The resulting EPackage is checked using Diagnostician
 *   - All elements inserted from the merged package are marked with an annotation
 */
class PackageMergeMerger implements EcoreMerger {
	@Inject extension EcoreExtensions
	List<Conflict> conflicts
	static final String ORIGIN_ANNOTATION_SOURCE = "http://www.inria.fr/melange/origin"

	override merge(EPackage receiving, EPackage merged) {
		return merge(receiving, merged, true)
	}

	def EPackage merge(EPackage receiving, EPackage merged, boolean validate) {
		conflicts = newArrayList
		val resulting = receiving//EcoreUtil::copy(receiving)

		if (receiving === null || merged === null)
			return null
//		if (receiving == merged || receiving.nsURI == merged.nsURI)
//			addConflict(receiving, merged, null, "Cannot merge packages with same URI")
		if (receiving.allSubPkgs.contains(merged))
			addConflict(receiving, merged, null, "Receiving package cannot contain merged package")
		if (merged.allSubPkgs.contains(receiving))
			addConflict(receiving, merged, null, "Merged package cannot contain receiving package")
		// FIXME: We should check for forbidden cross-refs between receiving/merged
		//         but this is quite costly

		if (receiving.doMatch(merged))
			resulting.doMerge(merged)

		if (!conflicts.empty)
			return null

		resulting.updateReferences

		if (validate)
			if (!validateAndProduceConflicts(resulting))
				return null

		resulting.cleanAnnotations

		return resulting
	}

	def void cleanAnnotations(EPackage pkg) {
		val toRemove = newArrayList
		val i = pkg.eAllContents

		while (i.hasNext) {
			val o = i.next
			if (o instanceof EModelElement)
				toRemove += o.EAnnotations.filter[source == ORIGIN_ANNOTATION_SOURCE]
		}

		toRemove.forEach[EcoreUtil::delete(it)]
	}

	def boolean validateAndProduceConflicts(EPackage resulting) {
		val diag = Diagnostician.INSTANCE.validate(resulting)
		if (diag.severity != Diagnostic::OK) {
			diag.children.forEach[d |
				d.data.forEach[diagSource |
					if (diagSource instanceof ENamedElement) {
						diagSource.EAnnotations.filter[source == ORIGIN_ANNOTATION_SOURCE].forEach[ann |
							if (ann.references.size == 2) {
								val mergedElement = ann.references.head as ENamedElement
								val feature = ann.references.get(1) as EReference
								val receivingElement = if (feature.containment) diagSource.eContainer else diagSource
								addConflict(receivingElement as ENamedElement, mergedElement, feature, d)
							}
						]
					}
				]
			]

			return false
		}

		return true
	}

	def void updateReferences(EPackage pkg) {
		EcoreUtil.ExternalCrossReferencer.find(pkg).forEach[o, s |
			s.forEach[ss |
				if (ss.EStructuralFeature !== null && !ss.EStructuralFeature.derived && !ss.EStructuralFeature.many) {
					if (o instanceof EClassifier) {
						val corresponding = pkg.EClassifiers.findFirst[name == o.name]
						if (corresponding !== null)
							ss.EObject.eSet(ss.EStructuralFeature, corresponding)
					} else if (o instanceof EReference) {
						if (o.EOpposite !== null) {
							val correspondingCls = pkg.EClassifiers.findFirst[name == o.EContainingClass.name] as EClass
							val correspondingRef = correspondingCls.EReferences.findFirst[name == o.name]

							if (correspondingRef !== null)
								ss.EObject.eSet(ss.EStructuralFeature, correspondingRef)
						}
					}
				}
			]
		]
	}

	override merge(List<EPackage> receiving, List<EPackage> merged) {
		merged.forEach[mergedPkg |
			val correspondingPkg = receiving.findFirst[doMatch(mergedPkg)]

			if (correspondingPkg !== null)
				merge(correspondingPkg, mergedPkg)
			else
				receiving += EcoreUtil::copy(mergedPkg)
		]

		return receiving
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
		return
			   rcv.name == merged.name
			&& typesMatch(rcv.EType, merged.EType)
	}

	private def dispatch boolean doMatch(EReference rcv, EReference merged) {
		return
			   rcv.name == merged.name
			&& typesMatch(rcv.EType, merged.EType)
	}

	private def dispatch boolean doMatch(EOperation rcv, EOperation merged) {
		return
			   rcv.name == merged.name
			&& typesMatch(rcv.EType, merged.EType)
	}

	private def dispatch boolean doMatch(EParameter rcv, EParameter merged) {
		return rcv.name == merged.name
	}

	private def dispatch boolean doMatch(EAnnotation rcv, EAnnotation merged) {
		return false // TODO
	}

	private def boolean typesMatch(EClassifier eA, EClassifier eB) {
		if (eA === null && eB === null)
			return true
		else if (eA === null || eB === null)
			return false
		else
			return doTypesMatch(eA, eB)
	}

	private def dispatch boolean doTypesMatch(EClassifier eA, EClassifier eB) {
		return false
	}

	private def dispatch boolean doTypesMatch(EClass clsA, EClass clsB) {
		return
			   clsA.name == clsB.name
			|| clsA.EAllSuperTypes.exists[name == clsB.name]
	}

	private def dispatch boolean doTypesMatch(EDataType dtA, EDataType dtB) {
		// FIXME: Should we match instanceClass instead?
		return	dtA.name == dtB.name
	}

	private def dispatch boolean doTypesMatch(EEnum enumA, EEnum enumB) {
		return enumA.name == enumB.name
	}

	private def dispatch void doMerge(EPackage rcv, EPackage merged) {
		// TODO: what about URIs, prefix, etc. ?
		doCollectionsMerge(rcv, EcorePackage.Literals.EPACKAGE__ECLASSIFIERS, rcv.EClassifiers, merged.EClassifiers)
		doCollectionsMerge(rcv, EcorePackage.Literals.EPACKAGE__ESUBPACKAGES, rcv.ESubpackages, merged.ESubpackages)
	}

	private def dispatch void doMerge(EClass rcv, EClass merged) {
		rcv.abstract = rcv.abstract && merged.abstract
		rcv.interface = rcv.interface && merged.interface
		doCollectionsMerge(rcv, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, rcv.EStructuralFeatures, merged.EStructuralFeatures)
		doCollectionsMerge(rcv, EcorePackage.Literals.ECLASS__EOPERATIONS, rcv.EOperations, merged.EOperations)
		doCollectionsMerge(rcv, EcorePackage.Literals.ECLASS__ESUPER_TYPES, rcv.ESuperTypes, merged.ESuperTypes)
	}

	private def dispatch void doMerge(EDataType rcv, EDataType merged) {
	}

	private def dispatch void doMerge(EEnum rcv, EEnum merged) {
	}

	private def dispatch void doMerge(EAttribute rcv, EAttribute merged) {
		rcv.derived = rcv.derived || merged.derived
		rcv.transient = rcv.transient || merged.transient
		rcv.volatile = rcv.volatile || merged.volatile
		rcv.unsettable = rcv.unsettable && merged.unsettable
		rcv.changeable = rcv.changeable || merged.changeable
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.unique || merged.unique
		rcv.lowerBound = #[rcv.lowerBound, merged.lowerBound].min
		rcv.upperBound = maxBound(rcv.upperBound, merged.upperBound)
	}

	private def dispatch void doMerge(EReference rcv, EReference merged) {
		rcv.derived = rcv.derived || merged.derived
		rcv.transient = rcv.transient || merged.transient
		rcv.volatile = rcv.volatile || merged.volatile
		rcv.unsettable = rcv.unsettable && merged.unsettable
		rcv.changeable = rcv.changeable || merged.changeable
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.unique || merged.unique
		rcv.lowerBound = #[rcv.lowerBound, merged.lowerBound].min
		rcv.upperBound = maxBound(rcv.upperBound, merged.upperBound)

		if (rcv.containment != merged.containment)
			addConflict(rcv, merged, null, "Conflicting containment values for reference")
	}

	private def dispatch void doMerge(EOperation rcv, EOperation merged) {
		rcv.ordered = rcv.ordered || merged.ordered
		rcv.unique = rcv.ordered || merged.unique
		rcv.lowerBound = #[rcv.lowerBound, merged.lowerBound].min
		rcv.upperBound = maxBound(rcv.upperBound, merged.upperBound)
	}

	private def dispatch void doMerge(EParameter rcv, EParameter merged) {
	}

	private def dispatch void doMerge(EAnnotation rcv, EAnnotation merged) {
	}

	private def <T extends ENamedElement> void deepCopy(ENamedElement context, EReference ref, List<T> receiving, T merged) {
		val copy = EcoreUtil::copy(merged)
		receiving += copy

		val newAnn = EcoreFactory.eINSTANCE.createEAnnotation => [
			source = ORIGIN_ANNOTATION_SOURCE
			references += merged
			references += ref
		]

		if (ref.containment)
			copy.EAnnotations += newAnn
		else
			context.EAnnotations += newAnn
	}

	private def <T extends ENamedElement> void doCollectionsMerge(ENamedElement context, EReference ref, List<T> rcv, List<T> merged) {
		merged.forEach[m |
			val match = rcv.findFirst[r | r.doMatch(m)]

			if (match !== null)
				match.doMerge(m)
			else
				deepCopy(context, ref, rcv, m)
		]
	}

	private def int maxBound(int a, int b) {
		return
			if (a == -1 || b == -1) -1
			else #[a, b].max
	}

	private def void addConflict(ENamedElement rcv, ENamedElement merged, EReference ref, String message) {
		addConflict(rcv, merged, ref, message, null)
	}

	private def void addConflict(ENamedElement rcv, ENamedElement merged, EReference ref, Diagnostic d) {
		addConflict(
			rcv,
			merged,
			ref,
			'''Cannot merge «merged.uniqueId» with «rcv.uniqueId».«ref.name»: «d.message»''',
			d
		)
	}

	private def void addConflict(ENamedElement rcv, ENamedElement merged, EReference ref, String message, Diagnostic d) {
		conflicts += new Conflict(rcv, merged, ref, message, d)
	}

	override List<Conflict> getConflicts() {
		return conflicts
	}
}
