package pseudostates.conditional

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import conditionalpseudostate.StateMachine
import conditionalpseudostate.Transition
import java.util.ArrayList
import puzzle.annotations.processor.OverrideRequiredAspectMethod
import conditionalpseudostate.Pseudostate
import conditionalpseudostate.PseudostateKind
import java.util.Hashtable
import org.eclipse.emf.common.util.EList
import conditionalpseudostate.Vertex

@Aspect(className=StateMachine)
class StateMachineAspect { 
	
	@OverrideRequiredAspectMethod
	def public void step(Hashtable<String, Object> context, EList<String> events){
		var boolean allConditionalsAttended = false
		while(!allConditionalsAttended){
			_self._original_step(context, events)
			
			var ArrayList<Vertex> currentState = context.get("currentState") as ArrayList<Vertex>
			var _conditionalPseudostate = currentState.findFirst[_vertex | (_vertex instanceof Pseudostate) &&
				(_vertex as Pseudostate).kind == PseudostateKind.CONDITIONAL]
			allConditionalsAttended = _conditionalPseudostate == null
		}
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
		if((selectedTransition.source instanceof Pseudostate)
			&& (selectedTransition.source as Pseudostate).kind == PseudostateKind.CONDITIONAL){
			for(Transition _theTransition : (selectedTransition.source as Pseudostate).outgoing){
				if(_theTransition.validGuard(context)){
					if(!newActiveTransitions.contains(newActiveTransitions))
						newActiveTransitions.add(_theTransition)							
				}
			}
		}
		else{
			_self._original_findNewActiveTransitions(newActiveTransitions, selectedTransition, context)
		}	
	}
	
	@OverrideRequiredAspectMethod
	def public void findNewActiveStates(ArrayList<Vertex> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, 
		Hashtable<String, Object> context){
		if((selectedTransition.source instanceof Pseudostate)
			&& (selectedTransition.source as Pseudostate).kind == PseudostateKind.CONDITIONAL){
			for(Transition _theTransition : (selectedTransition.source as Pseudostate).outgoing){
				if(_theTransition.validGuard(context)){
					if(!newActiveStates.contains(newActiveStates))
						newActiveStates.add(_theTransition.target)							
				}
			}
		}
		else{
			_self._original_findNewActiveStates(newActiveStates, selectedTransition, currentActiveTransitions, context)
		}	
	}
}