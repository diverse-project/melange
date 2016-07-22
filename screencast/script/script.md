Melange Part 1: Language declaration

0. In this tutorial we will compose FSM language with an Expressions language
1. Before starting we need the basic material to work
2. Firstly, import MiniFSM and MiniLang languages in your workspace
3. The projects are available at https://github.com/diverse-project/melange/tree/master/examples/MiniFSM/languageProjects

4. Both language definitions are split in two
5. A project to define the syntax
6. Another project to define the semantic

7. The metamodel of MiniFSM
8. The semantic of MiniFSM is defined by K3 aspects.

9. MiniLang is a basic language of Expressions and Statements
10. We evaluate expression with an Interpreter design pattern,
  we therefore have a Context EClass to store variable values.
11. The semantic of MiniLang is also defined by K3 aspects.
12. Each Expression is evaluated with eval(Context)
13. And Statements update Context with execute(Context)

14. Now we will create a new Melange project
15. This wizard help to create your first language
16. Here we create a new one base on minifsm.ecore

17. We don't use transformations in this tutorial
18. You have an outline to show the structure of your languages
19. Each language have a ModelType

20. We add the semantic of MiniFSM.
21. Shortcut Ctrl+Space
21. --The 'with' operator to import a K3 aspect--
22. FSMAspect declare an EOperation and two EReference on FSM

23. In the ModelType, FSM have both syntactical and semantical elements
