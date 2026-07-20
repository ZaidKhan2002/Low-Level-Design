# Lazy Initialization Singleton

## Definition

> The Singleton instance is created only when it is requested for the first time.

Instead of creating the object when the application starts, Lazy Initialization delays object creation until it is actually needed. This helps save memory and resources if the object is never used.

---

## Implementation

```java
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {

        if (instance == null) {
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

First call:

```
getInstance()

↓

instance == null

↓

Create Object

↓

Return Object
```

Second call:

```
getInstance()

↓

instance != null

↓

Return Existing Object
```

Only one object is created during normal single-threaded execution.

---

## Why is the Constructor Private?

If the constructor were public,

```java
new DatabaseConnection();
```

could be called from anywhere, creating multiple objects and violating the Singleton pattern.

A private constructor ensures that objects can only be created from inside the class.

---

## Why is `instance` Static?

`instance` belongs to the class, not to an object.

There should be only one shared instance throughout the application.

If `instance` were non-static, every object would have its own copy, defeating the purpose of Singleton.

---

## Why is `getInstance()` Static?

Since no object exists initially, we need a way to access the singleton without creating an object first.

Static methods belong to the class and can be called directly.

Example:

```java
DatabaseConnection.getInstance();
```

---

## Advantages

- Object created only when needed
- Saves memory
- Simple implementation
- Easy to understand

---

## Disadvantages

- Not thread-safe
- Multiple threads can create multiple instances
- Not suitable for concurrent applications

---

## Thread Safety Problem

Suppose two threads call:

```java
DatabaseConnection.getInstance();
```

at the same time.

Thread A:

```
instance == null

↓

Ready to create object
```

Before it creates the object, the CPU switches to Thread B.

Thread B also checks:

```
instance == null

↓

Ready to create object
```

Now both threads create separate objects.

The Singleton guarantee is broken.

---

## Real-World Example

A Configuration Manager that loads configuration only when it is first requested.

---

## Interview Questions

### 1. What is Lazy Initialization?

Object creation is delayed until the first request.

---

### 2. Why is the constructor private?

To prevent external object creation.

---

### 3. Why is the instance variable static?

To ensure one shared instance for the entire class.

---

### 4. Why is `getInstance()` static?

To access the singleton without creating an object.

---

### 5. Is Lazy Singleton thread-safe?

No.

Multiple threads can create multiple instances.

---

### 6. How can it be made thread-safe?

By using:

- `synchronized`
- Double Checked Locking
- Enum Singleton (recommended in Java)

---

## Common Mistakes

### Mistake 1

Making the constructor public.

This breaks Singleton.

---

### Mistake 2

Making `instance` non-static.

Each object would then have its own instance variable.

---

### Mistake 3

Using Lazy Singleton in a multithreaded application without synchronization.

---

## Key Takeaway

> Lazy Initialization creates the Singleton object only when it is needed, saving memory, but the basic implementation is not thread-safe.