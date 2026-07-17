# Factory Pattern

## Intent

> Provide a centralized way to create objects without exposing object creation logic to the client.

The client requests an object from the factory instead of creating it directly using `new`.

---

## Problem Statement

Suppose an application supports multiple payment methods:

- Card
- UPI
- Wallet

A naive implementation creates objects directly:

```java
PaymentStrategy payment = new CardPayment();
```

As the application grows, object creation becomes scattered throughout the codebase.

Changing constructors or initialization logic requires updating every client.

---

## Bad Design

```
Main

↓

new CardPayment()

new UpiPayment()

new WalletPayment()
```

Problems:

- Object creation duplicated.
- Tight coupling to concrete classes.
- Difficult to maintain.
- Hard to change initialization logic.

---

## Good Design

```
Main

↓

PaymentFactory

↓

CardPayment
UPIPayment
WalletPayment
```

The client only requests an object.

The factory decides which object to create.

---

## Components

### Product

Common interface.

Example:

```java
PaymentStrategy
```

---

### Concrete Products

- CardPayment
- UpiPayment
- WalletPayment

---

### Factory

Responsible for object creation.

Example:

```java
PaymentFactory
```

---

### Client

Uses the object.

Example:

```java
Main
```

---

## Advantages

- Centralized object creation.
- Loose coupling.
- Easier maintenance.
- Cleaner client code.
- Constructor changes happen in one place.

---

## Disadvantages

- Factory grows as products increase.
- Adding a new product usually requires modifying the factory.
- Can introduce unnecessary complexity for very simple applications.

---

## Real-World Examples

- LoggerFactory (SLF4J)
- Calendar.getInstance()
- Executors.newFixedThreadPool()
- JDBC DriverManager
- Spring BeanFactory

---

## Interview Questions

### 1. What problem does Factory Pattern solve?

It centralizes object creation and hides creation logic from clients.

---

### 2. Who creates the object?

The Factory.

---

### 3. Does Factory violate OCP?

A simple factory may require modification when new products are added.

Advanced variants like Factory Method and Abstract Factory improve extensibility.

---

### 4. How is Factory different from Strategy?

| Factory | Strategy |
|---------|----------|
| Creates objects | Executes algorithms |
| Focuses on object creation | Focuses on behavior |
| Used during object creation | Used after object creation |

---

### 5. Where is Factory used in Java?

- `Executors.newFixedThreadPool()`
- `Calendar.getInstance()`
- `LoggerFactory.getLogger()`

---

### 6. Can Factory and Strategy be used together?

Yes.

Factory creates the appropriate strategy object, and the context executes it.

---

## Common Mistakes

### Mistake 1

Putting business logic inside the factory.

Factories should only create objects.

---

### Mistake 2

Using a factory when there is only one implementation.

---

### Mistake 3

Confusing Factory with Strategy.

Factory creates.

Strategy performs.

---

## Related SOLID Principles

- SRP
- OCP
- DIP

---

## Key Takeaway

> **Factory Pattern encapsulates object creation, while Strategy Pattern encapsulates behavior.**

Factory answers:

> "Which object should I create?"

Strategy answers:

> "How should this task be performed?"