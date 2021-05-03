# Variables
- reserved memory locations to store values
- represents or “holds” a piece of data
- value may or may not be known at the time of declaration
_________________
## Data Type of a variable
- datatypes are assigned to variables
- data being held can be manipulated or the variable can be reassigned to hold new data of the same type
- the operating system allocates memory and decides what can be stored in the reserved memory(variable), based on the data type
- There are two data types available in Java:
    - **Primitive Data Types:**
        - the only things in Java that aren’t Object Oriented
        - holds a simple value **eg. 20**
        - predefined by Java and named by a keyword
        - Java supports the folowing eight primitive data types:
            - **byte, short, int, long, float, double, boolean, char**
    - **Reference Data Types:**
        - holds the reference to an object's location(memory address) in memory(points to the object)
        - variables that are created using defined constructors of the classes
        - used to access objects
        - declared to be of a specific type that cannot be changed
        - include class objects, and various type of array variables
        - default value is null
        - can be used to refer to any object of the declared type or any compatible type
        - Example: Animal animal = new Animal("giraffe");
        - Class objects, and various type of array variables come under reference data type.
        - Default value of any reference variable is null.
        - A reference variable can be used to refer to any object of the declared type or any compatible type.
        - Example: Animal animal = new Animal("giraffe");
___________________________________________________________

| Primitive Type        | Size                          | Description                           |
| --------------------- |:-----------------------------:| -------------------------------------:|
| boolean               | ~1 bit (dependent on the JVM) | Represents a true or false value      |
|byte                   |8-bits (1 byte)                | Signed Numerical value of -128 to 127 |
|short                  |16-bits(2 bytes)               |Signed numerical value. Integer|
|int                    |32-bits (4 bytes)              |Signed Numerical value, integer (most common numerical)
|long (“L”)             |64-bits (8 bytes)              |Signed Numerical value, integer|
|float (“f”)            |32-bit                         |Signed Floating point (decimal) number|
|double                 |64-bit                         |Signed Floating point number, this is the most common/default decimal value.|
|char                   |16-bit                         |Unicode character (unsigned numerical)|


### Variable scopes:

- Define the availability of a variable (Where can I access it.)
- 4 Scopes:
    - **Class (static) scope:** 
        - Static variables declared in a class
        - same single variable is accessible to all objects of that class
        - `static int i = 0; )`
    - **Instance (object) scope:** 
        - accessible anywhere within the object(field variables) 
    - **Method scope:**
        - variable declared in a method can only be accessed in that method
        - includes parameters
    - **Block scope:** 
        - variable inside a block of code (defined by curly braces) is only visible in that block
        - includes if/else blocks, loops etc


________________________
- [More about datatypes](DataTypes.md) 