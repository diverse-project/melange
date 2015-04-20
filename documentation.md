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
   [Download Eclipse Luna](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2)
2. In order to add behavior on models we also need **Kermeta3**, a tool providing an action language able to manipulate your model.
   Add the [update site](http://kermeta.org/k3/update/) (`Menu Help > Install new software...`) and check DiverSE Commons & Kermeta3.
3. Melange depends on **Xtext** to run.
   Get the [lastest release](https://eclipse.org/Xtext/download.html) and add it with the update site (`Menu Help > Install new software...`).
4. The last dependency is **EMF Compare**, used in the type system of Melange. 
   Get the [lastest release](https://www.eclipse.org/emf/compare/download.html) and add it with the update site (`Menu Help > Install new software...`).

## Getting started

In this chapter you will learn how to quickly start a Melange project with the wizard.

First you need to create a project defining a metamodel. It will contains the .ecore file that will be a base for your language in Melange.

1. Change to a Java perspective if needed (`Menu Window > Open Perspective > Java`).
2. Go in `File > New > Project...` and select `Eclipse Modeling Framework > Empty EMF Project`, then clic `Next`
3. Name your project "org.sample.metamodel.fsm", then `Finish`.
4. Get the Finite State Machine metamodel define by this (.ecore)[https://github.com/diverse-project/melange/blob/master/examples/fr.inria.diverse.examples.fsm.metamodel/models/fsm.ecore] and add it in the model folder of your project.
5. Right clic on the model folder, `New > Other...` and select `Eclipse Modeling Framework > EMF Generator Model`, then `Next`
6. Name it "fsm.genmodel" and put it in model folder, then `Next`.
7. Select Ecore model, then `Next`
8. `Browse Workspace` and select fsm.ecore, then `Next`
9. Their is only one package so clic `Finish`.
10. Open fsm.genmodel, do a right clic on the root and select `Generate Model Code`. It will make Java classes from your .ecore.

Then you can create a Melange project based on the previous one.

1. Go in the menu `File > New > Project...` and select `Melange > Melange Project`, then clic `Next`.
2. Put "org.melange.sample.fsm" in Project name and clic `Next`.
3. Check `Create a plug-in using one of the templates` and select `Simple Melange project`, then `Next`.
4. Set "org.sample.fsm" as package, and change language name to MyFSM. Browse the location to select fsm.ecore from your model project, then `Finish`.

Congratulation, you created you first Melange project !

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
