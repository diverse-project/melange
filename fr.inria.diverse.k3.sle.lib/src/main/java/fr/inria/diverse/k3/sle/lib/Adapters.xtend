package fr.inria.diverse.k3.sle.lib

import com.google.common.base.Function

import com.google.common.collect.Iterators

import java.lang.reflect.InvocationTargetException

import java.util.Collection
import java.util.List
import java.util.ListIterator

import org.eclipse.emf.common.notify.Notification

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EStructuralFeature

interface GenericAdapter<E> {
	def E getAdaptee()
	def void setAdaptee(E a)
}

class ListAdapter<E, F> implements List<E>
{
	List<F> adaptee
	Class<? extends GenericAdapter<F>> adapType

	new(List<F> a, Class<? extends GenericAdapter<F>> type) {
		adaptee = a
		adapType = type
	}

	override add(E e) {
		adaptee.add(decapsulate(e))
	}

	override add(int index, E element) {
		adaptee.add(index, decapsulate(element))
	}

	override addAll(Collection<? extends E> c) {
		c.forEach[adaptee.add(decapsulate(it))]
		true
	}

	override addAll(int index, Collection<? extends E> c) {
		c.forEach[it, i | adaptee.add(index + i, decapsulate(it))]
		true
	}

	override clear() {
		adaptee.clear
	}

	override contains(Object o) {
		adaptee.contains(o)
	}

	override containsAll(Collection<?> c) {
		adaptee.containsAll(c)
	}

	override get(int index) {
		val adap = adapType.newInstance
		adap.adaptee = adaptee.get(index)
		return adap as E
	}

	override indexOf(Object o) {
		adaptee.indexOf(o)
	}

	override isEmpty() {
		adaptee.isEmpty
	}

	override iterator() {
		Iterators.transform(adaptee.iterator, new IteratorTranslator<F, E>(adapType))
	}

	override lastIndexOf(Object o) {
		adaptee.lastIndexOf(decapsulate(o))
	}

	override listIterator() {
		Iterators.transform(adaptee.listIterator, new IteratorTranslator<F, E>(adapType)) as ListIterator<E>
	}

	override listIterator(int index) {
		Iterators.transform(adaptee.listIterator(index), new IteratorTranslator<F, E>(adapType)) as ListIterator<E>
	}

	override remove(Object o) {
		adaptee.remove(decapsulate(o))
	}

	override remove(int index) {
		val adap = adapType.newInstance
		adap.adaptee = adaptee.remove(index)
		return adap as E
	}

	override removeAll(Collection<?> c) {
		adaptee.removeAll(c)
	}

	override retainAll(Collection<?> c) {
		adaptee.retainAll(c)
	}

	override set(int index, E element) {
		val adap = adapType.newInstance
		adap.adaptee = adaptee.set(index, decapsulate(element))
		return adap as E
	}

	override size() {
		adaptee.size
	}

	override subList(int fromIndex, int toIndex) {
		new ListAdapter<E, F>(adaptee.subList(fromIndex, toIndex), adapType)
	}

	override toArray() {
		adaptee.toArray
	}

	override <T> toArray(T[] a) {
		adaptee.toArray(a)
	}

	def decapsulate(Object e) {
		(e as GenericAdapter<F>).adaptee
	}
}

abstract class EObjectAdapter<E extends EObject> implements EObject, GenericAdapter<E> {
	E adaptee

	override getAdaptee() { adaptee }
	override setAdaptee(E a) { adaptee = a }

	override eAllContents() {
		adaptee.eAllContents
	}

	override eClass() {
		adaptee.eClass
	}

	override eContainer() {
		adaptee.eContainer
	}

	override eContainingFeature() {
		adaptee.eContainingFeature
	}

	override eContainmentFeature() {
		adaptee.eContainmentFeature
	}

	override eContents() {
		adaptee.eContents
	}

	override eCrossReferences() {
		adaptee.eCrossReferences
	}

	override eGet(EStructuralFeature feature) {
		adaptee.eGet(feature)
	}

	override eGet(EStructuralFeature feature, boolean resolve) {
		adaptee.eGet(feature, resolve)
	}

	override eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		adaptee.eInvoke(operation, arguments)
	}

	override eIsProxy() {
		adaptee.eIsProxy
	}

	override eIsSet(EStructuralFeature feature) {
		adaptee.eIsSet(feature)
	}

	override eResource() {
		adaptee.eResource
	}

	override eSet(EStructuralFeature feature, Object newValue) {
		adaptee.eSet(feature, newValue)
	}

	override eUnset(EStructuralFeature feature) {
		adaptee.eUnset(feature)
	}

	override eAdapters() {
		adaptee.eAdapters
	}

	override eDeliver() {
		adaptee.eDeliver
	}

	override eNotify(Notification notification) {
		adaptee.eNotify(notification)
	}

	override eSetDeliver(boolean deliver) {
		adaptee.eSetDeliver(deliver)
	}
}

class EListAdapter<E, F> extends ListAdapter<E, F> implements EList<E>
{
	EList<F> adaptee
	Class<? extends GenericAdapter<F>> adapType

	new(EList<F> a, Class<? extends GenericAdapter<F>> type) {
		super(a, type)
		adaptee = a
		adapType = type
	}

	override move(int newPosition, E object) {
		adaptee.move(newPosition, (object as GenericAdapter<F>).adaptee)
	}

	override move(int newPosition, int oldPosition) {
		adapType.declaredConstructors.head.newInstance(adaptee.move(newPosition, oldPosition)) as E
	}
}

class IteratorTranslator<E, F> implements Function<E, F> {
	Class<?> adapType

	new(Class<?> type) { adapType = type }

	override apply(E arg) {
		val adap = adapType.newInstance as GenericAdapter<E>
		adap.adaptee = arg
		return adap as F
	}
}
