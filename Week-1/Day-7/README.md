# Week 1 — Day 7
## Strings, Exception Handling and Input in Java
### ***Goal: Learn how to store and manipulate text data, Basics of Exception handling and Input in Java.***

---
### 1. What is a String
A String is a sequence of characters.

***Example:***
```java
String name = "Vipul";
```

***Here:***
* `String` → data type
* `"Vipul"` → string value

***Strings are used for:***
* Names
* Messages
* JSON data
* API responses

---
### 2. String Creation
**Method 1 (Most common)**
```java
String name = "Java";
```
**Method 2 (Using new keyword)**
```java
String name = new String("Java");
```

---
### 3. String is Immutable
Important concept.

Immutable = cannot be changed after creation

***Example:***
```java
String s = "Hello";
s = s + " World";
```
Java creates a new object, original string stays unchanged.

---
### 4. String Pool
Java stores strings in a special memory area called String Pool inside heap.

***Example:***
```java
String a = "Java";
String b = "Java";
```
Both variables refer to the same memory location.

---
### 5. String Length
Find number of characters.
```java
String text = "Hello";

System.out.println(text.length());
```

***Output*** `5`

---
### 6. Access Characters
Use charAt().

***Example:***
```java
String name = "Java";

System.out.println(name.charAt(0));
```

***Output*** `J`

Index starts from 0.

---
### 7. String Comparison
**equals()**

Checks content.
```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

***Output*** `true`

**== operator**

Checks memory reference.
```java
System.out.println(a == b);
```
May return true or false depending on memory.

---
### 8. substring()
Extract part of string.

***Example:***
```java
String text = "Programming";

System.out.println(text.substring(0,6));
```

***Output*** `Progra`

---
### 9. indexOf()
Find position of character.

***Example:***
```java
String text = "Java";

System.out.println(text.indexOf('v'));
```

***Output*** `2`

---
### 10. toUpperCase() and toLowerCase()
Convert case.

***Example:***
```java
String text = "Java";

System.out.println(text.toUpperCase());
System.out.println(text.toLowerCase());
```

***Output***
```
JAVA
java
```

---
### 11. String Concatenation
Join strings.
**Using +**
```java
String first = "Hello";
String second = "World";

String result = first + " " + second;
```

***Output*** `Hello World`

**Using concat()**
```java
String result = first.concat(second);
```

---
### 12. StringBuilder and StringBuffer (Mutable String)
Unlike String, StringBuilder and String buffer are mutable.

***Example:***

```java
StringBuilder sb = new StringBuilder("Hello");
StringBuffer sb1 = new StringBuffer("Hello");

sb.append(" World");
sb1.append(" World");

System.out.println(sb);
System,out.println(sb1);
```

***Output*** 
```java
Hello World
Hello World
```

**Key Differences**

|Feature |StringBuilder|StringBuffer|
|---|---|---|
|Thread-Safe|No (not synchronized)|Yes (all methods synchronized)|
|Performance|Faster (less overhead)|Slower (due to synchronization)|
|Use Case|Single-threaded environments|Multi-threaded environments|
|Introduced|Java 5 (JDK 1.5)|Java 1.0|
|Memory|Slightly less overhead|Slightly higher overhead|

---
### 13. What is Exception
An Exception is an error that occurs during program execution and stops normal flow.
***Example:*** `int a = 10 / 0;`

***Output:*** `Exception in thread "main" java.lang.ArithmeticException`

---
### 14. Why Exception Handling is Needed
***Without handling:***
* Program crashes ❌
* Bad user experience ❌

***With handling:***
* Program continues running ✅
* Errors handled gracefully ✅

---
### 15. Types of Exceptions
* Checked Exceptions
    * Checked at compile time
    * Must be handled
    
    ***Examples:***
    ```
    IOException
    SQLException
    ```
* Unchecked Exceptions
    * Occur at runtime
    
    ***Examples:***
    ```
    ArithmeticException
    NullPointerException
    InputMismatchException
    ```

---
### 16. try-catch Block
Used to handle exceptions.

***Syntax:***
```java
try {
    // risky code
} catch (Exception e) {
    // handling code
}
```

***Example:***
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

***Output:*** `Cannot divide by zero`

---
### 17. finally Block
Always executes (used for cleanup).

***Example:***
```java
try {
    int a = 10 / 2;
} catch (Exception e) {
    System.out.println("Error");
} finally {
    System.out.println("Execution completed");
}
```

---
### 18. Multiple catch Blocks
Handle different exceptions separately.
```java
try {
    int arr[] = new int[5];
    arr[10] = 50;
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of bounds");
}
```

---
### 19. throw Keyword
Used to manually throw exception.
```java
int age = -5;

if (age < 0) {
    throw new IllegalArgumentException("Invalid age");
}
```

---
### 20. throws Keyword
Used to declare exception.
```java
void readFile() throws IOException {
}
```

---
### 21. Common Exceptions

|Exception|Cause|
|---|---|
|ArithmeticException|Divide by zero|
|NullPointerException|Null reference|
|InputMismatchException|Wrong input type|
|ArrayIndexOutOfBoundsException|Invalid index|

---
### 22. Taking Input using Scanner
Used to read input from user.

***Example:***
```java
Scanner sc = new Scanner(System.in);

String input = sc.nextLine();
```

---
### 23. Input as String
Always take input as String for flexibility.

***Example:***
```java
String input = sc.nextLine();
```

---
### 24. Converting Input
Convert String to required type.
***Example:***
```java
int num = Integer.parseInt(input);
```

---
### 25. Checking Empty Input
Ensure input is not empty.

***Example:***
```java
if (input.isEmpty()) {
    System.out.println("Input cannot be empty");
}
```
---
### 26. Input Handling with Exception
```java
Scanner sc = new Scanner(System.in);

try {
    int num = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input!");
}
```

---
### 27. Key Concepts to Remember
* String = sequence of characters.
* Strings are immutable.
* Stored in String Pool.
* Use .equals() for comparison.
* .length() gives string size.
* StringBuilder and Stringbuffer are mutable but StringBuilder is faster.
* Exception = runtime error
* Use try-catch to handle errors
* finally always runs
* throw is used to create exception
* throws is used to declare exception
* Handle specific exceptions (not generic)
* Always take input as String
* Convert using parse methods
* Use try-catch for safety
* Validate before processing

## Practice Programs
***Write programs for:***

* Reverse a string
    
    Example
    ```
    Input: hello
    Output: olleh
    ```
* Check palindrome string

    Example
    ```
    Input: madam
    Output: Palindrome
    ```
* Count vowels in string

    Example
    ```
    Input: education
    Output: 5
    ```
* Check anagram

    Example
    ```
    listen
    silent
    Output: Anagram
    ```
* Count words in sentence

    Example
    ```
    Input: Java is powerful
    Output: 3
    ```
* Exception Handling for these Cases

    ```
    Handle divide by zero
    Handle invalid input
    ```
* Array Index Error
    
    ```
    Access invalid index and handle exception
    ```
* Age Validation
    
    ```
    Input: -1
    Output: Invalid age
    ```

## ✅ After Week 1, you now understand:
* Java basics
* Variables
* Operators
* Control flow
* Methods
* Arrays
* Strings
* Exception Handling
* Input

This is the foundation every Java backend developer needs.
