package semantics.flat

import semantics.common.Context

import static extension semantics.flat.StateAspect.*

class ForkThread extends Thread {
	
	flatfsm.fsm.State state
	Context context
	
	new (flatfsm.fsm.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}