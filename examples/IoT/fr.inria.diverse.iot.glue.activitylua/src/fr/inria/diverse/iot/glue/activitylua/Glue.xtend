package fr.inria.diverse.iot.glue.activitylua

import activitydiagram.OpaqueAction
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.lua.Expression
import org.xtext.lua.semantics.Environment

import static extension org.xtext.lua.semantics.BlockAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect {
	public Block lua

	def void execute(Context c) {
		_self.lua.execute(new Environment)
	}
}

@Aspect(className = Expression)
class ExpressionAspect {
	def void execute(Environment e) {
		
	}
}
