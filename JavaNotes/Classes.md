# Classes

- Java code is written in discrete units of related code, classes
- from classes, you “instantiate” “objects.” 
- A class is a Java structure that you define.
- An object is a instance (something that exists in memory) that follows the class template.
- Think of a class as a blueprint for a car, and an object as the car itself
- From a single blueprint, you can generate as many car objects – as many instances of a car class – as you need.
- This is the relationship between objects and classes. You write classes, but you work with objects.
- can be named anything, with the exception of a couple of dozen reserved words, a best practice is to use nouns, and they are always written by capitalizing the first letter of each word in the name.
________________________________________________
## Syntax
- A simple **Java class** called MyFirstProgram
- has a **main method** that tells the JVM to “begin here”
- the main method invokes the `message()` method and two things are passed-in: an integer, and a String. 
- then the main() method ends, and the program is done.

```
//1. package organizational term, used to group related classes
package examples:

//2. class declaration
public class MyFirstProgram{

  //3. method
  public static void message(String myString, int myInt) {
    System.out.println("This is my String: " + myString);
    System.out.println("and this is my int: " + myInt);
  }
  //4. main method
  public static void main(String[] args) {
    message("Hello World!", 4);
  }
}
```
- [Simple Hello Worl Program](./img/basicprogram.png)

### Class
- the class declaration, consists of 
  - the **access modifier** `public`
  - the **class keyword/reserved word** `class`
  - the **name of the class** `MyFirstProgram`
  - the **curly braces** that wrap around the contents of the class.

###### 3. Method
`message()`
- a set of instructions that may or may not take in some values, and may or may not return some value.
- a method can be invoked by just calling the method’s name
- **public** is an access modifier 
- **void** is the return type, and indicates that the method returns no values
- **message** is the method title, and is followed by parenthesis that contain the input parameters
- the method body lies between the curly braces.

###### 4. Class Main Method
`public static void main(String[] args)`
- every Java program that you wish to execute must contain one class with a main method in it
- never returns anything, because when its execution finishes, the program is done.
- it is the entry-point for executing a java program and is static because the JVM needs to be able to access the method without creating an instance of the class that contains it – that would require another class and method in which it would do so, and another for  instantiating that class, etc.
- **Void** is the return type for this method and means that nothing is returned. The code in the method will execute, and then the execution continues to the next line after the method was invoked.
- **Public** indicates the method is visible to the world. It would have to be, for the JVM to be able to find it. 
- **Static** is a scope keyword that means the method exists before an object of the class is instantiated (Static means that the method belongs to the class NOT the object, it is globally visible to all instances of the class.)
- **String[] args:** It stores Java command line arguments and **is an array of type java.lang.String class.** 
_________________________________________


## Class Access modifiers
  - determine what other classes can access the code contained in a class for their own use
  - the curly braces are mandatory, nested scopes are indented for easier understanding
  - curly braces also group code into structures
  - can either be public, or left blank meaning default
    - **public** data can be accessed by any class in the application
    - **protected** data can only be accessed by classes in the same package or a subclass (which can be in any
    other package)
    - **default** is data with no modifier is considered to have "default" access. This marks the item accessible by any class or subclass in the same package only
    - **private** data is only accessible the class itself. No other class (or subclass) whether in the same package
    or not can access it.

________________________________

## Getters(Accessors and Setters(Mutators)
 - if you want to expose data from within a class to outside manipulation, its best to do that by making the data private and create simple 
 - getters return the value of a variable stored in an object
 - setters allows you to change the value
    ```
      package examples;

      public class Robot {
        0.
        
      //instance variable each instance of Robot will have 
      //has-a relationship
      // private means nothing can see this outside the robot class
        private int maxSpeed;
        
        public Robot(int maxSpeed) {
          this.maxSpeed = maxSpeed;
        }
        
        public int getMaxSpeed() {
          return maxSpeed;
        }

    //setter method
        public void setMaxSpeed(int maxSpeed) {
          if (maxSpeed >= 0)
            this.maxSpeed = maxSpeed;
          else
            this.maxSpeed = 0;
        }
        
        public void travel() {
          System.out.println("The robot moves a distance of " + maxSpeed + " units.");
        }
        
      }
    ```
______________________________

## IS-A vs. HAS-A relationships
- An IS-A relationship represent a class that is a subclass of another.
- A HAS-A relationship is a class that has a field that references another class. 
_______________________________________

## Class Constructors
- is a specialized block of code that serves to initialize the state of a class
- is called once and is called immediately after you invoke the new keyword on this class
- A constructor will always have an access modifier and the name of the class followed by a list of
arguments. The example below demonstrates a no-arg constructor. It is a constructor that has zero arguments.
  ```
      public class Robot {
        //an example constructor
        public Robot(){
        …
        }
      }

  ```

_________________________________________

## Method Overloading

- You can overload a method by creating more than one method with the same name. The difference is in the parameters listed for the method.
- You can also change the return type or the exceptions thrown from a method, but the parameter list has to be different, otherwise the compiler will complain. It will claim that you have duplicate methods and there is no way to differentiate between the two when code wishes to call one over the other. Thus the parameter list has to be different.
- If we have to perform only one operation, having same name of the methods increases the readability of the program. 
- Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.
_________________________________

## Method Overriding
- a child class can override a method inherited from its parent, but you must define a method in the child class with the same signature as its parent; in general, it should have the same name, number and type of parameters 
  - [Example1](img/overriding1.png)
  - [Example2](img/overriding2.png)
  - [Example with super](img/overriding2withsuper.png),
__________________

## Inheritance
**Inheritance is one of the four major principles of Object-Oriented development**
- gives access to the states and behaviors of one class to another similar to how a child
- the parent class is also referred to as the **base or super class** 
- the child class is also referred to as the subclass or derived class.
- a class can extend only one class; it may have only one direct parent class.
- multiple inheritance is when one class has more than one direct parent class. Java does not support multiple inheritance.
- inheritance is an **IS-A** relationship. A child class is considered as a parent class.
- inheritance supports polymorphism, an object is considered an instance of every class in its inheritance chain
_________________________

## This Keyword
**A special constructor in Java that is used in a class to refer to the current instance.**

_____________________________



## Super keyword
- the keyword super is a way to refer to a parent class (from within the child class).
- to call a method from the parent class, you would use the dot operator with super, For example: `super.parentMethod();`
__________________________________

## Summary
- A **class** is a Java structure that you define, from classes, you “instantiate” “objects”
- A class declaration, consists of the **access modifier**, **class keyword/reserved word**, **name of the class**, and **curly braces** to wrap the content
- An **object** is a instance (something that exists in memory) that follows the class structure
- **Class Access modifiers** determine what other classes can access the code contained in a class for their own use
- A **method** is a set of instructions that can be invoked by just calling the method’s name
- A method consist of an **access modifier**, a **return type**, **method name** followed by **parenthesis** that contain the input parameters and **curly braces** that contains the method body
- Every Java program that you wish to execute must contain one class with a **main method** in it, that never returns anything, because when its execution finishes, the program is done
- **Static** is a scope keyword that means the method exists before an object of the class is instantiated (Static means that the method belongs to the class NOT the object, it is globally visible to all instances of the class.)
_____________________________

## References
- [Java Revature: ](https://app.revature.com/core/resources/revContents/content/java/java_object_classes.htm)
- []()
- []()
- []()
- []()