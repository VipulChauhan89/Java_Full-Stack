# Week 01 — Day 04
## Control Flow in Java
### ***Goal: Learn how a program makes decisions and repeats tasks.***

---
### 1. What is Control Flow
Control flow determines the order in which program statements execute.

**Types:**
* Decision making
* Looping (repetition)
* Jump statements

---
### 2. if Statement
Used to execute code only if a condition is true.

***Syntax:***
```java
if(condition){
    // code
}
```

***Example:***
```java
int age = 20;

if(age >= 18){
    System.out.println("Eligible to vote");
}
```

---
### 3. if–else Statement
Executes one block if true, another if false.

***Syntax:***
```java
if(condition){
    // true block
}
else{
    // false block
}
```

***Example:***
```java
int number = 5;

if(number % 2 == 0){
    System.out.println("Even");
}
else{
    System.out.println("Odd");
}
```

---
### 4. else-if Ladder
Used when multiple conditions exist.

***Syntax:***
```java
if(condition1){
}
else if(condition2){
}
else{
}
```

***Example:***
```java
int marks = 85;

if(marks >= 90){
    System.out.println("Grade A");
}
else if(marks >= 75){
    System.out.println("Grade B");
}
else{
    System.out.println("Grade C");
}
```

---
### 5. switch Statement
Used for multiple fixed choices.

***Syntax:***
```java
switch(variable){
    case value1:
        break;
    case value2:
        break;
    default:
}
```

***Example:***
```java
int day = 2;

switch(day){
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

***Important:***
* `break` stops execution.
* `default` runs if no case matches.

---
### 6. Loops
Loops execute code multiple times.

**Types:**
* for loop
* while loop
* do-while loop

---
### 7. for Loop
Used when number of iterations is known.

***Syntax:***
```java
for(initialization; condition; update){
    // code
}
```

***Example:***
```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

***Output:***
```
1
2
3
4
5
```

---
### 8. while Loop
Used when iterations depend on a condition.

***Syntax:***
```java
while(condition){
    // code
}
```

***Example:***
```java
int i = 1;

while(i <= 5){
    System.out.println(i);
    i++;
}
```

---
### 9. do-while Loop
Executes at least once, even if condition is false.

***Syntax:***
```java
do{
    // code
}
while(condition);
```

***Example:***
```java
int i = 1;

do{
    System.out.println(i);
    i++;
}
while(i <= 5);
```

---
### 10. break Statement
Used to terminate loop or switch.

***Example:***
```java
for(int i=1;i<=10;i++){
    if(i==5){
        break;
    }
    System.out.println(i);
}
```

***Output:***
```
1
2
3
4
```

---
### 11. continue Statement
Skips current iteration.

***Example:***
```java
for(int i=1;i<=5;i++){
    if(i==3){
        continue;
    }
    System.out.println(i);
}
```

***Output:***
```
1
2
4
5
```

---
### 12. Nested Loops
A loop inside another loop.

***Example:***
```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

***Output:***
```
* * *
* * *
* * *
```

---
### 13. Key Concepts to Remember
* `if` → single condition
* `if-else` → two outcomes
* `else-if` → multiple conditions
* `switch` → multiple fixed options
* `for` → known iterations
* `while` → condition-based loop
* `do-while` → executes at least once
* `break` → stop loop
* `continue` → skip iteration

---
## Practice Programs
**Write programs for:**

* Print numbers 1 to 100
* Check if a number is prime
* Print multiplication table

    ***Example:***
    ```
    5 x 1 = 5
    5 x 2 = 10
    ```
* Sum of numbers from 1 to n
* Number pattern
    ```
    *
    **
    ***
    ****
    ```
