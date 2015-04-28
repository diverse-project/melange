---
layout: page
title: Quick Start
group: navigation
---

{% include JB/setup %}

# Melange tutorial

In this tutorial you will learn how to make executable languages and how Melange can help you to write generic algorithms for a familly of language thanks to Model Type.

We will first design 4 differents languages close enough that we would write one tool for all of them, and then will do it !

## Variants of language

Melange is a tool to manipulate languages and we will explore its possibilities. But first we need a familly of languages.

In this chapter we will create four differents languages which are variations of Finite State Machine language.

### What is a Finite State Machine

>It is conceived as an abstract machine that can be in one of a finite number of states. The machine is in only one state at a time; the state it is in at any given time is called the current state. It can change from one state to another when initiated by a triggering event or condition; this is called a transition. A particular FSM is defined by a list of its states, and the triggering condition for each transition.
>
>![FSM](http://upload.wikimedia.org/wikipedia/commons/d/d8/Automate-impair.png)

[From Wikipedia](http://en.wikipedia.org/wiki/Finite-state_machine)

#### Targeted FSM languages

The variations of FSM language we will design are:

 * Simple FSM<br>
   This language is the most basic. It is able to define FSM with States and Transition handling Event.
 * Timed FSM<br>
   This language is the same as Simple FSM except you can add time on Transition.
 * Composite FSM<br>
   This language is the same as Simple FSM except State can contains sub States.
 * Timed composite FSM<br>
   This language as its name suggest, have both composite States and time on Transitions.

### Designing languages

#### Simple FSM

##### Modeling

##### Weaving aspects

#### Others FSM

##### Timed FSM

##### Composite FSM

##### Timed composite

## The Melange world

### New project

### Interface of language : the Model Type

### Transformation?

## Conclusion

In this tutorial you learnt how to add behavior on a language and used Melange to write a generic algorithm for different (but close) languages.
