package fr.inria.diverse.melanger

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.Transition
import fr.inria.diverse.context.minilang.Context
import fr.inria.diverse.minilang.Block
import fr.inria.diverse.minilang.BooleanExpression

import static extension fr.inria.diverse.melanger.FSMGlue.*
import static extension fr.inria.diverse.melanger.StateGlue.*
import static extension fr.inria.diverse.melanger.TransitionGlue.*
import static extension minilang.aspects.BlockAspect.*
import static extension minilang.aspects.StatementAspect.*
import static extension minilang.aspects.BooleanExpressionAspect.*
import minifsm.aspects.FSMAspect
import minifsm.aspects.StateAspect
import minifsm.aspects.TransitionAspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import fr.inria.diverse.melanger.melangedlang.minifsm.FinalState
import org.eclipse.emf.common.util.EList

@Aspect(className=FSM)
class FSMGlue extends FSMAspect{
	@Containment
	public var Context context
	
	override void execute(EList<String> events){
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
class StateGlue extends StateAspect{
	
	@Containment
	public var Block block
	
	@OverrideAspectMethod
	override void execute(){
		println("Exec "+_self.name)
		_self.block.statement.forEach[execute(_self.fsm.context)]
	}
}

@Aspect(className=Transition)
class TransitionGlue extends TransitionAspect{
	
	@Containment
	public var BooleanExpression expression
	
	@OverrideAspectMethod
	override boolean isActivated(){
		return _self.expression.eval(_self.fsm.context)
	}
}