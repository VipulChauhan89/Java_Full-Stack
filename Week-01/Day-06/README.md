# Week 01 — Day 06
## Arrays in Java
### ***Goal: Learn how to store multiple values of the same type in one variable.***

---
### 1. What is an Array
An array is a collection of elements of the same data type stored in contiguous memory locations.

***Example:***
```
int[] numbers = {10, 20, 30, 40};
```

***Here:***
* `numbers` → array name
* `Elements` → 10,20,30,40

---
### 2. Why Arrays Are Used
***Instead of creating many variables:***
```java
int a = 10;
int b = 20;
int c = 30;
```

***Use an array:***
```java
int[] arr = {10,20,30};
```

***Advantages:***
* Easy data management
* Efficient memory usage
* Easier iteration using loops

---
### 3. Array Declaration
***Syntax:***
```java
datatype[] arrayName;
```

***Example:***
```java
int[] arr;
double[] prices;
char[] grades;
```

---
### 4. Array Initialization
**Method 1**
```java
int[] arr = new int[5];
```

***Meaning:*** `Array size = 5`

***Default values:***

|Type|Default|
|---|---|
|int|0|
|double|0.0|
|boolean|false|
|char|'\u0000'|

**Method 2**
***Direct initialization:***
```java
int[] arr = {10,20,30,40};
```

---
### 5. Accessing Array Elements
Array index starts from 0.
***Example:***
```java
int[] arr = {10,20,30};

System.out.println(arr[0]);
System.out.println(arr[1]);
```

***Output:***
```
10
20
```

---
### 6. Updating Array Elements
***Example:***
```java
int[] arr = {10,20,30};

arr[1] = 50;
```

***New array:*** `10 50 30`

---
### 7. Traversing an Array
Using for loop.

***Example:***
```java
int[] arr = {10,20,30,40};

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
```

***Important:*** `arr.length`

Returns array size.

---
### 8. Enhanced For Loop (For-Each)
Used for simpler traversal.

***Example:***
```java
int[] arr = {10,20,30};

for(int num : arr){
    System.out.println(num);
}
```

---
### 9. Multidimensional Arrays
Arrays inside arrays.

***Example:***
```java
int[][] matrix = {
    {1,2,3},
    {4,5,6}
};
```

***Access element:***
```java
System.out.println(matrix[1][2]);
```

***Output:*** `6`

---
### 10. Array Memory Concept
Arrays are stored in Heap Memory.

***Structure:***
```
Stack
  ↓
reference → Heap Memory
           [10][20][30][40]
```

***Important:***
Array variable stores reference address, not the actual values.

---
### 11. Array Index Rules
***Valid:*** `0 to length-1`

***Example:***
```
length = 5
index → 0 1 2 3 4
```

***Invalid access:*** `arr[5]`

***Error:*** `ArrayIndexOutOfBoundsException`

---
### 13. Key Concepts to Remember
* Arrays store multiple values of same type.
* Index starts from 0.
* Size is fixed after creation.
* Arrays are stored in heap memory.
* Use arr.length to get size.

---
## Practice Programs
***Write programs for:***
* Find maximum element in array
    
    ***Example***
    ```
    Input: 10 20 5 30
    Output: 30
    ```
* Reverse an array
    ```
    Input: 1 2 3 4
    Output: 4 3 2 1
    ```
* Sum of array elements
* Count even numbers in array
* Search element in array
    ```
    Input: 10 20 30
    Search: 20
    Output: Found
    ```

