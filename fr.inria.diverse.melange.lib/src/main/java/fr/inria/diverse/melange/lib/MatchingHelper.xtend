package fr.inria.diverse.melange.lib

import com.google.inject.Inject

import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Stack

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference

class MatchingHelper
{
	List<EPackage> pkgsA
	List<EPackage> pkgsB
	@Inject extension EcoreExtensions

	Map<Pair<String, String>, Boolean> matches
	Stack<String> currentMatching

	def boolean match(List<EPackage> l1, List<EPackage> l2) {
		pkgsA = l1
		pkgsB = l2

		matches = new HashMap<Pair<String, String>, Boolean>
		currentMatching = new Stack<String>

		return pkgsB.allClassifiers.filter(EClass).forall[clsB |
			pkgsA.allClassifiers.filter(EClass).exists[clsA |
				clsA.internalMatch(clsB)
			]
		]
	}

	private def boolean internalMatch(EClass clsA, EClass clsB) {
		if (matches.containsKey(clsA.uniqueId -> clsB.uniqueId))
			return matches.get(clsA.uniqueId -> clsB.uniqueId)
		else if (!currentMatching.contains(clsB.uniqueId)) {
				currentMatching.push(clsB.uniqueId)

				val ret =
				    clsA.name == clsB.name
				&&  clsB.EOperations.forall[opB |
						clsA.EOperations.exists[opA | opA.internalMatch(opB)]
					]
				&&  clsB.EAttributes.forall[attrB |
						clsA.EAttributes.exists[attrA | attrA.internalMatch(attrB)]
					]
				&&  clsB.EReferences.forall[refB |
						clsA.EReferences.exists[refA | refA.internalMatch(refB)]
					]

				currentMatching.pop
				matches.put(clsA.uniqueId -> clsB.uniqueId, ret)

				return ret
		} else
			return true
	}

	private def boolean internalMatch(EOperation opA, EOperation opB) {
		val ret =
		    opA.name == opB.name
			// FIXME: Just a hack for now
		&&  if (opA.EType instanceof EDataType || opB.EType instanceof EDataType || !pkgsA.allClassifiers.contains(opA.EType))
				opA.EType?.name == opB.EType?.name
			else
				(
					   pkgsA.allClassifiers.contains(opA.EType)
					&& pkgsB.allClassifiers.contains(opB.EType)
					&& (opA.EType as EClass).internalMatch(opB.EType as EClass)
				) || (
					opA.EType === null && opB.EType === null
				) || (
					   opA.EType instanceof EClass
					&& (opA.EType as EClass).EAllSuperTypes.contains(opB.EType)
				)
		&&  opA.EParameters.internalMatch(opB.EParameters)
		&&  opA.EExceptions.forall[excA |
				opB.EExceptions.exists[excB |
					if (excA instanceof EDataType || excB instanceof EDataType)
						excA.name == excB.name
					else
						(
							   pkgsA.allClassifiers.contains(excA)
							&& pkgsB.allClassifiers.contains(excB)
							&& (excA as EClass).internalMatch(excB as EClass)
						) || (
							(excA as EClass).EAllSuperTypes.contains(excB)
						)
				]
			]

		return ret
	}

	private def boolean internalMatch(List<EParameter> paramsA, List<EParameter> paramsB) {
		var rank = 0

		for (paramB : paramsB) {
			if (rank >= paramsA.size)
				return false

			val paramA = paramsA.get(rank)

			if (paramA.EType instanceof EDataType || paramB.EType instanceof EDataType)
				if (paramA.EType.name != paramB.EType.name)
					return false
			else if (pkgsA.allClassifiers.contains(paramA.EType)
					&& pkgsB.allClassifiers.contains(paramB.EType))
				if (!(paramA.EType as EClass).internalMatch(paramB.EType as EClass))
					return false
			else
				if (!(paramA.EType as EClass).EAllSuperTypes.contains(paramB.EType))
					return false

			if (
				   paramA.lowerBound != paramB.lowerBound
				|| paramA.upperBound != paramB.upperBound
				|| paramA.unique != paramB.unique
				|| paramA.ordered && !paramB.ordered
			)
				return false

			rank = rank + 1
		}

		return true
	}

	private def boolean internalMatch(EAttribute attrA, EAttribute attrB) {
		val ret =
		    attrA.name == attrB.name
		&&  (attrA.changeable || !attrB.changeable)
		&&  (attrA.unique == attrB.unique)
		&&  (!attrA.ordered || attrB.ordered)
		// TODO: Actually, it should also work when the underlying Java type
		//        is a subtype of the underlying Java type of the super-datatype
		&&  (
				(attrA.EAttributeType.instanceClassName == attrB.EAttributeType.instanceClassName
				&& attrA.EAttributeType.instanceClassName !== null)
			|| (attrA.EAttributeType.instanceTypeName == attrB.EAttributeType.instanceTypeName
				&& attrA.EAttributeType.instanceTypeName !== null)
			|| (
				   attrA.EAttributeType instanceof EEnum && attrB.EAttributeType instanceof EEnum
				&& attrA.EAttributeType.name == attrB.EAttributeType.name
			)
		)
		&&  (attrA.lowerBound == attrB.lowerBound)
		&&  (attrA.upperBound == attrB.upperBound)

		return ret
	}

	private def boolean internalMatch(EReference refA, EReference refB) {
		val ret =
		    refA.name == refB.name
		&&  (refA.changeable || !refB.changeable)
		&&  (refA.containment == refB.containment)
		&&  (refA.unique == refB.unique)
		&&  (!refA.ordered || refB.ordered)
		&&  (refA.lowerBound == refB.lowerBound)
		&&  (refA.upperBound == refB.upperBound)
		&&  (!(refA.EOpposite !== null) || (refB.EOpposite !== null && refA.EOpposite.name == refB.EOpposite.name))
		&&  (refA.EReferenceType.internalMatch(refB.EReferenceType))

		return ret
	}
}
