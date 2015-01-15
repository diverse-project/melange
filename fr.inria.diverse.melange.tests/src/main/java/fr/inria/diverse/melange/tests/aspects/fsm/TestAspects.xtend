package fr.inria.diverse.melange.tests.aspects.fsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fsm.FSM
import fsm.State
import fsm.Transition

import java.util.ArrayList
import java.util.Collection
import java.util.List

// TODO: Inheritance, can't test static, etc.
// TODO: Test overriding EMF code, etc.

@Aspect(className = State)
class SimpleAttributes {
	String foo
	int i
	boolean b
	char c
	long l
	double d
	float f
}

@Aspect(className = Transition)
class AttributesCollections {
	List<String> ls
	ArrayList<String> als
}

@Aspect(className = FSM)
class SimpleReferences {
	State s
	FSM f
}

@Aspect(className = State)
class ReferencesCollections {
	List<State> ls
	ArrayList<FSM> lf
	Collection<Transition> lt
}

interface A {}
class B {}
enum C {
	X, Y, Z
}
@Aspect(className = Transition)
class ExternalReferences {
	A a
	List<B> b
	C c

	def Object foo(A arg1, C arg2) { return null }
}

@Aspect(className = Transition)
class Visibility {
	private int i
	protected int j
	public int k
	int l

	def void f1() {}
	public def void f2() {}
	protected def void f3() {}
	private def void f4() {}
}

@Aspect(className = FSM)
class Operations {
	def int i(int arg1) { return 0 }
	def void j(String arg1, Transition arg2) {}
	def List<State> k(List<Transition> arg1) { return null }
}
