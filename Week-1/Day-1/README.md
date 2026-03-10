# Week 1 — Day 1
## Java Basics: How Java Works
### **Goal:** ***Understand how Java programs run internally.***

### 1. What is Java
* High-level programming language.
* Object-Oriented.
* Platform Independent.
* Write Once Run Anywhere `(WORA)`.

***Meaning:*** Java code can run on any system with JVM installed.

---
### 2. JDK, JRE, JVM
**JDK (Java Development Kit)**

***Contains:***
* Compiler `(javac)`
* Debugger
* Tools
* JRE

***Purpose:*** Used for developing Java programs.

---
**JRE (Java Runtime Environment)**

***Contains:***
* JVM
* Libraries
* Runtime files

***Purpose:*** Used to run Java programs.

---
**JVM (Java Virtual Machine)**

***Responsibilities:***
* Executes bytecode
* Memory management
* Garbage collection
* Platform independence

***JVM converts `bytecode → machine code`.***

---
### 3. Java Program Execution Flow
```shell
Hello.java
   ↓
javac compiler
   ↓
Hello.class (bytecode)
   ↓
JVM
   ↓
Machine Code
   ↓
Program Runs
```
***Steps:***
* Write code in `.java`
* Compile using `javac`
* Bytecode `.class` generated
* JVM executes bytecode.

---
### 4. Platform Independence
***Normal languages:***
```shell
Source Code → Machine Code → OS dependent
```

***Java:***
```shell
Source Code → Bytecode → JVM → Machine Code
```

***Because JVM exists for every OS.***

**Example:**
* Windows JVM
* Linux JVM
* Mac JVM

***Same bytecode runs everywhere.***

---
### 5. Basic Java Program Structure
***Example:***
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
**Important parts:**

* ***public class →*** class definition
* ***main() →*** program starting point
* ***System.out.println() →*** print output

---
### 6. main() Method
***Signature:***
```java
public static void main(String[] args)
```
***Meaning:***
|Keyword|Meaning|
|---|---|
|public|accessible everywhere|
|static|no object required|
|void|returns nothing|
|main|program entry point|
|String[] args|command line arguments|

---
### 7. Compilation Commands
**Compile program:***
```java
javac HelloWorld.java
```
***Run program:***
```java
java HelloWorld
```
***Note:*** Do not include .java while running.

---
### 8. Important Files
* Java source file
* `HelloWorld.java`
* Compiled bytecode
* `HelloWorld.class`

---
### 9. Key Concepts to Remember
* Java code compiles to bytecode.
* JVM runs the bytecode.
* JDK is used for development.
* JRE is used for execution.
* JVM provides platform independence.

---
## Practice (Very Important)
**Write and run 3 programs:**
* Print Hello World
* Print your name
* Print 3 lines of text

***Compile and run them manually.***
---
