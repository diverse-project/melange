package finitestatemachines.composite

import FSM.interfaces.Context

import static extension finitestatemachines.composite.StateAspect.*

class ForkThread extends Thread {
	
	finitestatemachinescomposite.State state
	Context context
	
	new (finitestatemachinescomposite.State _state, Context _context){
		state = _state
		context = _context
	}
	
	override run(){
		state.eval(context)
	}
}