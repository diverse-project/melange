package fr.inria.diverse.melange.adapters

import com.google.common.base.Function

/**
 * Used to convert {@link E} objects to {@link F} objects when transforming
 * an iterator on List<{@link E}> to iterator on List<{@link F}>. 
 */
class IteratorTranslator<E, F> implements Function<E, F>
{
	Class<?> adapType

	new(Class<?> type) { adapType = type }

	override apply(E arg) {
		try {
			val adap = adapType.newInstance as GenericAdapter<E>
			adap.adaptee = arg
			return adap as F
		} catch (Exception e) {
			throw new RuntimeException("Cannot instantiate adapter type", e)
		}
	}
}
