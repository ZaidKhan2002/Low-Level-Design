# Enum Singleton

## Definition

> A Singleton implementation using Java's `enum` type.

Each enum constant is instantiated only once by the JVM, making it a natural Singleton.

---

## Implementation

```java
public enum DatabaseConnection {

    INSTANCE;

    public void connect() {
        System.out.println("Connected");
    }

}
```

---

## Usage

```java
DatabaseConnection db = DatabaseConnection.INSTANCE;
```

---

## How It Works

Application Starts

↓

Enum class loads

↓

INSTANCE created

↓

Future access returns the same object

---

## Why is it Thread-Safe?

The JVM guarantees that enum constants are initialized only once during class loading.

---

## Advantages

- Very simple
- Thread-safe
- Reflection-safe
- Serialization-safe
- Recommended in Effective Java

---

## Disadvantages

- Not lazily initialized
- Cannot extend another class (because enums already extend `java.lang.Enum`)

---

## Real-World Example

A global configuration manager that is always required during the application's lifetime.

---

## Interview Questions

### 1. Why is Enum Singleton considered the safest?

Because the JVM guarantees a single instance and protects against reflection and serialization issues.

---

### 2. Does it require `synchronized`?

No.

The JVM handles initialization safely.

---

### 3. Can Reflection create another enum instance?

No.

Java prevents reflective creation of enum constants.

---

### 4. Is Enum Singleton lazy?

No.

It is eagerly initialized during class loading.

---

## Common Mistakes

### Mistake 1

Thinking enums are only for constants.

Enums can also contain constructors, methods, and fields.

---

### Mistake 2

Using Enum Singleton when lazy initialization is a strict requirement.

---

## Key Takeaway

> Enum Singleton is the simplest and safest Singleton implementation in Java, offering built-in protection against thread-safety, reflection, and serialization issues.