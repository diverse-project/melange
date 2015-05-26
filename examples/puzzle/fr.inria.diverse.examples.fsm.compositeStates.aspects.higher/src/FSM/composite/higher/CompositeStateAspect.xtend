package FSM.composite.higher

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.AddExtensionMethod
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	

import compositestates.State
import compositestates.Transition
import compositestates.AbstractState

import java.util.Hashtable
import java.util.ArrayList

import compositestates.Region

@Aspect(className=Region)
class RegionAspect{
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<AbstractState> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, Hashtable<String, Object> context){
	
		// Adding the super states to the current state.
		val ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>()
		_self.getAllParents(selectedTransition.target, targetParents)
		targetParents.forEach[_parent | 
			if(!newActiveStates.contains(_parent))
					newActiveStates.add(_parent);
		]
		
		// Performing the legacy operation
		for(Transition _currentTransition : currentActiveTransitions){
			_self._original_findNewActiveStates(newActiveStates, _currentTransition, currentActiveTransitions, context)
		}
		
		// Removing the states coming from conflicting transitions
		var ArrayList<AbstractState> toDelete = new ArrayList<AbstractState>()
		for(AbstractState _newState : newActiveStates){
			var boolean delete = true
			
			for(Transition _incoming : _newState.incoming){
				
				if(_newState instanceof State){
					var ArrayList<AbstractState> children = newArrayList
					_self.getAllChildren(_newState, children)
					if(children.findFirst[child | newActiveStates.contains(child)] != null)
						delete = false
				}
				
				if(currentActiveTransitions.contains(_incoming))
					delete = false
			}
			
			if(delete)
				toDelete.add(_newState)
		}
		newActiveStates.removeAll(toDelete)
	}
	
	@OverrideRequiredAspectMethod
	def public void findOldActiveStates(ArrayList<AbstractState> oldActiveStates, 
		Transition selectedTransition){
		
		// Performing the legacy operation
		_self._original_findOldActiveStates(oldActiveStates, selectedTransition)
		
		// Getting out of a composite state so leaving all the children states
		val ArrayList<AbstractState> sourceChildren = new ArrayList<AbstractState>()
		_self.getAllChildren(selectedTransition.source, sourceChildren)
		sourceChildren.forEach[_children | 
			if(!oldActiveStates.contains(_children))
				oldActiveStates.add(_children);
		]
		
		// Adding to the old state the parent states of the leaving parents
		val ArrayList<AbstractState> sourceParents = new ArrayList<AbstractState>()
		_self.getAllParents(selectedTransition.source, sourceParents)
		
		val ArrayList<AbstractState> targetParents = new ArrayList<AbstractState>()
		_self.getAllParents(selectedTransition.target, targetParents)
		
		
		var Iterable<AbstractState> leavingParents = sourceParents.filter[ _parent | !targetParents.contains(_parent)]
		oldActiveStates.addAll(leavingParents)
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
		
		var conflictingTransition = _self.highestConflictingTransition(newActiveTransitions, selectedTransition)
		if(conflictingTransition == null)
			_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)
	}
	
	@AddExtensionMethod
	def public void getAllParents(AbstractState vertex, ArrayList<AbstractState> parents){
		if(vertex instanceof State){
			var State superState = (vertex as State).ownerRegion.ownerState
			while(superState != null){
				if(!parents.contains(superState))
					parents.add(superState);
				superState = superState.ownerRegion.ownerState
			}
		}
	}
	
	@AddExtensionMethod
	def public void getAllChildren(AbstractState vertex, ArrayList<AbstractState> children){
		if(vertex instanceof State){
			if((vertex as State).ownedRegions != null){
				(vertex as State).ownedRegions.forEach[_region|
					children.addAll(_region.subvertex)
					_region.subvertex.forEach[ _vertex |
						_self.getAllChildren(_vertex, children)
					]
				]
			}
		}
	}
	
	@AddExtensionMethod
	def public Transition highestConflictingTransition(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition){
			
		if(selectedTransition.source instanceof State){
			var State sourceState = selectedTransition.source as State
			var ArrayList<AbstractState> parents = new ArrayList<AbstractState>()
			_self.getAllParents(sourceState, parents)
			for(Transition _activeTransition : newActiveTransitions){
				if(parents.contains(_activeTransition.source)){
					return _activeTransition
				}
			}
		}
		return null
	}
}

@Aspect(className=State)
class StateAspect { 
	
	@OverrideRequiredAspectMethod
	def public void evalState(Hashtable<String, Object> context){
		_self._original_evalState(context)
		_self.ownedRegions.forEach[ _region | _region.initRegion(context)]
	}
}