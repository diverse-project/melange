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
 * Just a dummy implementation of {@link MelangeProcessor} that automatically
 * browses the current {@link Resource} and dispatches to the most precise
 * method depending on the actual type of the current {@link EObject}. 
 */
class DispatchMelangeProcessor implements MelangeProcessor
{
	override preProcess(EObject object, boolean preLinkingPhase) {
		object._preProcess(preLinkingPhase)
	}

	def void _preProcess(EObject object, boolean preLinkingPhase) {
		if (object !== null)
			object.eContents.forEach[preProcess(preLinkingPhase)]
	}

	override postProcess(EObject object) {
		object._postProcess
	}

	def void _postProcess(EObject object) {
		if (object !== null)
			object.eContents.forEach[postProcess]
	}
}
