package fr.inria.diverse.melanger

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.Transition
import fr.inria.diverse.context.minilang.Context
import fr.inria.diverse.minilang.Block
import fr.inria.diverse.minilang.BooleanExpression

import static extension fr.inria.diverse.melanger.FSMGlue.*
import static extension minilang.aspects.BlockAspect.*
import static extension minilang.aspects.StatementAspect.*
import static extension minilang.aspects.BooleanExpressionAspect.*
import minifsm.aspects.FSMAspect
import minifsm.aspects.StateAspect
import minifsm.aspects.TransitionAspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=FSM)
class FSMGlue extends FSMAspect{
	public var Context context
}

@Aspect(className=State)
class StateGlue extends StateAspect{
	
	public var Block block
	
	@OverrideAspectMethod
	override void execute(){
		println("Exec "+_self.name)
		_self.block.statement.forEach[execute(_self.fsm.context)]
	}
}

@Aspect(className=Transition)
class TransitionGlue extends TransitionAspect{
	
	public var BooleanExpression expression
	
	@OverrideAspectMethod
	override boolean isActivated(){
		return _self.expression.eval(_self.fsm.context)
	}
}