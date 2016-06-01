package minifsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.FinalState
import fr.inria.diverse.minifsm.Transition
import fr.inria.diverse.minifsm.Condition

import static extension minifsm.aspects.FSMAspect.*
import static extension minifsm.aspects.StateAspect.*
import static extension minifsm.aspects.FinalStateAspect.*
import static extension minifsm.aspects.TransitionAspect.*
import static extension minifsm.aspects.ConditionAspect.*

@Aspect(className=FSM)
class FSMAspect {
	
	var State currentState
	
	def void execute(){
		println("Start")
		_self.currentState = _self.initialState
		while(_self.currentState !== null){
			_self.currentState.execute
			if(_self.currentState instanceof FinalState)
				_self.currentState = null
			else{
				val candidate = _self.transitions.findFirst[input === _self.currentState && isActivated]
				_self.currentState = candidate?.output
			}
		}
	}
}

@Aspect(className=State)
class StateAspect {
	def void execute(){
		println("Exec "+_self.name)
	}
}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
	def void execute(){
		println("End")
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	def boolean isActivated(){
		//Should eval _self.condition here
		return true
	}
}

@Aspect(className=Condition)
class ConditionAspect {

}



