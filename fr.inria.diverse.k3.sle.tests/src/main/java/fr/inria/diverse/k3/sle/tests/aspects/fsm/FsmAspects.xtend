package fr.inria.diverse.k3.sle.tests.aspects.fsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = fsm.State)
class StateAspect1 {
	String foo = "foo1"

	def String bar()'''bar1'''
}

@Aspect(className = timedfsm.State)
class StateAspect2 {
	String foo = "foo2"

	def String bar()'''bar2'''
}
