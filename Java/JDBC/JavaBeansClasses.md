## Java Beans Classes


### Java Beans Class Structure
1. Create the class and implement `Serializable`
    - add the fileds that are in your database
    - the class name will have line under it if you do not add the `serialVersionUID` which you can get by hovering over the class name
    - add a no args constructor and any other constructors you need
    - add getters and setters
    - override the `hashcode()` `equals()` and `toString()` methods