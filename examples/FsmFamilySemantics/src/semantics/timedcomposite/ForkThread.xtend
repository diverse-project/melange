package semantics.timedcomposite

import semantics.common.Context

import static extension semantics.timedcomposite.StateAspect.*

class ForkThread extends Thread {
	
	timedcompositefsm.fsm.State state
	Context context
	
	new (timedcompositefsm.fsm.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}
