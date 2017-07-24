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

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data

/**
 * A dummy data object containing representing an error during the build.
 */
@Data
class BuilderError {
	/**
	 * The error message
	 */
	String message
	/**
	 * The {@link EObject} to which the message is associated
	 */
	EObject location
}
