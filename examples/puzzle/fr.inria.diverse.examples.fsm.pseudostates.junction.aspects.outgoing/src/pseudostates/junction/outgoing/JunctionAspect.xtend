package pseudostates.junction.outgoing

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod

import java.util.ArrayList
import java.util.Hashtable
import junctionpseudostate.Region
import junctionpseudostate.Transition
import junctionpseudostate.Pseudostate
import junctionpseudostate.PseudostateKind
import junctionpseudostate.AbstractState
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList

@Aspect(className=Region)
class RegionAspect {
	
	@OverrideRequiredAspectMethod
	def public void step(Hashtable<String, Object> context, EList<String> events){
		var boolean allJunctionsAttended = false
		while(!allJunctionsAttended){
			_self._original_step(context, events)
			
			var ArrayList<AbstractState> currentState = context.get("currentState-" + _self.name) as ArrayList<AbstractState>
			allJunctionsAttended = !currentState.exists[_vertex | _vertex.outgoing.exists[_outgoing|
				(_outgoing.target instanceof Pseudostate) &&
					(_outgoing.target as Pseudostate).kind == PseudostateKind.JUNCTION
			]]
		}
	}
	
	@OverrideRequiredAspectMethod
	def public EList<Transition> getActiveTransitions(AbstractState vertex, EList<String> events){
		
		val res = new BasicEList<Transition>();
		for(Transition transition : vertex.outgoing){
			if( (transition.trigger == null) || 
				(transition.trigger != null && transition.trigger.evalTrigger(events) ||
					(transition.target instanceof Pseudostate)
						&& ((transition.target as Pseudostate).kind == PseudostateKind.JUNCTION)
				)
			){
				res.add(transition)
			}
		}
		return res;
	}
	
	@OverrideRequiredAspectMethod
	def public void findOldActiveStates(ArrayList<AbstractState> oldActiveStates, 
		Transition selectedTransition, Hashtable<String, Object> context){
			
		var boolean sourceIsJunction = (selectedTransition.source instanceof Pseudostate) &&
			(selectedTransition.source as Pseudostate).kind == PseudostateKind.JUNCTION
			
		if(sourceIsJunction){
			var boolean allOutputFired = !selectedTransition.source.outgoing.exists[ _transition | !_transition.alreadyFired(context)]
			var boolean junctionComplete = (sourceIsJunction && allOutputFired)
			
			if(!oldActiveStates.contains(selectedTransition.source) && junctionComplete)
				oldActiveStates.add(selectedTransition.source)
		}else{
			_self._original_findOldActiveStates(oldActiveStates, selectedTransition, context)
		}
		
	}
	
//	@OverrideRequiredAspectMethod
//	def public void findNewActiveStates(ArrayList<AbstractState> newActiveStates,
//		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions, 
//		Hashtable<String, Object> context){
//		if((selectedTransition.source instanceof Pseudostate)
//			&& (selectedTransition.source as Pseudostate).kind == PseudostateKind.JUNCTION){
//			for(Transition _theTransition : (selectedTransition.source as Pseudostate).outgoing){
//				if(_theTransition.validGuard(context)){
//					if(!newActiveStates.contains(newActiveStates))
//						newActiveStates.add(_theTransition.target)							
//				}
//			}
//		}
//		else{
//			_self._original_findNewActiveStates(newActiveStates, selectedTransition, currentActiveTransitions, context)
//		}	
//	}
}