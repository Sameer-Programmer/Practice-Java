# Introduction

- An array is an indexed collection of a fixed number of homogeneous data elements.
- The main advantage of arrays is that we can represent a large number of values using a single variable,
  thereby improving the readability of the code.
-  However, the main disadvantage of arrays is that they are fixed in size; once we create an array, there is no way to increase or decrease its size based on our requirements. Therefore, to use arrays, we must know the size in advance, which may not always be possible.

# Array Declaration

## One-Dimensional Array Declaration

- `int[] x;` — Valid. Best practice recommended because the name is clearly separated from the type.
- `int []x;` — Valid.
- `int x[];` — Valid.

At the time of declaration, we cannot specify the size; otherwise, we will get a compile-time error.

- `int[6] x;` — Invalid.
- `int[] x;` — Valid.

## Two-Dimensional Array Declaration

- `int[][] x;` — Valid.
- `int [][]x;` — Valid.
- `int x[][];` — Valid.
- `int[] []x;` — Valid.
- `int[] x[];` — Valid.
- `int []x[];` — Valid.

### Which of the following is valid?

- `int[] a,b;` — Valid. `a` is 1-dimensional, `b` is 1-dimensional.
- `int[] a[],b;` — Valid. `a` is 2-dimensional, `b` is 1-dimensional.
- `int[] a[],b[];` — Valid. `a` is 2-dimensional, `b` is 2-dimensional.
- `int[] []a,b;` — Valid. `a` is 2-dimensional, `b` is 2-dimensional.
- `int[] []a,b[];` — Valid. `a` is 2-dimensional, `b` is 3-dimensional.
- `int[] []a,[]b;` — Invalid. If we want to specify the dimension before the variable, this facility is applicable only for the first variable in a declaration.

If we try to apply this for the remaining variables, we will get a compile-time error:

- `int[] []a,[]b,[]c;` — `a` is valid, `b` is invalid, `c` is invalid.

**Note:** `int [] []a,[]b;` — Invalid. If you want to declare the dimension before the variable, this facility is only for the first variable. If you apply it to the remaining variables, you will get a compile-time error.

## Three-Dimensional Array Declaration

The following declarations are all valid:

- `int[][][] a;`
- `int [][][]a;`
- `int a[][][];`
- `int[] [][]a;`
- `int[] a[][];`
- `int[] []a[];`
- `int[][] []a;`
- `int[][] a[];`
- `int [][]a[];`
- `int []a[][];`

### Array Creation
- **Note**  Every array in Java is a Object only , Hence We can Create array by 'new' Operator
- int [ ] a = new int [3];
- for every Array type Corressponding Classes are available, but these classes are part of java lang way , not avilable to the programmer Level
```
Example 1 for Single  Dimensional Array 
class HelloWorld {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        System.out.println(a.getClass().getName());
    }
}
output
java -cp /tmp/hsW7EE2UyK/HelloWorld
[I

=== Code Execution Successful ===
```
```
Example 2 for Two Dimensional Array 
class HelloWorld {
    public static void main(String[] args) {
        
        int[][] a = new int[5][3];
        System.out.println(a.getClass().getName());
    }
}
output
java -cp /tmp/hsW7EE2UyK/HelloWorld
[[I

=== Code Execution Successful ===
```
- corresponding class name for differnt Data types 
- `int[]` - `[I`
- `int[][]` - `[[I`
- `double[]` - `[D`
- `short[]` - `[S`
- `byte[]` - `[B`
- `boolean[]` - `[Z`
# Loopholes for Creating Arrays in Java

1. Array size must be specified at creation time:
   - `int[] x = new int[];`   // Invalid
   - `int[] x = new int[6];`   // Valid

2. Arrays with zero size are legal:
   - `int[] x = new int[0];`   // Valid

3. Negative array size results in runtime exception:
   - `int[] x = new int[-3];`  // Valid syntax, but throws RuntimeException: NegativeArraySizeException

4. Allowed data types for array size:
   - byte, short, char, and int
   - Examples:
     ```java
     int[] x = new int[10];    // Valid
     int[] x = new int['a'];   // Valid
     byte b = 20;
     int[] x = new int[b];     // Valid
     short s = 30;
     int[] x = new int[s];     // Valid
     int[] x = new int[10L];   // Invalid, Compile Error: possible loss of precision found long required int
     ```

5. Maximum array size:
   - 2,147,483,647 (maximum value of int)
   - `int[] x = new int[2147483647];`   // Valid, but may cause RuntimeException if insufficient heap memory
   - `int[] x = new int[2147483648];`   // Invalid, Compile Error: integer number too large

## Summary

Arrays in Java:
- Have fixed size
- Don't specify size during declaration
- Size is compulsory during creation
- Size accepts data types: int, short, byte, and char
- Array size can be zero
- Negative values cause runtime exception
- Maximum allowed array size is int range (2^31 - 1)
