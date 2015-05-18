---
layout: page
title: Semantic/Syntactic variation
group: tutorial
---

{% include JB/setup %}

In this tutorial we will design 4 variations of the FSM language defined in [Tutorial 1: Defining a language](newlanguage.html)
and thanks to the Melange type system we will see relations between different but close languages.

### A family of language

Before playing with Melange, we need a family of languages. The idea is to have close languages sharing syntactic elements to illustrate the Melange type system.
To do so we will design the languages **Simple FSM**, **Timed FSM**, **Composite FSM** and **TimedComposite FSM**.
These languages will be independent, having structural variations and corresponding behavior changes.

-------------

As explained how to in [Tutorial 1: Defining a language](newlanguage.html), you have to create these 4 languages:

##### Simple FSM

If you remember, the Simple FSM language is composed of:

 - A State Machine
 - Some States
 - An Initial State (it's the entry point of the State Machine)
 - A Final State (we need also an exit point)
 - Some Transitions

And looks like:
![Simple FSM](images/fsmSimple.png)

##### Timed FSM

This language is similar to Simple FSM but with an EAttribut **time : EInt** in Transition.
Unlike in Simple FSM, here Transitions take time to be executed. This semantic variation have to be expressed in the Aspect on Transition.
![Simple FSM](images/fsmTimed.png)

##### Composite FSM

This language is similar to Simple FSM but with a containment EReference **substates : State** in State.
Composite states behave like StateMachine, they have Initial and Terminal states and an internal current state. If an outgoing Transition from a composite state target the same Event as the outgoing Transition of the current internal state, the top level Transition have the priority: the composite state is exited. This behavior need also to be described in Aspects on Composite FSM elements.
![Simple FSM](images/fsmComposite.png)

##### Timed composite

For this language we add both changes from Timed and Composite FSM
![Simple FSM](images/fsmTimedComposite.png)

### The Melange world

#### New project

~~~
language SimpleFSM {
	ecore "platform:/resource/org.sample.fsm/model/fsm.ecore"
	with finitestatemachines.StateMachineAspect
	with finitestatemachines.StateAspect
	with finitestatemachines.TransitionAspect
	exactType SimpleFSMMT
}

language TimedFSM {
	ecore "platform:/resource/org.sample.timedfsm/model/fsm.ecore"
	with finitestatemachines.timed.StateMachineAspect
	with finitestatemachines.timed.StateAspect
	with finitestatemachines.timed.TransitionAspect
	exactType TimedFSMMT
}

language CompositeFSM {
	ecore "platform:/resource/org.sample.compositefsm/model/fsm.ecore"
	with finitestatemachines.composite.StateMachineAspect
	with finitestatemachines.composite.StateAspect
	with finitestatemachines.composite.TransitionAspect
	exactType CompositeFSMMT
}

language TimedCompositeFSM {
	ecore "platform:/resource/org.sample.timedcompositefsm/model/fsm.ecore"
	with finitestatemachines.timedcomposite.StateMachineAspect
	with finitestatemachines.timedcomposite.StateAspect
	with finitestatemachines.timedcomposite.TransitionAspect
	exactType TimedCompositeFSMMT
}
~~~

#### The outline

//typing relation
