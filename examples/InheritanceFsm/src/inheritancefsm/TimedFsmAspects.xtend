package inheritancefsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = fsm.FSM)
class FSMAspect {
	fsm.State current

	def void execute() {
		
	}
}

@Aspect(className = fsm.State)
class StateAspect {
	def void step() {
		
	}
}

@Aspect(className = fsm.Transition)
class TransitionAspect {
	int time = 0

	def void fire() {
		
	}
}
