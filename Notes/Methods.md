## Java Methods
- a set of instructions
- may not take in some values
- may or may not return some value.
- can be invoked by just calling the method’s name
- methods are declared with:
    - access modifier
    - non-access modifier(optional)
    - return type
    - method name(conventionally named using lower-case camel case)
- methods can take parameters
    - some type of data that the method needs in order to complete its function
    - listed inside the parentheses after the method name
    - can be objects or primitives and the method will have access to them as variables

### Access Modifier
- Methods are declared with an access modifier 
- these determines the availability of the method to outside classes

[More on Access Modifiers](ACCESSMODIFIER.md)
________________

### Non-Access Modifier
- Methods can have Non-access modifiers as well. These are declared in the method signature after the access modifier.
    - static – The method resides with the class not the objects created from the class. Static methods can only call other static methods directly.
    - Others include final, abstract , synchronized etc.

____________________

### Return Type
- a return type that states what the method “gives back” when it is called
    - Return types can be:
        - objects
        - primitives 
        - no return type (void)

____________________________________

## Method Overloading/Overriding

### Method Overloading
- creating more than one method with the same name but differnt number and/or types of parameters and/or order of parameters
- helps us create components that are easy to use and easy to remember
- the parameter list has to be different
- can throw Exceptions
- can return a different datatype
_________________________________

### Method Overriding
- a child class can override a method inherited from its parent, but you must define a method in the child class with the same signature as its parent; in general, it should have the same name, number and type of parameters 
- Overriding - A child will implement the same method signature, allowing for the child to exhibit specific functionality different from the parent.
    - Static methods can not technically be overridden. However they can be “shadowed” which is functionally the same thing.
__________________

## Class Main Method
`public static void main(String[] args)`
- every Java program that you wish to execute must contain one class with a main method in it
- never returns anything, because when its execution finishes, the program is done.
- it is the entry-point for executing a java program and is static because the JVM needs to be able to access the method without creating an instance of the class that contains it – that would require another class and method in which it would do so, and another for  instantiating that class, etc.
- **Void** is the return type for this method and means that nothing is returned. The code in the method will execute, and then the execution continues to the next line after the method was invoked.
- **Public** indicates the method is visible to the world. It would have to be, for the JVM to be able to find it. 
- **Static** is a scope keyword that means the method exists before an object of the class is instantiated (Static means that the method belongs to the class NOT the object, it is globally visible to all instances of the class.)
- **String[] args:** It stores Java command line arguments and **is an array of type java.lang.String class.** 
_________________________________________

## Abstract Methods
- can only be declared in a abstract class( class containing it must be declared as abstract)
- use to guarantee a class will contain a particular method
- abstract methods contain a method signature, but no method body
- the actual implementation will determined by child classes, you can declare the method in the parent class as abstract
- place the abstract keyword before the method name in method declaration, and instead of curly braces an abstract method will have a semoi colon ( ; ) at the end
- Any class inheriting the current class(abstract class) must either override the abstract method or declare itself as abstract


