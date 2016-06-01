package fr.inria.diverse.melanger

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minifsm.FSM
import fr.inria.diverse.minifsm.State
import fr.inria.diverse.minifsm.Transition
import fr.inria.diverse.context.minilang.Context
import fr.inria.diverse.minilang.Block
import fr.inria.diverse.minilang.BooleanExpression

import static extension fr.inria.diverse.melanger.FSMAspect.*
import static extension minilang.aspects.BlockAspect.*
import static extension minilang.aspects.StatementAspect.*
import static extension minilang.aspects.BooleanExpressionAspect.*

@Aspect(className=FSM)
class FSMAspect {
	public var Context context
}

@Aspect(className=State)
class StateAspect {
	
	public var Block block
	
	def void execute(){
		println("Exec "+_self.name)
		_self.block.statement.forEach[execute(_self.fsm.context)]
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	
	public var BooleanExpression expression
	
	def boolean isActivated(){
		return _self.expression.eval(_self.fsm.context)
	}
}