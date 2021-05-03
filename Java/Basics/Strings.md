## Strings
- strings of characters
- strings are objects because they are constructed using the String class
- the String class has functionality(methods) to support their use in development
- both the String class and the value stored inside a String object are final(immutable)
    - you cannot create a String subclasses
    - you can create a new String in memory changing the original Strings value in some way, then changing the assignment of a String variable to point to the new String
____________________________
### Creating Strings
**Strings can be constructed in 2 ways in Java source code**

#### String Literals
- putting characters between `""` will create a String object call a string literal eg. "SHANNON"
- are identified by the compiler and then constructed during the start up processes of run time
- are stored in a particular place of the heap called the String pool
- Only one String object will be created for each unique String literal in the source code
    - if there are more than one variable that use the same string literals, they will always point to the same object in the string pool(This is why it is necessary for Strings to be immutable)

#### String created with the new keyword
- those that use the new keyword with String’s constructor
- will not be in the String pool, they will be in the general heap
_____________________________

### String Methods
- Strings override the `.equals()` method from the object class
    - instaed of checking the memory location Strings checks the value of the characters contained in the String
    - `==` should not be used with Strings and instead the `.equals()` method

#### Some String methods:
- charAt(): Will find (and return) the char at the specific index given.
- concat(): Joins two Strings together and returns the new String object.
- contains(): Checks to see if a sequence of characters exists in the String. Returns a boolean.
- toCharArray(): Converts a String to an array of characters.
- substring(x,y): extract the characters from a String beginning at the starting position (x) and to (but not including) the ending index (y). Returns those characters as String.
- length(): simply returns an int with the length of the String.
- split(): Takes a String and splits it into an array of substrings based on a delimiter you set. (commonly “,”). Returns all the new Strings in a String array.
- toLowerCase()/toUpperCase(): This will change all the characters that are letters to their upper or lower case forms.
- trim(): removes whitespace from both ends of the String.


_______________

### Mutable Strings

- StringBuffer and StringBuilder are classes very similar to the String class, with built constructors that convert easily between themselves and Strings
- allow the text value they contain to be changed at will, and they provide several utility methods for manipulating their contents in different ways
- **String Buffer**
    - a wrapper for a mutable string that is synchronized or thread safe
    - better used for multithreaded environments
    - will guarantee that only one thread can access it at a time, preventing confusion but can slow performance
- **StringBuilder**
- a wrapper for a mutable string, but it is not thread-safe
- use a StringBuilder when you are not using threads, or are performing thread control safely somewhere else
**Generally, if you are performing several mutations to a String, you will put it in a StringBuffer or builder, perform the changes, and then create a single new String out of the completed buffer/builder.**

#### StringBuilder and String Buffer Methods
- append(): adds chars to the end of the current value.
- insert(): adds chars to a specific location based on the current values indexes. Like append but possible to do in the middle or at the beginning.
- reverse(): reverses the characters in the value.
__________________


| Class Name    | Immutable | Thread Safe   | Speed  |
| ------------- |:---------:|:-------------:|:------:|
| String        | YES       | YES           | Slow   |
| StringBuilder | NO        | NO            | Fastest|
| StringBuffer  | NO        | YES           | Fast   |





