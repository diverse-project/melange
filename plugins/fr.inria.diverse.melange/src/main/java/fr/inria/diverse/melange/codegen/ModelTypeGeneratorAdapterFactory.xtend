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
package fr.inria.diverse.melange.codegen

import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory

/**
 * A specialized {@link GenModelGeneratorAdapterFactory} that is used to tune
 * the generation of the Java code of {@link ModelType}.
 * 
 * @see ModelTypeGenPackageGeneratorAdapter
 * @see ModelTypeGenClassGeneratorAdapter
 */
class ModelTypeGeneratorAdapterFactory extends GenModelGeneratorAdapterFactory {
	protected GenBaseGeneratorAdapter overridedGenPackageGeneratorAdapter
	protected GenBaseGeneratorAdapter overridedGenClassGeneratorAdapter

	override createGenPackageAdapter() {
		if (overridedGenPackageGeneratorAdapter === null)
			overridedGenPackageGeneratorAdapter = new ModelTypeGenPackageGeneratorAdapter(this)

		return overridedGenPackageGeneratorAdapter
	}

	override createGenClassAdapter() {
		if (overridedGenClassGeneratorAdapter === null)
			overridedGenClassGeneratorAdapter = new ModelTypeGenClassGeneratorAdapter(this)

		return overridedGenClassGeneratorAdapter
	}
}
