Melange Part 4: Use your language

1. Now we have defined our Languages, we generate them
2. We have 3 new projects, one for each Language
3. A generated Language contains 3 things
4. 1- An Ecore file with the merged syntax an semantic
5. 2- The code implementing the Ecore file
6. 3- The Aspects implementing the semantic

7. We have also generated artifacts in the Melange project
8. A set of ModelTypes in 'model-gen'
9. The code implementing the ModelTypes in 'src-gen'
10. There are also adaptation layers between Languages and ModelTypes
11a. Let's focus a moment on the Standalone class
11b. This class has the responsability to initialize the Melange stuff
11c. It registers EPackages, Languages and Adapters for the runtime
11d. So don't forget to call StandaloneSetup.doSetup() before using Languages

12. We import Xtext projects
13. Available at https://github.com/diverse-project/melange/tree/master/examples/MiniFSM/languageProjects
14. We have defined a textual grammar for MelangedLang
15. Theses Xtext project generate an editor based on this grammar
16. You can learn more about at https://eclipse.org/Xtext/

17. We launch a new Eclipse to test our Language

18. We will execute a model sample
19. Import SingingMachine project in the workspace
20. Available at https://github.com/diverse-project/melange/tree/master/examples/MiniFSM/modelProjects

21. We have the model 99bottles.minifsm defined with our MelangedFSM language
   Its execution will produce the lyrics of the Song 99 Bottles of Beer
22. We have State
23. with Statements
24. We have Transition
25. with Expression
26. And a Context with Variables initialized into the FSM

27. We have a Main class
28. We don't forget Melange initialization
29. Xtext initialisation
30. We load the model with a Melange URI
31. It start with "melange:/resource/
32. followed by the path to the file
33. and a query to cast the model to the ModelType namespace

34. Then we get the root element of the model
35. And call FSM.execute()

36. At the last we run the model
