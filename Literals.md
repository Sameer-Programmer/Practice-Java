# Literal

1. int x = 10

- int = data type or Keyword 
- x = name of variable  or identifier 
- 10 -- constant value noting but Literal
- A constant value  which can be assigned to a variable is called Literal 


# Integral Literals

For integral data types (`byte`, `short`, `int`, `long`), we can specify literal values in the following ways:

1. **Decimal Literals (Decimal Form) [Base 10]**
   - Allowed digits: `0` to `9`
   - Example: `int x = 10;`

2. **Octal Form [Base 8]**
   - Allowed digits: `0` to `7`
   - Literal value should be prefixed with `0`
   - Example: `int x = 010;`

3. **Hexadecimal Form [Base 16]**
- Allowed digits: `0` to `9`, `a` to `f` (for extra digits, both lowercase and uppercase characters can be used)
- The values of hexadecimal digits are as follows:
  - `a = 10`
  - `b = 11`
  - `c = 12`
  - `d = 13`
  - `e = 14`
  - `f = 15`
   - This is one of the few areas where Java is not case-sensitive.
   - Literal value should be prefixed with `0x` or `0X`
   - Example: `int x = 0x10;`

## Summary

There are three possible ways to specify a literal value for integral data types: **Decimal**, **Octal**, and **Hexadecimal**.

## Examples

```java
int x = 10;       // Valid: Decimal literal
int x = 0786;     // Invalid: Octal literals allow digits 0 to 7 only, but 8 is present
int x = 07777;    // Valid: Octal literal
int x = 0xFace;   // Valid: Hexadecimal literal, using digits 0 to 9 and letters a to f
int x = 0xBeeer;  // Invalid: Hexadecimal literals only allow 0 to 9 and a to f, but 'r' is present
```
## Good







