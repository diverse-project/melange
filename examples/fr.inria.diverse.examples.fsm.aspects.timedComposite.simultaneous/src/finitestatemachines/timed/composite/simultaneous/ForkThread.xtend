package finitestatemachines.timed.composite.simultaneous

import FSM.interfaces.Context

import static extension finitestatemachines.timed.composite.simultaneous.StateAspect.*

class ForkThread extends Thread {
	
	finitestatemachinestimedcomposite.State state
	Context context
	
	new (finitestatemachinestimedcomposite.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}