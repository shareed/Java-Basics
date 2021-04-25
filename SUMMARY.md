# Java
- programming language that is almost object oriented, becasue everything is an object except primitive variables

[More....](Notes/JavaIntro.md)
____________________________


## How It Works
The JDK compiles the source code, which turns it into byte code. The JVM, which is inside JRE, takes that byte code, runs it in the virtual environment and the Just In Time compiler turns the byte code into machine code.

[More....](Notes/JavaIntro.md)
______________________________________

## Memory
- Java splits its memory into two structures
    - Heap:
        - where objects are stored in memory
    - Stack:
        - LIFO
        - where methods are placed when they are called on the top of the stack
        - manages application flow
        - Variables in the stack reference the location of an object in the heap

[More....](Notes/JavaMemory.md)
__________________________________________

## Packages
- a collection of similar classes, interfaces and subclasses
- like folders, they contain the .java files, like the classes and interfaces

[More....](Notes/JavaIntro.md)
______________________________________

## Classes
- A template or a blueprint for an object
- a class describes the attributes and behaviors of an object
- Fields store information about the object
- Methods are actions the object can take

[More....](Notes/JavaIntro.md)
__________________________________________

## Scope
- **Variable Scope:** defines the availability of a variable
- 4 scopes
    - Class
        - visiable to all objects of a class and the value is the same across entire class
    - Instance
        - only visiable to a particular instance
    - Method
        - only visiable inside the method
    - Block
        - only visiable within curly braces

[More....](Notes/Variables.md)
_______________________________________________

## Variables
- reserved memory locations to store values

[More....](Notes/Variables.md)
______________________

## Methods
- define the functionality/behavior of an object or class
[More....](Notes/Methods.md)
____________________________________________________________

## Method Overloading
- creating more than one method with the same name
    - must have differnt number and/or types of parameters and/or order of parameters
[More....](Notes/Methods.md)
____________________________________

## Method Overriding
- a child class can override a method inherited from its parent
    - must define a method in the child class with the same signature as its parent
    - should have the same name, number and type of parameters 

[More....](Notes/Methods.md)
_________________________________

## Abstract Methods
- methods with no body 
    - the implmentation will be determine by the child classes
- can only be declared in a abstract class
- guarantees a class will contain certain methods
- class inheriting the current class(abstract class) must either override the abstract method or declare itself(the class) as abstract

[More....](Notes/Methods.md)
_____________________________________________

## Access Modifiers
- determines the availability of a  method or class to a outside class
- **public:** can be accessed anywhere in application
- **protected:** can be accessed anywhere in the same package and any subclasses, which can be outside the package
- **private:** only the class itself can access
- **default:** only access anywhere in same application
___________________________________________________

## Objects
- a instance of a class
_______________________________

## Abstract Class
- a class that cannot be instantiated `new AbstractClass`
    - used to add structure to a class but not the implementation
    - must be extended 
- Abstract classes can have instance variables that are not automatically public static final, but Interface variables are always `public static final`
- Abstract method can have methods that are not public, interface methods are `public abstract`

[More....](Notes/AbtractClasses.md)
__________________________

## Interface
- an abstract entity that contains behaviors that a class must implement
    - can have abstract and default(declared with the default keyword and are public) methods
    - variables/fields: must be public static final
- classes implement interfaces
    - multiple interfaces can be implmented in one class
        - this acheives multiple inheritance
- interfaces extend other interfaces
- Interface variables are always `public static final` but, abstract classes can have instance variables that are not automatically public static final, but 
- Interface methods are `public abstract` abstract classes can have methods that are not public

[More....](Notes/Interface.md)
___________________________

## Constructors
- a block of code that is executed only once, when a class is instantiated
- **super:**  will call the parent constructor
- **this:** will call another constructor in the class
    - **constuctor chaining:**  is using this to avoid repeating code
- first line must be a call to either **super** or **this**
    - all objects start with the object class in java which is why super must be called
    - if you do not do this the compiler will do it for you
- don't break the superclass
    - if parent no args constructor is overidden then you should add arguments to the super call of child constructor

    [More....](Notes/Constructors.md)
____________________________________________________

## Keywords
- Final has different affects based on where it is used
    - Final Class: You can not extend the class to make a subclass/child class.
    - Final method: Can’t be overridden by child classes.
    - Final variable: Can’t be modified after initialization.
- Finally
    - part of a try/catch which handles exception or errors, it will always run
    - System.exit(), will stop a finally block from running by crashing the application
- Finalize
    - method on the Object class that the garbage collector calls immediately before the object is removed from memory.

[More....](Notes/Keywords.md)
__________________________

## OOP Pillars
- **Abstraction:**
    - Hiding implementation details from the user and show only functionality
    - E.g. When a pilot is landing an airplane he does not need to know how the landing gear works he just needs to know what controlls he need to use in the cockpit to land the plane.
- **Encapsulation:**
    - Wrapping data and code into a single unit and protecting it form outside manipulation
    - we use getters and setters to access and change 
- **Inheritance:**
    - when one class takes on the properties of another class
    - E.g A Content Class has title and description fields
        - if we have a Movie and TVShow classes that are subclasses of Content
        - the Movie and TVShow classes would inherit the title and description fields from the content class
- **Polymorphism:**
    - the ability of an object to take on many forms
    - different classes can be used with the same interface, each class providing its own implementation
    - method overloading
    - method override
    - E.g. A Female can also be a sister or a mother etc...
_________________________________

## Collection Framework
- a combination of classes and interfaces
- used to store and manipulate the data in the form of objects
- Collection framework implements various interfaces(e.g Collection and Map)

[More....](Notes/CollectionFW/CollectionFW.md)
____________________

## Collection
- an object that contains and manipulates a group of objects(e.g List, Oueue etc...)
- mainly distinguished by two characteristics:how they order elements, and whether those elements are sorted

[More....](Notes/CollectionFW/Collections.md)
____________________

## Collections
- a utility class that provides serveral static methods that are useful when working with a collection object

[More....](Notes/CollectionFW/Collections.md)
___________________________________

## Wrapper Class
- let you treat primitives as objects
    - e.g int: Integer
- needed to use primitives with collections

[More....](Notes/WrapperClass.md)
__________________

## Boxing
- converting primitives into a wrapper class variants
- autoboxing feature does this for us(implicity)
- auto-unboxing feature does the opposite
- all this happens under the hood

[More....](Notes/WrapperClass.md)
______________________________

## Compareable and Comparator
- interfaces used to sort elements
- **Compareable:**
    - defines the natural ordering for a class
    - allow us to sort a collection on the basis of a single element using a single ordering sequence
    - class must implement Comparable in order to be sorted by the compareTo() method, which compares this object to a specified object
- **Comparator:**
    - defines total ordering on some collection of objects
    - allow us to sort a collection on the basis of a single element using multiple sorting sequences
    - class doesn’t have to implement Comparator to use the compare() method which compares this object to a specified object

[More....](Notes/Compara.md)
______________________

## Lambdas
- a short block of code which takes in parameters and returns a value
- allow you create single use, anonymous methods, that can be passed as parameters
- can be implemented right in the body of a method
____________________________

## Design Patterns
## Singleton
## Factories
## Wrapper Classes
## Strings
## Scanner
## Casting ???
## Arrays
## Errors ???
## Exceptions
## Garbage Collection
## Threads ???