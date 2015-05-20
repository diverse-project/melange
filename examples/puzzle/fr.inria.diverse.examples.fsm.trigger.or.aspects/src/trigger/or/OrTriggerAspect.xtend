package trigger.or

import ortrigger.OrTrigger

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideSuperAspectMethod

import org.eclipse.emf.common.util.EList

@Aspect(className=OrTrigger)
class OrTriggerAspect {
	
	@OverrideSuperAspectMethod
	def public boolean evalTrigger(EList<String> events){
		return _self.right.evalTrigger(events) || _self.left.evalTrigger(events);
	}
}