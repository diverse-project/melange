package minilang.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.minilang.IntExpression
import fr.inria.diverse.minilang.Integer
import fr.inria.diverse.minilang.Boolean
import fr.inria.diverse.minilang.IntOperation
import fr.inria.diverse.minilang.Equal
import fr.inria.diverse.minilang.Greater
import fr.inria.diverse.minilang.GreaterOrEqual
import fr.inria.diverse.minilang.Less
import fr.inria.diverse.minilang.LessOrEqual
import fr.inria.diverse.minilang.Not
import fr.inria.diverse.minilang.Or
import fr.inria.diverse.minilang.And
import fr.inria.diverse.minilang.Plus
import fr.inria.diverse.minilang.Minus
import fr.inria.diverse.minilang.Multiply
import fr.inria.diverse.minilang.Divide
import fr.inria.diverse.minilang.IntComparison
import fr.inria.diverse.minilang.BooleanExpression
import fr.inria.diverse.minilang.BooleanOperation
import fr.inria.diverse.minilang.BooleanVariableRef
import fr.inria.diverse.minilang.IntVariableRef
import fr.inria.diverse.minilang.VariableRef
import fr.inria.diverse.minilang.Statement
import fr.inria.diverse.minilang.BooleanAssignment
import fr.inria.diverse.minilang.IntAssignment
import fr.inria.diverse.minilang.Block

import static extension minilang.aspects.IntExpressionAspect.*
import static extension minilang.aspects.IntegerAspect.*
import static extension minilang.aspects.BooleanAspect.*
import static extension minilang.aspects.IntOperationAspect.*
import static extension minilang.aspects.EqualAspect.*
import static extension minilang.aspects.GreaterAspect.*
import static extension minilang.aspects.GreaterOrEqualAspect.*
import static extension minilang.aspects.LessAspect.*
import static extension minilang.aspects.LessOrEqualAspect.*
import static extension minilang.aspects.NotAspect.*
import static extension minilang.aspects.OrAspect.*
import static extension minilang.aspects.AndAspect.*
import static extension minilang.aspects.PlusAspect.*
import static extension minilang.aspects.MinusAspect.*
import static extension minilang.aspects.MultiplyAspect.*
import static extension minilang.aspects.DivideAspect.*
import static extension minilang.aspects.IntComparisonAspect.*
import static extension minilang.aspects.BooleanExpressionAspect.*
import static extension minilang.aspects.BooleanOperationAspect.*
import static extension minilang.aspects.BooleanVariableRefAspect.*
import static extension minilang.aspects.IntVariableRefAspect.*
import static extension minilang.aspects.VariableRefAspect.*
import static extension minilang.aspects.StatementAspect.*
import static extension minilang.aspects.BooleanAssignmentAspect.*
import static extension minilang.aspects.IntAssignmentAspect.*
import static extension minilang.aspects.BlockAspect.*
import fr.inria.diverse.context.minilang.Context
import fr.inria.diverse.minilang.If
import fr.inria.diverse.minilang.While
import fr.inria.diverse.context.minilang.BooleanVar
import fr.inria.diverse.context.minilang.IntegerVar
import fr.inria.diverse.minilang.PrintStr
import fr.inria.diverse.minilang.PrintVar
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=IntExpression)
class IntExpressionAspect {
	def int eval(Context ctx){
		0
	}
}

@Aspect(className=Integer)
class IntegerAspect extends IntExpressionAspect {
	def int eval(Context ctx){
		return _self.value
	}
}

@Aspect(className=Boolean)
class BooleanAspect extends BooleanExpressionAspect {
	def boolean eval(Context ctx){
		return _self.value
	}
}

@Aspect(className=IntOperation)
class IntOperationAspect extends IntExpressionAspect {
}

@Aspect(className=Equal)
class EqualAspect extends IntComparisonAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) == _self.right.eval(ctx)
	}
}

@Aspect(className=Greater)
class GreaterAspect extends IntComparisonAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) > _self.right.eval(ctx)
	}
}

@Aspect(className=GreaterOrEqual)
class GreaterOrEqualAspect extends IntComparisonAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) >= _self.right.eval(ctx)
	}
}

@Aspect(className=Less)
class LessAspect extends IntComparisonAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) < _self.right.eval(ctx)
	}
}

@Aspect(className=LessOrEqual)
class LessOrEqualAspect extends IntComparisonAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) <= _self.right.eval(ctx)
	}
}

@Aspect(className=Not)
class NotAspect extends BooleanExpressionAspect {
	def boolean eval(Context ctx){
		return !_self.expression.eval(ctx)
	}
}

@Aspect(className=Or)
class OrAspect extends BooleanOperationAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) || _self.right.eval(ctx)
	}
}

@Aspect(className=And)
class AndAspect extends BooleanOperationAspect {
	def boolean eval(Context ctx){
		return _self.left.eval(ctx) && _self.right.eval(ctx)
	}
}

@Aspect(className=Plus)
class PlusAspect extends IntOperationAspect {
	def int eval(Context ctx){
		return _self.left.eval(ctx) + _self.right.eval(ctx)
	}
}

@Aspect(className=Minus)
class MinusAspect extends IntOperationAspect {
	def int eval(Context ctx){
		return _self.left.eval(ctx) - _self.right.eval(ctx)
	}
}

@Aspect(className=Multiply)
class MultiplyAspect extends IntOperationAspect {
	def int eval(Context ctx){
		return _self.left.eval(ctx) * _self.right.eval(ctx)
	}
}

@Aspect(className=Divide)
class DivideAspect extends IntOperationAspect {
	def int eval(Context ctx){
		return _self.left.eval(ctx) / _self.right.eval(ctx) //TODO: check 0
	}
}

@Aspect(className=IntComparison)
class IntComparisonAspect extends BooleanExpressionAspect {
}

@Aspect(className=BooleanExpression)
class BooleanExpressionAspect {
	def boolean eval(Context ctx){
		return false
	}
}

@Aspect(className=BooleanOperation)
class BooleanOperationAspect extends BooleanExpressionAspect {
}

@Aspect(className=BooleanVariableRef )
class BooleanVariableRefAspect extends BooleanExpressionAspect {
	def boolean eval(Context ctx){
		val variable = ctx.variables
			.filter(BooleanVar)
			.findFirst[name == _self.name]
		if(variable !== null)
			return variable.value
		else
			false
	}
}

@Aspect(className=IntVariableRef)
class IntVariableRefAspect extends IntExpressionAspect {
	def int eval(Context ctx){
		val variable = ctx.variables
			.filter(IntegerVar)
			.findFirst[name == _self.name]
		if(variable !== null)
			return variable.value
		else
			0
	}
}

@Aspect(className=VariableRef)
class VariableRefAspect {

}

@Aspect(className=Statement)
class StatementAspect {
	def void execute(Context ctx){
		
	}
}

@Aspect(className=BooleanAssignment)
class BooleanAssignmentAspect extends StatementAspect {
	def void execute(Context ctx){
		val variable = ctx.variables
			.filter(BooleanVar)
			.findFirst[name == _self.variable.name]
		if(variable !== null)
			variable.value = _self.value.eval(ctx)
	}
}

@Aspect(className=IntAssignment)
class IntAssignmentAspect extends StatementAspect {
	def void execute(Context ctx){
		val variable = ctx.variables
			.filter(IntegerVar)
			.findFirst[name == _self.variable.name]
		if(variable !== null)
			variable.value = _self.value.eval(ctx)
	}
}

@Aspect(className=Block)
class BlockAspect {
	def void execute(Context ctx){
		_self.statement.forEach[execute(ctx)]
	}
}

@Aspect(className=If)
class IfAspect {
	def void execute(Context ctx){
		
		if(_self.condition.eval(ctx)){
			_self.then.execute(ctx)
		}
		else(_self.^else !== null){
			_self.^else.execute(ctx)
		}
	}
}

@Aspect(className=While)
class WhileAspect {
	def void execute(Context ctx){
		
		while(_self.condition.eval(ctx)){
			_self.body.execute(ctx)
		}
	}
}

@Aspect(className=PrintStr)
class PrintStrAspect extends StatementAspect{
	def void execute(Context ctx){
		println(_self.value)
	}
}

@Aspect(className=PrintVar)
class PrintVarAspect extends StatementAspect{
	def void execute(Context ctx){
		val variable = ctx.variables.findFirst[name == _self.value]
		switch (variable) {
			IntegerVar: println(variable.value)
			BooleanVar: println(variable.value)
			default: println(_self.value + "is undefined")
		}
	}
}