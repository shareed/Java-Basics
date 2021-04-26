# Data Types
- Java specifies its own datatypes
- Each variable specifies its own type.

### Variables
- reserved memory locations to store values
- Strongly Typed, meaning each variable can only hold only one data type
- by assigning different data types to variables, you can store integers, decimals, or characters in these variables
- the operating system allocates memory and decides what can be stored in the reserved memory based on the data type
- There are two categories of variables:
  - **primitives** uses a predefined amount of space in memory, store data directly as bytes
  - **reference or object** uses a class name as its type, store memory addresses where objects are located, and dictate how those objects are accessed
#### Variable Classifications
- `{}` denotes change in scope
- variables declared in a scope, it is visible only to lower scopes(nested scopes)
- **Instance Variable:** variables declared in the class scope, after the class declration but outside of any class methods, is a instance variable
  - each instance of that class will have a copy of the variable with a value unique to that instance
-**Static/Class/Global Variable:** variables with the statid keyword
  - every object of the class will share the same value for that variable
  - if the value is changed in one object it changes in all of them
-**Local Variable:** variable declared inside a method
  - does not exist outside the method in which it is declared
  - when the method is executing, the variable is deleted from memory
____________________________________

### Reference Data Types
- Reference variables are created using defined constructors of the classes. 
- They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy etc.
- Class objects, and various type of array variables come under reference data type.
- Default value of any reference variable is null.
- A reference variable can be used to refer to any object of the declared type or any compatible type.
- dot operator can be used to access the variables or methods of the referenced object so long as they are declared in the class type
- Point to an object and is not the object itself
- Example: Animal animal = new Animal("giraffe");
- `ainmal` contains a reference to the Animal object, reference is the address of the memory location where Animal is stored

### Primitive Types
**There are 8 primitive datatypes, which are lowercased and predefined by the language and named by a keyword:**
- contain the lowest value they can by default
  - 0 for numbers
  - false for boolean
  - null for char
1. **boolean:** true or false a 0 or 1
  - does not support truthy values, so 0 is not the same as false
  - boolean data type represents one bit of information.
  - There are only two possible values: true and false.
  - This data type is used for simple flags that track true/false conditions.
  - Default value is false.
  - Example: boolean one = true

2. **byte:** 8-bit two's complement integer
  - Minimum value is -128 (-2^7)
  - Maximum value is 127 (inclusive)(2^7 -1)
  - Default value is 0
  - Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int.
  - Example: byte a = 100 , byte b = -50
  
3. **short:** 16-bit two's complement integer
  - Minimum value is -32,768 (-2^15)
  - Maximum value is 32,767 (inclusive) (2^15 -1)
  - Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an int
  - Default value is 0.
  - Example: short s = 10000, short r = -20000
  
4. **char:** 16-bit Unicode character
  - Minimum value is '\u0000' (or 0).
  - Maximum value is '\uffff' (or 65,535 inclusive).
  - Char data type is used to store any character.
  - Example: char letterA ='A'
  
5. **int:** 32-bit two's complement integerinteger
  - Minimum value is - 2,147,483,648.(-2^31)
  - Maximum value is 2,147,483,647(inclusive).(2^31 -1)
  - Int is generally used as the default data type for integral values unless there is a concern about memory.
  - The default value is 0.
  - Example: int a = 100000, int b = -200000
  
6. **float:** 32-bit floating-point 
  - Float is mainly used to save memory in large arrays of floating point numbers.
  - Default value is 0.0f.
  - Float data type is never used for precise values such as currency.
  - Example: float f1 = 234.5f
  
7. **long:** 64-bit integer two's complement integer integer.
  - Minimum value is -9,223,372,036,854,775,808.(-2^63)
  - Maximum value is 9,223,372,036,854,775,807 (inclusive). (2^63 -1)
  - This type is used when a wider range than int is needed.
  - Default value is 0L.
  - Example: long a = 100000L, long b = -200000L
  
8. **double:** 64-bit floating-point number
  - This data type is generally used as the default data type for decimal values, generally the default choice.
  - Double data type should never be used for precise values such as currency.
  - Default value is 0.0d.
  - Example: double d1 = 123.4

___________________________________________-

## Data Types
- specifies the size and type of value stored in variables
### Primitive Types(8)
- has no additional methods
- size depends on the data type
| **Data Type** |	**Size**    |	**Description** |
| ------------- |:-------------:| --------------------------------------------------------------------------------:|
| byte          |    1 byte     | Stores whole numbers from -128 to 127                                            |
| short         |    2 bytes    | Stores whole numbers from -32,768 to 32,767                                      |
| int           |    4 bytes    | Stores whole numbers from -2,147,483,648 to 2,147,483,647                        |
| long          |    8 bytes    | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
| float         |    4 bytes    | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits          |
| double        |    8 bytes    | Stores fractional numbers. Sufficient for storing 15 decimal digits              |
| boolean       |    1 bit      | Stores true or false values                                                      |
| char          |    2 bytes    | Stores a single character/letter or ASCII values                                 |

#### Integer types
- stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are **byte**, **short**, **int** and **long**. Which type you should use, depends on the numeric value.

#### Floating Point Types
- represents numbers with a fractional part, containing one or more decimals. There are two types: **float** and **double**

### Reference Types
- are created by the programmer and is not defined by Java
- can be used to call methods to perform certain operations
- can be null
- all have the same size
________________________________
