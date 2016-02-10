package finitestatemachines.timed.composite.simultaneous

import FSM.interfaces.Context

import static extension finitestatemachines.timed.composite.simultaneous.StateAspect.*

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