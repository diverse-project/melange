package FSM.composite.emptyInitial

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import puzzle.annotations.processor.OverrideRequiredAspectMethod
	
import java.util.Hashtable

import compositestates.Region
import compositestates.Pseudostate
import compositestates.PseudostateKind
import java.util.ArrayList
import compositestates.AbstractState

@Aspect(className=Region)
class RegionAspect{
	
	@OverrideRequiredAspectMethod
	def public void initRegion(Hashtable<String, Object> context){
	
		var Pseudostate initialPseudostate = _self.subvertex.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex as Pseudostate).kind == PseudostateKind.INITIAL] as Pseudostate
							
		if(initialPseudostate != null){
			_self._original_initRegion(context)
		}else{
			if(!(context.get("currentState-" + _self.name) as ArrayList<AbstractState>).contains(_self.ownerState))
				(context.get("currentState-" + _self.name) as ArrayList<AbstractState>).add(_self.ownerState)
		}
	}
	
	
}