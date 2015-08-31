package fr.inria.diverse.glue

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.Expression
import activitydiagram.Block

@Aspect(className=Expression)
class ExpressionAspect {
	public Block lua
}