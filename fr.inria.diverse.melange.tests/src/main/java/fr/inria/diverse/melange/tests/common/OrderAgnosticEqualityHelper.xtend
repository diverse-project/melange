package fr.inria.diverse.melange.tests.common

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

import java.util.ArrayList
import java.util.Comparator
import java.util.Collections
import java.util.List

class OrderAgnosticEObjectComparator implements Comparator<EObject>
{
	override compare(EObject o1, EObject o2) {
		val s1 = extractComparisonString(o1)
		val s2 = extractComparisonString(o2)

		return s1.compareTo(s2)
	}

	private def extractComparisonString(EObject o) {
		o.toString.replaceAll(o.class.name, "").replaceAll(Integer.toHexString(o.hashCode), "")
	}
}

class OrderAgnosticEqualityHelper extends EcoreUtil$EqualityHelper
{
	override equals(List<EObject> l1, List<EObject> l2) {
		val comparator = new OrderAgnosticEObjectComparator
		val ll1 = new ArrayList<EObject>(l1)
		val ll2 = new ArrayList<EObject>(l2)

		Collections.sort(ll1, comparator)
		Collections.sort(ll2, comparator)

		super.equals(ll1, ll2)
	}
}
