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
package fr.inria.diverse.melange.adapters

import com.google.common.collect.Iterators
import java.util.Collection
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

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
	protected Resource eResource
	AdaptersFactory adaptersFactory

	def static <E extends EObject, F extends EObject> EListAdapter<E, F> newInstance(EList<F> a, AdaptersFactory adapFact, Resource resource) {
		return new EListAdapter<E, F>(a, adapFact,resource)
	}

	new(EList<F> a, AdaptersFactory adapFact, Resource resource) {
		adaptee = a
		adaptersFactory = adapFact
		eResource = resource
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
		return adaptersFactory.createAdapter(adaptee.get(index), eResource) as E
	}

	override indexOf(Object o) {
		return adaptee.indexOf(o.decapsulate)
	}

	override isEmpty() {
		return adaptee.isEmpty
	}

	override iterator() {
		return Iterators.transform(adaptee.iterator, new IteratorTranslator<F, E>(adaptersFactory,eResource))
	}

	override lastIndexOf(Object o) {
		return adaptee.lastIndexOf(o.decapsulate)
	}

	override listIterator() {
		throw new UnsupportedOperationException()
	}

	override listIterator(int index) {
		throw new UnsupportedOperationException()
	}

	override remove(Object o) {
		return adaptee.remove(o.decapsulate)
	}

	override remove(int index) {
		return adaptersFactory.createAdapter(adaptee.remove(index), eResource) as E
	}

	override removeAll(Collection<?> c) {
		return adaptee.removeAll(c.map[decapsulate].toList)
	}

	override retainAll(Collection<?> c) {
		return adaptee.retainAll(c.map[decapsulate].toList)
	}

	override set(int index, E element) {
		return adaptersFactory.createAdapter(adaptee.set(index, element.decapsulate), eResource) as E
	}

	override size() {
		return adaptee.size
	}

	override subList(int fromIndex, int toIndex) {
		return EListAdapter::newInstance(
			adaptee.subList(fromIndex, toIndex) as EList<F>, adaptersFactory,eResource)
	}

	override toArray() {
		return adaptee.toArray.map[adaptersFactory.createAdapter(it as F, eResource)]
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

	override move(int newPosition, int oldPosition) {
		return adaptersFactory.createAdapter(adaptee.move(newPosition, oldPosition), eResource) as E
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(EList<F> a) {
		adaptee = a
	}
}
