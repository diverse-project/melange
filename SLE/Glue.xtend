package fr.inria.diverse.glue

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EOperation
import activitydiagram.Activity
import org.xtext.lua.Expression
import org.xtext.lua.Block

@Aspect(className=EOperation)
class EOperationAspect {
	Activity behavior
}

@Aspect(className=Expression)
class ExpressionAspect {
	Block lua
}