# Practice-Java
# Identifiers in Java

## Definition and Rules
- A name in Java programs is called an **identifier**, used for identification purposes.
- Identifiers should **not** start with numerical digits.
- Allowed characters in identifiers:
  - a-z
  - A-Z
  - Underscore (_)
  - Dollar sign ($)
  - 0 to 9
- Java is a **case-sensitive** language.
- Identifiers may be lengthy, but long identifiers are not recommended.

## Reserved Keywords

Reserved keywords cannot be used as identifiers in Java. They represent specific functionalities or concepts.

### Types of Reserved Words
1. **Keywords**: Reserved words associated with functionality.
2. **Reserved literals**: Reserved words associated with values but not functionality.

### Breakdown
- Total reserved words: 53
  - Keywords: 50
    - Used: 48
    - Unused: 2 (goto, const)
  - Reserved literals: 3 (true, false, null)





## Execution Order in a Java Class

1. **Static Block Execution**
   - The `static` block will execute first when the class is loaded into memory.

2. **Object Creation**
   - Objects should be created inside any method or any block within the class.

3. **Main Method Execution**
   - The `main` method will execute next after the static block and object creation.

