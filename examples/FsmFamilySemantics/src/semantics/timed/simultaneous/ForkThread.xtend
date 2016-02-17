package semantics.timed.simultaneous

import semantics.common.Context

import static extension semantics.timed.simultaneous.StateAspect.*

class ForkThread extends Thread {
	
	timedfsm.fsm.State state
	Context context
	
	new (timedfsm.fsm.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}
