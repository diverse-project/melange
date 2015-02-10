package finitestatemachines.rtc

import static extension finitestatemachines.rtc.StateAspect.*

class ForkThread extends Thread {
	
	finitestatemachines.State state
	Context context
	
	new (finitestatemachines.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}