### In Java, Every Variable and Regular Expression Should have a Data type

### Each and Every Data type is cleared defined


## Data Types
### Numeric Data Types



### Integral Data Types
1. byte
2. int
3. short 
4. long

### Floating Data Types
- float
- double

### Non Numeric Data Types 
1. boolean
2. char


### Except boolean and char All the primitive data types are signed Data Types.

### Example 
1. int x = + 10; // valid
2. int y = -10;// valid 

3.boolean b =+ or - true; not valid
4.char = + or - a ; not valid.

### Byte

When working with streams, either through files or networks, the best data types to use are generally byte-based data types.

- **Range**: -128 to 127
- **One Byte**: 8 bits
- **First Bit**: Most Significant Bit (MSB), followed by 7 bits representing powers of 2, calculated as:

  \[
  2^0 + 2^1 + 2^2 + 2^3 + 2^4 + 2^5 + 2^6 = 1 + 2 + 4 + 8 + 16 + 32 + 64 = 127
  \]

Thus, the range of a byte is -128 to 127.

### Short

- **Size**: 2 bytes (16 bits)
- **Range**: From -2^15 to 2^15 - 1

`short` is a rarely used data type. It was more commonly used in 1995, particularly when 16-bit processors were prevalent.
### INT

`int` is the most common data type in Java.

- **Size**: 4 bytes (32 bits)
- **Range**: From -2^31 to 2^31 - 1

Sometimes, `int` is not enough to represent large values, and in such cases, we need to use `long` data types.

-**Example**: The distance traveled by light in 1,000 days. To hold this value, `int` is not sufficient. 

Light travels 126,000 miles per second. Therefore, the distance traveled in 1,000 days is:

126,000 * 60 * 60 * 24 * 1,000 miles.

-**Example 2**: The number of characters in a file.

- **File**: Contains lakhs of pages.
- **Each Page**: 100 lines.
- **Each Line**: 1000 characters.

The `f.length()` method returns the number of characters present in the file. The `length()` method in the `File` class returns a `long`, not an `int`. It can be used as follows:

- java
- long l = f.length();


### long

- **Size**: 8 bytes (64 bits)
- **Range**:From -2^63 to 2^63 - 1

Note that the range has been corrected to reflect the actual range of a `long` data type, which is from `-2^63` to `2^63 - 1`.
### Floating Point Data Types

| Data Type | Precision         | Decimal Values           | Size   |
|-----------|-------------------|--------------------------|--------|
| `float`   | Single Precision   | Up to 6-7 decimal places  | 4 bytes |
| `double`  | Double Precision   | Up to 15-16 decimal places | 8 bytes |

### boolean 
- Allowed only `true` or `false`  
- **Size**: NA - dependent on Virtual Machine
- **Range**: NA  
```public class T2 {
    public static void main(String[] args) {
        while (true)
            System.out.println("sameer");
    }
}
```
- The while loop is a control flow statement that repeatedly executes a block of code as long as the specified condition is true.
```public class T2 {
    public static void main(String[] args) {
        while (true)
            System.out.println("sameer");
    }
}
```
- In this case, the condition is false, so the code inside the while loop will never be executed.


### Example 3 
```public class T2 {
    public static void main(String[] args) {
        while (1)
            System.out.println("sameer");
    }
}
```
- Error is While loop , incompatable Data type Found int , required boolean
- - Default value of boolean  is `false` 

- # char data type 
  # Java `char` Data Type

- **Size:** 2 bytes
- **Encoding:** Unicode-based

## Java and Unicode

Java uses the Unicode standard to represent characters. This allows Java to support a wide range of characters from various languages, including English, Hindi, Telugu, Tamil, Chinese, and more.

## Older Languages: C, C++

- **Encoding:** ASCII-based
- **Allowed Characters:** ≤ 256
  - English Alphabets (both uppercase and lowercase)
  - Digits (`0` to `9`)
  - Special Characters
- **Size:** 8 bits (1 byte) is enough to represent these 256 characters.

### Limitations of ASCII

In languages like C and C++, the ASCII standard restricts the character set to 256 possible characters, which primarily includes English alphabets, digits, and a few special characters. This limitation makes it difficult to represent characters from other languages like Hindi, Telugu, Tamil, Chinese, etc.

## Advantages of Unicode in Java

With Unicode in Java, you can represent characters not only from the basic ASCII set but also from almost all languages across the world, making Java highly versatile in handling internationalization.


- Default value of char is zero  and it represents the space character
