## Access Modifier

- determine specifies which classes can access a given class and its fields, constructors and methods
- can be specified separately for a class, its constructors, fields and methods
- classes, fields, constructors and methods can have one of four different Java access modifiers:
    - **public** 
        - data can be accessed by any class in the application
    - **protected** 
        - data can only be accessed by classes in the same package or a subclass (which can be in any other package)
        - not allowed for classes
    - **default:** 
        - data with no modifier is considered to have "default" access
        - item only accessible inside the package
    - **private** 
        - data is only accessible the class itself. No other class (or subclass) whether in the same package or not can access it
        - not allowed for classes
