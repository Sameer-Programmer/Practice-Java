# Practice-Java
## Execution Order in a Java Class

1. **Static Block Execution**
   - The `static` block will execute first when the class is loaded into memory.

2. **Object Creation**
   - Objects should be created inside any method or any block within the class.

3. **Main Method Execution**
   - The `main` method will execute next after the static block and object creation.

