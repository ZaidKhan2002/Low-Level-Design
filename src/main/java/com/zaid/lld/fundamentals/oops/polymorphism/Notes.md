# Day 7 - Polymorphism

## Definition

Polymorphism means **"many forms."**

It allows the same interface or parent reference to represent different object implementations.

Example:

```java
Notification notification = new EmailNotification();
notification.send(...);

notification = new SMSNotification();
notification.send(...);
```

The client code remains the same, while the implementation changes.

---

## Types of Polymorphism

### 1. Compile-Time Polymorphism

Also called **Method Overloading**.

Methods have:

- Same name
- Different parameter list

Example:

```java
class Calculator {

    int add(int a, int b) { ... }

    double add(double a, double b) { ... }

}
```

Resolved during compilation.

---

### 2. Runtime Polymorphism

Also called **Method Overriding**.

The method executed depends on the actual object created at runtime.

Example:

```java
Notification notification = new EmailNotification();
notification.send(...);
```

Resolved during runtime.

---

## How Runtime Polymorphism Works

```java
Notification notification = new SMSNotification();
```

Reference Type:

```
Notification
```

Object Type:

```
SMSNotification
```

Compile Time:

The compiler checks whether `Notification` has a `send()` method.

Runtime:

Java executes `SMSNotification.send()` because the object is an instance of `SMSNotification`.

This mechanism is called **Dynamic Method Dispatch**.

---

## Why do we need Polymorphism?

- Eliminates long `if-else` or `switch` statements.
- Makes applications extensible.
- Supports the Open-Closed Principle.
- Allows programming against abstractions.
- Makes code easier to test and maintain.

---

## Bad Design

```java
if(type.equals("EMAIL")) {

}
else if(type.equals("SMS")) {

}
else if(type.equals("PUSH")) {

}
```

Every new notification type requires modifying existing code.

---

## Better Design

```java
Notification notification = new EmailNotification();
notification.send(...);
```

Adding a new notification type only requires creating another implementation.

---

## Real-World Examples

- Payment Gateway
- Notification Service
- Authentication Provider
- Database Driver
- Storage Service
- Logging Framework

---

## Upcasting

```java
Notification notification = new EmailNotification();
```

Always allowed.

Child object can be referenced by a parent/interface type.

---

## Downcasting

```java
Notification notification = new EmailNotification();

EmailNotification email =
        (EmailNotification) notification;
```

Used when child-specific functionality is required.

Should be used carefully.

---

## Best Practices

- Program to interfaces, not implementations.
- Prefer polymorphism over conditional logic.
- Keep interfaces focused on a single responsibility.
- Avoid unnecessary downcasting.

---

## Interview Questions

### What is Polymorphism?

The ability of one interface or parent reference to represent multiple implementations.

---

### What are the types of Polymorphism?

- Compile-Time (Method Overloading)
- Runtime (Method Overriding)

---

### What is Dynamic Method Dispatch?

The JVM decides which overridden method to execute based on the actual object created at runtime.

---

### What is Upcasting?

Assigning a child object to a parent or interface reference.

```java
Notification notification = new EmailNotification();
```

---

### What is Downcasting?

Casting a parent reference back to the child type.

```java
EmailNotification email =
        (EmailNotification) notification;
```

---

### Why is Polymorphism important?

It reduces coupling, improves extensibility, removes conditional logic, and enables scalable system design.

---

## Key Takeaways

- Polymorphism means one interface, many implementations.
- Runtime polymorphism is achieved using method overriding.
- Upcasting is safe and common.
- Downcasting should be used sparingly.
- Modern Java frameworks like Spring heavily rely on polymorphism and dependency injection.