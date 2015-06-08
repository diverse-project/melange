package transitioneffects.parallel

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
 
import transitioneffect.Statement
import transitioneffect.Transition

import java.util.Hashtable
import java.util.ArrayList

@Aspect(className=Transition)
class TransitionAspect {

	@OverrideRequiredAspectMethod
	def public void evalTransition(Hashtable<String, Object> context){
		_self._original_evalTransition(context)
		
		val ArrayList<Hashtable<String,Object>> parallelContexts = new ArrayList<Hashtable<String,Object>>();
		for(Statement _statement : _self.effect){
			var Hashtable<String,Object> _newContext = new Hashtable<String,Object>(context)
			_statement.eval(_newContext)
			parallelContexts.add(_newContext)
		}
		
		// Merging the contexts
		for(Hashtable<String,Object> _context : parallelContexts){
			var _it = _context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = _context.get(_key)
				if(!_key.startsWith("currentState"))
					context.put(_key, _value)
			}
		}
	}
}