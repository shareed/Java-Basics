## JUnit/Unit Testing
**JUnit is a test framework that provide annotations and methods for creating unit test**
- one of the most used testing frameworks for Java and well intergrated with Eclipse/STS

**Unit Testing smallest units of code(in Java this will be methods) to ensure they function as intended**
- Test can be positive or negative test, and you should test for both
    - Positive test give a expected/valid input and test to see if the expected returns occurs
    - Negative test take an invalid/unexpected input and sees if your code handles it correctly
- **Annotations:**
    - **@Test:**  Labels a method as test method to be run when testing occurs
    - **@BeforeAll:** Runs this method(method must be static) before any test in the class are run
    - **@AfterAll:** Runs this method(method must be static) after all the test in the class are ran
    - **@BeforeEach:** Runs every time before a test method is ran
    - **@AfterEach:** Runs after a test method is ran
    - **@Ignore** will tell a test not to run

### Building Test Methods
- Assert: methods that will allow you to test the result of your methods
    - **assertTrue():** test that the method returns true
    - **assertFlase():**
    - **assertEquals():**
    - **assertNotEquals():**
    - **assertThat():** general asertion that you have to define the functionality of
    - **assertThrows():** can test for exceptions but requires lambda functions
   
