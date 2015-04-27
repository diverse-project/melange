package finitestatemachines.timed

import FSM.interfaces.Context

import static extension finitestatemachines.timed.StateAspect.*

class ForkThread extends Thread {
	
	finitestatemachinestimed.State state
	Context context
	
	new (finitestatemachinestimed.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}