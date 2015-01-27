package inheritancefsm

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className = timedfsm.FSM)
class FSMAspect {
	timedfsm.State current

	def void execute() {
		
	}
}

@Aspect(className = timedfsm.State)
class StateAspect {
	def void step() {
		
	}
}

@Aspect(className = timedfsm.Transition)
class TransitionAspect {
	int time = 0

	def void step() {
		
	}
}
