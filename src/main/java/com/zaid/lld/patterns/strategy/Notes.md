# Strategy Pattern

## Intent

> Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

Instead of writing multiple conditional statements, encapsulate each algorithm in its own class and switch between them dynamically.

---

## Problem Statement

Consider a payment application that supports multiple payment methods.

Initially, the application supports:

- Card
- UPI
- Wallet

A common implementation uses:

```java
if (paymentType.equals("CARD")) { ... }
else if (paymentType.equals("UPI")) { ... }
else if (paymentType.equals("WALLET")) { ... }
```

As new payment methods are introduced, this conditional logic keeps growing, making the code difficult to maintain and extend.

---

## Bad Design

```
PaymentService

↓

if-else

↓

Card
UPI
Wallet
```

Problems:

- Violates Open/Closed Principle.
- Difficult to extend.
- Large conditional blocks.
- Business logic and payment algorithms are tightly coupled.

---

## Good Design

```
                 PaymentStrategy
                        ▲
        ┌───────────────┼───────────────┐
        │               │               │
 CardPayment      UpiPayment      WalletPayment
                        ▲
                        │
                PaymentService
```

Each payment algorithm is encapsulated in its own class.

`PaymentService` depends only on the `PaymentStrategy` abstraction.

---

## Components

### Strategy

Defines the common interface.

Example:

```java
PaymentStrategy
```

---

### Concrete Strategies

Provide different implementations.

Examples:

- CardPayment
- UpiPayment
- WalletPayment

---

### Context

The class that uses the strategy.

Example:

```java
PaymentService
```

---

### Client

Responsible for selecting the appropriate strategy.

Example:

```java
Main
```

---

## Advantages

- Eliminates long `if-else` chains.
- Follows Open/Closed Principle.
- Easy to add new algorithms.
- Promotes loose coupling.
- Improves readability.
- Easy to unit test.

---

## Disadvantages

- More classes.
- Client must choose the correct strategy.
- Can feel excessive for very simple logic.

---

## Real-World Examples

- Payment gateways
- Route calculation in Google Maps
- Sorting algorithms
- Compression algorithms
- Authentication mechanisms
- Shipping cost calculation

---

## Interview Questions

### 1. What problem does the Strategy Pattern solve?

It eliminates complex conditional logic by encapsulating each algorithm into its own class.

---

### 2. Which SOLID principles does Strategy support?

- Open/Closed Principle
- Dependency Inversion Principle
- Single Responsibility Principle

---

### 3. Who selects the strategy?

The client.

The context only executes it.

---

### 4. Can the strategy change at runtime?

Yes.

That is one of the main advantages of the Strategy Pattern.

---

### 5. How is Strategy different from Factory?

Strategy decides **how an operation is performed**.

Factory decides **which object to create**.

---

## Common Mistakes

### Mistake 1

Keeping `if-else` inside the context class.

### Mistake 2

Letting the context create concrete strategy objects.

### Mistake 3

Using Strategy for logic that never changes.

---

## Related SOLID Principles

- SRP
- OCP
- DIP

---

## Key Takeaway

> **Encapsulate varying algorithms behind a common interface so they can be swapped without changing the code that uses them.**