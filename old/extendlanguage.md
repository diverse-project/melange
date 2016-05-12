---
layout: page
title: Extending a new language
group: tutorial
---

{% include JB/setup %}

In this tutorial you will learn how to define a new language based on an old one with a different behavior.

### One syntax, two behaviors

Let's define two Finite State Machines behaving differently.

//TODO
// - Sequence of Event
// - Sequence of simultaneous Events

### Extend a language in Melange

The syntax of the Simple FSM language is defined in [Tutorial 1: Defining a language](newlanguage.html)

~~~
language SimpleFSM {
	ecore "platform:/resource/org.sample.fsm/model/fsm.ecore"
	with finitestatemachines.StateMachineAspect
	with finitestatemachines.StateAspect
	with finitestatemachines.TransitionAspect
	exactType SimpleMT
}

language SimultaneousFSM inherit SimpleFSM{
	with simultaneousfsm.StateMachineAspect
	with simultaneousfsm.StateAspect
	with simultaneousfsm.TransitionAspect
	exactType SimultaneousMT
}
~~~

The Melange will complain about SimultaneousFSM language because it can't find the EMF runtime.
Do a left clic on the error marker and select `Generate EMF runtime in a new project`.
This quickfix will create a new project containing .ecore file identic to the  super model ModelType SimpleMT.

### Conclusion

In this tutorial you learnt how to define a language inherited from another with the same syntax but a different semantic.

 


