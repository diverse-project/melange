package semantics.composite

import semantics.common.Context

import static extension semantics.composite.StateAspect.*

class ForkThread extends Thread{
	compositefsm.fsm.State state
	Context context

	new(compositefsm.fsm.State _state, Context _context) {
		state = _state
		context = _context
	}

	override run() {
		state.eval(context)
	}
}
