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
-Bydefault Every integral Literal is of int type , But we can specify Explicitly as Long Type bu suffixed with small l or Capital L 
-

```
int x = 10; //valid
long l = 10 L ; // valid  but not a Good Practice 
long l = 10 l ; // valid
int x = 10L ; not valid -- as Here int we have Given we have given Literal as long L
```
There is no Direct way to specify byte and short literals Explicitly 
byte b = 10b ; // not valid
short s = 12s; // not valid 

Indirectly, we can specify that whenever we assign an integral literal to a `byte` variable, and if the value is within the range of `byte` or `short`, the compiler automatically treats it as a `byte` or `short` literal.

Examples:

1. `byte b = 10;` - Valid
2. `byte b1 = 127;` - Valid
3. `byte b2 = 128;` - Invalid
4. `short s = 32767;` - Valid
5. `short s1 = 32788;` - Invalid

## Floating Point Literals

- Generally  if we write float f =  123.456; // invalid
- It will through the compile time Error - Because Every Floating point  Literal (123.456) is by default it is `double data type`
-  Inorder to Represent float Particularly we have to write as
-  float f = 123.456f; // valid
-    float f = 123.456F; // valid

-    if we want to Represent double Explicitly we can write as
-    double d = 123.456D // valid
-    double d = 123.456d // valid
-    double d = 123.456// valid -- by default it is double


double d = 0786;   // invalid
double d1 = 0XFace; // valid

/*
0786 -- This is Integral Literal
-- Integral starts with zero means Octal
- Limits - 0 to 7 only
But Here 8 Came So invalid

0XFace -- This is Integral Literal
---- Integral starts with zero and X means Hexadecimal
- Limits - 0 to 9, a to f
All values are within limits, so this is valid
*/

double d = 10;
System.out.println(d); // Output: 10.0
### Integral Literal can be assigned to Floating point variable, it will automatically convert to floating point type

double d = 0786.0;  // valid
double d = 0Xace.0; // invalid

### We can not assign floating point Literals to integral  data types
1. double d = 10; valid 
2. int x = 10.0 ; invalid

### Note
-We can specify floating point Literal even in Exponential form (scientic notation )

-double d = 1.2 e3; // 1.2 * 10^3
sop (d) = 1200

float f =1.2 e3; not valid - found double
float f = 1.2e3f; valid

## boolean Data types 
## boolean Literals 
1. The Only allowed values for boolean data type are true or false 
2.  boolean b = true ;
3. boolean b = 0; // invalid
4. boolean b = True; // invalid- variable not found 
5. boolean b = "True"  // invalid
6. Example
   ```
   class HelloWorld {
    public static void main(String[] args) {
        int x = 0 ;
        
        if (x){
         System.out.println("hello");
        } else {
        System.out.println("bye");
    }
}
ERROR!
/tmp/GKY1NY60aC/HelloWorld.java:11: error: reached end of file while parsing
}
 ^
1 error

=== Code Exited With Errors ===

### if always accepts Condition true or false but we have Given Zero , so It throws Error
  ### Similarly For While Loop also  
  ```
class HelloWorld {
    public static void main(String[] args) {
        boolean b  = 0 ;
        while (b) { 
            System.out.println("hello");
    }
}
}
```
ERROR!
/tmp/jnhJ2o8ngJ/HelloWorld.java:6: error: incompatible types: int cannot be converted to boolean
        boolean b  = 0 ;
                     ^
1 error

=== Code Exited With Errors ===
while always accepts Condition true or false but we have Given Zero , so It throws Error
