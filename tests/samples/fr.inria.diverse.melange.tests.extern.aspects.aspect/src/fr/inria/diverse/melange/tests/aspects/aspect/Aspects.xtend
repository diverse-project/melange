package fr.inria.diverse.melange.tests.aspects.aspect

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = fsm.State)
class StateAspect1 {
	def String foo()'''foo!'''
}

@Aspect(className = fsm.State)
class StateAspect3 {
	def int baz(String s) { return -1 }
}
