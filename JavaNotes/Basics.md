# Java Basics

## Class
- a template used to instantiate objects
- also called a type when used with a reference variable
- a class used to instantiate an object determines what states and behaviors an object will possess 
- a class used as the type for a reference variable determines what behaviors of an object can be invoked, and how any variables get initialized

## Object
- an instance of a class in memory
- you never interact with objects directly, instead, you interact with them through their reference, which is the memory address used by the JVM to find a particular object

## Reference Varible
- a variable that stores the reference to an object in memory
- the type of a reference variable determines what types of objects a reference variable can store a reference to
- when a class is used as the type of a reference variable, that reference can only be used to invoke behaviors of the object that are declared in the class/type

#### Example
```
String someVar = new String("Hello World");
  1      2             3
```
1. The class/type of the reference variable
    - String type means that someVar can only store a reference to an object that is an instance of the String class (directly or through inheritance)
    - String type means that someVar can only be used to invoke methods or access public variables present in the String class (whether defined in String or inherited from a superclass)
2. The name of the reference variable
    - `someVar` reference variable does not contain a String object, it contains a reference that points to it in memory
3. The instantiation of a new object using the new keyword to invoke the constructor
    - `new String("Hello World")` expression creates an object, it is not the object itself. You can never access the object directly. 
**Understanding these concepts and their implications is key to properly understanding the Java language.**
______________________________

## ==(relational operator) vs equals()(method)
**Both == and equals()**
- are used to compare two things and return a boolean value
### ==(relational operator)
- used compare the value  of primitives `if (x == 6){}`
- if you compare two reference variables `==` will **compare the reference address of the objects** each variable points to and it may not return true even if the contents of those two objects are the same
    - For example, comparing two Strings (when one is created using the new operator) will return false
        - In the code below s is not equal to s2,
        - objects have their own place in memory and each time you create a new object, it'll have its own memory address and thus the == operator will return false
        - So when you create a new String object, it'll have its own memory address 
        
        ```
            String s = "Hello";
            String s2 = new String("Hello");
            if (s == s2) {..}
        ```
### equals()(method)
- use to **compare the values** of objects with one another
- When working with objects use the equals() method, this will compare the values of objects with one another
        - use equals() instead of == and the if-statement would execute:
            ```
                String s = "Hello";
                String s2 = new String("Hello");
                if (s.equals(s2)) {..}
            ```
_________________________
