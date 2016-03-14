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
