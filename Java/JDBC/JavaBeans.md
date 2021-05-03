## POJO(Plain Old Java Object)
- are a descriptor of Java objects that do not extend other classes(beyaond Object) or implement interfaces for functionality
- defines an entity E.g account class
- as long as it is not implementing functionality
- our models
### Java Beans vs POJO
- Java Beans are POJOs that have specific features, these sre often expected by frame works built for Java
    - **Implements the Serializable**
        - is a marker interface that holds no functionality of its own
        - it marks and object as being able to be Serilized
    - **Private fields**
        - to provide complete control of fields
        - fields should only be accessiable by constructors and getters and setters
    - **Getters and Setters** 
        - for all fields
    - **No args constructor** 
        - along with any other constructors
- **Java Beans are not Spring Beans**
    - its a common confusion in the industry when people talk about beans so be sure to know the context you are talking about

