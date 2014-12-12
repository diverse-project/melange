package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

interface MelangeProcessor
{
	def boolean preProcess(ModelTypingSpace root)
	def boolean postProcess(ModelTypingSpace root)
}
