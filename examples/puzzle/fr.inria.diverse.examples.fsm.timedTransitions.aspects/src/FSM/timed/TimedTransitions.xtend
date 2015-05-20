package FSM.timed

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideSuperAspectMethod

import timedfsm.TimedTransition
import java.util.Hashtable


@Aspect(className=TimedTransition)
class TimedTransitionAspect {

	@OverrideSuperAspectMethod
	def public void evalTransition(Hashtable<String, Object> context) {
		
		Thread.wait(_self.time)
		_requiredSuper.evalTransition(context)
	}
}