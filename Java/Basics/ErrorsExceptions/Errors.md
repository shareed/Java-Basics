## Errors
**When your application encounters problems that stop it from completing its tasks it will “throw” an exception or error.**
- inherit from Error
- all exceptions and errors inherit from the class Throwable
- Generally Errors are unrecoverable so you shouldn’t even try to handle them
__________________________________

![Exceptions](img/exceptions.png)
Erros and exceptions inherit from the Throwable class
- Errors are unchecked exception
- Exception is a checked exception
    - Exceptios that inherit from Exception:
        - FileNotFoundException(checked exception)
        - Other I/O Exceptions(checked exception)
        - Runtime Exceptions(Unchecked Exception)
            - Exceptios that inherit from RunTime Exception Exception:
                - IndexOutBounds
                - ClassCast
                - Arithmetic

____________________________________

## Compile time Errors
- Compile-time errors are the errors that occurred when we write the wrong syntax or semantic
    - syntax errors occur when the code does not 
    - semantic errors exist when the statements are not meaningful to the compilerfollow the syntax of the programming language
    - the program will not run until all the errors are removed from the program

### What happens at compile time?
- java file is compiled by Java Compiler converting the java code into bytecode
    - It does not interact with OS
____________________
## Runtime Errors
- Runtime errors are the errors that occur during the execution and after compilation
_________________________________

**Exceptions and Errors are generally not Final so they can be extended. This is how you make custom Errors or Exceptions.**
