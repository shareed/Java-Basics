## Casting

- Casting is “changing” from one variable type to another. It generally has to be done with objects that share an inheritance relationship. The object itself never changes type, rather the variable holding will have a different declared type.
- Upcasting is taking a subclass and putting it into a superclass declared variable. This is implicitly performed by the compiler.
- Downcasting is taking a superclass and putting it into a child class variable. This can lead to exceptions if you attempt to downcast an object incorrectly.
    - Downcasting must be done explicitly with the “cast” being specified with the new type in parentheses.
        - E.g.: 
            - Animal animal = new Cat();
            - Cat c = (Cat) animal;