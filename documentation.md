---
layout: page
title: Documentation
group: navigation
---

{% include JB/setup %}

## What is Melange ?

## Installation

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

```
modeltype FSMmt{
	ecore "platform:/resource/fr.inria.diverse.examples.fsm.metamodel.composite/model/fsm.ecore"
}
```

#### Transformation

```
transformation execute(FiniteStateMachineUMLMT stateMachine, String input, String outputFile){
	val root = stateMachine.contents.head as finitestatemachines.finitestatemachineumlmt.StateMachine
	root.eval(new FSM.interfaces.Context(input), outputFile)
}
```

## Main transformation

```
@Main
transformation main(){
	val simpleProgram = FiniteStateMachineUML.load("input/exampleComposite.xmi")
	execute.call(simpleProgram, "{e}", "output/UML-output " + 
		System.currentTimeMillis + ".pdf")
}
```

#### Load a model

#### Call a transformation

#### Execution the main transformation

## A concrete example
