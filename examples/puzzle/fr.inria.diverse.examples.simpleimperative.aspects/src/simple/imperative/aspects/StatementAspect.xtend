package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
	
import simpleimperativelanguage.Statement
import simpleimperativelanguage.Println
import simpleimperativelanguage.Print
import simpleimperativelanguage.Assignation

import java.util.Hashtable
import simpleimperativelanguage.VarDecl
import simpleimperativelanguage.Loop
import simpleimperativelanguage.RelationalExpression
import simpleimperativelanguage.Conditional
import simpleimperativelanguage.Program
import simpleimperativelanguage.PutInMemory

import static extension simple.imperative.aspects.ExpressionAspect.*
import simpleimperativelanguage.Wait

@Aspect(className=Statement)
abstract class StatementAspect {
	
	def abstract void eval(Hashtable<java.lang.String, Object> context)
}

@Aspect(className=Program)
class ProgramAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<java.lang.String, Object> context){
		for(Statement _statement : _self.statements){
			_statement.eval(context)
			
		}
	}
}

@Aspect(className=VarDecl)
class VarDeclAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<java.lang.String, Object> context){
		context.put(_self.name, _self.expr.obtainValue(context))
	}
}

@Aspect(className=Conditional)
class ConditionalAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<java.lang.String, Object> context){
		if((_self.condition as RelationalExpression).obtainValue(context) as Boolean){
			_self.body.eval(context)
		}
	}
}

@Aspect(className=Loop)
class LoopAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def void eval(Hashtable<java.lang.String, Object> context){
		while((_self.guard as RelationalExpression).obtainValue(context) as Boolean){
			_self.body.eval(context)
		}
	}
}

@Aspect(className=Println)
class PrintlnAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<java.lang.String, Object> context){
		println(_self.input)
	}
}

@Aspect(className=Print)
class PrintAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<java.lang.String, Object> context){
		print(_self.input)
	}
}

@Aspect(className=Assignation)
class AssignationAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<java.lang.String, Object> context){
		context.put(_self.varRef.name, _self.expression.obtainValue(context))
	}
}

@Aspect(className=PutInMemory)
class PutInMemoryAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<java.lang.String, Object> context){
		context.put("memory.displays." + _self.key, _self.value.obtainValue(context));
	}
}

@Aspect(className=Wait)
class WaitAspect extends StatementAspect {
	
	@OverrideAspectMethod
	def public void eval(Hashtable<java.lang.String, Object> context){
		synchronized(_self){
			_self.wait(_self.miliseconds)
		}
	}
}
