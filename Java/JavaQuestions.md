### Basics
1. What is Java?
***Object Oriented Like programming language, everything is an object except primitive variables***

2. How does Java work?
***The JDK compiles the Java source code into byte code, then the JVM takes that byte code, runs it in the virtual environment and turns it into machine code by way of the Just In Time Compiler***

3. How does Java's Memory work?
***Java memory is divide into two structures the heap is where objects are stored and the stack manages application flow and is where methods are placed when they are called.***

4. What are packages?
***Packages are like folders that hold .java files like the class and interface files***

5. What is a class?
***A class is a blueprint for an object, they define the atrributes(variables) and behaviors(methods) of an object***

6. What is Scope?
***Scope define what has access to or the availability of a variable***
    - Class scope 
    - Instance scope
    - Method scope
    - Block scope

7. What is a variable?
***Reserved memory location to store values***


8. What is a Method
***Defines the functionality or behavior of an object or class***

9. What is method overloading?
***Method overloading is having more than one method with the same name but must have either different type, number and/or order of parameters***

10. What is method overriding?
***Method overriding is when a child class overides the parents class method***

11. What are abstarct methods
***An abstract method is a method that has no body or implementation***

12. What are access modifiers?
***Access modifiers defines what outside classes can access a resource, such as a method or class***



13. What are objects?
***An object is an instance of a class***

14. What is an Interface?
***Abstrct entity that contains behaviors that a class must implement***

15. What is an constructor?
***A block of code that is executed only once, when a class is instantiated***

16. Whay does fianl mean?
***Final means it can not be changed final class cannot be extended, final method cannot be overridden and final variables cannot be modified after initilization***

17. What does finally mean?
***Finally is part of a try cath statement, the block of code within it always runs no matter what***

18. What does finalize mean?
***Finalize is a method on the object class that the garbage collector calls before the object is removed from memory***

19. What are the OOP pillars?
    - Ecapsulation
    - Inheritance
    - Abstarction
    - Poloymorphism

20. What is Encapsulation??????????
***Protecting data and code from outside manipulation by wrapping it into a single unit***
    - Eg. setting the private level access to variables of a class, making them only accessible within that class through getters and setters

21. What is Inheritance?
***The ability of an class to take on the properties of another***
    - E.g A Content Class has title and description fields
            - if we have a Movie and TVShow classes that are subclasses of Content
            - the Movie and TVShow classes would inherit the title and description fields from the content class

22. What is Abstraction?????
***Hiding Implementation details and only showing functionality to the user***
    - E.g. When a pilot is landing an airplane he does not need to know how the landing gear works he just needs to know what controlls he need to use in the cockpit to land the plane.
    - E.g. Can use a abstarct class that has abstarct methods to force the child class to provide the implementation of the methods

23. What is Polymorphism?
***The ability of an object to take on many forms***
    - E.g. using method overloading or overiding to provide differnt implementations of the same methods 
        - E.g. A female class has a method introduction()
            - give the Female class a generic introduction message
            - then there could be two Female subclasses Sister and Mother
            - could override the introduction() method in the Sister and Mother subclasses to messages that are specific to those subclasses, give you different ways to complete the same action
        
### Collections
24. What is the Collection Framework/API?
***A kind of architecture that is a combination of classes and interfaces***
    - Collection Interface extends the Iterable Interface
    - Collection Inferface is extended by Set, List and Queue Interfaces


25. What is a collection?
***A collection is a object that represents a group of objects***

26. What is a List?
***Ordered collection of elements that can contain duplicates and extend the Collection Interface***

27. What is a Set?
***Collection of unique elements that are not ordered and extend the Collection Interface***

28. What is a Map?
***Special type of collection used to store key-value pairs and do not extend the Collection Interface***

29. What is a Queue?
***Collection of unordered elements that are First In First Out (FIFO) and extend the Collection Interface***

1. Does the collection allow duplicates?
    - List and Queues allow duplicate
    - Sets and Maps do not allow duplicates

2. Does the collection allow nulls?
    - List can have null values
    - Set can only have one null element
    - Queue most do not let you insert nulls, but some like LinkedLists, allow nulls
    - Map does not allow null values

3. Does the collection maintain an order of its values?
    - List, Sets and Queues do not maintain order
    - Maps most do not, only Treemap does

4. Why are maps weird?
    - Map is part of the Collection Framework but does not extends the Collection Interface because thay are incompatible
        - Map need key-value pairs but the Collection methods take an Object as it parameters
        -  Map supports keySet, valueSet etc. Collection classes does not have such views


31. What are Arrays?
***A data structure that is fixed in size sequentially store the same type of data in memory***

Arrays vs ArrayList
- arrays are fixed in length all other data structures(ArrayList etc...) are dynamic in size

___________________________________________

32. Control Flow statements
33. Loops

34. What is Scanner?
***A class that allows us to take a stream of inputs during runtime***

35. What is Garbage Collection?
***What removes objects from memory that no longer have any reference variable pointing to them***

36. What are Strings?
***Strings are a sequence of characters, the String API helps us creat am]nd manipulate strings***

37. What is StringBuilder?
***A wrapper for a mutable string, it is not thread safe***

38. String Buffer
***A wrapper for a mutable string, it is thread safe(Synchronized)***

39. What are Errors?
***Unrecoverable problems in a application***

40. What are Exceptions?
***Problems in a application that the application can recover from*** 
    - checked exceptions are anticipated as possible and so the compiler will require you to handle them in some manner before it will compile
    - unchecked exceptions are exception that the compiler does not require you to preemptively handle them

41. What is the Object Class?
***The parent of all classes***

42. Runnable Interface
***Interface used to execute code on a concurrent thread***

43. MultiThreading
***A process of executing two or more threads simultaneously to maximum utilization of CPU, this process is also know as Cocurrency***

44. Synchronization
***A non-access modifier “synchronized” which will “lock-down” a method or class/object to a single thread having access to it at a time***

45. Deadlock
***When two threads are competing for the same set of resources and neither is willing to give up the part of the set that they control***

46. Producer / Consumer Problems
47. Thread Class
***A thread of execution in a program***

48. JUnit Annotations
***JUnit is a test framework that provide annotations and methods for creating unit test***
___________________________________

49. Assert methods
___________________________

50. Project Object Model (POM)
***An XML file that contains information about the project and configuration details used by Maven to build the project***

51. **ArrayList**
52. **LinkedList**
53. HashSet
54. TreeSet
55. ArrayDeque
56. PriorityQueue
57. Iterable Interface

58. What is the Compareable Interface????
***Interface that defines the natural ordering for a class and is used to sort elements. Allow us to sorting on the basis of a single element using a single ordering sequence. A class must implement Comparable in order to be sorted by the compareTo() method, which compares this object to a specified object*** 

59. What is the Comparator Interface????
***Interface that defines total ordering on some collection of objects and is used to sort elements. Allow us to sort a collection on the basis of a single element using multiple sorting sequences. A class doesn’t have to implement Comparator to use the compare() method which compares this object to a specified object***

60. Generics
***Allow us to create classes that work with data types,allowing them to be parameters to methods, classes and interfaces***

61. What are Wrapper Classes?
    - alow us to treat primitives as objects

62. What is a Singleton?
    - a class that allow only one instance can be created from 

63. What is a Factory?
    - a design pattern which creates objects in which the precise type may not be known until runtime

64. What are Lambdas?
    - short block of code which takes in parameters and returns a value
    - allows us to create a single use, anonymous methods, that can be passed as parameters
    - are used primarily to define inline implementation of a functional interface
_____________________________________________

65. What is a Design Pattern?
***Software template, to base your design off of, that help slove recurring problems that arise when developing program***

66. What are annotations?
***A special form of syntactic meta-data that can be added to Java source code for better code readability and structure***

### Casting
67. What is Casting?
    - changing from one variable type to another
    - the current object it self does not change the variable type changes
__________________________

68. What is Upcasting?
    - taking a subclass and putting it into a superclass declared variable
    - is implicitly performed by the compiler
_____________________________

69. What is Downcasting?
    - taking a superclass and putting it into a child class declared variable
    - must be done explicitly with the “cast” being specified with the new type in parentheses
_________________________________________________

### Servlets
70. What are Servlets?
    - A servlet is a java class that is a singleton
    - takes incoming request, processes them and generates a response to send back
_______________________________________________

80. What is a servelet Lifecycle?