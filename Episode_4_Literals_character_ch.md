# `char` Data Type in Java

## Overview
- **Size**: `char` in Java is a 16-bit data type, which means it can hold any character represented by a 16-bit unsigned integer (i.e., values between `0` and `65535`).

## Ways to Specify `char` Literals

### 1. Single Character within Single Quotes
- **Example**: 
  ```java
  char ch = 'a';
  ```
- This is the most common way to specify a `char`. The character must be enclosed within single quotes.

### 2. Unicode Representation
Unicode Representation will be `'\uXXXX'`  Here 4XXXX means 4 Numerical Digits 
-- single quote backslash U 4 Numerical digits single quote
- **Example**: 
  ```java
  char ch = '\u0041'; // This is 'A'
  ```
- This represents the character using a Unicode escape sequence. The value is provided as a hexadecimal number following `\u`.

### 3. Decimal Representation
- **Example**: 
  ```java
  char ch = 97; // This is 'a'
  ```
- You can directly assign an integer value that corresponds to the Unicode value of a character.

### 4. Octal and Hexadecimal Representation
- **Example**: 
  ```java
  char ch = 0777; // This is a character with Unicode value 511
  ```
  ```java
  char ch = 0xBeef; // This is a character with Unicode value 48879
  ```
- The value can be specified using octal (starting with `0`) or hexadecimal (starting with `0x` or `0X`) notation.

## Important Points

### Single Character in Single Quotes
- **Valid**: 
  ```java
  char ch = 'a';
  ```
- **Invalid**: 
  ```java
  char ch = a; // No quotes, so it's not a valid character.
  ```
- **Invalid**: 
  ```java
  char ch = "a"; // Double quotes indicate a string, not a `char`.
  ```
- **Invalid**: 
  ```java
  char ch = 'ab'; // Multiple characters within single quotes are not allowed for a `char`.
  ```

### Character Ranges
- The `char` data type can hold values between `0` and `65535`.
- **Invalid**: 
  ```java
  char ch = 65536; // Exceeds the valid range for a `char`.
  ```
- Floating-point values (e.g., `97.0`) are not allowed for `char`.

## Example Code

```java
class HelloWorld {
    public static void main(String[] args) {
        char ch1 = 'a';        // Valid: 'a' is a character.
        // char ch2 = a;       // Invalid: No quotes around 'a'.
        // char ch3 = "a";     // Invalid: "a" is a string, not a char.
        // char ch4 = 'ab';    // Invalid: Multiple characters are not allowed.
        char ch5 = 97;         // Valid: 97 is the Unicode for 'a'.
        char ch6 = 0777;       // Valid: Octal value.
        char ch7 = 0xBeef;     // Valid: Hexadecimal value.
        char ch8 = 65535;      // Valid: Maximum value for char.
        // char ch9 = 65536;   // Invalid: Exceeds char range.
        // char ch10 = 97.0;   // Invalid: Float is not allowed.
        
        System.out.println(ch1); // Output: a
        System.out.println(ch5); // Output: a
        System.out.println(ch6); // Output: Character corresponding to octal 0777
        System.out.println(ch7); // Output: Character corresponding to hexadecimal 0xBeef
        System.out.println(ch8); // Output: Character corresponding to 65535
    }
}
```

### Output
- `ch1` will print `a`.
- `ch5` will also print `a`.
- `ch6`, `ch7`, and `ch8` will print the characters corresponding to their respective Unicode values.
## Escape Characters in Java

Every escape character is a valid character literal in Java. Here are some examples:

- `'\n'` = New Line
- `'\t'` = Horizontal Tab
- `'\r'` = Carriage Return
- `'\b'` = Backspace
- `'\f'` = Form Feed

### Escape Characters in Java

In Java, we have the following escape characters:

1. `'\n'` - New Line
2. `'\t'` - Horizontal Tab
3. `'\r'` - Carriage Return
4. `'\b'` - Backspace
5. `'\f'` - Form Feed

### Example Usage
char ch = '\n';  // New Line
char ch = '\t';  // Horizontal Tab
char ch = '\m';  // Illegal Escape Character (Not valid)


| S.NO | Escape Character | Description                                 |
|------|------------------|---------------------------------------------|
| 1    | `\n`             | New Line                                    |
| 2    | `\t`             | Horizontal Tab                              |
| 3    | `\r`             | Carriage Return                             |
| 4    | `\b`             | Backspace                                   |
| 5    | `\f`             | FormFeed                                    |
| 6    | `\'`             | To Print Symbol of Single Quote `'`         |
| 7    | `\"`             | To Print Symbol of Double Quote `"`         |
| 8    | `\\`             | To Print Symbol of Single Slash `\`         |


### String Literals in Java
Any sequence of characters within double quotes is called a String Literal.
Example:

String s = "sameer";


### Integral Data Types: Literals Representation

**Versions Before 1.7:**
Until version 1.7, integral literal values could be specified in the following ways:
1. Decimal Form
2. Octal Form
3. Hexadecimal Form

**Versions 1.7 and Onwards:**
From version 1.7 onwards, literal values can also be specified in binary form. 
- **Allowed Digits:** `0` and `1`
- **Prefix:** Literal values should be prefixed with `0b` or `0B`
- **Example:** `int x = 0b1111;`

**Usage of Underscore Symbol in Numeric Literals:**
From version 1.7 onwards, you can use the underscore symbol between digits of numeric literals.
- **Examples:**
  - `double d = 123456.789;`
  - `double d = 1_23_456.7_89;`
  - `double d = 123_456.7_8_9;`

**Note:** The underscore symbol applies only within `.java` files. 

**Advantage:** This improves readability of the code. 

At the time of compilation, these underscores will be removed automatically. Thus, the above lines will be compiled as:
```java
double d = 123456.789;
```
-- 
double d = 1_________2___3__5_6___.7_8_9 // valid
We can give n number of underscores No Problem 


We have to Use Underscore only between Digits 
1. double d = _123456.789; invalid
2. double d = 1_23_456_.7_89;invalid
3 .double d = 123_456.7_8_9_;invalid


### 8 byte we can Assign to 4 byte float variable because Both are Following  Different Memory Representation Internally 

```
class HelloWorld {
    public static void main(String[] args) {
       // char ch = 0XBED; // valid
          float ch = 10l;
        System.out.println(ch);
    }
}
```

### Value Assignments

We can assign a `byte` value to a `short`. The assignment hierarchy is as follows:

- `int` → `long`
- `short` → `int`
- `char` → `int`
- `long` → `float`
- `float` → `double`

The complete type hierarchy for implicit widening conversions is:

```plaintext
byte → short → int → long → float → double
