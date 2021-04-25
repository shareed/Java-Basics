## Comparable nd Comparator
**Interfaces that we can use to sort elements**

### Comparable
- defines the natural ordering for a class
    - a class must implement Comparable in order to be sorted by the compareTo() method
    - `compareTo()` compares this object to a specified object
- allow us to sort a collection on the basis of a single element using a single ordering sequence

### Comparator
- defines total ordering on some collection of objects
- class doesn’t have to implement Comparator to use the compare() method
    - `compare()` compares this object to a specified object
- allow us to sort a collection on the basis of a single element using multiple sorting sequences