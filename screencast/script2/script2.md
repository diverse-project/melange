Melange Part 2: Languages composition

0. We will see now how to merge languages

1. We define a language for MiniLang
2. exactType is not mandatory
3. Import syntax by Ctrl+Space
4. It has another .ecore defining the dynamic elements used by its semantic
5. And we complete the definition by adding the semantic

6. We define the final language
7. It inherits MiniFSM
8. The triangles in the outline indicate implemented ModelTypes 
9. Since the first and last languages are the same,
  they implements their each other exactType
10. We can see the structure of both ModelTypes are identicals

11. We slice MiniLang to merge a subpart in MelangedFSM
12. MiniFSM and MiniLang have different EPackages
13. So we rename the root EPacakge after the slice
14. The new language contains FSM and MiniLang elements but without If and While
