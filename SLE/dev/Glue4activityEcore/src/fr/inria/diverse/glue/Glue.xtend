package fr.inria.diverse.glue

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.EOperation
import activitydiagram.Activity

@Aspect(className=EOperation)
class EOperationAspect {
	public Activity behavior
}