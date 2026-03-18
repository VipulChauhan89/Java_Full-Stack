# Week 2 — Day 11
## Polymorphism in Java
### ***Goal: Learn how one object/method can take multiple forms.***

---
### 1. What is Polymorphism
Polymorphism means "many forms".

***In Java, it allows:*** `One method → different behaviors`

---
### 2. Types of Polymorphism
* Compile-Time Polymorphism (Method Overloading)
* Runtime Polymorphism (Method Overriding)

---
### 3. Method Overloading (Compile-Time)
Same method name but different parameters.

***Example:***
```java
class MathUtil {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}
```

***Usage:***
```java
MathUtil m = new MathUtil();

System.out.println(m.add(2,3));      // 5
System.out.println(m.add(2,3,4));    // 9
```

---
### 4. Rules for Method Overloading
* Method name must be same
* Parameters must be different
* Return type can be same or different

---
### 5. Method Overriding (Runtime Polymorphism)
Child class redefines parent method.

***Example:***
```java
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
```

---
### 6. Runtime Behavior (Dynamic Method Dispatch)
***Example:***
```java
Animal obj = new Dog();
obj.sound();
```

***Output:*** `Dog barks`

***Explanation:***
```
Reference type → Animal
Object type → Dog
```
Method of Dog executes at runtime

---
### 7. Upcasting
Parent reference → Child object
```java
Animal a = new Dog();
```

***Used for:***
* Flexibility
* Runtime polymorphism

---
### 8. Why Polymorphism is Important
***Advantages:***
* Code flexibility
* Code reusability
* Loose coupling
* Easy extension

Used heavily in frameworks like `Spring Boot`

---
### 9. Real-Life Example
```
Payment method:
   Pay() → UPI / Card / NetBanking
```
Same method → different behavior

---
### 10. Difference: Overloading vs Overriding
|Feature|Overloading|Overriding|
|---|---|---|
|Time|Compile-time|Runtime|
|Class|Same class|Parent + Child|
|Parameters|Different|Same|
|Purpose|Flexibility|Dynamic behavior|

---
### 11. Key Concepts to Remember
* Polymorphism = many forms
* Overloading = same method, different parameters
* Overriding = same method, different implementation
* Runtime polymorphism uses inheritance + overriding
* Upcasting enables dynamic behavior

---
## Practice Programs
* Calculator (Overloading)
    ```
    add(int, int)
    add(int, int, int)
    add(double, double)
    ```
* Animal Sound (Overriding)
    ```
    Animal → sound()
    Dog → sound()
    Cat → sound()
    ```
* Shape Area
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
