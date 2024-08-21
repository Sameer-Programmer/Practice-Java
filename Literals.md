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
## Note 
JVM alwys give the anser in decimal form 
## Code Explanation

### The Code
```java
class HelloWorld {
    public static void main(String[] args) {
        int x = 10;        // Decimal form
        int y = 010;       // Octal form (010 in octal is 8 in decimal)
        int z = 0xBeef;    // Hexadecimal form (0xBeef is 48879 in decimal)

        System.out.println("Try programiz.pro " + (x + y + z));
    }
}
```
## Step-by-Step Explanation

### Variable Initialization:

- **`int x = 10;`**
  - `x` is assigned the decimal value `10`.

- **`int y = 010;`**
  - `y` is assigned the octal value `010`.
  - In octal, `010` is equivalent to `8` in decimal (because the rightmost digit represents `8 * 1` and the leftmost digit represents `8 * 0`).

- **`int z = 0xBeef;`**
  - `z` is assigned the hexadecimal value `0xBeef`.
  - In hexadecimal, `0xBeef` translates to `48879` in decimal. Here's the breakdown:
    - `B` in hexadecimal is `11` in decimal.
    - `E` in hexadecimal is `14` in decimal.
    - `E` in hexadecimal is `14` in decimal.
    - `F` in hexadecimal is `15` in decimal.
  - So, `0xBeef` equals `(11 * 16^3) + (14 * 16^2) + (14 * 16^1) + (15 * 16^0) = 48879` in decimal.

### Calculation:

- The expression `(x + y + z)` is calculated as follows:
  - `x = 10`
  - `y = 8`
  - `z = 48879`
- Therefore, the sum is `10 + 8 + 48879 = 48897`.

### Output:

- The `System.out.println` statement concatenates the string `"Try programiz.pro "` with the result of the calculation.
- The output will be:

```java
Try programiz.pro 48897
```






