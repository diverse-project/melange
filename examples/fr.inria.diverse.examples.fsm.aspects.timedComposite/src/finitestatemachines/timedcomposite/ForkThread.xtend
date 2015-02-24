package finitestatemachines.timedcomposite

import FSM.interfaces.Context

import static extension finitestatemachines.timedcomposite.StateAspect.*

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