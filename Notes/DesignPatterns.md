## Design Patterns
- software template, to base your design off of
- help slove recurring problems that arise when developing programs

### Popular Design patterns
- Singletons
- Factory
- Decorator
- Prototype
- Publisher-Subscriber

#### Singletons
- a class that can have only one object(instance) at a time
- use when you do not want more than one object created from a class
- ensures that only one object can ever be created
- **Create a Singleton**
    - private constructor
    - static method

#### Factories
- a class that lets us creates objects without exposing the creation logic to the client
- using the `new` keyword to create a object is fine if you want to only create a few object but what if you wanted to create 10000 objects, this is where Factory design comes in

- create a class ending in `Factory`(LaptopFactory)
    - use for separation of concerns
    - abstracts away a lot of the desision making code so that ideally you can simply have line of code like 