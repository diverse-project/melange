package simpleaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main

import timedfsm.fsm.FSM
import timedfsm.fsm.State
import timedfsm.fsm.Transition

import static extension simpleaspects.TimedFsmAspect.*
import static extension simpleaspects.TimedStateAspect.*
import static extension simpleaspects.TimedTransitionAspect.*

@Aspect(className = FSM)
class TimedFsmAspect
{
	public State current

	@Main
	def void execute(String input) {
		if (_self.current === null)
			_self.current = _self.initialState

		for (i : 0 ..< input.length)
			_self.current.step(input.charAt(i))
	}
}

@Aspect(className = State)
class TimedStateAspect
{
	def void step(char c) {
		val validTrans =
			_self.outgoingTransition
			.filter[input.equals(String.valueOf(c))]

		if (validTrans.size > 0)
			validTrans.head.fire
	}
}

@Aspect(className = Transition)
class TimedTransitionAspect
{
	def void fire() {
		if (_self.timeIsOk) {
			print(_self.output + "(" + _self.time + ")")
			_self.source.owningFSM.current = _self.target
		}
	}

	def boolean timeIsOk() {
		return _self.time > 0
	}
}
