### Decision making structures
- one or more conditions to be evaluated or tested by the program, along with a statement or statements that are to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false
### Decision making statements
- if statement 
    - Boolean expression followed by one or more statements
    - If the Boolean expression evaluates to true then the block of code inside the if statement will be executed
- if..else statement
    - if statement followed by an optional else statement, which executes when the Boolean expression is false
    - if statement can have zero or one else's
- if...else if 
    - if statement followed by an optional else if...else statement
    - if statement can have zero to many else if's
    - if using a else statement it must come last
    - if else if succeeds, none of the remaining else if's or else's will be tested.
- nested if statement
    - using one if or else if statement inside another if or else if statement
- switch statement
    -  allows a variable to be tested for equality against a list of values
    - each value is called a case
    - the variable being switched on is checked for each case
    - the variable used in a switch statement can only be integers, convertable integers (byte, short, char), strings and enums.
    - value for a case must be the same data type as the variable in the switch and it must be a constant or a literal
    - not every case needs to contain a break
    - no break is needed in the default case.
__________________________________________



## Conditional Statements
- statements that have one or more conditions to be evaluated or tested by the program, along with a statement or statements that are to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false

### if statement
- a Boolean expression followed by one or more statements

### if..else statement
- An if statement can be followed by an optional else statement, which executes when the Boolean expression is false

### if..else if statement
- An if statement can be followed by an optional else if...else statement, which is very useful to test various conditions using single if...else if statement.
- An if can have zero or one else's and it must come after any else if's.
- An if can have zero to many else if's and they must come before the else.
- Once an else if succeeds, none of the remaining else if's or else's will be tested.


### nested if statement
- you can use one if or else if statement inside another if or else if statement


### switch statement
- allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case
- Rules
    - The variable used in a switch statement can only be integers, convertable integers (byte, short, char), strings and enums.
    - You can have any number of case statements within a switch. Each case is followed by the value to be compared to and a colon.
    - The value for a case must be the same data type as the variable in the switch and it must be a constant or a literal.
    - When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
    - When a break statement is reached, the switch terminates, and the flow of control jumps to the next line following the switch statement.
    - Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
    - A switch statement can have an optional default case, which must appear at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.


_____________________



## Loops
- allows us to execute a statement or group of statements multiple times 
### While loop
-  repeatedly executes a target statement as long as a given condition is true


### For loop
- a repetition control structure that allows you to efficiently write a loop that needs to be executed a specific number of times, useful when you know how many times a task is to be repeated


### Do..While loop
- similar to a while loop, except that a do...while loop is guaranteed to execute at least one time

### Enhanced For Loop
- mainly used to traverse collection of elements including arrays
_________________
