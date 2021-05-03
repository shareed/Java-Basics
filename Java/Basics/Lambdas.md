## Lambda Expressions

**Java 8 introduced new functionality for functional interfaces and the ability to use them to create lambda expressions.**
- a short block of code which takes in parameters and returns a value
- similar to methods, but they do not need a name
- can be implemented right in the body of a method
- have to immediately return a value
- cannot contain variables, assignments or statements such as if or for
- allow you create single use, anonymous methods, that can be passed as parameters
- a functional interface will have a single abstract method that the lambda will then implement
- Runnable, Comparator, Executable are all functional interfaces
- **Syntax:** `parameter -> expression body`

## Characteristics
**Data type declaration:** 
- optional
- No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.
```
    //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
```

**Parenthesis around parameter:** 
- optional, for a single parameter
- required for multiple parameters
```
  //without parenthesis
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
      //with parenthesis
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);
```

**Curly braces:**
- optional if the body contains a single statement

**Return keyword:**
- compiler automatically returns the value if the body has a single expression to return the value
- Curly braces are required to indicate that expression returns a value.
```
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
```