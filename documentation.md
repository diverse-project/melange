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

## Creating new project

In this chapter you will learn how to quickly start a Melange project with the wizard.

First you need to create a project defining a metamodel. It will contains the .ecore file that will be a base for your language in Melange.

1. Change to a Java perspective if needed (`Menu Window > Open Perspective > Java`).
2. Go in `File > New > Project...` and select `Eclipse Modeling Framework > Empty EMF Project`, then clic `Next`
3. Name your project "org.sample.metamodel.fsm", then `Finish`.
4. Get the Finite State Machine metamodel define by this [.ecore file](https://github.com/diverse-project/melange/blob/master/examples/fr.inria.diverse.examples.fsm.metamodel/models/fsm.ecore) and add it in the model folder of your project.
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

The outline shows an overview of your project.

It display the main Melange elements in your project:

* Languages: ![language image](images/outline-language.png) <br>
  Represented by a colored icon before its name. It may be followed by the operator triangle (meaning "typed by") and a list of ModelType.
  It can be composed of:
  * Aspects: ![aspect image](images/outline-aspect.png) <br>
    Represented by an icon "brick" before its name, ending with the operator '@' (meaning weaved on) and the name the base class.
  * Ecore: ![ecore image](images/outline-package.png) <br>
    Represented by an icon "package" before its name.
* ModelTypes: ![modeltype image](images/outline-modeltype.png) <br>
  Represented by an icon "Text" before its name.
* Transformations: ![transformation image](images/outline-transformation.png) <br>
  Represented by an icon "arrows" before its name

#### Generated files

## Features

#### Language

Melange is designed to play with languages. So one of the main elements is naturally the Language.

Here's an example to explain how to define one of them:

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

We have :

* `language` <br>
  This keyword means your want to declare a Language. It is mandatory to set the ecore & exactType properties.
* `ecore` <br>
  This keyword is followed by the location of a .ecore file, which will be the base of your model. It follows the [Eclipse platform URLs convention](http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fmisc%2Fplatform-scheme-uri.html). Usually the url looks like "platform:/resource/your.model.project/model/yourmodel.ecore".
* `exactType` <br>
  This keyword is followed by the name you want for the type of your model.
* `with` <br>
  This keyword is used to apply ascpects on your Ecore model. You just need to set the fully qualified name of your class. Make sure your META-INF/MANIFEST.MF requires the project of your model.
 If you want to define you own aspects you can get learn how to do in the [Kermeta3 documentation](https://github.com/diverse-project/k3/wiki)

#### Model type

In Melange Languages are typed. Their exactType are their default type but you can create news one, independantly of languages by the keyword `modeltype`.

~~~
modeltype FSMmt{
	ecore "platform:/resource/fr.inria.diverse.examples.fsm.metamodel.composite/model/fsm.ecore"
}
~~~

Like for `Language` we use the keyword `ecore` to locate an .ecore file. This Ecore will define the model type.

#### Transformation

Transformation is the concept of Melange that use the others main concepts. 
Basically a transformation will manipulate instances of languages. The required ModelType of inputs allows to check their validity. 
It will raise an error if we use instances of language not typed by the ModelType of the input.

An example of transformation

~~~
transformation execute(FiniteStateMachineUMLMT stateMachine, String input, String outputFile){
	val root = stateMachine.contents.head as finitestatemachines.finitestatemachineumlmt.StateMachine
	root.eval(new FSM.interfaces.Context(input), outputFile)
}
~~~

Here we have:

* `transformation` <br>
  This keyword is used to declare the transformation named 'execute'
* A list of inputs <br>
  You can set a list of inputs, typed by ModelTypes or by Java types.
* A list of instructions <br>
  The used language is the same used to define aspects: [Xtend](https://eclipse.org/xtend/).

## Main transformation

Their is a special transformation: the entry point of your program.
We use the annotation `@Main` to specify which one is your first transformation.

~~~
@Main
transformation main(){
	val simpleProgram = FiniteStateMachineUML.load("input/exampleComposite.xmi")
	execute.call(simpleProgram, "{e}", "output/UML-output " + 
		System.currentTimeMillis + ".pdf")
}
~~~

#### Load a model

In order to load a model, your language provide a method `load(String)` that takes as parameter a path to a serialized model file.

#### Call a transformation

To call a transformation, each one provide a mathod `call(...)` that takes parameters if defined.

#### Launch the program

To launch your program, look inside the folder `src-gen` (where Melange generates Java files) and inside the package defined in your `.melange` right clic on the class named after your main transformation and select `Run As > Java Application`.

## A concrete example
