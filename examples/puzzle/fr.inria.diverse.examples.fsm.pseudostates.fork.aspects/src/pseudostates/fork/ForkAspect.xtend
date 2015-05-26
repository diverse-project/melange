package pseudostates.fork

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import forkpseudostate.Transition
import java.util.ArrayList
import puzzle.annotations.processor.OverrideRequiredAspectMethod
import forkpseudostate.Pseudostate
import forkpseudostate.PseudostateKind
import forkpseudostate.AbstractState
import java.util.Hashtable
import forkpseudostate.Region

@Aspect(className=Region)
class RegionAspect {

	@OverrideRequiredAspectMethod
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
			
		if((selectedTransition.target instanceof Pseudostate)
			&& (selectedTransition.target as Pseudostate).kind == PseudostateKind.FORK){
			newActiveTransitions.addAll((selectedTransition.target as Pseudostate).outgoing)
		}
		else{
			_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)			
		}
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<AbstractState> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, Hashtable<String, Object> context){
		if((selectedTransition.target instanceof Pseudostate)
			&& (selectedTransition.target as Pseudostate).kind == PseudostateKind.FORK){
			for(Transition _transition : (selectedTransition.target as Pseudostate).outgoing){
				newActiveStates.add(_transition.target)
			}
		}
		else{
			_self._original_findNewActiveStates(newActiveStates, selectedTransition, currentActiveTransitions, context)
		}
	}	
}