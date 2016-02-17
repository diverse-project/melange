package semantics.timedcomposite.simultaneous

import semantics.common.Context

import static extension semantics.timedcomposite.simultaneous.StateAspect.*

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