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

import com.google.common.base.Function
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/**
 * Used to convert {@link E} objects to {@link F} objects when transforming
 * an iterator on List<{@link E}> to iterator on List<{@link F}>. 
 */
class IteratorTranslator<E extends EObject, F> implements Function<E, F>
{
	AdaptersFactory adaptersFactory
	protected Resource eResource

	new(AdaptersFactory adapFact, Resource resource) {
		adaptersFactory = adapFact
		eResource = resource
	}

	override apply(E arg) {
		try {
			val adap = adaptersFactory.createAdapter(arg, eResource)
			adap.adaptee = arg
			return adap as F
		} catch (Exception e) {
			throw new RuntimeException("Cannot instantiate adapter type", e)
		}
	}
}
