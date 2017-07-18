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

import java.util.List

/**
 * A {@link Builder} is an abstract processor associated to a special kind of
 * {@link Operator} that can build part of the syntax and semantics of a 
 * {@link Language} and produce {@link BuilderError} along the way.
 */
interface Builder {
	/**
	 * Implementations must implement their actual processing in the
	 * {@link #make} method. {@link #make} is preceded by {@link #preBuild}
	 * and followed by {@link #postBuild}.
	 */
	def void make()

	/**
	 * Should be called right before the actual {@link #make} method.
	 */
	def void preBuild()

	/**
	 * Should be called right after the actual {@link #make} method.
	 */
	def void postBuild()

	/**
	 * Returns all the {@link BuilderError} constructed during the
	 * {@link #make} method.
	 */
	def List<BuilderError> getErrors()
}
