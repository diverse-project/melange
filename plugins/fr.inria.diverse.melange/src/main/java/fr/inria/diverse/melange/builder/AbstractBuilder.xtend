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
import org.eclipse.emf.ecore.EPackage
import java.util.Set

/**
 * Default implementation of {@link Builder}. An {@link EPackage} {@code model}
 * is attached to the builder that correspond to what has been built.
 * <br>
 * Implementors must later implement the {@link Builder#make} method.
 */
abstract class AbstractBuilder implements Builder {
	/**
	 * A set of {@link EPackage} containing the chunk of syntax generated
	 * from this builder. Each {@link EPackage} is a root of the chunk.
	 */
	protected Set<EPackage> model = newHashSet
	/**
	 * {@link BuilderError} collected during the build.
	 */
	protected List<BuilderError> errors = newArrayList

	override preBuild() {
		model = newHashSet
		errors = newArrayList
	}

	override postBuild() {
	}

	def Set<EPackage> getModel() {
		return model
	}

	override getErrors() {
		return errors
	}

	def final void build() {
		preBuild()
		make()
		postBuild()
	}
}
