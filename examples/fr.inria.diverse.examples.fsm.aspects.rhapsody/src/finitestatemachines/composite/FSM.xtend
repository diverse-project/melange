package finitestatemachines.composite

import FSM.interfaces.Context
import finitestatemachinescomposite.Fork
import finitestatemachinescomposite.InitialState
import finitestatemachinescomposite.Join
import finitestatemachinescomposite.State
import finitestatemachinescomposite.StateMachine
import finitestatemachinescomposite.Transition
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.ArrayList
import java.util.List

import static extension finitestatemachines.composite.StateMachineAspect.*
import static extension finitestatemachines.composite.StateAspect.*
import static extension finitestatemachines.composite.TransitionAspect.*
import static extension finitestatemachines.composite.CompositeStateAspect.*
import finitestatemachinescomposite.CompositeState
import finitestatemachinescomposite.Action
import java.util.Set
import java.util.HashSet
import finitestatemachinescomposite.FinitestatemachinescompositeFactory

//
// *.*
// ASPECT
/**
 * StateMachineAspect: Aspects for the State Machine meta-class
 * Serves as the interpreter of the state machine (the controller of the )
 */
@Aspect(className=StateMachine)
class StateMachineAspect {
	
	public Set<State> currentState = null
	List<Transition> currentTransitions = null
	
	/**
	 * Evaluates the input and sequentially executes the steps in the state machine. 
	 */
	 
	def private void eval (Context context, String filePath) {
		println("\nExecuting the state machine. Please wait for the results...\n")
		println(" ... executing input ...\n")
		
		var ArrayList<ArrayList<String>> events = context.events
		
		_self.currentState = _self.getInitialState()
		_self.currentState.get(0).eval(context)
		
		for(ArrayList<String> eventsGroup : events){
			println("  input item: " + eventsGroup + " time: " + (System.currentTimeMillis as int))
			_self.step(context, eventsGroup)
		}
		
		println("\n *.* Your results are ready! \n")
		(new Printer()).printFinalStateInConsole(_self)
		(new Printer()).printFinalStateInFile(_self, filePath)
	}
	
	/**
	 * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
	 * If there are several events in the same step they are executed sequentially.  
	 */
	def private void step(Context context, ArrayList<String> eventsGroup){
		// In this case, the current transitions are local to the step. 
		_self.currentTransitions = new ArrayList<Transition>()
		
		for(String event : eventsGroup){
			for(State state : _self.getDeepestCurrent(event)){
				state.getActiveTransitions(event).forEach[fire(context)]
			}
		}
	}
	

	/*
	 * Get all states concerned by this event and remove those contained 
	 */
	def private List<State> getHigherCurrent(String event){
		val List<State> res = new ArrayList<State>()
		
		val List<State> candidates = new ArrayList<State>()
		for(State state : _self.currentState){
			if(!state.getActiveTransitions(event).isEmpty){
				candidates.add(state)
			}
		}
		
		candidates.forEach[state |
			val parents = state.allParents
			//Check if state is a top element
			if(!candidates.exists[c | parents.contains(c)]){
				res.add(state)
			}
		]
		
		return res
	}
	
	/*
	 * Get all the deepest states concerned by this event
	 */
	def private List<State> getDeepestCurrent(String event){
		val List<State> res = new ArrayList<State>()
		
		val List<State> candidates = new ArrayList<State>()
		for(State state : _self.currentState){
			if(!state.getActiveTransitions(event).isEmpty){
				candidates.add(state)
			}
		}
		
		candidates.forEach[state |
			val children = state.allChildren
			//Check if state has no candidate children 
			if(!candidates.exists[c | children.contains(c)]){
				res.add(state)
			}
		]
		
		return res
	}
	
	/**
	 * Returns the (unique?) initial state of the state machine. 
	 */
	def private Set<State> getInitialState(){
		var HashSet<State> answer = new HashSet<State>()
		for(State state : _self.states){
			if(state instanceof InitialState) answer.add(state)
		}
		return answer
	}
	
	/*
	 * Intended format for @expression:
	 * <String>=<true|false>
	 */
	def public boolean isValid(String expression){
		val segments = expression.split("=")
		val varName = segments.get(0)
		val varValue = segments.get(1)
		
		var variable = _self.variables.findFirst[name == varName]
		if(variable != null){
			return variable.value == varValue
		}
		return false
	}
	
	/**
	 * Creates or update a variable
	 */
	def public void update(Action action){
		if(action != null){
			var variable = _self.variables.findFirst[name == action.variable]
			if(variable == null){
				variable = FinitestatemachinescompositeFactory.eINSTANCE.createVariable
				variable.name = action.variable
				_self.variables.add(variable)
			}
			variable.value = action.value
		}
	}
	
	def public void addCurrentState(State s){
		_self.currentState.add(s)
	}
	
	def public void removeCurrentState(State s){
		_self.currentState.remove(s)
	}
	
	def public boolean isCurrentState(State s){
		return _self.currentState.contains(s)
	}
	
}


@Aspect(className=State)
class StateAspect {
	
	def public void run(Context context) {
		_self.initialTime = (System.currentTimeMillis) as int
		Context.stateWorking(1000)
		_self.finalTime = (System.currentTimeMillis) as int
	}
	
	/**
	 * Get transitions that can be fired by this event
	 * If even is null all transitions without event are candidate 
	 */
	def public List<Transition> getActiveTransitions(String event){
		val List<Transition> res = new ArrayList<Transition>();
		for(Transition transition : _self.outgoing){
			if(event == null || transition.trigger.expression.equals(event)){
				if(_self.stateMachine.isValid(transition.guard.expression)){
					res.add(transition)
				}
			}
		}
		return res;
	}
	
	def public List<State> getAllParents(){
		val res = new ArrayList<State>()
		
		if(_self.parentState != null){
			res.addAll(_self.parentState.allParents)
			res.add(_self.parentState)
		}
		
		return res
	}
	
	def public List<State> getAllChildren(){
		val res = new ArrayList<State>()
	
		if(_self instanceof CompositeState){
			val composite = _self as CompositeState
			val subStates = composite.regions.map[states].flatten
			val allSubStates = subStates.map[s|s.getAllChildren].flatten
			res.addAll(allSubStates)
		}
	
		return res
	} 
	
	def public void eval (Context context){
		
		val fsm = _self.stateMachine
		
		if(_self instanceof Fork){
				var ArrayList<ForkThread> threads = new ArrayList<ForkThread>()
				for(Transition _forkTransition : _self.outgoing){
					var ForkThread _forkThread = new ForkThread(_forkTransition.target, context);
					threads.add(_forkThread)
					_forkThread.start
				}
				
				var boolean threadsAlive = true
				while(threadsAlive){
					var int stillAlive = 0
					for(Thread _thread : threads){
						if(_thread.alive){stillAlive++}
					}
					if(stillAlive == 0)threadsAlive=false
				}
		}
		else if(_self instanceof Join){
			val join = _self as Join
			val sources = join.incoming.map[source]
			if(fsm.currentState.containsAll(sources)){
				
				sources.forEach[s |
					//TODO: copied from Transition.fire() 
					//Remove all sub states if we exit a composite
					if(s instanceof CompositeState){
						val composite = s as CompositeState
						composite.getAllStates.forEach[subS | fsm.removeCurrentState(subS)]
					}
					else{
						fsm.removeCurrentState(s)
					}
				]
				
				join.outgoing.forEach[out |
					out.fire(context)
				]
			}
		}
		else if (_self instanceof CompositeState){
			
			val nextTransition = _self.getActiveTransitions(null)
			if(nextTransition.isEmpty){
				fsm.addCurrentState(_self)
				
				val composite = _self as CompositeState
				//Get all init states from all regions
				val initStates = composite.regions.map[r | r.states].flatten.filter[s|s instanceof InitialState]
				
				val ArrayList<ForkThread> threads = new ArrayList<ForkThread>()
				initStates.forEach[init |
					var ForkThread _forkThread = new ForkThread(init, context);
					threads.add(_forkThread)
					_forkThread.start
				]
				
				var boolean threadsAlive = true
				while(threadsAlive){
					var int stillAlive = 0
					for(Thread _thread : threads){
						if(_thread.alive){stillAlive++}
					}
					if(stillAlive == 0)threadsAlive=false
				}
			}
			else{
				_self.getActiveTransitions(null).forEach[ fire(context) ]
			}
		}
		else{
			// Simple state: If the transition goes to a simple state, evaluate the state and add it to the current states.
			_self.run(context)
			
			val nextTransition = _self.getActiveTransitions(null)
			if(nextTransition.isEmpty){
				fsm.addCurrentState(_self)
				//Add all containing states to current states
				var parent = _self.parentState
				while(parent != null && !fsm.isCurrentState(parent)){
					fsm.addCurrentState(parent)
					parent = parent.parentState
				}
			}
			else{
				_self.getActiveTransitions(null).forEach[ fire(context) ]
			}
		}
	}
}

@Aspect(className=CompositeState)
class CompositeStateAspect extends StateAspect {
	
	@OverrideAspectMethod
	def public void eval(Context context) {
		//Do nothing
	}
	
	/**
	 * Get all sub states
	 */
	def public List<State> getAllStates(){
		var ArrayList<State> attendedStates = new ArrayList<State>()
		var subStates = _self.regions.map[r | r.states].flatten
		while(!subStates.isEmpty){
			attendedStates.addAll(subStates)
			
			//Get sub states of subStates 
			var subComposite = subStates.filter[s|s instanceof CompositeState].map[s | s as CompositeState]
			subStates = subComposite.map[c|c.regions.map[r | r.states].flatten].flatten
		}
		return attendedStates
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	
	def public void fire(Context context){
		
		val fsm = _self.stateMachine
		val source = _self.source
		//Remove all sub states if we exit a composite
		if(source instanceof CompositeState){
			val composite = source as CompositeState
			composite.getAllStates.forEach[s | fsm.removeCurrentState(s)]
		}
		else{
			fsm.removeCurrentState(_self.source)
		}
		
		
		val Action action = _self.action
		_self.stateMachine.update(action)
		
		val target = _self.target
		target.eval(context)
		
	}
}
