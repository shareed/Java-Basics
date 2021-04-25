
# Four major principles of Object-Oriented development
_____________
## Inheritance
Inheritance is a way to create a relationship between two objects. One class inherits from another, an object that is an instance of the first class will also contain the states and behaviors of the second class 
- gives access to the states and behaviors of one class to another similar to how a child
- the parent class is also referred to as the **base or super class** 
- the child class is also referred to as the subclass or derived class.
- a class can extend only one class; it may have only one direct parent class.
- multiple inheritance is when one class has more than one direct parent class. Java does not support multiple inheritance.
- inheritance creates an **IS-A** relationship. A child class is considered as a parent class.
- inheritance supports polymorphism, an object is considered an instance of every class in its inheritance chain
- class that is inherited from is called a base, super, or parent class
- class that inherits from another is likewise called a derived, sub, or child class
- most OOP languages do not support multiple inheritance

# Polymorphism (“Many Forms”)
- refers to the “is-a” relationship created by two objects through inheritance
- when one class inherits from another, it creates a relationship that can be described by the verb “is”
- when one class extends another, an instance of that child class id also an instance of the parent class
    - If class Dog extends class Animal, then you can say an instance of a Dog is also an instance of an Animal. A Dog is-an Anima
**You can use this concept in reverse to figure out how your classes and their inheritances should be organized. If you can describe one class as being a more specific example of another class, then you can probably have the more specific class inherit some properties or behaviors from the more generic class**
- the principles of OOP says that a Dog object is an instance of the Dog class
- the principle of polymorphism also says that a Dog object is an instance of an Animal class too

 C
- Because a child class inherits all public and protected variables and methods from its super class, the child class is guaranteed to have at least those variables and methods– it may implement its own, or override the functionalities therein
    - If the Animal class has a public eat() method, then the Dog class that extends it is also guaranteed to have an eat() method, even if it works differently

- When you create a instance of a class using the new keyword, you store a reference to that object in a reference variable, that uses the object’s class as a type
    - `“Dog myDog = new Dog()”` 
        - creates a Dog object by using the new keyword to invoke the constructor of the Dog class
        - stores a reference to the Dog object in a variable of type Dog named “myDog.”
        - Understanding polymorphism requires understanding what that reference variable type actually does
        - you can think of the reference variable type(Dog) as a mask you put over your object’s code
        - the Dog object has all the code for methods defined in the Dog class, and the reference variable type is like a sheet of paper that sits overtop of that code, with holes cut away for certain methods to be seen through, while others are hidden.The holes that are cut away and thus allow access to the object code underneath, are placed to only allow access to the methods defined in the class being used as the type
- [Example1](img/polymorphism1.md)
    - the Animal class defines the method “eat()”
    - the Dog class extends Animal and additionally defines the method “bark()”
- [Example1](img/polymorphism2.md)
- If I store a reference to our Dog object in a Dog type reference variable, then I can access the logic for the eat() and bark() methods as defined in the Dog class
-  if I use an Animal reference type instead, then I only have access to the eat() method that is defined in the Animal class – even though the logic for that method will be the implementation used in the Dog class
- The process of storing a more specific value in a less specific type is called “upcasting”
