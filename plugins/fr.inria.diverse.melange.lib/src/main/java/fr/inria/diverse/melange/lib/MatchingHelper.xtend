/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.lib

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Mapping
import java.util.List
import java.util.Map
import java.util.Set
import java.util.Stack
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference

/**
 * This class manages the type comparison between groups of types
 */
class MatchingHelper
{
	List<EPackage> pkgsA
	List<EPackage> pkgsB
	Map<Pair<ENamedElement, ENamedElement>, Boolean> matches
	Stack<EClass> currentMatching
	Map<EClass, Set<EClass>> presumedMatching
	Mapping mapping
	boolean debug

	@Inject extension EcoreExtensions
	@Inject extension MappingExtensions

	/**
	 * Return true if each metaclass in {@link l2} have an equivalent
	 * metaclass in {@link l1} that is matching
	 */
	def boolean match(List<EPackage> l1, List<EPackage> l2, Mapping map) {
		pkgsA = l1
		pkgsB = l2
		mapping = map

		matches = newHashMap
		currentMatching = new Stack<EClass>
		presumedMatching = newHashMap

		val ret = pkgsB.allClassifiers.filter(EClass).forall[clsB |
			pkgsA.allClassifiers.filter(EClass).exists[clsA |
				clsA.internalMatch(clsB, 0)
			]
		]

		// We still need to check the presumably valid matchings
		val postValidation = presumedMatching.keySet.forall[clsA |
			val matchings = presumedMatching.get(clsA)
			matchings.size == 1 && clsA.internalMatch(matchings.head, 0)
		]

		return ret && postValidation
	}

	def void setDebug(boolean d) {
		debug = d
	}

	def Set<ENamedElement> getUnmatchedElements() {
		return matches.keySet.filter[pair |
			matches.keySet.filter[value == pair.value].forall[p |
				matches.get(p) == false
			]
		].map[value].toSet
	}

	private def void p(String msg, int nesting) {
		if (debug) {
			if (nesting > 0)
				print((1..nesting).map["\t"].join)
			println(msg)
		}
	}

	/**
	 * Return true if both classes have the same name and
	 * each operations, attributes or references in {@link clsB}
	 * have an equivalent element in {@link clsA} that is matching
	 */
	private def boolean internalMatch(EClass clsA, EClass clsB, int nesting) {
		if (matches.containsKey(clsA -> clsB))
			return matches.get(clsA -> clsB)
		else if (!currentMatching.contains(clsB)) {
				if (mapping.namesMatch(clsA, clsB))
					p("Matching " + clsA, nesting)

				currentMatching.push(clsB)

				val ret =
				    mapping.namesMatch(clsA, clsB)
				&&  clsB.EOperations.forall[opB |
						clsA.EOperations.exists[opA | opA.internalMatch(opB, nesting + 1)]
					]
				&&  clsB.EAttributes.forall[attrB |
						clsA.EAttributes.exists[attrA | attrA.internalMatch(attrB, nesting + 1)]
					]
				&&  clsB.EReferences.forall[refB |
						clsA.EReferences.exists[refA | refA.internalMatch(refB, nesting + 1)]
					]
				&& clsB.ESuperTypes.forall[sB |
						clsA.ESuperTypes.exists[sA | sA.internalMatch(sB, nesting + 1)]
					]

				currentMatching.pop
				matches.put(clsA -> clsB, ret)

				if (mapping.namesMatch(clsA, clsB))
					p("Done = " + ret, nesting)

				return ret
		} else if(mapping.namesMatch(clsA, clsB)){
			if (presumedMatching.get(clsA) === null)
				presumedMatching.put(clsA, newHashSet)
			presumedMatching.get(clsA) += clsB

			return true
		}
	}
	
	/**
	 * Return true if both operations have same name and return types,
	 * parameters and exceptions are matching
	 */
	private def boolean internalMatch(EOperation opA, EOperation opB, int nesting) {
		if (matches.containsKey(opA -> opB))
			return matches.get(opA -> opB)

		if (mapping.namesMatch(opA, opB))
			p("Matching " + opA, nesting)

		val ret =
		    mapping.namesMatch(opA, opB)
			// FIXME: Just a hack for now
		&&  if (opA.EType instanceof EDataType || opB.EType instanceof EDataType)// || !pkgsA.allClassifiers.contains(opA.EType))
				mapping.namesMatch(opA.EType, opB.EType)
			else
				(
					   pkgsA.allClassifiers.contains(opA.EType)
					&& pkgsB.allClassifiers.contains(opB.EType)
					&& (opA.EType !== null && opB.EType !== null)
					&& (opA.EType as EClass).internalMatch(opB.EType as EClass, nesting + 1)
				) || (
					opA.EType === null && opB.EType === null
				) || (
					   opA.EType instanceof EClass
					&& (opA.EType as EClass).EAllSuperTypes.contains(opB.EType)
				) || (
					   opA.EType.EPackage.nsURI == "http://www.eclipse.org/emf/2002/Ecore"
					&& opA.EType == opB.EType
				)
		&&  opA.EParameters.internalMatch(opB.EParameters, nesting + 1)
		&&  opA.EExceptions.forall[excA |
				opB.EExceptions.exists[excB |
					if (excA instanceof EDataType || excB instanceof EDataType)
						mapping.namesMatch(excA, excB)
					else
						(
							   pkgsA.allClassifiers.contains(excA)
							&& pkgsB.allClassifiers.contains(excB)
							&& (excA as EClass).internalMatch(excB as EClass, nesting + 1)
						) || (
							(excA as EClass).EAllSuperTypes.contains(excB)
						)
				]
			]

		if (mapping.namesMatch(opA, opB))
			p("Done = " + ret, nesting)

		matches.put(opA -> opB, ret)
		return ret
	}

	/**
	 * Return true if both attributes have the same name, the same properties
	 * and their types have same name.
	 */
	private def boolean internalMatch(EAttribute attrA, EAttribute attrB, int nesting) {
		if (matches.containsKey(attrA -> attrB))
			return matches.get(attrA -> attrB)

		if (mapping.namesMatch(attrA, attrB))
			p("Matching " + attrA, nesting)

		val ret =
		    mapping.namesMatch(attrA, attrB)
		&&  (attrB.changeable || !attrA.changeable)
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
					// TODO: Should also check for literals compatibility
				   attrA.EAttributeType instanceof EEnum && attrB.EAttributeType instanceof EEnum
				&& mapping.namesMatch(attrA.EAttributeType, attrB.EAttributeType)
			)
		)
		&&  (attrA.lowerBound == attrB.lowerBound)
		&&  (attrA.upperBound == attrB.upperBound)

		if (mapping.namesMatch(attrA, attrB))
			p("Done = " + ret, nesting)

		matches.put(attrA -> attrB, ret)
		return ret
	}

	/**
	 * Return true if both references have the same name, same properties and
	 * the type of {@link refA}  is matching the type of {@link refB}
	 */
	private def boolean internalMatch(EReference refA, EReference refB, int nesting) {
		if (matches.containsKey(refA -> refB))
			return matches.get(refA -> refB)

		if (mapping.namesMatch(refA, refB))
			p("Matching " + refA, nesting)

		val ret =
		    mapping.namesMatch(refA, refB)
		&&  (refB.changeable || !refA.changeable)
		&&  (refA.containment == refB.containment)
		&&  (refA.unique == refB.unique)
		&&  (!refA.ordered || refB.ordered)
		&&  (refA.lowerBound == refB.lowerBound)
		&&  (refA.upperBound == refB.upperBound)
		&&  (!(refB.EOpposite !== null) || (refA.EOpposite !== null && mapping.namesMatch(refA, refB)))
		&&  (refA.EReferenceType.internalMatch(refB.EReferenceType, nesting + 1))

		if (mapping.namesMatch(refA, refB))
			p("Done = " + ret, nesting)

		matches.put(refA -> refB, ret)
		return ret
	}

	/**
	 * Return true if paramsB.size() < paramsA.size() and
	 * each parameters in both list are matching
	 */
	private def boolean internalMatch(List<EParameter> paramsA, List<EParameter> paramsB, int nesting) {
		var rank = 0 //index in paramsB

		for (paramB : paramsB) {
			if (rank >= paramsA.size)
				return false

			val paramA = paramsA.get(rank)

			if (paramA.EType instanceof EDataType || paramB.EType instanceof EDataType)
				if (!mapping.namesMatch(paramA.EType, paramB.EType))
					return false
			else if (pkgsA.allClassifiers.contains(paramA.EType)
					&& pkgsB.allClassifiers.contains(paramB.EType))
				if (!(paramA.EType as EClass).internalMatch(paramB.EType as EClass, nesting + 1))
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
}
