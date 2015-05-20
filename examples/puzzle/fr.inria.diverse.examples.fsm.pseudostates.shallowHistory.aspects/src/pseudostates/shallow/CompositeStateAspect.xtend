package pseudostates.shallow

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	
import shallowhistory.CompositeState

import java.util.Hashtable
import shallowhistory.State
import java.util.ArrayList
import shallowhistory.Vertex

@Aspect(className=CompositeState)
class CompositeStateAspect {
	
	private State history;
	
	@OverrideRequiredAspectMethod
	def public void entryState(Hashtable<String, Object> context){
		// If it is the first time we enter to the composite state, then go to the initial one. 
		if(_self.history == null){
			(context.get("currentState") as ArrayList<Vertex>).add(_self.initialState)
			_self.initialState.entryState(context)
		}
		// Otherwise, go to the history!
		else{
			(context.get("currentState") as ArrayList<Vertex>).add(_self.history)
			_self.history.entryState(context)
		}
	}
	
	@OverrideRequiredAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self._original_exitState(context)
		// Save the current state when leaving the state
		_self.history  = _self.states.get(0)
	}
}