package fr.inria.diverse.iot.glue.activityecore

import activitydiagram.Activity
import activitydiagram.Expression
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Containment
import org.eclipse.emf.ecore.EOperation
import org.xtext.activitydiagram.semantics.Context

import static extension org.xtext.activitydiagram.semantics.ActivityAspect.*

@Aspect(className=EOperation)
class EOperationAspect {
	@Containment
	public Activity activity

	def void execute() {
		_self.activity.main(#[])
	}
}

@Aspect(className=Expression)
class ExpressionAspect {
	def void execute(Context c) {
	}
}
