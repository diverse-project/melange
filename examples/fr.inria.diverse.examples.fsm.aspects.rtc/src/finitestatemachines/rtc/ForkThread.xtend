package finitestatemachines.rtc

import FSM.interfaces.Context

import static extension finitestatemachines.rtc.StateAspect.*

class ForkThread extends Thread {
	
	fsm.State state
	Context context
	
	new (fsm.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}