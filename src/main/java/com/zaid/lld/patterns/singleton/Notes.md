# Singleton Pattern

## Definition

> **Ensure a class has only one instance and provide a global point of access to it.**

The Singleton Pattern is a **Creational Design Pattern** used when exactly one object of a class should exist throughout the application's lifecycle.

Instead of allowing multiple objects to be created, the class controls its own instantiation and provides a single shared instance.

---

# Why Do We Need Singleton?

Suppose every service in your application creates its own database connection.

```java
DatabaseConnection db1 = new DatabaseConnection();
DatabaseConnection db2 = new DatabaseConnection();
DatabaseConnection db3 = new DatabaseConnection();
```

Problems:

- Unnecessary memory usage
- Multiple expensive object creations
- Difficult to maintain shared state
- Inconsistent behavior

Instead, all services should share the same object.

```java
DatabaseConnection db = DatabaseConnection.getInstance();
```

---

# Real-World Examples

Singleton is commonly used for objects that should exist only once.

Examples include:

- Configuration Manager
- Logger
- Cache Manager
- Feature Flag Manager
- Connection Pool Manager
- Runtime Environment

> **Note:** The manager itself may be a Singleton, but it can internally manage multiple resources (e.g., database connections in a connection pool).

---

# Characteristics of Singleton

A Singleton class generally follows three rules:

### 1. Private Constructor

```java
private DatabaseConnection() {}
```

Prevents external classes from creating objects.

---

### 2. Private Static Instance

```java
private static DatabaseConnection instance;
```

Stores the single object shared across the application.

---

### 3. Public Static Getter

```java
public static DatabaseConnection getInstance()
```

Provides global access to the Singleton instance.

---

# Implementations Covered

This repository demonstrates five common Singleton implementations.

## 1. Lazy Initialization

Object is created only when requested.

### Advantages

- Saves memory
- Object created only when needed

### Disadvantages

- Not thread-safe

---

## 2. Eager Initialization

Object is created during class loading.

### Advantages

- Thread-safe
- Very simple

### Disadvantages

- Object created even if never used

---

## 3. Thread-Safe Singleton (Synchronized)

Uses the `synchronized` keyword to make Lazy Initialization thread-safe.

### Advantages

- Lazy initialization
- Thread-safe

### Disadvantages

- Synchronization overhead on every call

---

## 4. Double-Checked Locking

Synchronizes only during the first object creation.

Uses:

```java
volatile
```

to prevent instruction reordering.

### Advantages

- Lazy initialization
- Thread-safe
- Better performance

### Disadvantages

- Slightly more complex

---

## 5. Enum Singleton

Uses Java's `enum`.

Recommended in **Effective Java** by Joshua Bloch.

### Advantages

- Thread-safe
- Reflection-safe
- Serialization-safe
- Very simple

### Disadvantages

- Not lazily initialized

---

# Comparison

| Feature | Lazy | Eager | Synchronized | Double Checked | Enum |
|----------|------|--------|--------------|----------------|------|
| Lazy Initialization | ✅ | ❌ | ✅ | ✅ | ❌ |
| Thread-safe | ❌ | ✅ | ✅ | ✅ | ✅ |
| Synchronization Overhead | ❌ | ❌ | ✅ | Only First Call | ❌ |
| Reflection Safe | ❌ | ❌ | ❌ | ❌ | ✅ |
| Serialization Safe | ❌ | ❌ | ❌ | ❌ | ✅ |
| Complexity | Easy | Easy | Medium | Medium | Easy |

---

# Lazy vs Eager

## Lazy Initialization

```
Application Starts

↓

No Object

↓

First Call

↓

Object Created

↓

Reuse Forever
```

Creates the object only when required.

---

## Eager Initialization

```
Application Starts

↓

Object Created

↓

Future Calls Reuse Object
```

Creates the object immediately.

---

# Thread Safety

The basic Lazy Singleton is **not thread-safe**.

Suppose two threads execute:

```java
DatabaseConnection.getInstance();
```

at the same time.

Both threads may observe:

```java
instance == null
```

and create two separate objects.

This breaks the Singleton guarantee.

Solutions include:

- `synchronized`
- Double-Checked Locking
- Enum Singleton

---

# Why Double-Checked Locking?

The synchronized version locks every call.

Double-Checked Locking reduces this overhead.

Flow:

```
Object Exists?

↓

Yes

↓

Return Immediately

(No Lock)
```

Only the first object creation requires synchronization.

---

# Why `volatile`?

Without `volatile`, instruction reordering may expose a partially initialized object to another thread.

`volatile` guarantees:

- Visibility of updates across threads
- Prevention of unsafe instruction reordering

---

# Reflection Problem

Reflection can access private constructors.

Example:

```java
Constructor<?> constructor =
    DatabaseConnection.class.getDeclaredConstructor();
```

Without additional safeguards, reflection can create another Singleton instance.

Enum Singleton is naturally protected against this.

---

# Serialization Problem

Serialization writes an object to a file.

Deserialization recreates it.

Without implementing `readResolve()`, deserialization may produce another Singleton instance.

Enum Singleton automatically avoids this issue.

---

# Advantages

- Controlled object creation
- Global access point
- Memory efficient
- Prevents duplicate instances
- Shared state across the application

---

# Disadvantages

- Global state can increase coupling
- Harder to unit test if overused
- Requires careful thread-safe implementation
- Reflection and serialization can break some implementations

---

# Common Interview Questions

### 1. What is Singleton?

A creational design pattern that ensures only one instance of a class exists and provides a global point of access.

---

### 2. Why is the constructor private?

To prevent external object creation.

---

### 3. Why is `instance` static?

To ensure one shared instance across the entire application.

---

### 4. Why is `getInstance()` static?

To access the Singleton without creating an object first.

---

### 5. Why is Lazy Singleton not thread-safe?

Multiple threads can simultaneously create multiple objects.

---

### 6. Why is Eager Singleton thread-safe?

Because class initialization is performed once by the JVM.

---

### 7. Why is Double-Checked Locking faster?

Synchronization occurs only during the first object creation.

---

### 8. Why is `volatile` required?

To prevent instruction reordering and ensure visibility across threads.

---

### 9. Which Singleton implementation is recommended?

For general Java applications, **Enum Singleton** is often recommended because it is thread-safe and resistant to reflection and serialization attacks.

If lazy initialization is required, **Double-Checked Locking with `volatile`** is a common choice.

---

### 10. Can Singleton be broken?

Yes.

Possible ways include:

- Reflection
- Serialization
- Cloning (if supported)

Proper safeguards are required to prevent these issues.

---

# Common Mistakes

❌ Public constructor

❌ Non-static instance variable

❌ Forgetting `volatile` in Double-Checked Locking

❌ Assuming synchronized Singleton is the fastest implementation

❌ Using Singleton for every class

---

# Key Takeaways

- Singleton ensures that only one object exists throughout the application's lifecycle.
- Lazy Initialization saves memory but is not thread-safe by default.
- Eager Initialization is simple and thread-safe but creates the object eagerly.
- Synchronized Singleton guarantees thread safety but introduces synchronization overhead.
- Double-Checked Locking provides lazy initialization with better performance using `volatile`.
- Enum Singleton is the safest Java implementation because it naturally protects against thread-safety, reflection, and serialization issues.


---
> **Remember:** A Singleton is not just about creating one object—it is about controlling object creation, ensuring safe access, and understanding the trade-offs between simplicity, performance, and thread safety.