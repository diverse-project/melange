package trigger.not

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import nottrigger.NotTrigger
import org.eclipse.emf.common.util.EList
import puzzle.annotations.processor.OverrideSuperAspectMethod

@Aspect(className=NotTrigger)
class NotTriggerAspect {
	
	@OverrideSuperAspectMethod
	def public boolean evalTrigger(EList<String> events){
		return !_self.negated.evalTrigger(events);
	}
}