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

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter
import org.eclipse.emf.common.util.Monitor

/**
 * A specialized {@link GenClassGeneratorAdapter} used for generating the code
 * of {@link ModelType}s that actually does nothing.
 * Thus, the .impl package won't be generated, as it does not make sense to
 * generate implementation classes for a {@link ModelType}.
 */
class ModelTypeGenClassGeneratorAdapter extends GenClassGeneratorAdapter {
	new(GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory)
	}

	override generateClass(GenClass genClass, Monitor monitor) {
		// We don't want to generate implementation classes
		// as each implementing language will provide its own
		// set of adapters
	}
}
