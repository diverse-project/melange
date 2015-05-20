package FSM.composite.deepest

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.AddExtensionMethod
import puzzle.annotations.processor.OverrideSuperAspectMethod
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	
import compositestates.CompositeState
import compositestates.State
import compositestates.StateMachine
import compositestates.Transition
import compositestates.Vertex
import compositestates.Pseudostate
import compositestates.PseudostateKind

import java.util.Hashtable
import java.util.ArrayList

import static extension FSM.composite.deepest.CompositeStateAspect.*

@Aspect(className=StateMachine)
class StateMachineAspect{
	
	@OverrideRequiredAspectMethod
	def public void findOldActiveStates(ArrayList<Vertex> oldActiveStates, 
		Transition selectedTransition){
		_self._original_findOldActiveStates(oldActiveStates, selectedTransition)
		
		if(selectedTransition.source instanceof CompositeState){
			for(Vertex _childState : (selectedTransition.source as CompositeState).states){
				oldActiveStates.add(_childState)
			}
		}
		
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
	def public Transition deepestConflictingTransition(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition){
			
		if(selectedTransition.source instanceof CompositeState){
			var CompositeState sourceState = selectedTransition.source as CompositeState
			var ArrayList<Vertex> children = new ArrayList<Vertex>()
			sourceState.getAllChildren(children)
			for(Transition _activeTransition : newActiveTransitions){
				if(children.contains(_activeTransition.source)){
					return _activeTransition
				}
			}
		}else if(selectedTransition.source instanceof State){
			for(Transition _activeTransition : newActiveTransitions){
				if(_activeTransition.source instanceof CompositeState){
					var ArrayList<Vertex> children = new ArrayList<Vertex>()
					(_activeTransition.source as CompositeState).getAllChildren(children)
					if(children.contains(selectedTransition.source)){
						return _activeTransition
					}
				}
				
			}
		}
		return null
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<Vertex> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, Hashtable<String, Object> context){
		
		// Adding the super states to the current state.
		if(selectedTransition.target instanceof State){
			var State superState = (selectedTransition.target as State).ownerState
			while(superState != null){
				if(!newActiveStates.contains(superState))
					newActiveStates.add(superState);
				superState = superState.ownerState
			}
		}
		
		for(Transition _currentTransition : currentActiveTransitions){
			_self._original_findNewActiveStates(newActiveStates, _currentTransition, currentActiveTransitions, context)
		}
		
		var ArrayList<Vertex> toDelete = new ArrayList<Vertex>()
		for(Vertex _newState : newActiveStates){
			var boolean delete = true
			
			for(Transition _incoming : _newState.incoming){
				
				if(_newState instanceof CompositeState){
					var ArrayList<Vertex> children = newArrayList
					_newState.getAllChildren(children)
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
	
	@AddExtensionMethod
	def public void getAllParents(Vertex vertex, ArrayList<Vertex> parents){
		if(vertex.ownerState != null){
			parents.add(vertex.ownerState)
			_self.getAllParents(vertex.ownerState, parents)
		}
	}
}


@Aspect(className=CompositeState)
class CompositeStateAspect { 
	
	@OverrideSuperAspectMethod
	def public void evalState(Hashtable<String, Object> context){
		_requiredSuper.evalState(context)

		// Looking for the initial pseudo-state
		var Pseudostate initialPseudostate = _self.states.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex as Pseudostate).kind == PseudostateKind.INITIAL] as Pseudostate
		
		// Dispatching the transitions of the initial pseudo-state
		var ArrayList<Vertex> initialCurrentState = new ArrayList<Vertex>()
		for(Transition _transition : initialPseudostate.outgoing){
			initialCurrentState.add(_transition.target)
		}
		(context.get("currentState") as ArrayList<Vertex>).addAll(initialCurrentState)
	}
	
	@OverrideSuperAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self.states.forEach[ _state |
			if(_state instanceof State){
				_state.exitState(context)
			}
		]
		_requiredSuper.exitState(context)
	}
	
	@AddExtensionMethod
	def public void getAllChildren(ArrayList<Vertex> children){
		for(Vertex _vertex : _self.states){
			children.add(_vertex)
			if(_vertex instanceof CompositeState){
				_vertex.getAllChildren(children)
			}
		}
	}
}