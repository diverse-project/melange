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

import com.google.inject.Inject
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Import

/**
 * Builder for the {@link Import} operator.
 */
class ImportBuilder extends OperatorBuilder<Import> {
	@Inject ModelUtils modelUtils
	@Inject extension RenamerHelper

	new(Import source) {
		super(source)
	}

	/**
	 * Loads the {@link EPackage} associated to the {@link Import} operator
	 * and apply the associated renaming rules.
	 */
	override make() {
		model = modelUtils.loadAllPkgs(source.ecoreUri).filter[ESuperPackage == null].toSet
		model.forEach[applyRenaming(source.mappingRules)]
	}
}
