package org.xtext.lua.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import java.util.Scanner
import java.util.Stack
import org.eclipse.xtend.lib.annotations.Accessors
import org.xtext.lua.lua.Block
import org.xtext.lua.lua.Chunk
import org.xtext.lua.lua.Expression
import org.xtext.lua.lua.Expression_AccessArray
import org.xtext.lua.lua.Expression_AccessMember
import org.xtext.lua.lua.Expression_And
import org.xtext.lua.lua.Expression_CallFunction
import org.xtext.lua.lua.Expression_CallMemberFunction
import org.xtext.lua.lua.Expression_Concatenation
import org.xtext.lua.lua.Expression_Division
import org.xtext.lua.lua.Expression_Equal
import org.xtext.lua.lua.Expression_Exponentiation
import org.xtext.lua.lua.Expression_False
import org.xtext.lua.lua.Expression_Function
import org.xtext.lua.lua.Expression_Invert
import org.xtext.lua.lua.Expression_Larger
import org.xtext.lua.lua.Expression_Larger_Equal
import org.xtext.lua.lua.Expression_Length
import org.xtext.lua.lua.Expression_Minus
import org.xtext.lua.lua.Expression_Modulo
import org.xtext.lua.lua.Expression_Multiplication
import org.xtext.lua.lua.Expression_Negate
import org.xtext.lua.lua.Expression_Nil
import org.xtext.lua.lua.Expression_Not_Equal
import org.xtext.lua.lua.Expression_Number
import org.xtext.lua.lua.Expression_Or
import org.xtext.lua.lua.Expression_Plus
import org.xtext.lua.lua.Expression_Smaller
import org.xtext.lua.lua.Expression_Smaller_Equal
import org.xtext.lua.lua.Expression_String
import org.xtext.lua.lua.Expression_TableConstructor
import org.xtext.lua.lua.Expression_True
import org.xtext.lua.lua.Expression_VarArgs
import org.xtext.lua.lua.Expression_VariableName
import org.xtext.lua.lua.Field
import org.xtext.lua.lua.Field_AddEntryToTable
import org.xtext.lua.lua.Field_AddEntryToTable_Brackets
import org.xtext.lua.lua.Field_AppendEntryToTable
import org.xtext.lua.lua.Function
import org.xtext.lua.lua.Functioncall_Arguments
import org.xtext.lua.lua.LastStatement
import org.xtext.lua.lua.LastStatement_Break
import org.xtext.lua.lua.LastStatement_Return
import org.xtext.lua.lua.LastStatement_ReturnWithValue
import org.xtext.lua.lua.Statement
import org.xtext.lua.lua.Statement_Assignment
import org.xtext.lua.lua.Statement_Block
import org.xtext.lua.lua.Statement_CallFunction
import org.xtext.lua.lua.Statement_CallMemberFunction
import org.xtext.lua.lua.Statement_For_Generic
import org.xtext.lua.lua.Statement_For_Numeric
import org.xtext.lua.lua.Statement_FunctioncallOrAssignment
import org.xtext.lua.lua.Statement_GlobalFunction_Declaration
import org.xtext.lua.lua.Statement_If_Then_Else
import org.xtext.lua.lua.Statement_If_Then_Else_ElseIfPart
import org.xtext.lua.lua.Statement_LocalFunction_Declaration
import org.xtext.lua.lua.Statement_Local_Variable_Declaration
import org.xtext.lua.lua.Statement_Repeat
import org.xtext.lua.lua.Statement_While

import static extension org.xtext.lua.semantics.BlockAspect.*
import static extension org.xtext.lua.semantics.LuaExpressionAspect.*
import static extension org.xtext.lua.semantics.LastStatementAspect.*
import static extension org.xtext.lua.semantics.StatementAspect.*
import java.util.concurrent.ThreadLocalRandom

class Environment {
	Environment parent
	Stack<Object> values = new Stack<Object>
	Map<String, Object> variables = new HashMap<String, Object>
	Map<String, Function> functions = new HashMap<String, Function>

	def Environment getParent() {
		return parent
	}

	def void setParent(Environment e) {
		parent = e
	}

	def Object getVariable(String s) {
		return variables.get(s)
	}

	def void pushValue(Object o) {
		values.push(o)
	}

	def Object popValue() {
		return values.pop
	}

	def void putFunction(String s, Function f) {
		functions.put(s, f)
	}

	def Function getFunction(String s) {
		return functions.get(s)
	}

	def void putVariable(String s, Object o) {
		variables.put(s, o)
	}

	def void putAllVariables(Map<String, Object> v) {
		variables.putAll(v)
	}

	def void putAllFunctions(Map<String, Function> f) {
		functions.putAll(f)
	}

	def void pushAllValues(Stack<Object> v) {
		values.addAll(v)
	}

	def Stack<Object> getValues() {
		return values
	}

	def Map<String, Object> getVariables() {
		return variables
	}

	def Map<String, Function> getFunctions() {
		return functions
	}
}

@Aspect(className=Chunk)
class ChunkAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Block)
class BlockAspect extends ChunkAspect {
	@OverrideAspectMethod
	def void execute(Environment c) {
		_self.statements.forEach [ s |
			s.execute(c)
		]
		_self.returnValue?.execute(c)  //.execute(c)

	}
}

@Aspect(className=Statement_GlobalFunction_Declaration)
class Statement_GlobalFunction_DeclarationAspect extends StatementAspect {
	def void execute(Environment c) {
		c.putFunction(_self.prefix.get(0), _self.function)
	}
}

@Aspect(className=Expression_VariableName)
class Expression_VariableNameAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		//println(_self.variable)
		c.pushValue(c.getVariable(_self.variable))

	}
}

@Aspect(className=Statement_Assignment)
class Statement_AssignmentAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Environment c) {
		var variableName  = (_self.variable.get(0) as Expression_VariableName) .variable
		_self.values.get(0).execute(c)
		var value = c.popValue
		c.putVariable(variableName as String, value)
	}
}

@Aspect(className=Statement_CallFunction)
class Statement_CallFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
	@OverrideAspectMethod
	def void execute(Environment c) {
		var x = _self.object
		switch x {
			Expression_VariableName case x.variable.equals("print"): {
				_self.arguments.arguments.get(0).execute(c)
				print(c.popValue)
				return
			}
			Expression_VariableName case x.variable.equals("println"): {
				_self.arguments.arguments.get(0).execute(c)
				println(c.popValue)
				return
			}
			Expression_VariableName case x.variable.equals("sleep"): {
				_self.arguments.arguments.get(0).execute(c)
				val sleep = Double::parseDouble(c.popValue.toString).intValue
				Thread.sleep(sleep)
				return
			}
		}
		//println((c.values.get(0) as Expression_VariableName).variable)
		if (_self.object instanceof Expression_VariableName){
				var function = c.getFunction((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.popValue)]				
					//function.parameters.forEach[par|println(par)]
					var newC = new Environment
					newC.parent = c
					newC.putAllVariables(c.variables)
					newC.putAllFunctions(c.functions)
					newC.pushAllValues(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.putVariable(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					//println(newC.values.peek)
					c.pushValue(newC.popValue)
				}
		}
		
		

		//var res = c.popValue
		//	println(res)
			
	}
}

@Aspect(className=Expression_CallFunction)
class Expression_CallFunctionAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		val x = _self.object
		switch x {
			Expression_VariableName case x.variable.equals("rand"): {
				_self.arguments.arguments.get(0).execute(c)
				val min = Double::parseDouble(c.popValue.toString).intValue
				_self.arguments.arguments.get(1).execute(c)
				val max = Double::parseDouble(c.popValue.toString).intValue
				val rand = ThreadLocalRandom::current.nextInt(min, max)
				c.pushValue(rand as double)
				return
			}
		}

		_self.object.execute(c)
		if(_self.arguments.arguments.size>0){
			_self.arguments.arguments.get(0).execute(c)
			var res = c.popValue
			if ("\"*number\"".equals(res)){
				var res1 = c.popValue				
				c.pushValue(Double.parseDouble(""+res1))
				return
			}
		}
		if (_self.object instanceof Expression_VariableName){
				var function = c.functions.get((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.popValue)]				
					var newC = new Environment
					newC.parent = c
					newC.variables.putAll(c.variables)
					newC.functions.putAll(c.functions)
					newC.values.addAll(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.putVariable(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					c.pushValue(newC.popValue)
					//println(newC.values.peek)
				}
		}
		
		
		//_self.object.execute(c)
 		//if (!c.values.isEmpty){
		//	var res2 = c.values.peek
		//	print(res2)			
		//	}
		
	}
}

@Aspect(className=Expression_AccessMember)
class Expression_AccessMemberAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		if (_self.memberName.equals("read")) {
			var x = _self.object
			switch x {
				Expression_VariableName case x.variable.equals("io"): {
					//println("pass par la")
					var scanIn = new Scanner(System.in);
					var in = scanIn.nextLine();
					scanIn.close();
					c.pushValue(in)
				}
			}
		}
	}
}

@Aspect(className=LastStatement)
class LastStatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=LastStatement_Return)
class LastStatement_ReturnAspect extends LastStatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=LastStatement_Break)
class LastStatement_BreakAspect extends LastStatementAspect {
}

@Aspect(className=Statement)
class StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_Block)
class Statement_BlockAspect extends StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_While)
class Statement_WhileAspect extends StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_Repeat)
class Statement_RepeatAspect extends StatementAspect {
	def void execute(Environment c) {
		do{
		_self.block.execute(c)				
		_self.expression.execute(c)
		
		}while(c.popValue as Boolean)	
	}
}

@Aspect(className=Statement_If_Then_Else)
class Statement_If_Then_ElseAspect extends StatementAspect {
	def void execute(Environment c) {
		_self.ifExpression.execute(c)
		if (c.popValue as Boolean){
			_self.ifBlock.execute(c)
		}else if (_self.elseBlock !== null){
			_self.elseBlock.execute(c)			
		}
	}
}

@Aspect(className=Statement_If_Then_Else_ElseIfPart)
class Statement_If_Then_Else_ElseIfPartAspect {
	def void execute(Environment c) {
		
	}
}

@Aspect(className=Statement_For_Numeric)
class Statement_For_NumericAspect extends StatementAspect {
	def void execute(Environment c) {
	
		
	}
}

@Aspect(className=Statement_For_Generic)
class Statement_For_GenericAspect extends StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_LocalFunction_Declaration)
class Statement_LocalFunction_DeclarationAspect extends StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_Local_Variable_Declaration)
class Statement_Local_Variable_DeclarationAspect extends StatementAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Statement_FunctioncallOrAssignment)
class Statement_FunctioncallOrAssignmentAspect extends StatementAspect {
	@OverrideAspectMethod
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression)
class LuaExpressionAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_Nil)
class Expression_NilAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		c.pushValue(Void)		
	}
}

@Aspect(className=Expression_True)
class Expression_TrueAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
				c.pushValue(true)
		
	}
}

@Aspect(className=Expression_False)
class Expression_FalseAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
				c.pushValue(false)
		
	}
}

@Aspect(className=Expression_Number)
class Expression_NumberAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		c.pushValue(_self.value)
	}
}

@Aspect(className=Expression_VarArgs)
class Expression_VarArgsAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_String)
class Expression_StringAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		c.pushValue(_self.value)
	}
}

@Aspect(className=Expression_Function)
class Expression_FunctionAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_TableConstructor)
class Expression_TableConstructorAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Function)
class FunctionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Functioncall_Arguments)
class Functioncall_ArgumentsAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Field)
class FieldAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Field_AddEntryToTable_Brackets)
class Field_AddEntryToTable_BracketsAspect extends FieldAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Field_AddEntryToTable)
class Field_AddEntryToTableAspect extends FieldAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Field_AppendEntryToTable)
class Field_AppendEntryToTableAspect extends FieldAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=LastStatement_ReturnWithValue)
class LastStatement_ReturnWithValueAspect extends LastStatement_ReturnAspect {
	def void execute(Environment c) {
		_self.returnValues.forEach[e|e.execute(c)]
	}
}

@Aspect(className=Statement_CallMemberFunction)
class Statement_CallMemberFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_Or)
class Expression_OrAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.popValue as Boolean 
		_self.right.execute(c) 
		var  right =c.popValue as Boolean 	
		c.pushValue(left || right)
	}
}

@Aspect(className=Expression_And)
class Expression_AndAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.popValue as Boolean 
		_self.right.execute(c) 
		var  right =c.popValue as Boolean 	
		c.pushValue(left && right)
		
	}
}

@Aspect(className=Expression_Larger)
class Expression_LargerAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
						_self.left.execute(c)
		var  left =c.popValue as Comparable 
		_self.right.execute(c) 
		var  right =c.popValue as Comparable 	
		c.pushValue(left.compareTo(right)>0)
		
	}
}

@Aspect(className=Expression_Larger_Equal)
class Expression_Larger_EqualAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
						_self.left.execute(c)
		var  left =c.popValue as Comparable 
		_self.right.execute(c) 
		var  right =c.popValue as Comparable 	
		c.pushValue(left.compareTo(right)>=0)
		
	}
}

@Aspect(className=Expression_Smaller)
class Expression_SmallerAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
				_self.left.execute(c)
		var  left =c.popValue as Comparable 
		_self.right.execute(c) 
		var  right =c.popValue as Comparable 	
		c.pushValue(left.compareTo(right)<0)
	}
}

@Aspect(className=Expression_Smaller_Equal)
class Expression_Smaller_EqualAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
				_self.left.execute(c)
		var  left =c.popValue as Comparable 
		_self.right.execute(c) 
		var  right =c.popValue as Comparable 	
		c.pushValue(left.compareTo(right)<=0)
		
	}
}

@Aspect(className=Expression_Equal)
class Expression_EqualAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.popValue 
		_self.right.execute(c)
		var  right =c.popValue 	
		c.pushValue(left.equals(right))
	}
}

@Aspect(className=Expression_Not_Equal)
class Expression_Not_EqualAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.popValue 
		_self.right.execute(c)
		var  right =c.popValue 	
		c.pushValue(!left.equals(right))
	}
}

@Aspect(className=Expression_Concatenation)
class Expression_ConcatenationAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var String left =c.popValue as String
		_self.right.execute(c)
		var String right =c.popValue as String		
		c.pushValue(left + right)
	}
}

@Aspect(className=Expression_Plus)
class Expression_PlusAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(left + right)
	}
}

@Aspect(className=Expression_Minus)
class Expression_MinusAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(left - right)

	}
}

@Aspect(className=Expression_Multiplication)
class Expression_MultiplicationAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(left * right)
		
	}
}

@Aspect(className=Expression_Division)
class Expression_DivisionAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(left / right)
		
	}
}

@Aspect(className=Expression_Modulo)
class Expression_ModuloAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(left % right)

	}
}

@Aspect(className=Expression_Negate)
class Expression_NegateAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var Double left =c.popValue as Double
		c.pushValue(left *(-1))		
	}
}

@Aspect(className=Expression_Length)
class Expression_LengthAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var String left =c.popValue as String
		c.pushValue(left.length)		
	}
}

@Aspect(className=Expression_Invert)
class Expression_InvertAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var Double left =c.popValue as Double
		c.pushValue(left *(-1))	
	}
}

@Aspect(className=Expression_Exponentiation)
class Expression_ExponentiationAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.popValue as Double
		_self.right.execute(c)
		var Double right =c.popValue as Double		
		c.pushValue(Math.pow(left , right))
	}
}

@Aspect(className=Expression_CallMemberFunction)
class Expression_CallMemberFunctionAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_AccessArray)
class Expression_AccessArrayAspect extends LuaExpressionAspect {
	def void execute(Environment c) {
	}
}

