## Generics
- are constructs which enforce compile time safety by allowing you to use parameterized types
- are frequently and heavily used with collections
- can be declared on a class (generic types), method parameters (generic methods), or return types.

- you can restrict a class to only accept objects of a given type and the compiler will prevent you from using any other type
    ```
        List<String> names = new ArrayList<>(); // using a List of Strings only
        names.add("Alice"); // nice!
        names.add(new Object()); // now we get a compilation error to stop this - generics save the day!
    ```

### Make a class (or interface) generic
- use the angle brackets when declaring it
- use an arbitrary "generic type" which is determined by the invoking code
- the generic type can then be reused throughout the class to enforce type safety
    ```
            public class MyGenericClass<T> {
            private T instance;
        
            // simple generic setter method
            public void setObject(T object) {
            this.instance = object;
            }
}
    ```

### Naming Convention for Generics
**Technically, type parameters can be named anything you want. The convention is to use single, uppercase letters to make it obvious that they are not real class names.**

E => Element
K => Map Key
V => Map Value
N => Number
T => Generic data type
S, U, V, and so on => For multiple generic data types