# Week 1 — Day 7
## Strings in Java
### ***Goal: Learn how to store and manipulate text data.***

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
### 13. Key Concepts to Remember
* String = sequence of characters.
* Strings are immutable.
* Stored in String Pool.
* Use .equals() for comparison.
* .length() gives string size.
* StringBuilder and Stringbuffer are mutable but StringBuilder is faster.

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

## ✅ After Week 1, you now understand:
* Java basics
* Variables
* Operators
* Control flow
* Methods
* Arrays
* Strings

This is the foundation every Java backend developer needs.
