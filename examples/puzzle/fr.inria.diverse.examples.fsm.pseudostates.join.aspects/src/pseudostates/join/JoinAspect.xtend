package pseudostates.join

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod

import java.util.ArrayList
import joinpseudostate.Vertex
import joinpseudostate.Transition
import joinpseudostate.Pseudostate
import joinpseudostate.PseudostateKind
import java.util.Hashtable
import joinpseudostate.Region

@Aspect(className=Region)
class RegionAspect {
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
	
		_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)
	
		for(Transition _candidate : selectedTransition.target.outgoing){
			if((_candidate.target instanceof Pseudostate)
				&& ((_candidate.target as Pseudostate).kind == PseudostateKind.JOIN)){
				newActiveTransitions.add(_candidate)
			}
		}
	}
	  
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<Vertex> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions,
		Hashtable<String, Object> context){
			
		_self._original_findNewActiveStates(newActiveStates, selectedTransition, currentActiveTransitions, context)
		
		for(Transition _candidate : selectedTransition.target.outgoing){
			if((_candidate.target instanceof Pseudostate)
				&& ((_candidate.target as Pseudostate).kind == PseudostateKind.JOIN)){
				if(!newActiveStates.contains(_candidate.target))
					newActiveStates.add(_candidate.target)
			}
		}
	}
	
	@OverrideRequiredAspectMethod
	def public void findOldActiveStates(ArrayList<Vertex> oldActiveStates, 
		Transition selectedTransition){
			
		_self._original_findOldActiveStates(oldActiveStates, selectedTransition)
	
		for(Transition _candidate : selectedTransition.target.outgoing){
			if((_candidate.target instanceof Pseudostate)
				&& ((_candidate.target as Pseudostate).kind == PseudostateKind.JOIN)){
				if(!oldActiveStates.contains(_candidate.source))
					oldActiveStates.add(_candidate.source)
			}
		}
	}
}