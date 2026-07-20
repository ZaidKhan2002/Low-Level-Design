# Eager Initialization Singleton

## Definition

> The Singleton instance is created when the class is loaded by the JVM.

Unlike Lazy Initialization, the object is created immediately, even if it is never used.

---

## Implementation

```java
public class DatabaseConnection {

    private static final DatabaseConnection INSTANCE =
            new DatabaseConnection();

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        return INSTANCE;
    }

}
```

---

## How It Works

Application Starts

↓

DatabaseConnection class loads

↓

Static variables initialize

↓

Singleton object created

↓

Future calls return the same object

---

## Why is it Thread-Safe?

Java guarantees that a class is initialized only once.

Class initialization is synchronized by the JVM.

Therefore, only one Singleton instance is created.

No explicit synchronization is required.

---

## Advantages

- Very simple implementation
- Naturally thread-safe
- No synchronization overhead
- Easy to maintain

---

## Disadvantages

- Object is created even if never used
- May waste memory
- Slower application startup if object creation is expensive

---

## Real-World Example

A Logger that is required throughout the application lifecycle.

---

## Interview Questions

### 1. What is Eager Initialization?

The Singleton object is created during class loading.

---

### 2. Why is Eager Singleton thread-safe?

Because the JVM initializes a class only once, and class initialization is synchronized internally.

---

### 3. Why doesn't it need synchronized?

The object is already created before any thread calls `getInstance()`.

---

### 4. What is the biggest drawback?

Memory is allocated even if the object is never used.

---

### 5. When should you choose Eager over Lazy?

When the object is lightweight and guaranteed to be used.

---

## Common Mistakes

### Mistake 1

Assuming Eager Initialization improves runtime performance.

It removes synchronization during access, but may increase application startup time.

---

### Mistake 2

Using Eager Initialization for expensive objects that might never be needed.

---

## Key Takeaway

> Eager Initialization trades extra startup memory for simplicity and guaranteed thread safety by creating the Singleton instance during class loading.