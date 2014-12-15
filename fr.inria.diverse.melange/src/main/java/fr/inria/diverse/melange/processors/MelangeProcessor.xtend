package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

interface MelangeProcessor
{
	def void preProcess(ModelTypingSpace root)
	def void postProcess(ModelTypingSpace root)
}
