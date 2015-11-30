package fr.inria.diverse.melange.adapters

import com.google.common.collect.Iterators
import java.util.Collection
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject

/**
 * Adapter delegation pattern for manipulating a {@link EList list} of
 * {@link EObject} of type {@link F} as a {@link EList list} of {@link EObject}
 * of type {@link E}, providing that we have an appropriate
 * {@link EListAdapter#adaptersFactory adapters factory} between {@link F}
 * and {@link E}.
 */
class EListAdapter<E extends EObject, F extends EObject> implements GenericAdapter<EList<F>>, EList<E>
{
	EList<F> adaptee
	AdaptersFactory adaptersFactory

	def static <E extends EObject, F extends EObject> EListAdapter<E, F> newInstance(EList<F> a, AdaptersFactory adapFact) {
		return new EListAdapter<E, F>(a, adapFact)
	}

	new(EList<F> a, AdaptersFactory adapFact) {
		adaptee = a
		adaptersFactory = adapFact
	}

	override add(E e) {
		return adaptee.add(e.decapsulate)
	}

	override add(int index, E e) {
		adaptee.add(index, e.decapsulate)
	}

	override addAll(Collection<? extends E> c) {
		return adaptee.addAll(c.map[decapsulate].toList)
	}

	override addAll(int index, Collection<? extends E> c) {
		return adaptee.addAll(index, c.map[decapsulate].toList)
	}

	override clear() {
		adaptee.clear
	}

	override contains(Object o) {
		return adaptee.contains(o.decapsulate)
	}

	override containsAll(Collection<?> c) {
		return adaptee.containsAll(c.map[decapsulate].toList)
	}

	// FIXME: how can we get the current resource and give it to the factory?
	override get(int index) {
		return adaptersFactory.createAdapter(adaptee.get(index), null) as E
	}

	override indexOf(Object o) {
		return adaptee.indexOf(o.decapsulate)
	}

	override isEmpty() {
		return adaptee.isEmpty
	}

	override iterator() {
		return Iterators.transform(adaptee.iterator, new IteratorTranslator<F, E>(adaptersFactory))
	}

	override lastIndexOf(Object o) {
		return adaptee.lastIndexOf(o.decapsulate)
	}

	override listIterator() {
		return new ListIteratorWrapper(
			Iterators.transform(adaptee.listIterator, new IteratorTranslator<F, E>(adaptersFactory))
		)
	}

	override listIterator(int index) {
		return new ListIteratorWrapper(
			Iterators.transform(adaptee.listIterator(index), new IteratorTranslator<F, E>(adaptersFactory))
		)
	}

	override remove(Object o) {
		return adaptee.remove(o.decapsulate)
	}

	// FIXME: how can we get the current resource and give it to the factory?
	override remove(int index) {
		return adaptersFactory.createAdapter(adaptee.remove(index), null) as E
	}

	override removeAll(Collection<?> c) {
		return adaptee.removeAll(c.map[decapsulate].toList)
	}

	override retainAll(Collection<?> c) {
		return adaptee.retainAll(c.map[decapsulate].toList)
	}

	// FIXME: how can we get the current resource and give it to the factory?
	override set(int index, E element) {
		return adaptersFactory.createAdapter(adaptee.set(index, element.decapsulate), null) as E
	}

	override size() {
		return adaptee.size
	}

	override subList(int fromIndex, int toIndex) {
		return EListAdapter::newInstance(
			adaptee.subList(fromIndex, toIndex) as EList<F>, adaptersFactory)
	}

	// FIXME: how can we get the current resource and give it to the factory?
	override toArray() {
		return adaptee.toArray.map[adaptersFactory.createAdapter(it as F, null)]
	}

	// FIXME: Won't work
	override <T> toArray(T[] a) {
		return adaptee.toArray(a)
	}

	def F decapsulate(Object e) {
		if (e instanceof GenericAdapter<?>)
			return (e as GenericAdapter<F>).adaptee
		else
			return e as F
	}

	override move(int newPosition, E object) {
		adaptee.move(newPosition, object.decapsulate)
	}

	// FIXME: how can we get the current resource and give it to the factory?
	override move(int newPosition, int oldPosition) {
		return adaptersFactory.createAdapter(adaptee.move(newPosition, oldPosition), null) as E
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(EList<F> a) {
		adaptee = a
	}
}
