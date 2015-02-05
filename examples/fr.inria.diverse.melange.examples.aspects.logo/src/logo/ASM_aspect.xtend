package logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.Hashtable
import kmlogo.asm.Back
import kmlogo.asm.Block
import kmlogo.asm.Clear
import kmlogo.asm.Constant
import kmlogo.asm.Div
import kmlogo.asm.Equals
import kmlogo.asm.Expression
import kmlogo.asm.Forward
import kmlogo.asm.Greater
import kmlogo.asm.If
import kmlogo.asm.Instruction
import kmlogo.asm.Left
import kmlogo.asm.LogoProgram
import kmlogo.asm.Lower
import kmlogo.asm.Minus
import kmlogo.asm.Mult
import kmlogo.asm.Parameter
import kmlogo.asm.ParameterCall
import kmlogo.asm.PenDown
import kmlogo.asm.PenUp
import kmlogo.asm.Plus
import kmlogo.asm.Primitive
import kmlogo.asm.ProcCall
import kmlogo.asm.Repeat
import kmlogo.asm.Right
import kmlogo.asm.While
import kmlogo.asm.ControlStructure
import kmlogo.asm.BinaryExp

import static extension logo.InstructionAspect.*
import static extension logo.BackAspect.*
import static extension logo.BlockAspect.*
import static extension logo.ClearAspect.*
import static extension logo.ConstantAspect.*
import static extension logo.DivAspect.*
import static extension logo.EqualsAspect.*
import static extension logo.ExpressionAspect.*
import static extension logo.ForwardAspect.*
import static extension logo.GreaterAspect.*
import static extension logo.IfAspect.*
import static extension logo.InstructionAspect.*
import static extension logo.LeftAspect.*
import static extension logo.LogoProgramAspect.*
import static extension logo.LowerAspect.*
import static extension logo.MinusAspect.*
import static extension logo.MultAspect.*
import static extension logo.ParameterAspect.*
import static extension logo.ParameterCallAspect.*
import static extension logo.PenDownAspect.*
import static extension logo.PenUpAspect.*
import static extension logo.PlusAspect.*
import static extension logo.PrimitiveAspect.*
import static extension logo.ProcCallAspect.*
import static extension logo.RepeatAspect.*
import static extension logo.RightAspect.*
import static extension logo.WhileAspect.*
import static extension logo.ControlStructureAspect.*
import static extension logo.BinaryExpAspect.*
import java.util.ArrayList

@Aspect(className=Instruction) 
class InstructionAspect {

//	ArrayList<?> xx = null

	def public int eval (Context context ) {
		return 0
	}  

}

@Aspect(className=Primitive) 
public class PrimitiveAspect extends InstructionAspect{  

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}

} 

@Aspect(className=Back)
public class BackAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = -1*  _self.steps.eval(context)
		println("BACK "+ param)
		context.turtle.forward(param)
		return 0
	}

}

@Aspect(className=Forward)
public class ForwardAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.steps.eval(context)
		println("FORWARD " + param)
		context.turtle.forward(param)
		return 0
	}

}
 
@Aspect(className=Left)
public class LeftAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = (-1)  *_self.angle.eval(context)
		println("LEFT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=Right)
public class RightAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.angle.eval(context)
		println("RIGHT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=PenDown)
public class PenDownAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENDOWN")
		context.turtle.setPenUp(false)
		return 0
	}

}

@Aspect(className=PenUp)
public class PenUpAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENUP")
		context.turtle.setPenUp(true)
		return 0
	}

}

@Aspect(className=Clear)
public class ClearAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Context context) {
		println("CLEAR")
		context.turtle.reset
		return 0
	}

}

@Aspect(className=Expression)
public class ExpressionAspect extends InstructionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0 
	}

}

@Aspect(className=Constant)
public class ConstantAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.integerValue
	}

}

@Aspect(className=ProcCall)
public class ProcCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("Calling of : " + _self.declaration.name)
		var Hashtable<String,Integer> params = new Hashtable<String,Integer>()
		
		var int i = 0
		for (Expression exp : _self.actualArgs){
			var int currentArg = exp.eval(context)
			params.put(_self.declaration.args.get(i).name,currentArg)
			i= i+1
		}
		
		context.push(params)
		
		 _self.res = 0
		_self.declaration.instructions.forEach[instr | _self.res = instr.eval(context)]
		
		context.pop
		return _self.res
	}

	 int res = 0
}

@Aspect(className=Block)
public class BlockAspect extends ExpressionAspect{

	int res = 0
	@OverrideAspectMethod
	def int eval (Context context) {
		_self.instructions.forEach[instruction | _self.res = instruction.eval(context)]
		return _self.res
	}
	
}

@Aspect(className=ControlStructure)
public class ControlStructureAspect extends InstructionAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=If)
public class IfAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if (_self.condition.eval(context) != 0) {
			return _self.thenPart.eval(context)
		}
		else{
			return _self.elsePart.eval(context)
		}
	}

}

@Aspect(className=Repeat)
public class RepeatAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int time =  _self.condition.eval(context)
		while( time > 0){
			_self.block.eval(context)
			time = time - 1
		}
		return 0
	}

}

@Aspect(className=While)
public class WhileAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		while(_self.condition.eval(context) > 0){
			_self.block.eval(context)
		}
		return 0
	}

}

@Aspect(className=Parameter)
public class ParameterAspect {

	def int eval (Context context) {
		return context.peek.get(_self.name)
	}

}

@Aspect(className=ParameterCall)
public class ParameterCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.parameter.eval(context)
	}

}

@Aspect(className=BinaryExp)
public class BinaryExpAspect extends ExpressionAspect{
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=Plus)
public class PlusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) + _self.rhs.eval(context)
	}

}

@Aspect(className=Minus)
public class MinusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) - _self.rhs.eval(context)
	}

}

@Aspect(className=Mult)
public class MultAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) * _self.rhs.eval(context)
	}

}

@Aspect(className=Div)
public class DivAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.rhs.eval(context) != 0) {
			return _self.lhs.eval(context) / _self.rhs.eval(context)
		}
		else{
			return 0
		}
	}

}

@Aspect(className=Equals)
public class EqualsAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) == _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=Greater)
public class GreaterAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) > _self.rhs.eval(context)) {
			return 1
		}
		else{
			return 0
		}
	}

}

@Aspect(className=Lower)
public class LowerAspect extends BinaryExpAspect{

	def int eval (Context context) {
		if(_self.lhs.eval(context) < _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=LogoProgram)
public class LogoProgramAspect {

	def int eval (Context context) {
		println("LogoProgram eval !")
		_self.instructions.forEach[instr  | instr.eval(context)]
		return 0
	}

}

