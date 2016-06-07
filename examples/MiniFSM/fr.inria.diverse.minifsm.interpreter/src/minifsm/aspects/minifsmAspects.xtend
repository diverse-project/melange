package minifsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.FinalState
import fr.inria.diverse.minifsm.Transition

import static extension minifsm.aspects.FSMAspect.*
import static extension minifsm.aspects.StateAspect.*
import static extension minifsm.aspects.FinalStateAspect.*
import static extension minifsm.aspects.TransitionAspect.*
import org.eclipse.emf.common.util.EList
import java.util.Iterator

@Aspect(className=FSM)
class FSMAspect {
	
	public var State currentState
	public var String currentEvent
	
	def void execute(EList<String> events){
		println("Start")
		
		val eventIt = events.iterator
		if(eventIt.hasNext)
			_self.currentEvent = eventIt.next
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
		return _self.event === null || _self.fsm.currentEvent == _self.event
	}
}


