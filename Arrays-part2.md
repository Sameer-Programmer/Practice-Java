# Two-Dimensional Arrays in Java

In Java, a Two-Dimensional Array is often implemented using an "Array of Arrays" approach rather than a matrix style. The main advantage of this approach is improved memory utilization.

```java
int[] x = new int[3];

class HelloWorld {
    public static void main(String[] args) {
        int[] x = new int[5];
        
        System.out.println(x[0]);
    }
}
Output: 0
```
# Key Points

- **toString() Method:**  
  Whenever we try to print any reference variable, the `toString()` method is called internally. By default, this method returns a string in the following form: `classname@hashcodeinHexadecimalForm`.

- **Default Initialization:**  
  When an array is created, every element is automatically initialized with default values. If you try to perform any operation on `null`, a runtime exception will occur, specifically a `NullPointerException`.

- **Default Values:**  
  Once an array is created, each element is initialized to its default value, which for integers is `0`. If these default values are not satisfactory, you can override them with custom values.

- **Array Index Out of Bounds:**  
  If you try to access an array element with an out-of-range index, whether it is a positive or negative integer, you will encounter a runtime exception known as `ArrayIndexOutOfBoundsException`.



  ![image](https://github.com/user-attachments/assets/d7ccf1e5-fcfb-41c6-a157-cef93c7f4824)

