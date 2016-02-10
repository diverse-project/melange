package finitestatemachines.timedcomposite

import FSM.interfaces.Context

import static extension finitestatemachines.timedcomposite.StateAspect.*

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