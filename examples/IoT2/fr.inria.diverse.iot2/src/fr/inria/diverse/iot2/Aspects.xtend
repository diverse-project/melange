package fr.inria.diverse.iot2

import activitydiagram.ActivitydiagramFactory
import activitydiagram.BooleanValue
import activitydiagram.Expression
import activitydiagram.IntegerValue
import activitydiagram.OpaqueAction
import activitydiagram.Value
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.csu.idl.idlmm.OperationDef
import org.csu.idl.idlmm.ParameterMode
import org.xtext.activitydiagram.semantics.ActivityNodeAspect
import org.xtext.activitydiagram.semantics.Context
import org.xtext.lua.lua.Block
import org.xtext.lua.semantics.Environment

import static extension fr.inria.diverse.iot2.OperationDefAspect.*
import static extension org.xtext.lua.semantics.BlockAspect.*
import static extension org.xtext.activitydiagram.semantics.ActivityExpressionAspect.*

@Aspect(className = OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	public OperationDef service

	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		val fact = ActivitydiagramFactory::eINSTANCE
		if (_self.service !== null) {
			val wrappedEnv = new Environment => [
				_self.service.parameters
				.filter[#[ParameterMode::PARAM_IN, ParameterMode::PARAM_INOUT].contains(direction)]
				.forEach[p |
					val find = _self.activity.locals.findFirst[name == p.identifier]
					putVariable(p.identifier, _self.getValueAsString(find?.currentValue) ?: null)
				]
			]

			_self.service.execute(wrappedEnv)

			_self.service.parameters
			.filter[#[ParameterMode::PARAM_OUT, ParameterMode::PARAM_INOUT].contains(direction)]
			.forEach[p |
				val updated = _self.activity.locals.findFirst[name == p.identifier]
				val retInteger = new Integer(Double::parseDouble(wrappedEnv.getVariable(p.identifier).toString) as int)

				if (updated !== null)
					updated.currentValue = fact.createIntegerValue => [
						value = retInteger
					]
				else
					_self.activity.locals += fact.createIntegerVariable => [
						name = p.identifier
						currentValue = fact.createIntegerValue => [
							value = retInteger
						]
					]
			]
		}
		_self.expressions.forEach[e|e.execute(c)]
		_self.sendOffers(_self.takeOfferdTokens)
	}

	def String getValueAsString(Value v) {
		return
			switch (v) {
				IntegerValue: v.value.toString
				BooleanValue: v.value.toString
				default: null
			}
	}
}

@Aspect(className = OperationDef)
class OperationDefAspect {
	@Containment
	public Block lua

	def void execute(Environment c) {
		_self.lua.execute(c)
	}
}

@Aspect(className = Expression)
class ExpressionAspect {
	def void execute(Context c) {
		org.xtext.activitydiagram.semantics.ActivityExpressionAspect.execute(_self, c)
	}

	def void execute(Environment c) {
		org.xtext.lua.semantics.LuaExpressionAspect.execute(_self as org.xtext.lua.lua.Expression, c)
	}
}
