package pseudostates.shallow

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	

import java.util.Hashtable
import shallowhistory.State
import java.util.ArrayList
import shallowhistory.Region
import shallowhistory.AbstractState

import static extension pseudostates.shallow.RegionAspect.*
import puzzle.annotations.processor.AddExtensionMethod
import shallowhistory.Pseudostate
import shallowhistory.PseudostateKind

@Aspect(className=Region)
class RegionAspect {
	
	private State history;
	
	@OverrideRequiredAspectMethod
	def public void initRegion(Hashtable<String, Object> context){
		// If it is the first time we enter to the composite state, then go to the initial one. 
		if(_self.history == null){
			_self._original_initRegion(context);
		}
		// Otherwise, go to the history!
		else{
			(context.get("currentState") as ArrayList<AbstractState>).add(_self.history)
		}
	}
	
	@AddExtensionMethod
	def public void saveHistoryState(Hashtable<String, Object> context){
		println('saving the history state')
		if(_self.subvertex.exists[ _vertex | _vertex instanceof Pseudostate &&
			(_vertex as Pseudostate).kind == PseudostateKind.SHALLOW_HISTORY]){
				_self.history = (context.get("currentState") as ArrayList<AbstractState>).findFirst[ _state |
					_state instanceof State && (_state as State).ownerRegion == _self] as State
		}
		
	}
}

@Aspect(className=State)
class StateAspect {

	@OverrideRequiredAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self._original_exitState(context)
		_self.ownedRegions.forEach[_region | _region.saveHistoryState(context)]
	}	
}