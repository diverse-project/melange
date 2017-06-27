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

/**
 * Common interface for all adapters (either for objects or lists).
 * Simply allow to dynamically set/get the generic adaptee object.
 */
interface GenericAdapter<E>
{
	def E getAdaptee()
	def void setAdaptee(E a)
}
