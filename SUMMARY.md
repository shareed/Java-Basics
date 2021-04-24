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
- like folders, they contain the .java files, like the classes and interfaces
______________________________________

## Classes
- A template or a blueprint for an object
- Fields store information about the object
- Methods are actions the object can take
__________________________________________

## Scope
- define the availability of a variable
- 4 scopes
    - Class
        - visiable to all objects of a class and the value is the same across entire class
    - Instance
        - only visiable to a particular instance
    - Method
        - only visiable inside the method
    - Block
        - only visiable within curly braces
_______________________________________________

## Variables
- reserved memory locations to store values
______________________

## Methods
- define the functionality/behavior of an object or class
____________________________________________________________

## Abstract Methods
- methods with no body 
    - the implmentation will be determine by the child classes
- can only be declared in a abstract class
- guarantees a class will contain certain methods
- class inheriting the current class(abstract class) must either override the abstract method or declare itself(the class) as abstract
_____________________________________________

## Access Modifiers
- determines the availability of a  method or class to a outside class
- **public:** can be accessed anywhere in application
- **protected:** can be accessed anywhere in the same package and any subclasses, which can be outside the package
- **private:** only the class itself can access
- **default:** only access anywhere in same application
___________________________________________________-

## Objects
- a instance of a class
_______________________________

## Abstract Class
- used to add structure to a class but not the implementation
- cannot be instantiated eg. `new AbstractClass`
    - must be extended 
__________________________

## Interface
- collection of abstract methods
    - can also have default(declared with the default keyword) methods, which are public
    - variables/fields: must be public static final
- classes implement interfaces
    - multiple interfaces can be implmented in one class
        - this acheives multiple inheritance
- interfaces extend other interfaces
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

## Collections

## Lambdas

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