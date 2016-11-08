package fr.inria.diverse.melanger

import fr.inria.diverse.context.minilang.Context
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.melange.annotation.Containment
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.FinalState
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.Transition
import fr.inria.diverse.minilang.Block
import fr.inria.diverse.minilang.BooleanExpression
import minifsm.aspects.FSMAspect
import minifsm.aspects.StateAspect
import minifsm.aspects.TransitionAspect

import static extension fr.inria.diverse.melanger.FSMGlue.*
import static extension minilang.aspects.BooleanExpressionAspect.*
import static extension minilang.aspects.StatementAspect.*

@Aspect(className=FSM)
class FSMGlue extends FSMAspect{
	@Containment
	public var Context context
}

@Aspect(className=State)
class StateGlue extends StateAspect{
	
	@Containment
	public var Block block
	
	override void execute(){
		_self.block?.statement?.forEach[execute(_self.fsm.context)]
	}
}

@Aspect(className=FinalState)
class FinalStateGlue extends StateGlue{

	@OverrideAspectMethod
	def void execute(){
		_self.super_execute
		println("End")
	}
}

@Aspect(className=Transition)
class TransitionGlue extends TransitionAspect{
	
	@Containment
	public var BooleanExpression expression
	
	override boolean isActivated(){
		return _self.expression == null || _self.expression.eval(_self.fsm.context)
	}
}