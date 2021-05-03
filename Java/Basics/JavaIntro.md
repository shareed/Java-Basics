## What is Java?

- It’s a high level programming language.
- Highly (Highly) Object Orientated.
- Not completely OOP because it still does have “primitive” values that are not objects.
- Strongly Typed
- Variables are not implicitly converted.
- Strictly Typed
- Variables once declared can not change their value type.
- C based language
- Syntactically similar to the language C.

## Benefits of Java:

- Automatic Memory Management
- Write Once Run Anywhere – Java applications can run on any machine with a Java Runtime Environment. (Windows, Mac, Linux, Android, iOS etc.)
- Widely Used
- Extensive Libraries and Frameworks that are open source.
- Being C based is an advantage for programmers coming from other C based languages.
 

## Disadvantages of Java:

- Automatic Memory Management – Can be inefficient in some environments.
- Requires any user to have the JRE.
- Strongly Typed/Strictly Typed
- Essentially forces OOP.
- Compiled (So takes time to “build” your project from source code to byte code).
- Licensing issues (No longer entirely free in all scenarios)
 

## How Java Works:

**JDK(Java Development Kit)**

- Everything Devs need to write and compile Java Code.
- Compile Time happens here
    - the time at which the source code is converted into an executable code
- Compiler – Turns source code (human readable) to Java Byte Code (JVM Readable).
- Dev Tools – Tools specific for developers writing source code.
- Debugger – helps debug issues
- Documentation tools
- JRE

**JRE(Java Runtime Environment)**
- Everything needed to run a Java application.
Built in libraries.
- JVM

**JVM(Java Virtual Machine)**
- Runtime happens here
    - the run time is the time at which the executable code is started running
- Runs your code (the compiled byte code) in a virtual environment that is the same across devices. The JVM you use is specific to your machine’s OS.
- JIT – Just-In-Time compiler => Turns byte code into machine code essentially line by line as it runs.

**Compile Time and Runtime:**
- Compile time is when source code is converted all at once into byte code. If something goes wrong with compile time, the application does not complete.
- Runtime is when the byte code is being run by the JVM. Unresolved problem that occur here will crash your program, but you can restart.
 

 

**Java Packages:**

- Like a file folder, they store and organize our Java Class/Interface files. (.java files) Packages will generally be sorted into areas of functionality for our program.
- Package declarations (declaring where .java file is located) must be the first line (excluding comments) of your file.
- Naming conventions of packages is generally lowercase with reverse domain names. A “.” will indicate nested packages.
    - revature.app
        - com package
            - revature package
                - app package

**Java Classes:**

- A template or a blueprint for an object.
- You declare classes with an access modifier that controls what else can see the class in the application.
- IMPORTANT: The name of the public class must match the file name of the file it appears in. There can only be one public class per file.
- Class contains fields (variables) and methods (functions):
- Fields store information about the object
- Methods are actions the object can take.
- Best practice for naming Classes is to use upper-case camel case.
g. ThisIsMyClass.

__________________________

## Scanner
- class that allows us to take a stream of inputs during runtime
- primarily used with the console to provide inputs from there
- located in the java.util which is a JRE library
- has various methods for pulling particular types of information. This includes getting Strings, ints, doubles, etc
_____________________________

## Garbage Collection:
**Java’s memory management is abstracted away from us. It is responsible for processes that run in the background to manage memory. It will remove objects from memory that no longer have any reference variable pointing to them. We call this garbage collection**
- You can NOT force the garbage collector. You can suggest that the GC runs with System.gc() but there is no guarantee that it will.
________________________