## Threads

- Threads allow for our Java application to be more efficient. They create concurrently running execution flows.
- There are two ways to create Threads in Java:
    - A class can extend the Thread class and override the “run()” method.
    - The alternative is “Runnable” which is an interface your class can extend. This is will also require you to override the “run()” method.
    - Calling the “start()” method will create a thread and then use whatever is in the run method of your class as the base method for that execution flow (essentially a mini main method.)
- Because threads run independently there is no way to ensure the order in which they will run in comparison to each other. This “multithreaded environment” can have specific issues that crop up because of this. These are called concurrency issues:
    - Deadlock occurs when two threads are competing for the same set of resources and neither is willing to give up the part of the set that they control. This can cause your application to stall out and run indefinitely. This can usually be resolved by giving thread priority.
    - Starvation is similar to deadlock in that threads are competing. But in this case, one thread has all resources another thread needs. So thread without access to resources is stalled for a period of time. This can be mitigated by having threads release resources when they are not actively using.
- Synchronization – There is a non-access modifier “synchronized” which will “lock-down” a method or class/object to a single thread having access to it at a time.
- “isAlive()” is another way to avoid deadlock. It will pause a thread giving up it’s resources to the other thread that needs them.


then instaniate the class and call the start method

- the run method is where you provide the implmentation


- add runnable oubjct to the constructor