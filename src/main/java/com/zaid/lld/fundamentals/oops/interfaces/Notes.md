# Day 4 - Interfaces

## Definition

An interface defines a **contract** that a class agrees to follow.

It specifies **what** a class should do, not **how** it should do it.

---

## Why do we need Interfaces?

- Define a common contract.
- Support multiple inheritance of type.
- Reduce coupling between classes.
- Improve flexibility and maintainability.
- Enable dependency injection and polymorphism.

---

## Syntax

```java
public interface PaymentGateway {

    void processPayment();

}
```

A class implements an interface using the `implements` keyword.

```java
public class UPIPayment implements PaymentGateway {

    @Override
    public void processPayment() {

    }

}
```

---

## Interface Features

Interfaces can contain:

- Abstract methods
- Default methods (Java 8+)
- Static methods (Java 8+)
- Private methods (Java 9+)
- Constants (`public static final`)

Interfaces cannot contain:

- Constructors
- Instance variables

---

## Multiple Interface Implementation

```java
class CreditCardPayment
        implements PaymentGateway, Refundable, Auditable {

}
```

A class can implement multiple interfaces.

---

## Interface vs Abstract Class

| Abstract Class | Interface |
|----------------|-----------|
| Represents an object | Represents a capability |
| Can have constructors | No constructors |
| Can have instance variables | Only constants |
| Can contain state | Cannot maintain object state |
| Single inheritance | Multiple interfaces can be implemented |

---

## When to use an Interface?

Use an interface when:

- You want to define a contract.
- Different classes share a capability.
- Multiple inheritance is required.
- Implementation may vary.

Examples:

- Runnable
- Comparable
- Serializable
- Cloneable

---

## Best Practices

- Keep interfaces focused on a single responsibility.
- Name interfaces based on capabilities.
- Program to interfaces, not implementations.
- Use default methods sparingly.

---

## Interview Questions

### What is an Interface?

A contract that defines what a class must implement.

---

### Can we create an object of an Interface?

No.

---

### Can an Interface have constructors?

No.

---

### Can an Interface have instance variables?

No.

Only constants are allowed.

---

### Can an Interface have default methods?

Yes (Java 8+).

---

### Can an Interface have static methods?

Yes (Java 8+).

---

### Can an Interface have private methods?

Yes (Java 9+).

---

### Why use an Interface instead of an Abstract Class?

Use an interface when you need a contract or capability that can be shared across unrelated classes.

---

### Can a class implement multiple interfaces?

Yes.

This is one of the major advantages of interfaces.

---

## Key Takeaways

- Interfaces define capabilities.
- Classes define objects.
- Abstract classes provide shared implementation.
- Interfaces provide contracts.
- Prefer programming to interfaces instead of concrete implementations.