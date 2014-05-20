K3SLE
=====

TODO
----
- [ ] Metamodel/ModelType attributes and operations
- [X] Improves the subtyping algorithm so that it takes aspects into account
- [X] Manage subpackages
- [ ] Automatically find the root(s) of metamodels
- [X] Allow inheritance between metamodels (partially)
- [ ] Multiple inheritance/subtyping semantics? e.g. w/o aspects, partial, etc.
- [ ] Allow multiple inheritance of metamodels
- [ ] Allow the import of multiple Ecore files in a metamodel declaration
- [X] Allow the definition of model types independently of any metamodel
- [ ] Register to the EMF notification system (eg. 2-ways list adapters)
- [ ] Support non-isomorphic subtyping via renaming clauses
- [X] Allow arbitrary return types for transformations
- [ ] Create models from scratch using the generated factories
- [X] Manage (potentially cyclic) dependencies in the matching algorithm (partially)
- [X] Support metamodels making use of external references (to be checked)
- [X] Allow import of Ecore for modeltype definition
- [ ] Automatically merge different Ecore inherited and/or imported
- [ ] Write static semantic constraints on the abstract syntax
- [ ] Manage annotations on Ecore file to specify which elements need to be exposed by the interface
- [X] Expose methods signatures in the interface

TESTS
-----
- [ ] Subtyping algorithm
- [ ] Referenced packages
- [ ] Merge
- [ ] Inheritance
- [ ] Multiple inheritance

