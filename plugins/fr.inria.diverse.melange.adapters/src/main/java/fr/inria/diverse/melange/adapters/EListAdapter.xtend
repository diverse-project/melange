package fr.inria.diverse.melange.adapters

import com.google.common.collect.Iterators
import java.util.Collection
import org.eclipse.emf.common.util.EList

/**
 * Adapter delegation pattern for manipulating a {@link EList EList} of
 * elements of type {@link F} as an EList of elements of type {@link E},
 * providing that we have an {@link ListAdapter#adapType adapter type} between
 * {@link F} and {@link E}.
 */
class EListAdapter<E, F> implements GenericAdapter<EList<F>>, EList<E>
{
	EList<F> adaptee
	Class<? extends GenericAdapter<F>> adapType

	def static <E, F> EListAdapter<E, F> newInstance(EList<F> a, Class<? extends GenericAdapter<F>> type) {
		return new EListAdapter<E, F>(a, type)
	}

	new(EList<F> a, Class<? extends GenericAdapter<F>> type) {
		adaptee = a
		adapType = type
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

	override get(int index) {
		return adaptee.get(index).newAdapter
	}

	override indexOf(Object o) {
		return adaptee.indexOf(o.decapsulate)
	}

	override isEmpty() {
		return adaptee.isEmpty
	}

	override iterator() {
		return Iterators.transform(adaptee.iterator, new IteratorTranslator<F, E>(adapType))
	}

	override lastIndexOf(Object o) {
		return adaptee.lastIndexOf(o.decapsulate)
	}

	override listIterator() {
		return new ListIteratorWrapper(
			Iterators.transform(adaptee.listIterator, new IteratorTranslator<F, E>(adapType))
		)
	}

	override listIterator(int index) {
		return new ListIteratorWrapper(
			Iterators.transform(adaptee.listIterator(index), new IteratorTranslator<F, E>(adapType))
		)
	}

	override remove(Object o) {
		return adaptee.remove(o.decapsulate)
	}

	override remove(int index) {
		return adaptee.remove(index).newAdapter
	}

	override removeAll(Collection<?> c) {
		return adaptee.removeAll(c.map[decapsulate].toList)
	}

	override retainAll(Collection<?> c) {
		return adaptee.retainAll(c.map[decapsulate].toList)
	}

	// FIXME
	override set(int index, E element) {
		return adaptee.set(index, element.decapsulate).newAdapter
	}

	override size() {
		return adaptee.size
	}

	override subList(int fromIndex, int toIndex) {
		return EListAdapter::newInstance(
			adaptee.subList(fromIndex, toIndex) as EList<F>, adapType)
	}

	override toArray() {
		return adaptee.toArray.map[	(it as F).newAdapter]
	}

	// FIXME: Won't work
	override <T> toArray(T[] a) {
		return adaptee.toArray(a)
	}

	def F decapsulate(Object e) {
		return (e as GenericAdapter<F>).adaptee
	}

	override move(int newPosition, E object) {
		adaptee.move(newPosition, object.decapsulate)
	}

	override move(int newPosition, int oldPosition) {
		return adaptee.move(newPosition, oldPosition).newAdapter
	}

	private def newAdapter(F o) {
		try {
			val adap = adapType.newInstance
			adap.adaptee = o
			return adap as E
		} catch (Exception e) {
			throw new RuntimeException("Couldn't instantiate adapter", e)
		}
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(EList<F> a) {
		adaptee = a
	}
}
