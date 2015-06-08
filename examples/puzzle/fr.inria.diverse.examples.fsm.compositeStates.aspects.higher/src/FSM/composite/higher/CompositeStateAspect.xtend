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
import java.util.List

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
		val ArrayList<AbstractState> targetChildren = new ArrayList<AbstractState>()
		_self.getAllChildren(selectedTransition.source, targetChildren)
		
		for(AbstractState _newState : newActiveStates){
			//Do we can delete all this?
			var boolean delete = true
			var List<Transition> transitions = new ArrayList<Transition>();
			transitions.addAll(_newState.incoming)
			for(AbstractState _children : targetChildren){
				transitions.addAll(_children.incoming)
			}
			for(Transition _incoming : transitions){
				
				if(_newState instanceof State){
					var ArrayList<AbstractState> children = newArrayList
					_self.getAllChildren(_newState, children)
					if(children.findFirst[child | newActiveStates.contains(child)] != null)
						delete = false
				}
			// ** 
				if(currentActiveTransitions.contains(_incoming))
					delete = false
			}
			
			if(delete)
				toDelete.add(_newState)
		}
		
		val ArrayList<AbstractState> moreToDelete = new ArrayList<AbstractState>()
		newActiveStates.forEach[ _state |
			val ArrayList<AbstractState> child = new ArrayList<AbstractState>()
			_self.getAllChildren(_state, child)
			if(!_state.incoming.exists[ t | currentActiveTransitions.contains(t)] &&
				!child.exists[ s | s.incoming.exists[ t | currentActiveTransitions.contains(t)]])
					moreToDelete.add(_state)
		]
		
		toDelete.addAll(moreToDelete)
		newActiveStates.removeAll(toDelete)
	}
	
	@OverrideRequiredAspectMethod
	def public void findOldActiveStates(ArrayList<AbstractState> oldActiveStates, 
		Transition selectedTransition, Hashtable<String, Object> context){
		
		// Performing the legacy operation
		_self._original_findOldActiveStates(oldActiveStates, selectedTransition, context)
		
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

		newActiveTransitions.add(selectedTransition)
		var ArrayList<Transition> activeTransitions = new ArrayList<Transition>()
		activeTransitions.addAll(newActiveTransitions)
		activeTransitions.add(selectedTransition)
		var boolean conflictingTransition = _self.highestConflictingTransition(activeTransitions)

		if(!conflictingTransition)
			_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)
		else{
			newActiveTransitions.clear()
			newActiveTransitions.addAll(activeTransitions)	
		}
		
	}
	
	@OverrideRequiredAspectMethod
	def public String getContextPathByRegion(){
		var root = "currentState"
		var ArrayList<Region> parentRegions = new ArrayList<Region>()
		var Region currentRegion = _self
		while(currentRegion.ownerState != null && currentRegion.ownerState.ownerRegion != null){
			parentRegions.add(_self.ownerState.ownerRegion)
			currentRegion = currentRegion.ownerState.ownerRegion
		}
		
		for(var int i = parentRegions.size() - 1; i >= 0; i--){
			root += "-" + parentRegions.get(i).name
		}
		
		return root + "-" + _self.name
	}
	
	@OverrideRequiredAspectMethod
	def public void removeStatesFromContext(Hashtable<String, Object> context, ArrayList<AbstractState> toRemove){
		for(AbstractState _oldState : toRemove){
			(context.get(_self.getContextPath(_oldState)) as ArrayList<AbstractState>).remove(_oldState)
		}
		
	}
	
	@OverrideRequiredAspectMethod
	def public void addStatesToContext(Hashtable<String, Object> context, ArrayList<AbstractState> newStates){
		
		for(AbstractState _newState : newStates){
			var String path = _self.getContextPath(_newState)
			
			if(context.get(path) == null)
				context.put(path, new ArrayList<AbstractState>())
			
			if(!(context.get(path) as ArrayList<AbstractState>).contains(_newState))
				(context.get(path) as ArrayList<AbstractState>).add(_newState)
		}
	}
	
	@AddExtensionMethod
	def public String getContextPath(AbstractState _vertex){
		var root = "currentState"
		var ArrayList<Region> parentRegions = new ArrayList<Region>()
		var Region currentRegion = _vertex.ownerRegion
		while(currentRegion != null ){
			parentRegions.add(currentRegion)
			
			if(currentRegion.ownerState != null)
				currentRegion = currentRegion.ownerState.ownerRegion
			else
				currentRegion = null
		}
		
		for(var int i = parentRegions.size() - 1; i >= 0; i--){
			root += "-" + parentRegions.get(i).name
		}
		
		return root
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
	def public boolean highestConflictingTransition(ArrayList<Transition> activeTransitions){
		val res = activeTransitions.size()
		val ArrayList<Transition> toDelete = new ArrayList<Transition>()
		activeTransitions.forEach[ x |
			activeTransitions.forEach[ y |
				if(x.source instanceof State){
					var ArrayList<AbstractState> children = new ArrayList<AbstractState>()
					_self.getAllChildren((x.source as State), children)
					if(children.contains(y.source)){
						toDelete.add(y)
					}
				}
			]
		]
		activeTransitions.removeAll(toDelete)
		return res != activeTransitions.size()
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