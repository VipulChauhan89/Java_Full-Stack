# Week 1 — Day 2

## Variables & Data Types
### ***Goal: Understand how data is stored and used in Java programs.***

---
### 1. Variable
***Definition:*** A variable is a named memory location used to store data.

***Example:*** `int age = 22;`

**Meaning:**

* ***`int` →*** data type
* ***`age` →*** variable name
* ***`22` →*** value stored

---
### 2. Variable Declaration

***Syntax:*** `datatype variableName;`

***Example:***
```java
int number;
double salary;
char grade;
```

---
### 3. Variable Initialization
Assigning a value to a variable.
```java
int age = 25;
double price = 99.99;
char grade = 'A';
```

----
### 4. Primitive Data Types
Java has 8 primitive data types.
|Type|Size|Example|
|---|---|---|
|byte|1 byte|byte b = 10;|
|short|2 bytes|short s = 100;|
|int|4 bytes|int x = 10;|
|long|8 bytes|long num = 1000L;|
|float|4 bytes|float f = 10.5f;|
|double|8 bytes|double d = 10.5;|
|char|2 bytes|char c = 'A';|
|boolean|1 bit|boolean b = true;|

***Example program:***
```java
int age = 22;
double height = 5.9;
char grade = 'A';
boolean passed = true;
```

---
### 5. Non-Primitive Data Types
These store references to objects.
***Examples:***
* String
* Arrays
* Classes
* Objects

***Example:*** `String name = "Vipul";`

---
### 6. Type Casting
#### 1. Implicit Casting (Automatic)
`Smaller type → larger type.`
```java
int num = 10;
double value = num;
```
#### 2. Explicit Casting (Manual)
`Larger type → smaller type.`
```java
double num = 10.5;
int value = (int) num;
```
***Output becomes:*** `10` (decimal removed)

---
### 7. Constants
Use `final` to make variables constant.
```java
final double PI = 3.14159;
```
***Meaning:*** Value cannot change later.

---
### 8. Naming Rules for Variables
***Allowed:***
* age
* studentName
* total_marks
* price1

***Not allowed:***
* 1number
* class
* int

***Rules:***
* Cannot start with number
* Cannot use Java keywords
* Case sensitive

---
### 9. Multiple Variables
```java
int a = 10, b = 20, c = 30;
```
---
### 10. Printing Variables
```java
int age = 22;
System.out.println(age);
```
***Output:*** `22`

***Example:***
```java
String name = "Vipul";
int age = 22;

System.out.println("Name: " + name);
System.out.println("Age: " + age);
```

---
### 11. Key Concepts to Remember
* Variables store data in memory.
* Java has 8 primitive types.
* Primitive types store values directly.
* Non-primitive types store references.
* final makes constants.
* Type casting converts data types.

## Practice Programs
**Write programs for:**
* Store and print name, age, and city.
* Convert Celsius to Fahrenheit.
**Formula:** `F = (C × 9/5) + 32`
* Calculate area of circle.
**Formula:** `Area = π × r × r`
* Swap two numbers.
