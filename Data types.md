In Java, Every Variable and Regular Expression Should have a Data type

### Each and Every Data type is cleared defined


## Data Types
### Numeric Data Types



### Integral Data Types
1. byte
2. int
3. short 
4. long

### Floating Data Types
float
double

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


