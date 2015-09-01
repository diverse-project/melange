package fr.inria.diverse.iot.glue.activityecore

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.ecore.EOperation
import activitydiagram.Activity

@Aspect(className=EOperation)
class EOperationAspect {
	public Activity behavior
}
