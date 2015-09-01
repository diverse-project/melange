package fr.inria.diverse.iot.glue.activitylua

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.Expression
import org.xtext.lua.lua.Block

@Aspect(className=Expression)
class ExpressionAspect {
	public Block lua
}
