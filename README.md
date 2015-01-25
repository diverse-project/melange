Melange
=====

Melange language repository

TODO
----
- [ ] Directly embed Xcore into metamodel definitions
- [X] Factorize adapters creation in dedicated factories
- [ ] Externalize all AST-completion operations in a IDerivedStateComputer post-processor
- [ ] In-the-large
	- [ ] Metamodels attributes and operations
	- [ ] Modeltypes attributes and operations
- [X] Aspects weaving
	- [X] Weave aspects into a metamodel
	- [ ] Allow definition of generic aspects (on modeltypes)
	- [X] Generic extraction of metamodel fragments from aspect definition
- [X] Subtyping Algorithm
	- [X] Take aspects signatures into account
	- [X] Ensure termination (check for cycles)
- [X] Manage subpackages (implicit flattening)
  - [ ] Preserve the subpackages hierarchy in generated code
- [ ] Infer root type of modeltypes and automatically compute root elements list whenever needed (eg. transformation invokation)
- [X] Allow inheritance between metamodels (partially)
- [ ] Multiple inheritance/subtyping semantics? e.g. w/o aspects, w/o static sem, partial, etc.
- [ ] Allow multiple inheritance of metamodels
- [ ] Allow the import of multiple Ecore files in a metamodel declaration
- [X] Allow the definition of model types independently of any metamodel
- [ ] Register to the EMF notification system (eg. 2-ways list adapters)
- [X] Allow arbitrary return types for transformations
- [ ] Create models from scratch using the generated factories, avoiding families mixing
- [X] Support metamodels making use of external references
- [X] Allow import of Ecore for modeltype definition
- [ ] Automatically merge different Ecore inherited and/or imported
- [ ] Write static semantic constraints on the abstract syntax
- [ ] Manage annotations on Ecore file to specify which elements need to be exposed in the interface
- [X] Expose methods signatures in the interface
- [X] Define inheritance / aspects weaving, etc. in terms of metamodels merging (partially)
- [ ] Define independently and use modeltypes algebra for any kind of operators
- [ ] Support adaptation mechanisms between model types (at least renaming clauses)
- [ ] Manage visibilities, both when extracting interfaces and aspects' semantics
- [X] Allow transtyping @runtime between interfaces (ie. extensions/viewpoints) (to be checked)
- [ ] Separate serialization of extensions via specialized EMF Resource

TESTS
-----
- [ ] Aspects import
- [ ] Aspects' partial metamodels inference
- [ ] Aspects' dynamic biding and overloading
- [ ] Subtyping algorithm
- [ ] Referenced packages
- [ ] Subpackages
- [ ] Merge
- [ ] Inheritance
- [ ] Multiple inheritance

TOWARDS STANDALONE
------------------
- [ ] MelangeResource
- [ ] MelangeMetadata?
- [ ] ModelTypingSpace manager within Eclipse project or workspace

PERFORMANCE
-----------
- [ ] Disable Xtext services (indexing, scoping, etc.) on EPackages and their subtree (which constitutes the biggest part of the overall AST)
- [X] Alternatively, remove ModelingElement from the AST and use an external hash table to keep track of the associated EPackages
- [ ] Keep track of the generated artifacts (Melange/EMF) and regenerate them only when necessary
- [ ] exactType should be immutable reference to the EPackages defining the metamodel they are extracted from. No need to copy anything
