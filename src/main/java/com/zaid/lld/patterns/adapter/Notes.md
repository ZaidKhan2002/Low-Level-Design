# Adapter Pattern

## Intent

> Convert the interface of one class into another interface that clients expect.

The Adapter Pattern allows incompatible classes to work together without modifying their source code.

---

## Problem Statement

Suppose our application supports Stripe.

```java
pay(amount);
```

Later, we integrate Razorpay.

Its SDK provides:

```java
makePayment(amount);
```

Since the interfaces differ, the application cannot use Razorpay directly.

The Adapter Pattern bridges this gap.

---

## Bad Design

PaymentService directly depends on every payment provider.

```text
PaymentService

↓

Stripe

↓

Razorpay

↓

PayPal
```

Problems:

- Tight coupling
- if-else chains
- Difficult to extend

---

## Good Design

```text
PaymentService

↓

PaymentGateway

↓

RazorpayAdapter

↓

Razorpay SDK
```

The adapter translates one interface into another.

---

## Components

### Client

Uses the target interface.

Example:

```java
PaymentService
```

---

### Target

The interface expected by the client.

Example:

```java
PaymentGateway
```

---

### Adaptee

Existing class with an incompatible interface.

Example:

```java
RazorpayGateway
```

---

### Adapter

Implements the target interface and delegates calls to the adaptee.

Example:

```java
RazorpayAdapter
```

---

## Advantages

- Integrates legacy or third-party code
- Promotes loose coupling
- Supports OCP
- Reuses existing classes

---

## Disadvantages

- Introduces extra classes
- Can increase complexity for simple integrations

---

## Real World Examples

### Payment Gateway Integration

- Stripe
- Razorpay
- PayPal

---

### Java I/O

```java
InputStreamReader
```

Adapts:

```text
InputStream

↓

Reader
```

---

### Arrays Utility

```java
Arrays.asList(array)
```

Adapts an array into a List.

---

### Spring Boot

Adapters for:

- Third-party APIs
- External notification services
- Legacy systems

---

## Interview Questions

### 1. What problem does Adapter solve?

It allows incompatible interfaces to work together.

---

### 2. What is an Adaptee?

The existing class whose interface does not match what the client expects.

---

### 3. Does Adapter modify the third-party SDK?

No.

It wraps it.

---

### 4. Which SOLID principles does Adapter support?

- OCP
- DIP

---

### 5. What is the difference between Adapter and Decorator?

| Adapter | Decorator |
|----------|-----------|
| Changes interface | Adds behavior |
| Used for compatibility | Used for extensibility |
| Solves integration problems | Solves feature extension |

---

### 6. Where is Adapter used in Java?

- InputStreamReader
- Arrays.asList()
- JDBC Drivers

---

## Common Mistakes

### Mistake 1

Changing third-party SDK code.

Never modify external libraries.

---

### Mistake 2

Confusing Adapter with Strategy.

Strategy changes behavior.

Adapter changes interface.

---

### Mistake 3

Putting business logic inside the adapter.

Adapters should only translate one interface into another.

---

## Key Takeaway

> **Adapter acts as a translator between two incompatible interfaces, allowing existing code to work with new or legacy components without modification.**