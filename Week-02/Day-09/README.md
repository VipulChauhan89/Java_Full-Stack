# Week 02 — Day 09
## Encapsulation & Access Modifiers
### ***Goal: Learn how to protect data and control access in OOP programs.***

---
### 1. What is Encapsulation
Encapsulation means wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data.

***Idea:*** `Data + Methods = Class`

***Purpose:***
* Data security
* Controlled access
* Better code structure

---
### 2. How Encapsulation is Achieved
***Steps:***
* Make variables private
* Provide getter and setter methods

***Example:***
```java
class Student {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
```

***Usage:***
```java
Student s = new Student();

s.setName("Vipul");

System.out.println(s.getName());
```

---
### 3. Getter and Setter Methods
**Getter**

Used to read data.
```java
public String getName(){
    return name;
}
```
***Setter***

Used to update data.
```java
public void setName(String name){
    this.name = name;
}
```

---
### 4. Why Encapsulation is Important
***Advantages:***
* Protects data
* Allows validation
* Improves maintainability

***Example with validation:***
```java
public void setAge(int age){
    if(age > 0){
        this.age = age;
    }
}
```

---
### 5. Access Modifiers
Access modifiers control visibility of classes, variables, and methods.

***Types:***
* private
* default
* protected
* public

---
### 6. private
Accessible only inside the same class.

***Example:*** `private int age;`

Used for encapsulation.

---
### 7. default (no modifier)
Accessible only within the same package.

***Example:*** `int number;`

---
### 8. protected
***Accessible:***
* Same package
* Subclasses (even in other packages)

***Example:*** `protected int salary;`

---
### 9. public
Accessible from anywhere.

***Example:*** `public String name;`

---
### 10. Access Modifier Visibility Table

|Modifier|Same Class|Same Package|Subclass|Other Package|
|---|---|---|---|---|
|private|Yes|No|No|No|
|default|Yes|Yes|No|No|
|protected|Yes|Yes|Yes|No|
|public|Yes|Yes|Yes|Yes|

---
### 11. Encapsulation Example
```java
class BankAccount {

    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
```

***Usage:***
```java
BankAccount acc = new BankAccount();

acc.deposit(1000);

System.out.println(acc.getBalance());
```

***Output*** `1000`

---
### 12. Key Concepts to Remember
* Encapsulation = data hiding + controlled access.
* Variables should usually be private.
* Use getters and setters to access data.
* Access modifiers control visibility of class members.

---
## Practice Programs
* Student Class
    
    Fields:
    ```
    name
    age
    marks
    ```
    Make them private and create getter/setter methods.
* Bank Account System

    Methods:
    ```
    deposit()
    withdraw()
    checkBalance()
    ```
    Add validation.
* Employee Class

    Attributes:
    ```
    name
    salary
    department
    Use encapsulation properly.
