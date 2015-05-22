package FSM.composite.deepest

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	
import compositestates.State

import java.util.Hashtable
import compositestates.Region
import java.util.ArrayList
import compositestates.Transition
import compositestates.Vertex
import puzzle.annotations.processor.AddExtensionMethod

@Aspect(className=Region)
class RegionAspect{
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<Vertex> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, Hashtable<String, Object> context){
	
		println("CompositeStates.findNewActiveStates")
		// Adding the super states to the current state.
		val ArrayList<Vertex> targetParents = new ArrayList<Vertex>()
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
		var ArrayList<Vertex> toDelete = new ArrayList<Vertex>()
		for(Vertex _newState : newActiveStates){
			var boolean delete = true
			
			for(Transition _incoming : _newState.incoming){
				
				if(_newState instanceof State){
					var ArrayList<Vertex> children = newArrayList
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
	def public void findOldActiveStates(ArrayList<Vertex> oldActiveStates, 
		Transition selectedTransition){
		
		// Performing the legacy operation
		_self._original_findOldActiveStates(oldActiveStates, selectedTransition)
		
		// Getting out of a composite state so leaving all the children states
		val ArrayList<Vertex> sourceChildren = new ArrayList<Vertex>()
		_self.getAllChildren(selectedTransition.source, sourceChildren)
		sourceChildren.forEach[_children | 
			if(!oldActiveStates.contains(_children))
				oldActiveStates.add(_children);
		]
		
		// Adding to the old state the parent states of the leaving parents
		val ArrayList<Vertex> sourceParents = new ArrayList<Vertex>()
		_self.getAllParents(selectedTransition.source, sourceParents)
		
		val ArrayList<Vertex> targetParents = new ArrayList<Vertex>()
		_self.getAllParents(selectedTransition.target, targetParents)
		
		
		var Iterable<Vertex> leavingParents = sourceParents.filter[ _parent | !targetParents.contains(_parent)]
		oldActiveStates.addAll(leavingParents)
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
		var conflictingTransition = _self.deepestConflictingTransition(newActiveTransitions, selectedTransition)
		if(conflictingTransition == null)
			_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)
		else{
			newActiveTransitions.remove(conflictingTransition)
			newActiveTransitions.add(selectedTransition)
		}
	}
	
	@AddExtensionMethod
	def public void getAllParents(Vertex vertex, ArrayList<Vertex> parents){
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
	def public void getAllChildren(Vertex vertex, ArrayList<Vertex> children){
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
	def public Transition deepestConflictingTransition(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition){
			
		if(selectedTransition.source instanceof State){
			for(Transition _activeTransition : newActiveTransitions){
				if(_activeTransition.source instanceof State){
					var ArrayList<Vertex> children = new ArrayList<Vertex>()
					_self.getAllChildren((_activeTransition.source as State), children)
					if(children.contains(selectedTransition.source)){
						return _activeTransition
					}
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