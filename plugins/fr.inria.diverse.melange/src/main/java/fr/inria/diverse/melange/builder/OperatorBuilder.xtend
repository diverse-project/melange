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
package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.Operator

/**
 * A specialized {@link Builder} dedicated to {@link Operator}s.
 */
abstract class OperatorBuilder<T extends Operator> extends AbstractBuilder {
	public T source

	new(T source) {
		super()
		this.source = source
	}
}
