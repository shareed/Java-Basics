
## Keywords
- a reserved word in Java that has specific meaning to the compiler.
- you cannot use the name of a keyword as a variable, method or class.

### static
- static member is shared class-wide, changing a static member values canges it for the entire class
- globally available to all instances of a class, and will always point to the same object in memory
- a static method can only use other static variables or methods in the same class
- you can use a static member with the dot operator on the class WITHOUT instantiating the class first 
  - [Example](../JavaProjects/static/staticexample.java)


### final
- Used to specify a class, method or variable as immutable
  - **Final Variables** `public final int x = 124;`
    - must be initialized when declaring it and cannot be assigned a new value once initialized
    - final reference variables cannot be reassigned to a different object but their properties can still be reassigned (if not marked final)
  - **Final Methods** `public final int someMethod(){ . . . }`
    - cannot be overridden, but we can define another method that has the same name(method overloading) 
  - **Final Classes** `public final class FinalClass { . . . }`
    - cannot be extended (cannot create a subclass of this class)


### abstract
- declares a method or class as incomplete(no definition/nobody) or as a template
- abstract class cannot be instantiated and should be extended
- if a child class extends an abstract class, it must override all inherited abstract methods to provide an implementation of its own . If you do not do this, the subclass must also be declared abstract 
- If you declare at least one method abstract, then the class must be declared as abstract
- If you declare a class as abstract, you do not need to specify any methods as abstract

