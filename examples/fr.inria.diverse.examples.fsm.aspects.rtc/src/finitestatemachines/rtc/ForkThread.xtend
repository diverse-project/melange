package finitestatemachines.rtc

import FSM.interfaces.Context

import static extension finitestatemachines.rtc.StateAspect.*

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