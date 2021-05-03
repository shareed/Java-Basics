# Abstract Class
- used to achieve abstraction
- cannot be instantiated eg. `new AbstractClass`
    - must be extended and cannot be final
- can have only one direct parent
    - avoids conflicts from methods with the same method signature in the parent classes
- may or may not contain abstract methods(methods without a body) `public void get();`
- if a class have at least one abstract method, then the class must be declared abstract

## Using a abstract class
**To use a abstract class you have to inherit it in another class, and provide implementations to the abstract methods within it.**
- provide implementations to all the abstract methods in the inheriting class, or else the inheriting class must also be abstract