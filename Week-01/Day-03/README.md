# Week 01 — Day 03
## Operators in Java

### ***Goal: Learn how to perform operations on variables and values.***

---
### 1. What is an Operator
An operator is a symbol that performs an operation on operands.

***Example:*** `int sum = 10 + 5;`

**Here:**
* ***`+`→*** operator
* ***`10` and `5` →*** operands

---
### 2. Types of Operators in Java
**Main categories:**
* Arithmetic Operators
* Relational Operators
* Logical Operators
* Assignment Operators
* Unary Operators
* Bitwise Operators

---
### 3. Arithmetic Operators
Used for mathematical calculations.
|Operator|Meaning|Example|
|---|---|---|
|+|Addition|a + b|
|-|Subtraction|a - b|
|*|Multiplication|a * b|
|/|Division|a / b|
|%|Modulus (remainder)|a % b|

***Example:***
```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---
### 4. Relational Operators
Used for comparisons.\
Return `type → boolean`(true / false)

|Operator|Meaning|
|---|---|
|==|Equal to|
|!=|Not equal|
|>|Greater than|
|<|Less than|
|>=|Greater or equal|
|<=|Less or equal|

***Example:***
```java
int a = 10;
int b = 5;

System.out.println(a > b); // true
System.out.println(a == b); // false
```

---
### 5. Logical Operators
Used for combining conditions.

|Operator|Meaning|
|---|---|
|&&|Logical AND|
|\|\||Logical OR|
|!|Logical NOT|

***Example:***
```java
int age = 20;

System.out.println(age > 18 && age < 30);
```
***Output:*** `true`

***Explanation:*** Both conditions must be true.

---
### 6. Assignment Operators
Used to assign values to variables.

|Operator|Example|Meaning|
|---|---|---|
|=|a = 5|assign|
|+=|a += 2|a = a + 2|
|-=|a -= 2|a = a - 2|
|*=|a *= 2|a = a * 2|
|/=|a /= 2|a = a / 2|

***Example:***
```java
int a = 10;
a += 5;

System.out.println(a);
```
***Output:*** `15`

---
### 7. Unary Operators
Operate on one operand.

|Operator|Meaning|
|---|---|
|+|positive|
|-|negative|
|++|increment|
|--|decrement|

***Example:***
```java
int x = 5;

x++;
System.out.println(x);
```
***Output:*** `6`

---
### 8. Pre Increment vs Post Increment
#### Post Increment
```java
int x = 5;
System.out.println(x++);
```
***Output:*** `5`

**Then x becomes 6.**

#### Pre Increment
```java
int x = 5;
System.out.println(++x);
```
***Output:*** `6`

**Value increases before printing.**

---
### 9. Bitwise Operators (Basic Idea)
Operate on binary numbers.

|Operator|Meaning|
|---|---|
|&|AND|
|\||OR|
|^|XOR|
|~|NOT|

***Example:***
```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

---
### 10. Operator Precedence
**Order of execution:**
* 1 `(` `)`
* 2 `++` `--`
* 3 `*` `/` `%`
* 4 `+` `-`
* 5 Relational operators
* 6 Logical operators
* 7 Assignment

***Example:*** `int result = 10 + 5 * 2;`

***Output:*** `20`

**Because `*` executes first.**

---
### 11. Key Concepts to Remember
* Arithmetic operators perform math operations.
* Relational operators return true/false.
* Logical operators combine conditions.
* Assignment operators update variables.
* `++` and `--` increase or decrease values.
* Operator precedence controls execution order.

## Practice Programs
**Write programs for:**
* Simple calculator
    * ***Input:*** `a = 10`, `b = 5`
    * ***Output:***
        * Addition
        * Subtraction
        * Multiplication
        * Division
* Even or Odd
    * Use `%` operator.
* Find largest of 3 numbers
* Check if number is positive or negative
