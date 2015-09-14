package fr.inria.diverse.iot.glue.activitylua

import activitydiagram.OpaqueAction
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.ArrayList
import org.eclipse.emf.ecore.EOperation
import org.xtext.activitydiagram.semantics.ActivityNodeAspect
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.lua.Expression_VariableName
import org.xtext.lua.lua.Statement_CallFunction
import org.xtext.lua.semantics.Environment
import org.xtext.lua.semantics.Statement_FunctioncallOrAssignmentAspect

import static extension fr.inria.diverse.iot.glue.activityecore.EOperationAspect.*
import static extension org.xtext.lua.semantics.BlockAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@Containment
	public Block lua

	def void execute(Context c) {
		val env = new Environment
		env.putVariable("context", c)
		_self.lua.execute(env)
		_self.sendOffers(_self.takeOfferdTokens)
	}
}

@Aspect(className=Statement_CallFunction)
class Statement_CallFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
	public EOperation op

	@OverrideAspectMethod
	def void execute(Environment c) {
		var x = _self.object
		switch x {
			Expression_VariableName case x.variable.equals("print"): {
				_self.arguments.arguments.get(0).execute(c)
				println(c.popValue)
				return
			}
			Expression_VariableName case x.variable.equals("sendMsg"): {
				val context = c.getVariable("context") as Context
				_self.op.execute(context)
				return
			}
		}

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
				c.pushValue(newC.popValue)
			}
		}
	}
}
