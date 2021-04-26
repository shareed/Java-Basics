## Arrays:

- Arrays in Java are data structure that sequentially store the same type of data in memory.
- Arrays have a fixed length (the length property is final) to ensure it knows how much memory it needs.
    - If you need a larger/smaller array you have to create a new array object in memory.
    - Since the length of the array is property, you can access as a field variable of the array itself, you do not need a method to find the length.
        - myArray.length not myArray.length()
- Each member or entry in the array has a specific index. This allows you to quickly find a single value in the array. The first index of an array is always 0.
- You can change the values in an array as long as they are of the same type.
- You can create an array in 2 main ways.
    - Create an empty array of the length your need
    - `int[] intArray = new int[3];`
    - You can then fill the values by index.
    - Assign values immediately
        - int[] intArray2 = {8, 9, 10};