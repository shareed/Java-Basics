## equals() method vs ==
- are used to compare objects to check equality 

### ==
- is a operator
- for reference comparison (address comparison) 

### equals() method
- is a method that compares objects value, cannot compare primitives
- to use primitive you must use the wrapper class to covert them to objects
- If a class does not override the equals method, then it defaults to the equals(Object o) method of the closest parent class that has overridden this method
- If no parent classes have provided an overriden equals method, then it defaults to the method from the ultimate parent class, Object, and so you're left with the Object#equals(Object o) method. Per the Object API this is the same as `==`
- remember to override hashCode if you override equals so as not to "break the contract". As per the API, the result returned from the hashCode() method for two objects must be the same if their equals methods show that they are equivalent. The converse is not necessarily true.
__________________
`System.out.println(System.identityHashCode(variableName));`

- equals method is on the object class
- `.equals` method by default uses the `==` operator under the hood, which compares the memory addresses 
    - if you want to compare values you will have to override the equals method in your class