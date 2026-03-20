# Week 2 — Day 13
## Advanced OOP in Java
### ***Goal: Strengthen deep OOP concepts before moving to collections/backend.***

---
### 1. static Keyword
Used for class-level members (shared among all objects).

***Example:***
```java
class Student {
    static String college = "ABC";
}
```

***Key Points:***
* Shared across all objects
* Memory allocated once
* Can be accessed without object
* `Student.college;`

---
### 2. final Keyword
Used to restrict modification.

***Uses:***
* Variable → constant
* Method → cannot override
* Class → cannot extend

***Example:&&&
```java
final int x = 10;
```

---
### 3. Object Lifecycle
***Steps:***
* ***Step 1:*** Object creation (new)
* ***Step 2:*** Initialization (constructor)
* ***Step 3:*** Usage
* ***Step 4:*** Eligible for Garbage Collection

***Example:***
```java
Student s = new Student();
```

---
### 4. Method Chaining
Calling multiple methods in one line.

***Example:***
```java
System.out.println("hello".toUpperCase().trim());
```
Used heavily in backend frameworks.

---
## 5. Enums
Used to define fixed set of constants.

***Example:***
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
```

***Usage:***
```java
Day d = Day.MONDAY;
```

---
### 6. Record (Java 14+)
Used to create immutable data classes easily.

***Example:***
```java
record Student(String name, int age) {}
```

***Automatically provides:***
* constructor
* getters
* toString()

---
### 7. Static vs Dynamic Binding
**Static Binding (Compile-Time)**
* Method overloading
* Private/final/static methods

**Dynamic Binding (Runtime)**
* Method overriding
    
    ***Example:***
    ```java
    Animal a = new Dog();
    a.sound(); // decided at runtime
    ```

---
### 8. Pass by Value (Important)
Java is always pass by value.

***Example:***
```java
void change(int x){
    x = 100;
}
```
Original value does not change.

***For objects:***
* Reference is passed by value
* Object can still be modified

---
### 9. Packages
Used to organize classes.

***Example:***
```java
package com.myapp;
```

***Compile***
```
javac -d . Test.java
java com.demo.Test
```

***Benefits:***
* Avoid naming conflicts
* Better structure

---
### 10. Nested Classes
Class inside another class.

***Types:***
* Inner class
* Static nested class

***Example:***
```java
class Outer {

    class Inner {
        void show(){
            System.out.println("Inner class");
        }
    }
}
```

---
### 11. Initializer Blocks
Runs before constructor.
* Instance initializer
    ```java
    {
        System.out.println("Initializer block");
    }
    ```
* Static initializer
    ```
    static {
        System.out.println("Static block");
    }
    ```

---
### 12. Key Concepts to Remember
* static → shared data
* final → restrict changes
* Object lifecycle → creation to GC
* Enums → fixed constants
* Record → simple immutable class
* Java is pass by value
* Binding → compile-time vs runtime
* Packages → organize code
* Nested classes → inner structure

---
## Practice Programs
* Static Example
    ```
    Count number of objects using static variable
    ```
* Final Keyword
    ```
    Create constant PI and use it
    ```
* Enum Example
    ```
    Create enum for days and print values
    ```
* Pass by Value
    ```
    Try modifying primitive and object
    Observe behavior
    ```
* Package Example
    ```
    Create package and class inside it
    ```
* Nested Class
    ```
    Create outer and inner class
    Call inner method
    ```
