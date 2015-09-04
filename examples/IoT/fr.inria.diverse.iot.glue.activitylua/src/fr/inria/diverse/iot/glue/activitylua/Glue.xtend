package fr.inria.diverse.iot.glue.activitylua

import activitydiagram.OpaqueAction
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.lua.Expression
import org.xtext.lua.semantics.Environment

import static extension org.xtext.lua.semantics.BlockAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect {
	@Containment
	public Block lua

	def void execute(Context c) {
		val env = new Environment
		c.inputValues.filterNull.forEach[value |
			env.pushValue(value.value)
		]
		env.pushValue("Test")
		_self.lua.execute(env)
	}
}

@Aspect(className = Expression)
class ExpressionAspect {
	def void execute(Environment e) {
		
	}
}
