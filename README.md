K3SLE  / Eclipse projects
=====

This folder contains the projects for eclipse that are relative to the Action Language.
They are built using tycho+maven dependency system.

To import and build these projects in eclipse, use the "Import projects..." wizard from the git Repositories view

To build all the projects using maven (like in the continuous integration), simply run the fr.inria.diverse.k3.sle.root/pom.xml

TODO
----
* Metamodel/ModelType attributes and operations
* ~~Improves the subtyping algorithm so that it takes aspects into account~~
* Manage subpackages
* ~~Automatically find the root(s) of metamodels~~
* ~~Allow inheritance between metamodels~~
* Multiple inheritance/subtyping semantics? e.g. w/o aspects, partial, etc.
* Allow multiple inheritance of metamodels
* Allow the import of multiple Ecore files in a metamodel declaration
* Allow the definition of model types independently of any metamodel
* Register to the EMF notification system (eg. 2-ways list adapters)
* Support non-isomorphic subtyping via renaming clauses
* ~~Allow arbitrary return types for transformations~~
* Create models from scratch using the generated factories
* ~~Manage (potentially cyclic) dependencies in the matching algorithm~~
* Support metamodels making use of external references
* ~~Allow import of Ecore for modeltype definition~~
* Automatically merge different Ecore inherited and/or imported
* Write static semantic constraints on the abstract syntax
* Manage annotations on Ecore file to specify which elements need to be exposed by the interface
* ~~Move the implements relationships discovery from generateAdapters to buildSubtypingHierarchy~~
* Automatically extract the exactType of any declared metamodel using a directive within it

