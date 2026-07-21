# Thread-Safe Singleton (Synchronized)

## Definition

> A Lazy Singleton made thread-safe using Java's `synchronized` keyword.

This implementation ensures that only one thread can execute `getInstance()` at a time, preventing multiple Singleton instances from being created.

---

## Implementation

```java
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {

        if(instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

}
```

---

## How It Works

Initially:

```
instance = null
```

Thread A:

```
Enter synchronized method

↓

Create object

↓

Return object
```

Thread B:

```
Wait

↓

Enter method

↓

Return existing object
```

Only one object is created.

---

## Why is it Thread-Safe?

The `synchronized` keyword allows only one thread to execute the method at a time.

This protects the critical section where the Singleton object is created.

---

## Advantages

- Lazy initialization
- Thread-safe
- Easy to implement
- Prevents race conditions

---

## Disadvantages

- Every call acquires a lock
- Slight performance overhead
- Not ideal for frequently accessed Singletons

---

## Real-World Example

A configuration manager shared by multiple request-handling threads.

---

## Interview Questions

### 1. Why is Lazy Singleton not thread-safe?

Multiple threads can simultaneously observe `instance == null` and each create a separate object.

---

### 2. How does `synchronized` solve the problem?

It ensures only one thread can execute `getInstance()` at a time.

---

### 3. Is this the best Singleton implementation?

No.

It is correct but not the most efficient because synchronization happens on every call.

---

### 4. What is the performance drawback?

Even after the Singleton is created, every thread must acquire and release the lock.

---

### 5. Which implementation improves this?

Double-Checked Locking.

---

## Common Mistakes

### Mistake 1

Synchronizing the constructor.

Constructors cannot be synchronized.

---

### Mistake 2

Thinking synchronization happens only during object creation.

The entire synchronized method is protected, so every call acquires the lock.

---

### Mistake 3

Using this implementation in highly performance-sensitive applications without considering the synchronization overhead.

---

## Key Takeaway

> `synchronized` makes Lazy Singleton thread-safe by allowing only one thread to execute `getInstance()` at a time, but every method call incurs synchronization overhead.