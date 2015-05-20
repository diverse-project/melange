package trigger.and

import andtrigger.AndTrigger

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideSuperAspectMethod
	
import org.eclipse.emf.common.util.EList

@Aspect(className=AndTrigger)
class AndTriggerAspect {
	
	@OverrideSuperAspectMethod
	def public boolean evalTrigger(EList<String> events){
		return _self.right.evalTrigger(events) && _self.left.evalTrigger(events);
	}
}