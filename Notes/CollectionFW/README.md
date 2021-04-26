## Collections
- a utility class
- used to sort and synchronize the collection elements
- contains only static methods like sort(), min(), max(), fill(), copy(), reverse() etc., which can be used for various operation on a collection

_______________________
## Collection
- Any group of individual objects which are represented as a single unit is known as the collection of the objects
- a single unit of objects

### Collection Framework
- Collection Framework is a combination of classes and interfaces, which is used to store and manipulate the data in the form of objects. It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as List, Queue, Set, etc. for this purpose.
- Collection framework implements various interfaces
- **Collection interface and Map interface** (java.util.Map) are the mainly used interfaces of Java Collection Framework, List of interfaces of Collection Framework is given below

    1. **Collection interface:** Collection (java.util.Collection) is the primary interface, and every collection must implement this interface.
        - is an interface
        - important methods of Collection interface are add(), remove(), size(), clear() etc
        - has subinterfaces such as Set, List, and Queue
    ____________________________________________

    2. **List interface:** List interface extends the Collection interface, and it is an ordered collection of objects. It contains duplicate elements. It also allows random access of elements.
        - The List Interface:
            - can contain duplicate elements
            - is an ordered collection which maintains the insertion order
            - contains a single legacy class which is Vector class
            - can allow n number of null values
    _________________________________________________

    3. **Set interface:** Set (java.util.Set) interface is a collection which cannot contain duplicate elements. It can only include inherited methods of Collection interface
        - The Set Interface:
            - includes only unique items
            - is an unordered collection which does not preserve the insertion order
            - does not have any legacy class
            - only allows a single null value
        - The HashSet and TreeSet, both classes, implement Set interface
            - **HashSet**
                - maintains no order
                - cannot have any duplicate value
                - contains the only single number of null value
                - impended by hash table
                - can be iterated
                - is backed by HashMap
                - performs faster than TreeSet
            - **TreeSet**
                - maintains ascending order
                - implemented by a Tree structure
                - backed by TreeMap
                - performs slower than HashSet
    _______________________________________

    4. **Queue interface**: Queue (java.util.Queue) interface defines queue data structure, which stores the elements in the form FIFO (first in first out).
    _________________________________

    5. **Dequeue interface:** it is a double-ended-queue. It allows the insertion and removal of elements from both ends. It implants the properties of both Stack and queue so it can perform LIFO (Last in first out) stack and FIFO (first in first out) queue, operations.
    ____________________________

    6. **Map interface:** A Map (java.util.Map) represents a key, value pair storage of elements. Map interface does not implement the Collection interface. It can only contain a unique key but can have duplicate elements. There are two interfaces which implement Map in java that are Map interface and Sorted Map.
        - The Map Interface:
            - contains key and values
            - can contain unique Keys with duplicate values
            - can include a single null key with n number of null values
        - HashMap and TreeMap implements the Map interface
            - **HashMap**
                - maintains no order
                - can contain duplicate values with unique keys
                - needs to convert into Set to be iterated
                - can hold a single null key with multiple null values
                - is implemented by hash table
                - can be sorted by Key or value
            - **TreeMap**
                - maintains ascending order
                - is implemented by a Tree structure
                - can be sorted by Key
                - cannot hold a null key but can have multiple null values