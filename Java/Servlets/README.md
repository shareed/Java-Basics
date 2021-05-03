## Java Servlets(Servlet API)
**A servlet is a java class that takes incoming request, processes them and generates a response to send back**
- serverlets are sigletons


### Servlet Lifecycle
1. `init()`
    - a method that is called once during ther lifecycle
    - creates the Servlet with the required data, if one doesnt already exist 
2. `service()`
    - called once per request and many times during the servlet lifecycle
    - delegates various do method based on the HTTP verb
    - get request will have the servlet hand off the handling of the request to a doGet method in the servlet
3. `destroy()`
    - ater the servlet has been unused for a while the server will call the destroy method on the servlet to make it ready for garbage collection

____________________________________________

### Servlet API
- servlets comes from the `javax.servlet` and `javax.servlet` packages
- Interfaces `ServletConfig` and `Servlet`

## Create Servlets
- Create a Maven Project
    - be sure to check the box for creating a simple project and choose you folder
    - Click Next and add:
        - GroupId: E.g `com.revature`
        - ArtifactId: E.g `ProjectName`
        - Packaging: right click the drop down and package it as a war file `war`
        - Name: E.g `ProjectName`
- the pom.xml file will have a error for the packaging tag
    - to fix this right click the project and select `Java EE Tools`
    - select `Generate Deployment Descriptor Stub`, the error should now be gone