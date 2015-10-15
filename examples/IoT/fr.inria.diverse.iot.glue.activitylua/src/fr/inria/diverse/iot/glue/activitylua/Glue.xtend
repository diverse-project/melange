package fr.inria.diverse.iot.glue.activitylua

import activitydiagram.BooleanValue
import activitydiagram.IntegerValue
import activitydiagram.OpaqueAction
import activitydiagram.Value
import activitydiagram.Variable
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.xtext.activitydiagram.semantics.ActivityNodeAspect
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.semantics.Environment

import static extension org.xtext.lua.semantics.BlockAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	@Containment
	public Block lua

	def void execute(Context c) {
		c.output.executedNodes.add(_self)

		if (_self.lua !== null) {
			val wrappedEnv = new Environment => [
				_self.activity.locals.forEach[v |
					println("Putting " + v)
					putVariable(v.name, _self.getValue(v.currentValue))
				]
			]

			_self.lua.execute(wrappedEnv)

			_self.activity.locals.forEach[v |
				val find = wrappedEnv.getVariable(v.name)
				println("find="+find)
				_self.setValue(v, find)
			]
		}

		_self.sendOffers(_self.takeOfferdTokens)
	}

	def Object getValue(Value v) {
		return
			switch (v) {
				IntegerValue: v.value as double
				BooleanValue: v.value
				default: null
			}
	}

	def void setValue(Variable v, Object value) {
		if (v.currentValue instanceof IntegerValue) {
			(v.currentValue as IntegerValue).value = value as Integer
		} else if (v.currentValue instanceof BooleanValue) {
			(v.currentValue as BooleanValue).value = value as Boolean
		}
	}
}
