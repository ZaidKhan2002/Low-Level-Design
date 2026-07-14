# Dependency Inversion Principle (DIP)

## Definition

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

> Abstractions should not depend on details. Details should depend on abstractions.

In simple terms, business logic should depend on interfaces or abstract classes instead of concrete implementations.

---

## Why do we need DIP?

Without DIP, high-level modules become tightly coupled to specific implementations.

This makes the application difficult to:

- Extend
- Test
- Maintain
- Replace implementations

By depending on abstractions, we can easily switch implementations without changing business logic.

---

## Bad Design

```
NotificationService
        │
        ▼
EmailService
```

The business logic directly depends on a concrete implementation.

If tomorrow we replace Email with SMS or WhatsApp, we must modify `NotificationService`.

---

## Good Design

```
              NotificationSender
                      ▲
          ┌───────────┴───────────┐
          │                       │
     EmailService           SmsService
               ▲
               │
        NotificationService
```

Both the high-level module (`NotificationService`) and low-level modules (`EmailService`, `SmsService`) depend on the `NotificationSender` abstraction.

---

## Benefits

- Loose coupling
- Easier unit testing
- Easy to replace implementations
- Better scalability
- Improved maintainability
- Encourages dependency injection

---

## Real-World Example

Consider a laptop charger.

The laptop doesn't know whether electricity comes from:

- Wall socket
- UPS
- Generator
- Power bank

It simply expects a compatible power adapter.

Similarly, business logic should depend on an abstraction rather than a specific implementation.

---

## Interview Questions

### What is the Dependency Inversion Principle?

High-level modules should depend on abstractions rather than concrete implementations.

---

### What is a high-level module?

A class containing business logic.

Examples:

- OrderService
- UserService
- NotificationService

---

### What is a low-level module?

A class responsible for implementation details.

Examples:

- MySQLDatabase
- EmailService
- SmsService

---

### How is DIP different from Dependency Injection (DI)?

**Dependency Inversion Principle (DIP)** is a design principle.

**Dependency Injection (DI)** is a technique used to implement DIP.

---

### Which type of Dependency Injection is used here?

Constructor Injection.

```java
public NotificationService(NotificationSender notificationSender) {
    this.notificationSender = notificationSender;
}
```

---

### Why is constructor injection preferred?

- Mandatory dependencies are provided during object creation.
- Makes objects immutable where possible.
- Easier to unit test.
- Easier to understand.

---

### Which OOP concepts help implement DIP?

- Abstraction
- Interfaces
- Polymorphism

---

### Does using an interface automatically mean DIP is followed?

No.

The high-level module must depend on the abstraction and should not create concrete implementations internally.

---
## Key Takeaway

> High-level business logic should not know the implementation details.

Instead,

> Depend on abstractions and inject the required implementation from outside.