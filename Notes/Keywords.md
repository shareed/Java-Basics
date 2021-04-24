## Keywords
### Final vs Finally vs Finalize:

- Final is a key word that has different effects based on where it is used. It is a non-access modifier.
    - Final Class: You can not extend the class to make a subclass/child class.
    - Final method: Can’t be overridden by child classes.
    - Final variable: Can’t be modified after initialization.
- Finally is part of a try/catch which handles exception or errors. A finally block always runs no matter if an exception/error is caught or not. The only way to stop a finally block from running is to crash the application. (System.exit())
- Finalize is a method on the Object class that the garbage collector calls immediately before the object is removed from memory.