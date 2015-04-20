---
layout: page
title: Documentation
group: navigation
---

{% include JB/setup %}

## What is Melange ?

## Installation

This chapter explains how to install a working IDE for Melange.

1. First you need an **Eclipse Luna**. Take the Eclipse Modeling Tools version since Melange is based on EMF.
   https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2
2. In order to add behavior on models we also need **Kermeta3**, a tool providing an action language able to manipulate your model.
   Add the update site http://kermeta.org/k3/update/ (`Menu Help > Install new software...`) and check Divers Common & Kermeta3.
3. Melange depends on **Xtext** to run.
   Get the lastest release https://eclipse.org/Xtext/download.html and add it with the update site (`Menu Help > Install new software...`).
4. The last dependency is **EMF Compare**, used in the type system of Melange. 
   Get the lastest release https://www.eclipse.org/emf/compare/download.html and add it with the update site (`Menu Help > Install new software...`).

## Getting started

#### Outline

#### Generated files

## Concepts

#### Language

~~~
language FiniteStateMachineClassic{
	ecore "platform:/resource/fr.inria.diverse.examples.fsm.metamodel.composite/model/fsm.ecore"
	exactType FiniteStateMachineClassicMT
	
	with finitestatemachines.composite.classic.StateMachineAspect
	with finitestatemachines.composite.classic.StateAspect
	with finitestatemachines.composite.classic.CompositeStateAspect
	with finitestatemachines.composite.classic.TransitionAspect
}
~~~

#### Model type

~~~
modeltype FSMmt{
	ecore "platform:/resource/fr.inria.diverse.examples.fsm.metamodel.composite/model/fsm.ecore"
}
~~~

#### Transformation

~~~
transformation execute(FiniteStateMachineUMLMT stateMachine, String input, String outputFile){
	val root = stateMachine.contents.head as finitestatemachines.finitestatemachineumlmt.StateMachine
	root.eval(new FSM.interfaces.Context(input), outputFile)
}
~~~

## Main transformation

~~~
@Main
transformation main(){
	val simpleProgram = FiniteStateMachineUML.load("input/exampleComposite.xmi")
	execute.call(simpleProgram, "{e}", "output/UML-output " + 
		System.currentTimeMillis + ".pdf")
}
~~~

#### Load a model

#### Call a transformation

#### Execution the main transformation

## A concrete example
