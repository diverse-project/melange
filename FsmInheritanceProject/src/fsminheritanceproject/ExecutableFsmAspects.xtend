package fsminheritanceproject

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import static extension fsminheritanceproject.ExecutableFsmAspect.*
import static extension fsminheritanceproject.ExecutableStateAspect.*
import static extension fsminheritanceproject.ExecutableTransitionAspect.*
import static extension fsminheritanceproject.TimedTransitionAspect.*

@Aspect(className = fsm.FSM)
class ExecutableFsmAspect
{
	String currentState
	
	def void execute(String input) {
		if (_self.currentState == null)
			_self.currentState = _self.initialState.name
		
		for (i : 0 ..< input.length) {
			val current = _self.ownedState.findFirst[name == _self.currentState]
			try
			{
				current.step(input.charAt(i))
			} catch (NoFireableTransition e) {
				println(" No fireable transition in " + current.name + " for input " + input.charAt(i))
				return
			} catch (NonDeterminism e) {
				println(" Non-determinism in " + current.name + " for input " + input.charAt(i))
				return
			}
		}
	}
}

@Aspect(className = fsm.State)
class ExecutableStateAspect
{
	def void step(char c) {
		val validTrans = _self.outgoingTransition.filter[input.equals(String.valueOf(c))]
		
		if (validTrans.empty)
			throw new NoFireableTransition
		if (validTrans.size > 1)
			throw new NonDeterminism

		validTrans.head.fire
	}
}

@Aspect(className = fsm.Transition)
class ExecutableTransitionAspect
{
	def void fire() {
		print(_self.output)
		_self.source.owningFSM.currentState = _self.target.name
	}
}

@Aspect(className = timedfsm.Transition, adapter = "fsminheritanceproject.timedfsm.adapters.fsm.TransitionAdapter")
class TimedTransitionAspect extends ExecutableTransitionAspect {
	int time
	
	@OverrideAspectMethod
	def void fire() {
		if (TimedTransitionAspect.timeIsOk(_self))
			_self.super_fire
		else throw new TimeConstraintException
	}

	def boolean timeIsOk() {
		_self.time > 0
	}
}

abstract class FsmException extends Exception {}
class NoFireableTransition extends FsmException {}
class NonDeterminism extends FsmException {}
class TimeConstraintException extends FsmException {}
