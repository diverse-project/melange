package pseudostates.deep

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	

import java.util.Hashtable
import java.util.ArrayList

import puzzle.annotations.processor.AddExtensionMethod

import static extension pseudostates.deep.RegionAspect.*
import deephistory.Region
import deephistory.State
import deephistory.AbstractState
import deephistory.Pseudostate
import deephistory.PseudostateKind

@Aspect(className=Region)
class RegionAspect {
	
	private ArrayList<AbstractState> deepHistory;
	
	@OverrideRequiredAspectMethod
	def public void initRegion(Hashtable<String, Object> context){
		// If it is the first time we enter to the composite state, then go to the initial one. 
		if(_self.deepHistory == null){
			_self._original_initRegion(context);
		}
		// Otherwise, go to the history!
		else{
			(context.get("currentState") as ArrayList<AbstractState>).addAll(_self.deepHistory)
		}
	}
	
	@AddExtensionMethod
	def public void saveDeepHistoryState(Hashtable<String, Object> context){
		println('saving the history state')
		if(_self.subvertex.exists[ _vertex | _vertex instanceof Pseudostate &&
			(_vertex as Pseudostate).kind == PseudostateKind.DEEP_HISTORY]){
				_self.deepHistory = new ArrayList<AbstractState>()
				val ArrayList<AbstractState> substates = new ArrayList<AbstractState>()
				_self.getAllSubstates(_self.ownerState, substates)
				_self.deepHistory.addAll(substates.filter[ _substate | 
					(context.get("currentState") as ArrayList<AbstractState>).contains(_substate)])
		}
	}
	
	@AddExtensionMethod
	def public void getAllSubstates(AbstractState vertex, ArrayList<AbstractState> children){
		if(vertex instanceof State){
			if((vertex as State).ownedRegions != null){
				(vertex as State).ownedRegions.forEach[_region|
					children.addAll(_region.subvertex)
					_region.subvertex.forEach[ _vertex |
						_self.getAllSubstates(_vertex, children)
					]
				]
			}
		}
	}
}

@Aspect(className=State)
class StateAspect {

	@OverrideRequiredAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self._original_exitState(context)
		_self.ownedRegions.forEach[_region | _region.saveDeepHistoryState(context)]
	}	
}