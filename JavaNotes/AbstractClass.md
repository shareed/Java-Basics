# Abstract Class
- used to achieve abstraction
- cannot be instantiated
- may or may not contain abstract methods(methods without a body) `public void get();`
- if a class have at least one abstract method, then the class must be declared abstract

## Using a abstract class
**To use a abstract class you have to inherit it in another class, and provide implementations to the abstract methods within it.**
- provide implementations to all the abstract methods in it, or else the inheriting class must also be abstract

## Abstract Methods
- can only be declared in a abstract class( class containing it must be declared as abstract)
- use to guarantee a class will contain a particular method
- abstract methods contain a method signature, but no method body
- the actual implementation will determined by child classes, you can declare the method in the parent class as abstract
- place the abstract keyword before the method name in method declaration, and instead of curly braces an abstract method will have a semoi colon ( ; ) at the end
- Any class inheriting the current class(abstract class) must either override the abstract method or declare itself as abstract