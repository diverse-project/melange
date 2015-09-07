package inheritanceoverriding

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = fsm.FSM)
class A1 {
	public int i1
	def void f1() { println("A1::f1") }
}

@Aspect(className = fsm.State)
class B1 {
	public int i2
	def void f2() { println("B1::f2") }
}

@Aspect(className = fsm.Transition)
class C1 {
	public int i3
	def void f3() { println("C1::f3") }
}

@Aspect(className = fsm.FSM)
class A2 {
	public int i4
	def void f4() { println("A2::f4") }
}

@Aspect(className = fsm.State)
class B2 {
	public int i5
	def void f5() { println("B2::f5") }
}

@Aspect(className = fsm.Transition)
class C2 {
	public int i6
	def void f6() { println("C2::f6") }
}

@Aspect(className = fsm.FSM)
class OverrideA1 {
	def void f1() { println("OverrideA1::f1") }
}

@Aspect(className = fsm.State)
class OverrideB2 {
	def void f5() { println("OverrideB2::f5") }
}

@Aspect(className = fsm.Transition)
class OverrideC1 {
	def void f3() { println("OverrideC1::f3") }
}
