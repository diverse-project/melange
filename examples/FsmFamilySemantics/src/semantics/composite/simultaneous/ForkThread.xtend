package semantics.composite.simultaneous

import semantics.common.Context

import static extension semantics.composite.simultaneous.StateAspect.*

class ForkThread extends Thread {
	
	compositefsm.fsm.State state
	Context context
	
	new (compositefsm.fsm.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}
