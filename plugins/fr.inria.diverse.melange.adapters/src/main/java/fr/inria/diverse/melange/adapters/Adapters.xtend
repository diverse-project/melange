package fr.inria.diverse.melange.adapters

import com.google.common.base.Function
import com.google.common.collect.Iterators
import java.lang.reflect.InvocationTargetException
import java.util.Collection
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.BasicInternalEList
import org.eclipse.xtend.lib.annotations.Delegate

interface GenericAdapter<E> {
	def E getAdaptee()
	def void setAdaptee(E a)
}

class ListAdapter<E, F> implements GenericAdapter<List<F>>, List<E>
{
	List<F> adaptee
	Class<? extends GenericAdapter<F>> adapType

	def static <E, F> ListAdapter<E, F> newInstance(List<F> a, Class<? extends GenericAdapter<F>> type) {
		return new ListAdapter<E, F>(a, type)
	}

	new(List<F> a, Class<? extends GenericAdapter<F>> type) {
		adaptee = a
		adapType = type
	}

	override add(E e) {
		return adaptee.add(decapsulate(e))
	}

	override add(int index, E element) {
		adaptee.add(index, decapsulate(element))
	}

	override addAll(Collection<? extends E> c) {
		c.forEach[adaptee.add(decapsulate(it))]
		return true
	}

	override addAll(int index, Collection<? extends E> c) {
		c.forEach[it, i | adaptee.add(index + i, decapsulate(it))]
		return true
	}

	override clear() {
		adaptee.clear
	}

	override contains(Object o) {
		return adaptee.contains(o)
	}

	override containsAll(Collection<?> c) {
		return adaptee.containsAll(c)
	}

	override get(int index) {
		try {
			val adap = adapType.newInstance
			adap.adaptee = adaptee.get(index)
			return adap as E
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		}
	}

	override indexOf(Object o) {
		return adaptee.indexOf(o)
	}

	override isEmpty() {
		return adaptee.isEmpty
	}

	override iterator() {
		return Iterators.transform(adaptee.iterator, new IteratorTranslator<F, E>(adapType))
	}

	override lastIndexOf(Object o) {
		return adaptee.lastIndexOf(decapsulate(o))
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
		return adaptee.remove(decapsulate(o))
	}

	override remove(int index) {
		try {
			val adap = adapType.newInstance
			adap.adaptee = adaptee.remove(index)
			return adap as E
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		}
	}

	override removeAll(Collection<?> c) {
		return adaptee.removeAll(c)
	}

	override retainAll(Collection<?> c) {
		return adaptee.retainAll(c)
	}

	override set(int index, E element) {
		try {
			val adap = adapType.newInstance
			adap.adaptee = adaptee.set(index, decapsulate(element))
			return adap as E
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		}
	}

	override size() {
		return adaptee.size
	}

	override subList(int fromIndex, int toIndex) {
		return new ListAdapter<E, F>(adaptee.subList(fromIndex, toIndex), adapType)
	}

	override toArray() {
		return adaptee.toArray
	}

	override <T> toArray(T[] a) {
		return adaptee.toArray(a)
	}

	def F decapsulate(Object e) {
		return (e as GenericAdapter<F>).adaptee
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(List<F> a) {
		adaptee = a
	}
}

abstract class EObjectAdapter<E extends EObject> extends EObjectImpl implements EObject, GenericAdapter<E> {
	/** Best. Annotation. Ever. */
	@Delegate protected E adaptee
	protected AdaptersFactory adaptersFactory

	new(AdaptersFactory factory) {
		adaptersFactory = factory
	}

	override getAdaptee() { return adaptee }
	override setAdaptee(E a) { adaptee = a }

	override eContainer() {
		return adaptersFactory.createAdapter(adaptee.eContainer)
	}

	override eContents() {
		val ret = new BasicInternalEList<EObject>(EObject) ;

		adaptee.eContents.forEach[o |
			ret += adaptersFactory.createAdapter(o) ?: o
		]

		return ret
	}

	override eAllContents() {
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
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
		try {
			return adapType.declaredConstructors.head.newInstance(adaptee.move(newPosition, oldPosition)) as E
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		} catch (InvocationTargetException e) {
			// ...
		}
	}
}

class IteratorTranslator<E, F> implements Function<E, F> {
	Class<?> adapType

	new(Class<?> type) { adapType = type }

	override apply(E arg) {
		try {
			val adap = adapType.newInstance as GenericAdapter<E>
			adap.adaptee = arg
			return adap as F
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		}
	}
}

abstract class ResourceAdapter implements GenericAdapter<Resource>, Resource {
	@Delegate protected Resource adaptee
	protected AdaptersFactory adaptersFactory

	new(AdaptersFactory factory) {
		adaptersFactory = factory
	}

	override getAdaptee() {
		return adaptee
	}

	override setAdaptee(Resource a) {
		adaptee = a
	}

	override getContents() {
		val ret = new BasicInternalEList<EObject>(EObject) ;

		adaptee.contents.forEach[o |
			ret += adaptersFactory.createAdapter(o) ?: o
		]

		return ret
	}

	override getAllContents() {
		throw new UnsupportedOperationException("FIXME: Should perform adaptation here")
	}

	override getEObject(String uriFragment) {
		return adaptersFactory.createAdapter(adaptee.getEObject(uriFragment))
	}
}

interface AdaptersFactory {
	def EObjectAdapter<EObject> createAdapter(EObject o)
}
