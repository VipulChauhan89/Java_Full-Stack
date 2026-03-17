# Week 01 — Day 05
## Methods / Functions in Java
### ***Goal: Learn how to organize code into reusable blocks.***

---
### 1. What is a Method
A method is a block of code that performs a specific task and can be reused.

**Benefits:**
* Code reusability
* Better structure
* Easier debugging

***Example:***
```java
public static void greet(){
    System.out.println("Hello");
}
```

---
### 2. Method Syntax
```java
access_modifier return_type methodName(parameters){
    // code
}
```

***Example:***
```java
public static void printMessage(){
    System.out.println("Welcome to Java");
}
```

---
### 3. Calling a Method
A method runs only when it is called.

***Example:***
```
public class Test {
    
    public static void greet(){
        System.out.println("Hello Vipul");
    }

    public static void main(String[] args){
        greet();
    }
}
```

***Output*** `Hello Vipul`

---
### 4. Method with Parameters
Parameters allow input values to a method.

***Example:***
```java
public static void add(int a, int b){
    System.out.println(a + b);
}
```

***Calling:*** `add(5,3);`

***Output*** `8`

---
### 5. Method with Return Value
A method can return a result.

***Example:***
```java
public static int add(int a, int b){
    return a + b;
}
```

***Calling:***
```java
int result = add(5,3);
System.out.println(result);
```

***Output*** `8`

---
### 6. Method Types
#### 1. Method with no parameter and no return
```java
public static void display(){
    System.out.println("Hello");
}
```

#### 2. Method with parameter but no return
```java
public static void display(int number){
    System.out.println(number);
}
```

#### 3. Method with parameter and return value
```java
public static int square(int n){
    return n*n;
}
```

### 4. Method with return but no parameter
```java
public static int getNumber(){
    return 10;
}
```

---
### 7. Method Overloading
Same method name but different parameters.

***Example:***
```java
public static int add(int a,int b){
    return a+b;
}

public static int add(int a,int b,int c){
    return a+b+c;
}
```
This is called compile-time polymorphism.

---
### 8. Recursion (Basic Idea)
A method calling itself.

***Example: Factorial***
```java
public static int factorial(int n){
    if(n==1)
        return 1;

    return n * factorial(n-1);
}
```

**Factorial of 5** `5 × 4 × 3 × 2 × 1 = 120`

---
### 9. Stack Memory and Method Calls
When a method runs:
* A stack frame is created.
* After execution it is removed from stack.

***Example flow:***
```
main()
   ↓
add()
   ↓
return
```
This is called call stack.

---
### 10. Important Keywords
|Keyword|Meaning|
|---|---|
|public|accessible everywhere|
|static|no object needed|
|void|no return value|
|return|sends value back|

### 11. Key Concepts to Remember
* Methods break programs into smaller reusable parts.
* Methods can take parameters.
* Methods can return values.
* Method overloading allows same name with different parameters.
* Recursion allows self-calling functions.

## Practice Programs
**Write methods for:**
* Add two numbers
* Find factorial
* Check palindrome number
* Find maximum of 3 numbers
* Power function
`Example: power(2,3) = 8`

