package FSM.simultaneous

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.ArrayList
import java.util.Hashtable
import java.util.Scanner

import fsmcore.FinalState
import fsmcore.StateMachine
import fsmcore.State
import fsmcore.Transition
import fsmcore.Trigger
import fsmcore.Vertex
import fsmcore.Pseudostate
import fsmcore.PseudostateKind

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList

import static extension FSM.simultaneous.StateAspect.*
import static extension FSM.simultaneous.TransitionAspect.*
import static extension FSM.simultaneous.TriggerAspect.*

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
	def public void evalStateMachine(String filePath) {
		println("\nExecuting the state machine. Please enter the events to process...\n")
		
		val Hashtable<String, Object> context = new Hashtable<String, Object>
		context.put("currentState", new ArrayList<Vertex>())
		
		// Looking for the initial pseudo-state
		var Pseudostate initialPseudostate = _self.subvertex.
						findFirst[ _vertex | (_vertex instanceof Pseudostate) && 
							(_vertex as Pseudostate).kind == PseudostateKind.INITIAL] as Pseudostate
		
		// Dispatching the transitions of the initial pseudo-state
		var ArrayList<Vertex> initialCurrentState = new ArrayList<Vertex>()
		var ArrayList<Transition> initialCurrentTransitions = new ArrayList<Transition>()
		for(Transition _transition : initialPseudostate.outgoing){
			initialCurrentTransitions.add(_transition)
			initialCurrentState.add(_transition.target)
		}
		(context.get("currentState") as ArrayList<Vertex>).addAll(initialCurrentState)
		
		initialCurrentTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
		
		while(true){
			var Scanner in = new Scanner(System.in);
			print(" ---> current active state (s): ")
			(context.get("currentState") as ArrayList<Vertex>).forEach[ _vertex |
				print( _vertex.name + " ")
			]
			println("\n ---> current variables' values: ")
			var _it = context.keySet.iterator
			while(_it.hasNext){
				var String _key = _it.next
				var Object _value = context.get(_key)
				if(!_key.equals("currentState"))
					println(" - " + _key + ": " + _value)
			}
			
			print(" \n\n INPUT ---> Next event: ")
			var EList<String> events = new BasicEList<String>()
			var String[] eventsChain = in.nextLine.split(",")
			for(String _event : eventsChain){
				events.add(_event)
			}
			_self.step(context, events)
		}
	}
	
	/**
	 * Performs a step in the state machine i.e., reads an entry of the input stack and executes it.
	 * If there are several events in the same step they are executed sequentially.  
	 */
	def public void step(Hashtable<String, Object> context, EList<String> events){
		var ArrayList<Vertex> currentState = _self.getCurrentState(context, events)
		var ArrayList<Transition> currentTransitions = new ArrayList<Transition>()
		
		var ArrayList<Vertex> attendedStates = new ArrayList<Vertex>()
		var ArrayList<Vertex> newStates = new ArrayList<Vertex>()
		var EList<Transition> activeTransitions = new BasicEList<Transition>()
		
		for(Vertex _state : currentState){
			activeTransitions.addAll(_self.getActiveTransitions(_state, events))
		}
		
		for(Transition transition : activeTransitions){
			_self.findOldActiveStates(attendedStates, transition)
			_self.findNewActiveTransitions(currentTransitions, transition, context)
			_self.findNewActiveStates(newStates, transition, currentTransitions, context)
		}

		currentState.removeAll(attendedStates)
		
		for(Vertex _newState : newStates){
			if(!currentState.contains(_newState))
				currentState.add(_newState)
		}
		
		currentTransitions.forEach[ transition |
			transition.evalTransition(context)
		]
	}
	
	/**
	 * Returns the current state of the machine. It corresponds to the current set of active states.
	 */
	def public ArrayList<Vertex> getCurrentState(Hashtable<String, Object> context, EList<String> events){
		return context.get("currentState") as ArrayList<Vertex>
	}
	
	/**
	 * Returns the active transitions of a vertex
	 */
	def public EList<Transition> getActiveTransitions(Vertex vertex, EList<String> events){
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
	def public void findOldActiveStates(ArrayList<Vertex> oldActiveStates, 
		Transition selectedTransition){
		if(!oldActiveStates.contains(selectedTransition.source))
			oldActiveStates.add(selectedTransition.source)
	}
	
	/**
	 * Finds the set of states that will be active after the step.
	 */
	def public void findNewActiveStates(ArrayList<Vertex> newActiveStates,
		Transition selectedTransition, ArrayList<Transition> currentActiveTransitions,
		Hashtable<String, Object> context){
			if(!newActiveStates.contains(selectedTransition.target))
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
	
	def public void evalTransition(Hashtable<String, Object> context){
		if(_self.validGuard(context)){
			
			if(_self.source instanceof State)
				(_self.source as State).exitState(context)
				
			if(_self.target instanceof State){
				(_self.target as State).entryState(context)
				(_self.target as State).evalState(context)				
			}
		}
	}
	
	def public boolean validGuard(Hashtable<String, Object> context){
		return (_self.guard == null) || (_self.guard != null && _self.guard.evalConstraint(context) == true)
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