package inheritanceoverriding

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fsm.FSM
import fsm.State
import fsm.Transition

@Aspect(className = FSM)
class A1 {
	public int i1
	def String f1() { return "A1::f1" }
}

@Aspect(className = State)
class B1 {
	public int i2
	def String f2() { return "B1::f2" }
}

@Aspect(className = Transition)
class C1 {
	public int i3
	def String f3() { return "C1::f3" }
}

@Aspect(className = FSM)
class A2 {
	public int i4
	def String f4() { return "A2::f4" }
}

@Aspect(className = State)
class B2 {
	public int i5
	def String f5() { return "B2::f5" }
}

@Aspect(className = Transition)
class C2 {
	public int i6
	def String f6() { return "C2::f6" }
}

@Aspect(className = FSM)
class OverrideA1 {
	def String f1() { return "OverrideA1::f1" }
}

@Aspect(className = State)
class OverrideB2 {
	def String f5() { return "OverrideB2::f5" }
}

@Aspect(className = Transition)
class OverrideC1 {
	def String f3() { return "OverrideC1::f3" }
}
