# Constructor
- a block of code that is executed only once, when a class is instantiated
- always have the same name as the class and can accept any number of parameters
-  if you create a class and don't specify a constructor the compiler will generate the default no-arg constructor
##### Example 
```
    class Animal { 

            //The below constructor is implicitly added by the compiler

            public Animal() { }

    }
```
-  the constructor has a call to invoke its superclass constructor, this will happen implicitly in the constructor, whether you write the code or not
        
    ```
    The exception to this rule is the constructor of th Object class which actually creates an object in memory or if you invoke this() to call anothe constructor from within the class. 
    ```

##### Example
```
class Animal { 

    //the below constructor is implicitly added by the compiler

    public Animal() {

        super(); //added by the compiler

    }

}
```
__________________

## Constructor: Handling a larger inheritance hierarchy
- The compiler will continue to add calls to super() and create no-arg constructors for as many classes that you define that need them
- No matter how you chain constructors, eventually the superclass constructor must be called
- This guarantees that at the end of the chain, the Object class constructor is getting called, so the object can actually be created in memory
_________________
## Implicit Constructor Pitfalls
- Ensure that you don't break the superclass chain
    - when you override the default construvtor

