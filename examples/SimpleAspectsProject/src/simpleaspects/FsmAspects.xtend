package simpleaspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fsm.FSM
import fsm.State
import fsm.Transition

import static extension simpleaspects.ExecutableFsmAspect.*
import static extension simpleaspects.ExecutableStateAspect.*
import static extension simpleaspects.ExecutableTransitionAspect.*

@Aspect(className = FSM)
class ExecutableFsmAspect
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
class ExecutableStateAspect
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
class ExecutableTransitionAspect
{
	def void fire() {
		print(_self.output)
		_self.source.owningFSM.current = _self.target
	}
}

@Aspect(className = Transition)
class InheritanceTransitionAspect extends ExecutableTransitionAspect
{
	public int time

	@OverrideAspectMethod
	override void fire() {
		if (_self.timeIsOk) {
			super_fire(_self)
		}
	}

	def boolean timeIsOk() {
		return _self.time > 0
	}
}
