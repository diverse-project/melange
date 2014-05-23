K3SLE
=====

TODO
----
- [ ] Modeling in-the-large
	- [ ] Metamodels attributes and operations
	- [ ] Modeltypes attributes and operations
- [X] Aspects weaving
	- [X] Weave aspects into a metamodel
	- [ ] Allow definition of generic aspects (on modeltypes)
	- [ ] Generic extraction of metamodel fragments from aspect definition
- [X] Subtyping Algorithm
	- [X] Take aspects signatures into account
	- [ ] Ensure termination (check for cycles)
- [X] Manage subpackages (implicit flattening)
- [ ] Infer root type of modeltypes and automatically compute root elements list whenever needed (eg. transformation invokation)
- [X] Allow inheritance between metamodels (partially)
- [ ] Multiple inheritance/subtyping semantics? e.g. w/o aspects, w/o static sem, partial, etc.
- [ ] Allow multiple inheritance of metamodels
- [ ] Allow the import of multiple Ecore files in a metamodel declaration
- [X] Allow the definition of model types independently of any metamodel
- [ ] Register to the EMF notification system (eg. 2-ways list adapters)
- [X] Allow arbitrary return types for transformations
- [ ] Create models from scratch using the generated factories, avoiding families mixing
- [X] Support metamodels making use of external references (to be checked)
- [X] Allow import of Ecore for modeltype definition
- [ ] Automatically merge different Ecore inherited and/or imported
- [ ] Write static semantic constraints on the abstract syntax
- [ ] Manage annotations on Ecore file to specify which elements need to be exposed by the interface
- [X] Expose methods signatures in the interface
- [ ] Define inheritance / aspects weaving, etc. in terms of metamodels merging
- [ ] Define independently and use modeltypes algebra for any kind of operators
- [ ] Support adaptation mechanisms between model types (at least through renaming)

TESTS
-----
- [ ] Aspects import
- [ ] Aspects' partial metamodels inference
- [ ] Aspects' dynamic biding and overloading
- [ ] Subtyping algorithm
- [ ] Referenced packages
- [ ] Subpackages
- [ ] Merge
- [ ] Inheritance
- [ ] Multiple inheritance

TOWARDS STANDALONE
------------------
- [ ] K3Resource
- [ ] K3Metadata?
- [ ] ModelTypingSpace manager within Eclipse project or workspace
