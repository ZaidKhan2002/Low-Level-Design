# Day 6 - Composition

## Definition

Composition is an object-oriented design principle where one class contains objects of other classes.

It represents a **has-a** relationship.

Examples:

- Order has a Customer
- Order has a Payment
- Car has an Engine
- Department has Employees

---

## Why do we need Composition?

- Promotes code reusability.
- Reduces tight coupling.
- Makes systems flexible.
- Allows objects to be replaced without changing the owning class.
- Preferred over inheritance in many real-world scenarios.

---

## Syntax

```java
class Order {

    private Customer customer;
    private Payment payment;

}
```

The `Order` class is composed of `Customer` and `Payment`.

---

## Composition vs Inheritance

| Inheritance | Composition |
|-------------|-------------|
| Represents **is-a** relationship | Represents **has-a** relationship |
| Uses `extends` | Uses objects as fields |
| Creates tight coupling | Creates loose coupling |
| Harder to modify | Easier to extend and replace |
| Used for specialization | Used for assembling objects |

---

## Examples

### Inheritance

```text
Developer is an Employee
```

```java
class Developer extends Employee {

}
```

---

### Composition

```text
Order has Payment
```

```java
class Order {

    private Payment payment;

}
```

---

## Why is Composition Preferred?

Instead of:

```java
class PaymentService extends Logger {

}
```

Prefer:

```java
class PaymentService {

    private Logger logger;

}
```

Reason:

- `PaymentService` is **not** a `Logger`.
- It **uses** a `Logger`.

This follows the **has-a** relationship.

---

## Advantages

- Loose coupling
- Better maintainability
- Better testability
- Easier dependency injection
- More reusable components
- Follows the Single Responsibility Principle (SRP)

---

## Best Practices

- Prefer composition over inheritance unless there is a true **is-a** relationship.
- Keep components focused on a single responsibility.
- Design classes to collaborate instead of inherit unnecessarily.
- Favor dependency injection when using composition.

---

## Interview Questions

### What is Composition?

Composition is a **has-a** relationship where one object contains another object.

---

### Why is Composition preferred over Inheritance?

Because it promotes loose coupling and makes systems easier to modify, test, and maintain.

---

### Give some real-world examples.

- Order → Customer
- Car → Engine
- Restaurant → Menu
- Department → Employees
- UserService → UserRepository

---

### Difference between Composition and Aggregation?

Composition implies stronger ownership.

If the owner object is destroyed, the composed objects are typically destroyed as well.

Aggregation is a weaker relationship where objects can exist independently.

---

### What is the famous OOP principle?

> **Favor Composition over Inheritance.**

---

## Key Takeaways

- Composition models **has-a** relationships.
- Inheritance models **is-a** relationships.
- Interfaces model **capabilities**.
- Composition leads to flexible and maintainable software.
- Most modern frameworks (Spring Boot, Hibernate, etc.) rely heavily on composition and dependency injection.