package fr.inria.diverse.k3.sle.processors

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

interface K3SLEProcessor
{
	def boolean preProcess(ModelTypingSpace root)
	def boolean postProcess(ModelTypingSpace root)
}
