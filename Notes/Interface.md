# Interface
- a class describes the attributes and behaviors of an object, a interface contains behaviors that a class implements
- an abstract entity that contains behaviors that a class must implement
- guarantees certain behaviors(methods) in a subclass
- its methods are `public abstract` (they don’t implement anything)
    - Java 8 added ability to use static or default methods, that do not have to be implmented in the subclass
- its variables are `public static final` (can not be changed once given a value)
- are contractual, and you can always use them polymorphically as reference types to guarantee access to certain methods
________________________________

### Implementing Interfaces
**Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class**
- All of the methods in an interface are abstract
- to implement an interface in your class, you use the `implements` keyword in the class declaration, after extending a class, if you do
- interfaces support type inheritance, but are not considered a traditional form of inheritance. 
- a class can implement multiple interfaces
- a class that implements an interface is polymorphically considered an instance of the interface(an IS-A relationship: If a Dog implements the Domesticated interface, we can say a Dog is-a Domesticated thing)
- an interface can extend multiple other interfaces

 --------------------------

### Extending Interfaces
- An interface can extend another interface in the same way that a class can extend another class
- The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface. 
```
/ Filename: Sports.java
public interface Sports {
   public void setHomeTeam(String name);
   public void setVisitingTeam(String name);
}

// Filename: Football.java
public interface Football extends Sports {
   public void homeTeamScored(int points);
   public void visitingTeamScored(int points);
   public void endOfQuarter(int quarter);
}

// Filename: Hockey.java
public interface Hockey extends Sports {
   public void homeGoalScored();
   public void visitingGoalScored();
   public void endOfPeriod(int period);
   public void overtimePeriod(int ot);
}
```
- The Hockey interface has four methods, but it inherits two from Sports. Thus, a class that implements Hockey needs to implement all six methods. Similarly, a class that implements Football needs to define the three methods from Football and the two methods from Sports

#### Extending Multiple Interfaces
- an interface can extend more than one parent interface.
- The extends keyword is used once, and the parent interfaces are declared in a comma-separated list
`public interface Hockey extends Sports, Event`

### Default Methods (Java 8)
- **default methods:** interface methods that are implemented in the interface
- a class that implements an interface with a default method is not required to implement the method, but they can override the method
- To use a default method, you just add the `default` keyword before the method declaration in the interface
- you can declare local variables in a default method
- default methods can also call other methods that are declared by the interface, even if they are not defined there, because the implementing class will provide an implementation for those other methods, so they are safe to call

_______________________________________________

### Static Methods (Java 8)
- An interface is allowed to have a static methods with definitions
- These methods carry the same restrictions as other static methods (Ex. you cannot call instance methods or use variables from within a static context)
- can be called without creating an instance of a class or interface
- can only call other static methods directly
- must use local reference variables to call non-static methods
- can call them directly off the Interface without creating an object, so there’s no guarantee that other non-static methods will have an implementation at the time you make the call
    - the static method adds anything Domesticated to one of the two ArrayLists
    -object passed in must be an object that implements Domesticated, but we still test whether the Domesticated thing is an Animal or a Plant before adding it to the appropriate list.
    - dowork must be implemented by a class `void doWork()`
    - Species are domesticated so they can do a job for humans, even if it’s just to entertain or feed us.The exact job they do is dependent on the class that implements the interface – what species is domesticated
     - default method doWork(String) might have been added later, to allow a Domesticated object to do a job specified by the programmer, rather than the classes’ implementation.This could be a good idea if we have a species of Dog that has two jobs.Of course, having default methods like this can lead to a big problem: **multiple inheritance**
________________________________________

### Inheriting Default Methods(Multiple Inheritance)
**Since default methods are inherited and a class can implement multiple interfaces, they may arise a situation where a class inherits the same method from two interfaces (multiple inheritance).** 
***These are for backwards compatibility and should be declared when absolutely necessary.***
- you can override the method and can specify which default by using the keyword super: `InterfaceName.super.doWork();`
    - If I have two interfaces that have default methods with the same name - like a Domesticated interface and a Worker interface that both have default methods named doWork() – and my class SeeingEyeDog implements them both, now SeeingEyeDog has two different implementations for the same method
        - `Domesticated.super.doWork()` will use the default doWork() implementation from the Domesticated interface
        - `Worker.super.doWork()` will use the default implementation in the Worker interface
-------------------------------------

### Abstract Classes vs. Interfaces
**The difference between a abstract class and a interface is the kinds of instance variables and methods they can have** 
- abstract classes can have instance variables that are not automatically public static final
- abstract classes can have methods that are not public

____________________________
## Summary
- A Interface is a reference type in Java
- A Interface is a collection of abstract methods
   - can also have concrete default methods
- A class can implement one or multiple interfaces
   - inheriting the abstract methods of the interface
- A interface can extend other interfaces
- Interfaces do not have constructors
- fields: must be public static final
- methods: abstract and public*