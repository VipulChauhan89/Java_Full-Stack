# Week 2 — Day 12
## Abstraction & Interfaces in Java
### ***Goal: Learn how to hide implementation details and expose only necessary functionality.***

---
### 1. What is Abstraction
Abstraction means hiding internal details and showing only essential features.

***Real-life example:***
```
Car → You use steering & brakes
      You don’t see engine internals
```

---
### 2. Why Abstraction
* Reduces complexity
* Improves code design
* Increases security
* Helps in building scalable systems

Used heavily in frameworks like `Spring Framework`

---
### 3. Ways to Achieve Abstraction
* Abstract Class
* Interface

---
### 4. Abstract Class
A class that cannot be instantiated and may contain abstract methods.

***Syntax:***
```java
abstract class Animal {

    abstract void sound();

    void sleep(){
        System.out.println("Sleeping...");
    }
}
```

---
### 5. Implementing Abstract Class
```java
class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }
}
```

***Usage:***
```java
Animal obj = new Dog();
obj.sound();
obj.sleep();
```

---
### 6. Interface
An interface is a blueprint with only abstract methods (by default).

***Syntax:***
```java
interface Animal {

    void sound();
}
```

---
### 7. Implementing Interface
Use implements keyword.
```java
class Dog implements Animal {

    public void sound(){
        System.out.println("Dog barks");
    }
}
```

---
### 8. Multiple Inheritance using Interface
Java supports multiple inheritance via interfaces.
```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show(){
        System.out.println("A");
    }

    public void display(){
        System.out.println("B");
    }
}
```

---
### 9. Abstract Class vs Interface

|Feature|Abstract Class|Interface|
|---|---|---|
|Methods|Abstract + Normal|Abstract (default)|
|Variables|Can have instance variables|Only constants|
|Inheritance|Single|Multiple|
|Keyword|extends|implements|

---
### 10. When to Use What
**Use Abstract Class when:**
* Classes share common behavior
* Need constructors and fields

**Use Interface when:**
* Only behavior is needed
* Want multiple inheritance
* Designing APIs

---
### 11. Real Backend Use
***Example:***
```
PaymentService (interface)
    → UPIService
    → CardService
```
This design is used in backend frameworks like `Spring Boot`

---
### 12. Key Concepts to Remember
* Abstraction hides implementation details
* Abstract class → partial abstraction
* Interface → full abstraction
* Use extends for abstract class
* Use implements for interface
* Interfaces support multiple inheritance

---
## Practice Programs
* Animal System
    ```
    Animal (abstract)
    → Dog
    → Cat
    ```
* Shape Interface
    ```
    Shape → area()
    Circle → area()
    Rectangle → area()
    ```
* Payment System
    ```
    Payment → pay()
    UPI → pay()
    Card → pay()
    ```
* Vehicle Interface
    ```
    Vehicle → start()
    Car → start()
    Bike → start()
    ```
