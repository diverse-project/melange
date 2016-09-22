Melange
=====

Melange is a language workbench that provides a modular approach for assembling, integrating, and customizing multiple domain-specific language (DSL) specifications and implementations. It helps to manage variability within language specifications (syntactic and semantic variation points), and reuse pieces of syntax and semantics from one DSL to the other.

The language workbench embeds a model-oriented type system that provides model polymorphism and language substitutability, i.e. the possibility to manipulate a model through different interfaces and to define generic transformations that can be invoked on models written using different DSLs. Melange also provides a dedicated meta-language where models are first-class citizens and languages are used to instantiate and manipulate them. By analogy with the class-based, object-oriented paradigm, Melange can be classified as a language-based, model-oriented language.

Melange is tightly integrated with the Eclipse Modeling Framework ecosystem and relies on the Ecore meta-language for the definition of the abstract syntax of DSLs. Operational semantics is defined using the [K3 meta-language](http://diverse-project.github.io/k3/) in the form of aspects that are statically woven on the language’s syntax. Designers can thus easily design an interpreter for their DSL in a non-intrusive way. Melange is bundled as a set of Eclipse plug-ins. Please refer to the [official website](http://melange-lang.org) for more information.

Main Features
-------------
* Specification of DSL syntax and operational semantics
* Full compatibility with other tools of the EMF ecosystem (e.g. Xtext for defining a DSL’s textual syntax, or Sirius for a graphical syntax)
* Import of existing Ecore metamodels into DSL definitions
* Composition, extension, restriction, and customization of DSLs
* Reuse of existing tools and transformations from one DSL to the other
* Definition of generic tools and services that can be applied to different DSLs
* Creation and management of language families and variation points

Build Status
------------
[![Build Status](https://ci.inria.fr/k3al/buildStatus/icon?job=melange-master)](https://ci.inria.fr/k3al/job/melange-master)

