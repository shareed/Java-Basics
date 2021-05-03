#### Factories
**Using the `new` keyword to create a object is fine if you want to only create a few object but what if you wanted to create 10000 objects, this is where Factory design comes in**
- a design pattern which creates objects in which the precise type may not be known until runtime
- lets us creates objects without exposing the creation logic to the client

### Create a factory
- create a class ending in `Factory`(LaptopFactory)
    - Abstract data type
    - Classes that inherit the abstract data type (the objects whose instantiation details may not be known until runtime)
    - Static method that returns a concrete instance, whose return type is the abstract data type in