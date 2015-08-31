package org.k3.lua.dynamic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.io.File
import java.util.HashMap
import java.util.Map
import java.util.Stack
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.LuaStandaloneSetup
import org.xtext.lua.Block
import org.xtext.lua.Chunk
import org.xtext.lua.Expression
import org.xtext.lua.Expression_AccessArray
import org.xtext.lua.Expression_AccessMember
import org.xtext.lua.Expression_And
import org.xtext.lua.Expression_CallFunction
import org.xtext.lua.Expression_CallMemberFunction
import org.xtext.lua.Expression_Concatenation
import org.xtext.lua.Expression_Division
import org.xtext.lua.Expression_Equal
import org.xtext.lua.Expression_Exponentiation
import org.xtext.lua.Expression_False
import org.xtext.lua.Expression_Function
import org.xtext.lua.Expression_Invert
import org.xtext.lua.Expression_Larger
import org.xtext.lua.Expression_Larger_Equal
import org.xtext.lua.Expression_Length
import org.xtext.lua.Expression_Minus
import org.xtext.lua.Expression_Modulo
import org.xtext.lua.Expression_Multiplication
import org.xtext.lua.Expression_Negate
import org.xtext.lua.Expression_Nil
import org.xtext.lua.Expression_Not_Equal
import org.xtext.lua.Expression_Number
import org.xtext.lua.Expression_Or
import org.xtext.lua.Expression_Plus
import org.xtext.lua.Expression_Smaller
import org.xtext.lua.Expression_Smaller_Equal
import org.xtext.lua.Expression_String
import org.xtext.lua.Expression_TableConstructor
import org.xtext.lua.Expression_True
import org.xtext.lua.Expression_VarArgs
import org.xtext.lua.Expression_VariableName
import org.xtext.lua.Field
import org.xtext.lua.Field_AddEntryToTable
import org.xtext.lua.Field_AddEntryToTable_Brackets
import org.xtext.lua.Field_AppendEntryToTable
import org.xtext.lua.Function
import org.xtext.lua.Functioncall_Arguments
import org.xtext.lua.LastStatement
import org.xtext.lua.LastStatement_Break
import org.xtext.lua.LastStatement_Return
import org.xtext.lua.LastStatement_ReturnWithValue
import org.xtext.lua.LuaPackage
import org.xtext.lua.Statement
import org.xtext.lua.Statement_Assignment
import org.xtext.lua.Statement_Block
import org.xtext.lua.Statement_CallFunction
import org.xtext.lua.Statement_CallMemberFunction
import org.xtext.lua.Statement_For_Generic
import org.xtext.lua.Statement_For_Numeric
import org.xtext.lua.Statement_FunctioncallOrAssignment
import org.xtext.lua.Statement_GlobalFunction_Declaration
import org.xtext.lua.Statement_If_Then_Else
import org.xtext.lua.Statement_If_Then_Else_ElseIfPart
import org.xtext.lua.Statement_LocalFunction_Declaration
import org.xtext.lua.Statement_Local_Variable_Declaration
import org.xtext.lua.Statement_Repeat
import org.xtext.lua.Statement_While

import static extension org.k3.lua.dynamic.BlockAspect.*
import static extension org.k3.lua.dynamic.ExpressionAspect.*
import static extension org.k3.lua.dynamic.StatementAspect.*
import static extension org.k3.lua.dynamic.LastStatementAspect.*
import java.io.Console
import java.util.Scanner
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import java.util.ArrayList

class Environment {
	public Environment parent
	public Stack<Object> values = new Stack<Object>
	public Map<String, Object> variables = new HashMap<String, Object>
	public Map<String, Function> functions = new HashMap<String, Function>

}

//@Aspect(className=Chunk)
class LuaDynamic {
}

class Main {
	protected XtextResourceSet resourceSet ;
	protected ResourceSet resourceSetxmi ;

	def static void main(String[] args) {
		new Main().run(args);
	}

	def void run(String[] args) {
		resourceSet = new XtextResourceSet();
		resourceSetxmi = new ResourceSetImpl();
		LuaStandaloneSetup.doSetup();

		if (!EPackage.Registry.INSTANCE.containsKey(LuaPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(LuaPackage.eNS_URI, LuaPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);

//		var inputPath = "../../moliz.ttc2015/org.modelexecution.operationalsemantics.ad.test/model/xmi/test5.xmi"
		var block = getBlock("test.lua")
		
		var resource = resourceSetxmi.createResource(URI.createFileURI("text.xmi"))
		resource.contents.add(block)
		resource.save(new HashMap )		
		// println(block)
//		var activity = getActivityfromXMI(inputPath)
		var start = System.nanoTime;
		var c = new Environment
		block.execute(c)

		var stop = System.nanoTime;
		println("time to execute " + ( stop - start))

	}

	def Block getBlock(String modelPath) {
		var resource = resourceSet.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Chunk) {
			var ch = eObject as Block;
			return ch;
		}
		return null;
	}

	def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	def Chunk getActivityfromXMI(String modelPath) {
		var resource = resourceSetxmi.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Chunk) {
			var ch = eObject as Chunk;
			// println((activity.locals.get(0) as BooleanVariable).initialValue)
			return ch;
		}
		return null;
	}

	def File createFile(String path) {
		return new File(path);
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
		c.functions.put(_self.prefix.get(0), _self.function)
	}
}

@Aspect(className=Expression_VariableName)
class Expression_VariableNameAspect extends ExpressionAspect {
	def void execute(Environment c) {
		//println(_self.variable)
		c.values.push(c.variables.get(_self.variable))

	}
}

@Aspect(className=Statement_Assignment)
class Statement_AssignmentAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Environment c) {
		var variableName  = (_self.variable.get(0) as Expression_VariableName) .variable
		_self.values.get(0).execute(c)
		var value = c.values.pop
		c.variables.put(variableName as String, value)
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
				println(c.values.pop)
				return
			}
		}
		//println((c.values.get(0) as Expression_VariableName).variable)
		if (_self.object instanceof Expression_VariableName){
				var function = c.functions.get((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.values.pop)]				
					//function.parameters.forEach[par|println(par)]
					var newC = new Environment
					newC.parent = c
					newC.variables.putAll(c.variables)
					newC.functions.putAll(c.functions)
					newC.values.addAll(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.variables.put(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					//println(newC.values.peek)
					c.values.push(newC.values.pop)
				}
		}
		
		

		//var res = c.values.pop
		//	println(res)
			
	}
}

@Aspect(className=Expression_CallFunction)
class Expression_CallFunctionAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.object.execute(c)
		if(_self.arguments.arguments.size>0){
			_self.arguments.arguments.get(0).execute(c)
			var res = c.values.pop
			if ("\"*number\"".equals(res)){
				var res1 = c.values.pop				
				c.values.push(Double.parseDouble(""+res1))
				return
			}
		}
		if (_self.object instanceof Expression_VariableName){
				var function = c.functions.get((_self.object as Expression_VariableName).variable)
				if (function != null){
					val params = new ArrayList()
					_self.arguments.arguments.forEach[args | args.execute(c)  params.add(c.values.pop)]				
					var newC = new Environment
					newC.parent = c
					newC.variables.putAll(c.variables)
					newC.functions.putAll(c.functions)
					newC.values.addAll(c.values)
					for (var i = 0 ; i< function.parameters.size;i++){
						newC.variables.put(function.parameters.get(i),params.get(i))	
					}
					function.body.execute(newC)
					c.values.push(newC.values.pop)
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
class Expression_AccessMemberAspect extends ExpressionAspect {
	def void execute(Environment c) {
		if (_self.memberName.equals("read")) {
			var x = _self.object
			switch x {
				Expression_VariableName case x.variable.equals("io"): {
					//println("pass par la")
					var scanIn = new Scanner(System.in);
					var in = scanIn.nextLine();
					scanIn.close();
					c.values.push(in)
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
		
		}while(c.values.pop as Boolean)	
	}
}

@Aspect(className=Statement_If_Then_Else)
class Statement_If_Then_ElseAspect extends StatementAspect {
	def void execute(Environment c) {
		_self.ifExpression.execute(c)
		if (c.values.pop as Boolean){
			_self.ifBlock.execute(c)
		}else{
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
class ExpressionAspect extends Statement_FunctioncallOrAssignmentAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_Nil)
class Expression_NilAspect extends ExpressionAspect {
	def void execute(Environment c) {
		c.values.push(Void)		
	}
}

@Aspect(className=Expression_True)
class Expression_TrueAspect extends ExpressionAspect {
	def void execute(Environment c) {
				c.values.push(true)
		
	}
}

@Aspect(className=Expression_False)
class Expression_FalseAspect extends ExpressionAspect {
	def void execute(Environment c) {
				c.values.push(false)
		
	}
}

@Aspect(className=Expression_Number)
class Expression_NumberAspect extends ExpressionAspect {
	def void execute(Environment c) {
		c.values.push(_self.value)
	}
}

@Aspect(className=Expression_VarArgs)
class Expression_VarArgsAspect extends ExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_String)
class Expression_StringAspect extends ExpressionAspect {
	def void execute(Environment c) {
		c.values.push(_self.value)
	}
}

@Aspect(className=Expression_Function)
class Expression_FunctionAspect extends ExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_TableConstructor)
class Expression_TableConstructorAspect extends ExpressionAspect {
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
class Expression_OrAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.values.pop as Boolean 
		_self.right.execute(c) 
		var  right =c.values.pop as Boolean 	
		c.values.push(left || right)
	}
}

@Aspect(className=Expression_And)
class Expression_AndAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.values.pop as Boolean 
		_self.right.execute(c) 
		var  right =c.values.pop as Boolean 	
		c.values.push(left && right)
		
	}
}

@Aspect(className=Expression_Larger)
class Expression_LargerAspect extends ExpressionAspect {
	def void execute(Environment c) {
						_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)>0)
		
	}
}

@Aspect(className=Expression_Larger_Equal)
class Expression_Larger_EqualAspect extends ExpressionAspect {
	def void execute(Environment c) {
						_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)>=0)
		
	}
}

@Aspect(className=Expression_Smaller)
class Expression_SmallerAspect extends ExpressionAspect {
	def void execute(Environment c) {
				_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)<0)
	}
}

@Aspect(className=Expression_Smaller_Equal)
class Expression_Smaller_EqualAspect extends ExpressionAspect {
	def void execute(Environment c) {
				_self.left.execute(c)
		var  left =c.values.pop as Comparable 
		_self.right.execute(c) 
		var  right =c.values.pop as Comparable 	
		c.values.push(left.compareTo(right)<=0)
		
	}
}

@Aspect(className=Expression_Equal)
class Expression_EqualAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.values.pop 
		_self.right.execute(c)
		var  right =c.values.pop 	
		c.values.push(left.equals(right))
	}
}

@Aspect(className=Expression_Not_Equal)
class Expression_Not_EqualAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var  left =c.values.pop 
		_self.right.execute(c)
		var  right =c.values.pop 	
		c.values.push(!left.equals(right))
	}
}

@Aspect(className=Expression_Concatenation)
class Expression_ConcatenationAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var String left =c.values.pop as String
		_self.right.execute(c)
		var String right =c.values.pop as String		
		c.values.push(left + right)
	}
}

@Aspect(className=Expression_Plus)
class Expression_PlusAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left + right)
	}
}

@Aspect(className=Expression_Minus)
class Expression_MinusAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left - right)

	}
}

@Aspect(className=Expression_Multiplication)
class Expression_MultiplicationAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left * right)
		
	}
}

@Aspect(className=Expression_Division)
class Expression_DivisionAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left / right)
		
	}
}

@Aspect(className=Expression_Modulo)
class Expression_ModuloAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(left % right)

	}
}

@Aspect(className=Expression_Negate)
class Expression_NegateAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var Double left =c.values.pop as Double
		c.values.push(left *(-1))		
	}
}

@Aspect(className=Expression_Length)
class Expression_LengthAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var String left =c.values.pop as String
		c.values.push(left.length)		
	}
}

@Aspect(className=Expression_Invert)
class Expression_InvertAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.exp.execute(c)
		var Double left =c.values.pop as Double
		c.values.push(left *(-1))	
	}
}

@Aspect(className=Expression_Exponentiation)
class Expression_ExponentiationAspect extends ExpressionAspect {
	def void execute(Environment c) {
		_self.left.execute(c)
		var Double left =c.values.pop as Double
		_self.right.execute(c)
		var Double right =c.values.pop as Double		
		c.values.push(Math.pow(left , right))
	}
}

@Aspect(className=Expression_CallMemberFunction)
class Expression_CallMemberFunctionAspect extends ExpressionAspect {
	def void execute(Environment c) {
	}
}

@Aspect(className=Expression_AccessArray)
class Expression_AccessArrayAspect extends ExpressionAspect {
	def void execute(Environment c) {
	}
}

