package fr.inria.diverse.iot.glue.activityecore

import activitydiagram.Activity
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.ecore.EOperation
import org.xtext.activitydiagram.semantics.Context

import static extension org.xtext.activitydiagram.semantics.ActivityAspect.*

@Aspect(className=EOperation)
class EOperationAspect {
	public Activity activity

	def void execute(Context c) {
		_self.activity.execute(c)
	}
}
