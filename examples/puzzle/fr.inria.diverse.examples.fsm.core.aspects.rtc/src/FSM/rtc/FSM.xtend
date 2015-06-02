package FSM.rtc

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.ArrayList
import java.util.Hashtable
import java.util.Scanner

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList

import fsmcore.FinalState
import fsmcore.Region
import fsmcore.StateMachine
import fsmcore.State
import fsmcore.Transition
import fsmcore.Trigger
import fsmcore.AbstractState
import fsmcore.Pseudostate
import fsmcore.PseudostateKind

import static extension FSM.rtc.StateAspect.*
import static extension FSM.rtc.RegionAspect.*
import static extension FSM.rtc.TransitionAspect.*
import static extension FSM.rtc.TriggerAspect.*

// *.*
// ASPECT
/**
 * StateMachineAspect: Aspects for the State Machine meta-class
 * Serves as the interpreter of the state machine (the controller of the )
 */ 
@Aspect(className=StateMachine)
class StateMachineAspect { 
	
	public String chain
	public ArrayList<ArrayList<String>> events
	 
	/**
	 * Evaluates the input and sequentially executes the steps in the state machine. 
	 */
	def public void evalStateMachine() {
		println("\nExecuting the state machine. Please enter the events to process...\n")
		
		val Hashtable<String, Object> context = new Hashtable<String, Object>
		context.put("currentState", new ArrayList<AbstractState>())
		
		_self.regions.forEach[ _region | _region.initRegion(context)]
		
		print(" ---> current active state (s): ")
		(context.get("currentState") as ArrayList<AbstractState>).forEach[ _vertex |
			print( _vertex.name + " ")
		]
		
		var _it = context.keySet.iterator
		var String variablesString = ""
		while(_it.hasNext){
			var String _key = _it.next
			var Object _value = context.get(_key)
			if(!_key.equals("currentState"))
				variablesString += " - " + _key + ": " + _value + "\n"
		}
		if(!variablesString.equals("")){
			println("\n ---> current variables' values: ")
			println(variablesString)
		}
		
		while(true){
			var Scanner in = new Scanner(System.in);
			print(" \n\n INPUT ---> Next event: ")
			var String[] eventsChain = in.nextLine.split(",")
			for(String _event : eventsChain){
				val EList<String> events = new BasicEList<String>()
				events.add(_event)
				_self.regions.forEach[ _region | _region.step(context, events)]
				
				print("    step: ---> current active state (s): ")
				(context.get("currentState") as ArrayList<AbstractState>).forEach[ _vertex |
					print( _vertex.name + " ")
				]
				
				_it = context.keySet.iterator
				variablesString = ""
				while(_it.hasNext){
					var String _key = _it.next
					var Object _value = context.get(_key)
					if(!_key.equals("currentState"))
						variablesString += "              - " + _key + ": " + _value + "\n"
				}
				if(!variablesString.equals("")){
					println("\n          ---> current variables' values: ")
					println(variablesString)
				}
				println
			}
		}
	}
}

// *.*
// ASPECT
@Aspect(className=Region)
class RegionAspect {
	
	def public void initRegion(Hashtable<String, Object> context){
		
		// Looking for the initial pseudo-state
		var Pseudostate initialPseudostate = _self.subvertex.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex as Pseudostate).kind == PseudostateKind.INITIAL] as Pseudostate
		
		// Dispatching the transitions of the initial pseudo-state
		var ArrayList<AbstractState> initialCurrentState = new ArrayList<AbstractState>()
		var ArrayList<Transition> initialCurrentTransitions = new ArrayList<Transition>()
		for(Transition _transition : initialPseudostate.outgoing){
			initialCurrentTransitions.add(_transition)
			initialCurrentState.add(_transition.target)
		}
		(context.get("currentState") as ArrayList<AbstractState>).addAll(initialCurrentState)
		
		initialCurrentTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
	}
	
	/**
	 * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
	 * If there are several events in the same step they are executed sequentially.  
	 */
	def public void step(Hashtable<String, Object> context, EList<String> events){
		var ArrayList<AbstractState> currentState = _self.getCurrentState(context, events)
		var ArrayList<Transition> currentTransitions = new ArrayList<Transition>()
		
		var ArrayList<AbstractState> attendedStates = new ArrayList<AbstractState>()
		var ArrayList<AbstractState> newStates = new ArrayList<AbstractState>()
		var EList<Transition> activeTransitions = new BasicEList<Transition>()
		
		for(AbstractState _state : currentState){
			activeTransitions.addAll(_self.getActiveTransitions(_state, events))
		}
		
		for(Transition transition : activeTransitions){
			_self.findOldActiveStates(attendedStates, transition, context)
			_self.findNewActiveTransitions(currentTransitions, transition, context)
			_self.findNewActiveStates(newStates, transition, currentTransitions, context)
		}

		for(AbstractState _attendedState : attendedStates){
			if(_attendedState instanceof State)
				(_attendedState as State).exitState(context)
		}
		
		currentState.removeAll(attendedStates)
		
		for(AbstractState _newState : newStates){
			if(!currentState.contains(_newState))
				currentState.add(_newState)
		}
		
		activeTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
		
		currentTransitions.forEach[ transition |
			if(!transition.alreadyFired(context))
				transition.evalTransition(context)
		]
		
		newStates.forEach[ state |
				state.outgoing.forEach[ transition | transition.resetFired() ]
		]
	}
	
	/**
	 * Returns the current state of the machine. It corresponds to the current set of active states.
	 */
	def public ArrayList<AbstractState> getCurrentState(Hashtable<String, Object> context, EList<String> events){
		return context.get("currentState") as ArrayList<AbstractState>
	}
	
	/**
	 * Returns the active transitions of a vertex
	 */
	def public EList<Transition> getActiveTransitions(AbstractState vertex, EList<String> events){
		val res = new BasicEList<Transition>();
		for(Transition transition : vertex.outgoing){
			if( (transition.trigger == null) || (transition.trigger != null && transition.trigger.evalTrigger(events))){
				res.add(transition)
			}
		}
		return res;
	}
	
	/**
	 * Finds the set of states that are active before the step and that will be left after the step. 
	 */
	def public void findOldActiveStates(ArrayList<AbstractState> oldActiveStates, 
		Transition selectedTransition, Hashtable<String, Object> context){
		if(!oldActiveStates.contains(selectedTransition.source))
			oldActiveStates.add(selectedTransition.source)
	}
	
	/**
	 * Finds the set of states that will be active after the step.
	 */
	def public void findNewActiveStates(ArrayList<AbstractState> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions,
		Hashtable<String, Object> context){
			if(!newActiveStates.contains(selectedTransition.target) && 
				!selectedTransition.alreadyFired(context))
					newActiveStates.add(selectedTransition.target)
	}
	
	/**
	 * Finds the transitions that will be fired during the step. 
	 */
	def public void findNewActiveTransitions(ArrayList<Transition> newActiveTransitions, 
		Transition selectedTransition, Hashtable<String, Object> context){
		newActiveTransitions.add(selectedTransition)
	}
}

// *.*
// ASPECT
@Aspect(className=State)
class StateAspect {
	
	def public void entryState(Hashtable<String, Object> context){
		if(_self.entry != null)
			_self.entry.eval(context)
	}
	
	def public void evalState(Hashtable<String, Object> context) {
		if(_self.doActivity != null){
			var Runnable _runnable = new Runnable{
				override run(){
					 synchronized (_self) {
					 	_self.doActivity.eval(context)
					 }
				}
			}
		 	var Thread _thread = new Thread(_runnable)
			_thread.start
		}
	}
	
	def public void exitState(Hashtable<String, Object> context){
		if(_self.exit != null)
			_self.exit.eval(context)
	}
}

// *.*
// ASPECT
@Aspect(className=Transition)
class TransitionAspect {
	
	private boolean fired = false
	
	def public void evalTransition(Hashtable<String, Object> context){
		if(_self.validGuard(context)){
			_self.fired = true
			if(_self.target instanceof State){
				(_self.target as State).entryState(context)
				(_self.target as State).evalState(context)				
			}
		} 
	}
	
	def public boolean validGuard(Hashtable<String, Object> context){
		return (_self.guard == null) || (_self.guard != null && _self.guard.evalConstraint(context) == true)
	}
	
	def public boolean alreadyFired(Hashtable<String, Object> context){
		return _self.fired
		
	}
	
	def public void resetFired(){
		_self.fired = false
	}
}

// *.*
// ASPECT
@Aspect(className=Trigger)
class TriggerAspect {
	
	def public boolean evalTrigger(EList<String> events){
		return events.contains(_self.expression)
	}
}

// *.*
// ASPECT
@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {
	
	@OverrideAspectMethod
	def public void exitState(Hashtable<String, Object> context){
		_self.super_exitState(context)
		System.exit(0)
	}
}