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

## Contructor
- a block of code that is executed only once, when a class is instantiated
- **super:**  will call the parent constructor
- **this:** will call another constructor in the class
    - **constuctor chaining:**  is using this to avoid repeating code


[More....](Notes/Constructors.md)
____________________________

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
- **default:** only access anywhere in same package

[More....](Notes/AccessModifiers.md)
___________________________________________________

## Objects
- a instance of a class

[More....](Notes/JavaIntro.md)
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
    - E.g. When a pilot is landing an airplane he does not need to know how the landing gear works he just needs to know what controlls he need to use in the cockpit to land the plane
    - E.g. Can use a abstarct class that has abstarct methods to force the child class to provide the implementation of the methods
- **Encapsulation:**
    - Wrapping data and code into a single unit and protecting it form outside manipulation
    - we use getters and setters to access and change data
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

[More....](Notes/OOPPillars.md)
_________________________________

## Collection Framework
***A kind of architecture that is a combination of classes and interfaces which are used to store and manipulate the data in the form of objects***

[More....](Notes/CollectionFW/CollectionFW.md)
____________________

## Collection
***An object that contains and manipulates a group of objects, like a list or a Set***


[More....](Notes/CollectionFW/Collections.md)
____________________

## Collections
***A utility class that provides serveral static methods that are useful when working with a collection object***

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

[More....](Notes/Lambdas.md)
____________________________

## Design Patterns
- software template, to base your design off of
- help slove recurring problems that arise when developing program
- **Some popular design patterns:**
    - Singletons
        - a class that can have only one object(instance) at a time
        - ensures that only one object can ever be created
    - Factorries
        - a class that lets us creates objects without exposing the creation logic to the client
        - use for separation of concerns
    - Decorator
    - Prototype
    - Publisher-Subscriber

[More....](Notes/DesignPatterns.md)
_________________________


## Strings
- strings of characters
- strings are objects because they are constructed using the String class
- both the String class and the value stored inside a String object are final(immutable)
    - you cannot create a String subclasses
    - you can create a new String in memory changing the original Strings value in some way, then changing the assignment of a String variable to point to the new String
- **Two ways to create strings:**
    - **String Literals:** `String shannon = "Shannon";`
        - are stored in a particular place of the heap called the String pool
        - one String object will be created for each unique String literal
    - **Using the nwe Keyword:** `String shannon = new String("Shannon");`
        - are stored in the general heap
- override the `.equals()` method from the object class to check the value of the characters contained in the String
- `==` should not be used with Strings

[More....](Notes/Strings.md)
________________________________

## StringBuffer and StringBuilder
- classes similar to the String class
- allow the text value they contain to be changed at will
- provide several utility methods for manipulating their contents in different ways
- **String Buffer**
    - a wrapper for a mutable string that is synchronized or thread safe
- **StringBuilder**
- a wrapper for a mutable string, but it is not thread-safe

[More....](Notes/Strings.md)

____________________________________

## equals() method
***A method that compares object's values***
- the string class overrides this functinality to compare the value of the characters contained in the String
- If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method

[More....](Notes/EqualMethod.md)
______________________________

## ==
***An operator that compares memory addresses***

[More....](Notes/EqualMethod.md)
____________________

## Annotations
***A tag that represents and provide metadata(data about data) to the compiler or JVM***
- can be used on classes, methods, interfaces or other
- often used by libraries that provide additional functionality

[More....](Notes/Annotations.md)
________________________

## Scanner
***A class, that is located in the java.util, that allow us to take a stream of inputs during runtime***

[More....](Notes/JavaIntro.md)
______________________________

## Casting ???
***Changing from one variable type to another***
- **Upcasting:** is taking a subclass and putting it into a superclass declared variable
- **Downcasting:** is taking a superclass and putting it into a child class variable

[More....](Notes/Casting.md)
_________________________________

## Arrays
***Are data structure that sequentially store the same type of data in memory***
- can change the values in an array as long as they are of the same type
- Create an empty array of the length your need
    - `int[] intArray = new int[3];`
- Assign values immediately
    - `int[] intArray2 = {8, 9, 10};`

[More....](Notes/Arrays.md)
______________________________________

## Errors ???
- problems that the application can not reasonably be expected to recover from itself
- **OutOfMemoryError:** no more memory available for Java to use
- **StackOverflowError:** no more room on the stack for a new method call

________________________________

## Exceptions
***An event, that occurs during the execution of a program, that disrupts the normal flow of the program***
    - checked exceptions are anticipated as possible and so the compiler will require you to handle them in some manner before it will compile
    - unchecked exceptions are exception that the compiler does not require you to preemptively handle them
_______________________________

## Garbage Collection
***Removing objects from memory that no longer have any reference variable pointing to them***
- this process runs in the background and you can not force it, it does it when it wants to

[More....](Notes/JavaIntro.md)
__________________________

## Threads ???
***Path that the application follows when executing a program***
***Alow Java application to be more efficient by creating concurrently running execution flows***
- **Ways to create a thread:**
    - **First Way:** A class can extend the Thread class and override the “run()” method, to create a thread
    - **Second Way:** A class can implement the Runnabe interface also and override the “run()” method, to create a thread
- **Concurrency issues:** Issues that arise becuase threads run independently and there is no way to ensure the order in which threads will run in comparison to each other
    - **Deadlock:** when two threads are competing for the same set of resources and neither is willing to give up the part of the set that they control, causing the application to stall out and run indefinitely
        - can usually be resolved by giving thread priority
        - can also use `isAlive()` it will pause a thread giving up it’s resources to the other thread that needs them
    - **Starvation:** when threads are competing because one thread has all resources another thread needs
        - the thread without access to resources is stalled for a period of time
        - can be mitigated by having threads release resources when they are not actively using
    - **Synchronization:** a non-access modifier `synchronized` will “lock-down” a method or class/object to a single thread having access to it at a time
______________________________________

### ArrayList vs LinkedList
- **Storage:**
    - ArrayList uses a dynamic array to store its elements
    - LinkedList uses Doubly Linked List to store its elements
- **Speed:**
    - ArrayList are slow as array manipulation is slower
    - LinkedList faster because it is node based
- **Implementation:**
    - ArrayList implement List
    - LinkedList implement List and Queues
- **Access:**
    - ArrayList faster at storing and accessing data but slower at manipulationg data
    - LinkedList faster at manipulating data


# Things to Review
- Lambdas
- Collections
- Threads
- Stacks
- Factories


____________________________

## Classes
- bleuprint for creating objects
_____________________


## Interface 
A **interface** is a reference type that uses abstract methods to specifiy what a class must do but not how to do it
____________________________

## Packages

- A **package** is a collection of similar classes, interfaces and subclasses
_______________________

## Abstract Classes
- A abstract class is one that must be inherited from another class, and cannot be used to create objects
    - can have both abstract and regular methods
__________________________

## Exceptions
- event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions
_______________________________
-  An **exception** is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions. A Java exception is an object that wraps an error event that occurred within a method
    - Catergories:
        - Checked Exceptions
            - compiler enforces that you handle them explicitly
            - Methods that generate checked exceptions must declare that they throw them. 
            - Methods that invoke other methods that throw checked exceptions must either handle them or let them propagate by declaring that they throw them. 
        - Unchecked Exceptions
            - Errors and RuntimeExceptions are unchecked — the compiler does not enforce (check) that you handle them explicitly. 
            - Methods do not have to declare that they throw them (in the method signatures). 
            - It is assumed that the application cannot do anything to recover from these exceptions (at runtime). 
        - Errors
            - are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error
_______________________________





- Arrays are always of fixed size, i.e., a user can not increase or decrease the length of the array according to their requirement or at runtime, but In Collection, size can be changed dynamically as per need.
- Arrays can only store homogeneous or similar type objects, but in Collection, heterogeneous objects can be stored.
- Arrays cannot provide the ?ready-made? methods for user requirements as sorting, searching, etc. but Collection includes readymade methods to use.

### Questions I got wrong	
1. **How many String objects have been created at the end of this code sequence?** ***Answer 5***
    ```
        String a = "Hello";
        String b = "World";
        a = a + b;
        a = new String("hello");// if this was a uppercase "H" then the answer would be 4
        String c = "World";
        String d = "Hello";

    ```

2. **Which of the following statements are true about Java lambda expressions?**
***Lambda expressions are used primarily to define inline implementation of a functional interface.***
***Lambda expressions fulfills the need for anonymous classes in Java.***

3. How many objects are created with the following code? Answer 2
    ```
        String a = new String(); //creates a string object
        String b = a; //does not create a new object
        a = "Hello";//creates a string object
    ```