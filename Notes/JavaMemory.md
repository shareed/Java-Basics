## MEMORY IN JAVA
**Java splits its memory into two structures**
_____________________________
### Stack
- manages application flow
- when methods are called, they are placed on the top of the stack then one of two things happen
    - they can call other methods that get placed on top of them
    - they are resolved and the calling method then continues
- For multithreaded environments the stack can “branch”
____________________________

### Heap
- where objects array etc..(reference variables) are stored
- the reference variable point to where the object is in the heap
- Variables in the stack reference the location of an object in the heap