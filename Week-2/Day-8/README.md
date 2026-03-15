# Week 2 — Day 8
## Object-Oriented Programming (OOP) Basics in Java
### ***Goal: Understand Object-Oriented Programming, which is the foundation of modern backend development.***

---
### 1. What is OOP
Object-Oriented Programming (OOP) is a programming paradigm based on objects and classes.

***Main idea:***

Programs are built using objects that interact with each other.

***Benefits:***
* Code reusability
* Better organization
* Easier maintenance
* Real-world modeling

---
### 2. Class
A class is a blueprint or template for creating objects.

***Example:***
```java
class Student {
    String name;
    int age;
}
```

***Here:***
* Student → class
* name, age → attributes (variables)

---
### 3. Object
An object is an instance of a class.

***Example:***
```java
Student s1 = new Student();
```

***Explanation:***
* Student → class
* s1 → object
* new → creates object

***Accessing variables:***
```java
s1.name = "Vipul";
s1.age = 22;
```

---
### 4. Methods in Class
Classes can contain methods (functions).

***Example:***
```java
class Student {

    String name;

    void display(){
        System.out.println(name);
    }
}
```

***Calling method:***
```java
Student s = new Student();
s.name = "Vipul";
s.display();
```

---
### 5. Constructor
A constructor is a special method used to initialize objects.

***Rules:***
* Same name as class
* No return type
* Called automatically when object is created

***Example:***
```java
class Student {

    String name;

    Student(){
        name = "Unknown";
    }
}
```

***Object creation:***
```java
Student s = new Student();
```

---
### 6. Parameterized Constructor
Constructor that accepts parameters.

***Example:***
```java
class Student {

    String name;

    Student(String n){
        name = n;
    }
}
```

***Object creation:***
```java
Student s = new Student("Vipul");
```

---
### 7. this Keyword
this refers to current object.

***Example:***
```java
class Student {

    String name;

    Student(String name){
        this.name = name;
    }
}
```

**Why use it?**

To avoid confusion between instance variable and parameter.

---
### 8. Four Pillars of OOP
***Core principles:***
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

You will study them in the next days.

---
### 9. Example Program
```java
class Car {

    String brand;

    void start(){
        System.out.println("Car started");
    }
}

public class Main {

    public static void main(String[] args){

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.start();
    }
}
```

***Output*** `Car started`

---
### 10. Key Concepts to Remember
* Class → blueprint
* Object → instance of class
* Constructor → initializes object
* new → creates object
* this → refers to current object

---
## Practice Programs
***Write programs for:***
* Student Class
    
    ***Fields:***
    ```
    name
    age
    marks
    ```
    Create object and print details.
* Rectangle Class
    
    ***Methods:***
    ```
    area()
    perimeter()
    ```
* Car Class

    ***Attributes:***
    ```
    brand
    model
    price
    ```
    ***Method:***
    ```
    displayDetails()
    ```
* Bank Account Class

    ***Attributes:***
    ```
    accountNumber
    balance
    ```
    ***Methods:***
    ```
    deposit()
    withdraw()
    ```
