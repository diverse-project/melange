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

import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import org.eclipse.emf.ecore.EPackage
import java.util.Set

/**
 * A specialized {@link OperatorBuilder} dedicated to {@link LanguageOperator}s,
 * ie. {@link Inheritance}, {@link Merge}, and {@link Slice}.
 */
abstract class LanguageOperatorBuilder<T extends LanguageOperator> extends OperatorBuilder<T> {
	/**
	 * The set of {@link EPackage} built from the {@link Language}
	 * pointed by the current {@link LanguageOperator}.
	 */
	protected Set<EPackage> targetModel
	/**
	 * The {@link ModelTypingSpaceBuilder} used to build the {@link ModelTypingSpace}
	 * to which the current {@link LanguageOperator} belongs.
	 */
	protected ModelTypingSpaceBuilder root

	new(T op, ModelTypingSpaceBuilder root) {
		super(op)
		this.root = root
		targetModel = newHashSet
	}

	override preBuild() {
		super.preBuild

		val langBuilder = root.getBuilder(source.targetLanguage)

		if (langBuilder.isBuilding)
			errors.add(
				new BuilderError(
					  '''Cyclic dependency between «source.targetLanguage.name» '''
					+ '''and «source.owningLanguage.name»''',source)
			)

		targetModel = langBuilder.model
		if (targetModel.isEmpty && langBuilder.errors.empty) {
			langBuilder.build()

			if (!langBuilder.errors.empty)
				errors.add(
					new BuilderError(
						  '''Language «source.targetLanguage.name» has errors '''
						+ '''in its definition''', source)
				)

			targetModel = langBuilder.model
		}
	}
}
