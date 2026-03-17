# Week 02 — Day 10
## Inheritance and Custom Exception in Java
### ***Goal: Learn how to reuse code and create relationships between classes and how to create custom exceptions.***

---
### 1. What is Inheritance
Inheritance allows one class to acquire properties and methods of another class.

***Idea:*** `Parent Class → Child Class`

***Benefits:***
* Code reuse
* Reduces duplication
* Improves maintainability

---
### 2. Syntax of Inheritance
Use extends keyword.
```java
class Parent {
    // properties and methods
}

class Child extends Parent {
    // additional features
}
```

---
### 3. Example
```java
class Animal {

    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("Barking...");
    }
}
```

***Usage:***
```java
Dog d = new Dog();

d.eat();
d.bark();
```

***Output:***
```
Eating...
Barking...
```

---
### 4. Types of Inheritance
* **Single Inheritance**
    ```
    A → B
    ```
* **Multilevel Inheritance**
    ```
    A → B → C
    ```
* **Hierarchical Inheritance**
    ```
        A
      /   \
     B     C
    ```
**Note:** Java does NOT support multiple inheritance with classes
(but supports it using interfaces — later topic).

---
### 5. super Keyword
Used to refer to parent class.

***Call parent method***
```java
super.methodName();
```

***Call parent constructor***
```java
super();
```

---
### 6. Constructor in Inheritance
Parent constructor is called automatically.

***Example:***
```java
class Animal {

    Animal(){
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog(){
        System.out.println("Dog constructor");
    }
}
```

***Output:***
```
Animal constructor
Dog constructor
```

---
### 7. Method Overriding
Child class provides its own implementation of parent method.

***Example:***
```java
class Animal {

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
}
```

---
### 8. @Override Annotation
Used to indicate method overriding.
```java
@Override
void sound(){
    System.out.println("Dog barks");
}
```

---
### 9. IS-A Relationship
Inheritance represents IS-A relationship.

***Example:***
```
Dog IS-A Animal
Car IS-A Vehicle
```

---
### 10. Access in Inheritance
* **Child class can access:**
    ```
    public
    protected
    ```
* **Cannot access:**
    ```
    private members of parent
    ```

---
### 11. What is Custom Exception
* User-defined exception
* Created for business logic errors

    **Example:** “Student not found”, “Invalid ID”

---
### 12. Why Use It
* Makes code clean & readable
* Separates logic errors from system errors
* Used in real backend systems

---
### 13. How to Create
* ***Step 1:*** Create Class
    ```java
    class StudentNotFoundException extends Exception {
        StudentNotFoundException(String message) {
            super(message);
        }
    }
    ```
* ***Step 2:*** Use It
    ```java
    Student findById(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.id == id) { 
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }
    ```
* ***Step 3:*** Handle It
    ```java
    try {
        Student s = service.findById(10);
    } catch (StudentNotFoundException e) {
        System.out.println(e.getMessage());
    }

---
### 14. Key Concepts to Remember
* Inheritance allows code reuse.
* Use extends keyword.
* Child class gets parent properties + methods.
* super refers to parent class.
* Method overriding changes behavior.
* Represents IS-A relationship.
* Use Custom exceptions for business rules only
* Keep messages clear for custom exceptions
* Don’t overuse custom exception

---
## Practice Programs
* Animal Example

    ***Create:***
    ```
    Animal → eat()
    Dog → bark()
    Cat → meow()
    ```
* Employee System

    ***Base class:*** `Employee`

    ***Child classes:***
    ```
    Manager
    Developer
    ```
* Vehicle System

    ***Base class:*** `Vehicle`

    ****Child:***
    ```
    Car
    Bike
    ```
    
    ***Add methods like:***
    ```
    start()
    stop()
    ```
* Create custom exceptions:
    * StudentNotFoundException
    * DuplicateStudentException
    * InvalidAgeException
    
    ***Create:*** Student (id, name, age)
    
    ***Add methods:***
    ```
    addStudent() → check duplicate → throw DuplicateStudentException
    findStudent() → if not found → throw StudentNotFoundException
    validateAge() → if invalid → throw InvalidAgeException
    ```
