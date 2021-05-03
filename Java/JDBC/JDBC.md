## Java Database Connectivity(JDBC)
**Framework for connecting Java to a database, it has functionality to connect to all major SQL dialect databases**
- JDBC's PostgreSQL driver will be added to our projects as a dependency via Maven

### Classes and Interfaces
- **DriverManager Class:**
    - used to create a connection to the databse driver
- **DataSource Interface:**
    - used to retrieve connections, its an alternative to DriverManager
- **Connection Interface:**
    - will be used by the framework to create a dialect/database specific object that represent the connection to the database in Java
- **SQLException Class:**
    - general exception that is thrown when something goes wrong on the database side
- **Statement Interface:**
    - reoresent a compiled SQL statement/query/command that is read to run against(on) the database
    - will take a string and run that string directly as a SQL coommand
    - since they use a raw string they are vulnerable to SQL injection(when a bad actor enters SQL code in place of a normal user entry to try and run it against your database)
        - E.g. `What is your username?` 
        - the user types `DROP TABLE users CASCADE`
- **PreparedStstement Interface:**
    - pre-compiled SQL statement/query/comman that will take inputs to set values in your statement and then compile to run against the database
    - they have built in protections against SQL injection
- **ResultSet Interface:**
    - how the JDBC represents the data returned from the database after a query
    - they use cursors to easily iterate over 


