package transitioneffects.sequential

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import transitioneffect.Transition
import java.util.Hashtable
import puzzle.annotations.processor.OverrideRequiredAspectMethod
import transitioneffect.Statement

@Aspect(className=Transition)
class TransitionAspect {
	
	@OverrideRequiredAspectMethod
	def public void evalTransition(Hashtable<String, Object> context){
		_self._original_evalTransition(context)
		for(Statement _statement : _self.effect){
			_statement.eval(context)
		}
	} 
}