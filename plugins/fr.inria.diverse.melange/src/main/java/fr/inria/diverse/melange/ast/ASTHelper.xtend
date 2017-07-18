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
package fr.inria.diverse.melange.ast

import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.Mapping
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

/**
 * A collection of utilities around Melange's AST
 */
class ASTHelper
{
	def Iterable<Language> getLanguages(ModelTypingSpace root) {
		return root.elements.filter(Language)
	}

	def Iterable<ModelType> getModelTypes(ModelTypingSpace root) {
		return root.elements.filter(ModelType)
	}

	def Iterable<XbaseTransformation> getTransformations(ModelTypingSpace root) {
		return root.elements.filter(XbaseTransformation)
	}

	def Iterable<Mapping> getMappings(ModelTypingSpace root) {
		return root.elements.filter(Mapping)
	}
}
