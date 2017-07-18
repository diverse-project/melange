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

import fr.inria.diverse.melange.metamodel.melange.Inheritance
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Builder for the {@link Inheritance} operator.
 */
class InheritanceBuilder extends LanguageOperatorBuilder<Inheritance> {
	new(Inheritance op, ModelTypingSpaceBuilder root) {
		super(op, root)
	}

	/**
	 * Points {@code AbstractBuilder#model} to the set of {@link EPackage} derived
	 * from the build of the {@link Language} pointed by the {@link Inheritance}
	 * operator.
	 */
	override make() {
		if (!targetModel.isEmpty) {
			model = EcoreUtil::copyAll(targetModel).toSet
		}
	}
}
