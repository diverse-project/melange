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
package fr.inria.diverse.melange.processors

import org.eclipse.emf.ecore.EObject

/**
 * Generic interface that must be implemented by Melange processors.
 * #preProcess and #postProcess methods can declare any valid type of 
 * Melange's AST as their first argument, calls are automatically dispatched.
 */
interface MelangeProcessor
{
	/**
	 * Invoked right after Xtext returns a first AST.
	 */
	def void preProcess(EObject object, boolean preLinkingPhase)

	/**
	 * Invoked right before the process ends. Must revert the changes in the
	 * AST introduced by {@link #preProcess}.
	 */
	def void postProcess(EObject object)
}
