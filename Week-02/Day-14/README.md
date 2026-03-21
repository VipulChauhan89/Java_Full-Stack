# Week 2 — Day 14
## Java Collections Framework
### ***Goal: Understand how to store, organize, and manipulate groups of objects efficiently using Java’s built-in data structures.***

---
### 1. What is the Collection Framework
The Collection Framework is a set of interfaces and classes that provide ready-to-use data structures.

***Purpose:***
* Store multiple objects
* Perform operations like search, insert, delete
* Provide efficient algorithms

***Advantages:***
* Dynamic size
* Built-in methods
* Standardized structure
* High performance

---
### 2. Collection Framework Hierarchy
***Main hierarchy:***
```
Iterable
   ↓
Collection
 ├── List
 ├── Set
 └── Queue
 ```

***Separate structure:***
```
Map
(Key → Value)
```

***Important point:***
* Collection stores single objects
* Map stores key-value pairs

---
### 3. List Interface
A List is an ordered collection.

***Features:***
* Maintains insertion order
* Allows duplicates
* Allows indexing

***Common implementations:***
* ArrayList
* LinkedList
* Vector

---
**ArrayList**

Dynamic array implementation.

***Example:***
```java
import java.util.*;

ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list);
```

***Important Methods:***
```
add()
get()
remove()
size()
contains()
```

***Advantages:***
* Fast random access
* Easy iteration

***Disadvantage:***
* Slow insertion/deletion in the middle

---
**LinkedList**

Implemented using doubly linked list.

***Example:***
```java
LinkedList<Integer> list = new LinkedList<>();

list.add(10);
list.add(20);
```

***Advantages:***
* Faster insertion and deletion
* Flexible memory usage

***Disadvantage:***
* Slower element access

---
### 4. Set Interface
A Set stores unique elements only.

***Features:***
* No duplicates allowed
* No indexing
* Mostly unordered

***Common implementations:***
* HashSet
* LinkedHashSet
* TreeSet

---
**HashSet**

Uses hashing for storage.

***Example:***
```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);

System.out.println(set);
```

***Output:***
```
[10, 20]
```

***Advantages:***
* Fast insertion
* Fast lookup

---
**LinkedHashSet**

Maintains insertion order.

***Example:***
```java
LinkedHashSet<Integer> set = new LinkedHashSet<>();
```

---
**TreeSet**

Stores elements in sorted order.

***Example:***
```java
TreeSet<Integer> set = new TreeSet<>();
```
Internally uses Red-Black Tree.

---
### 5. Queue Interface
Queue follows FIFO (First In First Out).

***Example structure:***
```
First In → First Out
```

***Common implementations:***
* PriorityQueue
* ArrayDeque
* LinkedList

***Example:***
```java
Queue<Integer> q = new LinkedList<>();

q.add(10);
q.add(20);

System.out.println(q.poll());
```

***Output:*** `10`

***Important Methods:***
```java
add()
poll()
peek()
```

---
### 6. Map Interface
A Map stores data in key → value pairs.

***Features:***
* Keys must be unique
* Values can be duplicated

***Common implementations:***
* HashMap
* LinkedHashMap
* TreeMap

---
**HashMap**

Most widely used Map implementation.

***Example:***
```java
HashMap<String, Integer> map = new HashMap<>();

map.put("Vipul", 90);
map.put("Raj", 85);

System.out.println(map);
```

***Access value:***
```java
map.get("Vipul");
```

---
**LinkedHashMap**

Maintains insertion order of keys.

***Example:***
```java
LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
```

---
**TreeMap**

Stores keys in sorted order.

***Example:***
```java
TreeMap<Integer, String> map = new TreeMap<>();
```
Internally uses Red-Black Tree.

---
### 7. Iterating Collections
**For-Each Loop**
```java
for(int num : list){
    System.out.println(num);
}
```
---
**Iterator**
```java
Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}
```

---
### 8. Common Collection Methods
**List Methods**
```java
add()
get()
set()
remove()
size()
contains()
```

**Set Methods**
```java
add()
remove()
contains()
size()
```

**Map Methods**
```java
put()
get()
remove()
containsKey()
keySet()
values()
```

---
### 9. When to Use Which Collection

|Use Case|Collection|
|---|---|
|Ordered data|ArrayList|
|Frequent insert/delete|LinkedList|
|Unique elements|HashSet|
|Maintain order + unique|LinkedHashSet|
|Sorted elements|TreeSet|
|Key-value storage|HashMap|
|Sorted key-value storage|TreeMap|
|FIFO processing|Queue|

---
### 10. Internal Working Concepts
**ArrayList**

Uses dynamic array.

***When capacity is full:***
```
New array created
Elements copied
```

---
**HashMap**

Uses hashing algorithm.

***Process:***
```
Key → Hash function → Bucket → Value
```

**Collision handling:**
* Linked List
* Tree structure (Java 8+)

---
### 11. Real Backend Usage
Collections are heavily used in backend frameworks like Spring Boot for:
* Caching
* Request handling
* Data storage
* API processing
* Database mapping

---
### 12. Key Concepts to Remember
* Collections store groups of objects dynamically
* List → ordered + duplicates allowed
* Set → unique elements
* Queue → FIFO processing
* Map → key-value storage
* HashMap is most commonly used in backend systems

---
## Practice Programs
* ArrayList Program
    ```
    Add elements
    Remove elements
    Print list
    Find element
    ```
* HashSet Program
    ```
    Store duplicate numbers
    Observe unique output
    ```
* HashMap Program
    ```
    Store name → marks
    Print all entries
    ```
* Frequency Counter
    
    Input: `[1,2,2,3,3,3]`

    Output:
    ```
    1 → 1
    2 → 2
    3 → 3
    ```
    Use HashMap.
* Sorting Example
    
    Use:
    ```
    TreeSet
    TreeMap
    ```

## ✅ At this point you have completed:
* Complete OOP
* Collections Framework

These are core foundations before advanced backend development in Java.
