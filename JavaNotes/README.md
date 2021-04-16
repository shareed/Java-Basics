 # Interview Questions
 ## Java
 1. What is the difference between abstract classes and interfaces and why you would use one approach over the other.?
    - A class can extend only one class (abstract or not) but can implement multiple interfaces
    - Interface variables are implicitly public static final
    - Abstract classes can declare any access modifier on instance variables
    - Interfaces can provide static and default methods, but all others are public abstract
    - Abstract classes can declare any access modifier on their methods
    - You would use a abstract class if you wanted to develop and enforce a certain hierarchy of functionality where state and behavior was tracked
    - You woud use a interface if you want a class to be free to implment functionality without constrained to a hierarchy


 2. What does the keyword final mean?
    - specifies a class, method or variable as immutable
 3. What does the keyword static mean?
    - specifies members that are shared class-wide 
 4. What is a interface?
 5. What is an object?
    - an instance of a class in memory
 6. What is a Linked List?
 7. What is a reference type?
    - stores the reference to an object in memory ???
 8. What is Inheritance with an example?
    - gives access to the states and behaviors of one class to another similar to how a child 
 9. What is Encapsulation with and example?
 10. What is Abstraction with an example?
    - hiding details, only showing what something does and hiding how it does it
    - achieved using Abstract classes and Interfaces
11. What are exceptions?
    - problems that arises during the execution of a program
    - checked exception are ones that the compiler checks and forces the programmer to handle them explicitly
    - unchecked exception are runtime exceptions, that the compiler does not check and does not force you to handle them explicitly, they will pop up in the middle of execution.
12. How do you handle exceptions?
    - must handle any checked exception in code by either using a try/catch/finally block or by rethrowing the exception using the throws keyword
    - the try block contains code that can potentially throw an exception
    - the catch block is used to catch any exceptions that may be thrown from code in the try block, if an exception is thrown it will execute any code within its block 
    - the finally block is used to execute code regardless of if an exception is thrown (even if a return statement is in the try block)

 ## SQL
