## List Interface
- an interface that specifies an order
- available in java.util package and extends java.util.Collection interface
- extends the collection interface
- zero base, index starts at 0
- it is not sorted by default, order is based on insertion
- can have duplicate elements and null value


- Classes that implement the List Interface 
    - **ArrayList**
    - **Vector**
    - **LinkedList** 
______________________________
### List Methods
- **add:** put in new element at end
- **get:** get data at a certain index
- **set:** overwrite element at certain index
- **size:** returns the number of elements
- **remove:** remove element
- **forEach:** do an action for each List element
________________________________
### Classes that implement the Set Interface
#### ArrayList
- uses an Array that can be sized dynamically
- fast access to the middle
- fast adds to the end
- slow inserts and deletes in the middle

#### LinkedList
- uses a series of nodes that point to the next node in the list
- fast inserts given that you have the adjacent node
- beginning and the end, sometimes the middle
- slow lookup for elements in the middle
- ALSO implements the Queue interface
______________________________

#### Stacks 
- wildly predate the collections frameworks
- is LIFO - last in first out
________________________________


#### Vector
- grandfathered in a can’t be removed for legacy reasons
- DON’T USE THEM >:(
- f you want a stack -> use ArrayDeque
________________________