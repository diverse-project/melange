package fr.inria.diverse.iot.glue.activityecore

import activitydiagram.Activity
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.eclipse.emf.ecore.EOperation

import static extension org.xtext.activitydiagram.semantics.ActivityAspect.*

@Aspect(className=EOperation)
class EOperationAspect {
	@Containment
	public Activity activity

	def void execute() {
		_self.activity.main(#[])
	}
}
