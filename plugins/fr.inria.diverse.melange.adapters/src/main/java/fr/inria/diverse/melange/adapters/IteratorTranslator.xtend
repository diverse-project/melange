package fr.inria.diverse.melange.adapters

import com.google.common.base.Function
import org.eclipse.emf.ecore.EObject

/**
 * Used to convert {@link E} objects to {@link F} objects when transforming
 * an iterator on List<{@link E}> to iterator on List<{@link F}>. 
 */
class IteratorTranslator<E extends EObject, F> implements Function<E, F>
{
	AdaptersFactory adaptersFactory

	new(AdaptersFactory adapFact) { adaptersFactory = adapFact }

	override apply(E arg) {
		try {
			val adap = adaptersFactory.createAdapter(arg, null)
			adap.adaptee = arg
			return adap as F
		} catch (Exception e) {
			throw new RuntimeException("Cannot instantiate adapter type", e)
		}
	}
}
