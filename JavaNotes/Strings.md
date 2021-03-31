# Strings
- both the String class and the value stored inside a String object are final(immutable)
- If you want to create a mutable String object you would use a StringBuilder or StringBuffer object
- String class cannot be extended, and once instantiated, the value inside a String object cannot be changed, so when you modify a String object a new String is created
- Each line below creates a new String object in memory.
        ```
        String var1 = new String ("Hello ");
        String var2 = new String ("World");
        var1 = var1 + var2;
        var2 = "Example";
        ```
_______________

## StringBuilder or StringBuffer object
- objects that allow the text value they contain to be changed at will, and they provide several utility methods for manipulating their contents in different ways

**However, consider a situation where two separate processes (called threads) are running at the same time, and both processes need to access the same text at the same time, and one process will change it. With a String object, this is not a problem - when one of the processes changes a String, it gets a new String object and the original remains unchanged. If the text value were mutable though, then the value returned to one process would depend on whether the other has editted it yet. This means that our editable text is not thread-safe.**

### StringBuffer 
- use whenever you need a mutable string object, and also need it to be thread-safe
- will guarantee that only one thread can access it at a time, preventing confusion but can slow performance

### StringBuilder
- a wrapper for a mutable string, but it is not thread-safe
- use a StringBuilder when you are not using threads, or are performing thread control safely somewhere else