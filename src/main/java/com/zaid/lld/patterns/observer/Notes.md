# Observer Pattern

## Intent

> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

---

## Problem Statement

Consider an e-commerce application.

When an order is placed:

- Send Email
- Send SMS
- Generate Invoice

A naive implementation directly calls all services inside OrderService.

As requirements grow, OrderService becomes tightly coupled to multiple services.

---

## Bad Design

OrderService directly depends on:

- EmailService
- SmsService
- InvoiceService

Problems:

- Tight coupling
- Difficult to extend
- Violates OCP
- Violates SRP

---

## Good Design

OrderService acts as a Subject.

Observers subscribe themselves.

Whenever an order is placed:

```java
notifyObservers();
```

Every observer reacts independently.

---

## Components

### Subject

Maintains a list of observers.

Responsibilities:

- Register observers
- Remove observers
- Notify observers

Example:

```java
OrderService
```

---

### Observer

Defines the update contract.

Example:

```java
Observer
```

---

### Concrete Observers

Examples:

- EmailObserver
- SmsObserver
- InvoiceObserver

---

## Advantages

- Loose coupling
- Easy to extend
- Supports runtime subscription
- Follows OCP
- Follows SRP
- Encourages event-driven architecture

---

## Disadvantages

- Notification order may be difficult to control
- Too many observers can affect performance
- Debugging event chains can be difficult

---

## Real World Examples

### YouTube

Channel uploads video.

Subscribers receive notifications.

---

### E-commerce

Order placed.

Observers:

- Email
- SMS
- Invoice
- Analytics

---

### Stock Market

Stock price changes.

Observers:

- Trading App
- Portfolio Tracker
- News Service

---

### Backend Systems

- Kafka Consumers
- RabbitMQ Consumers
- Spring Events
- Redis Pub/Sub
- WebSocket Listeners

---

## Interview Questions

### 1. What problem does Observer solve?

It allows one object to notify multiple dependent objects without tight coupling.

---

### 2. What is the Subject?

The object being observed.

Example:

```java
OrderService
```

---

### 3. What is an Observer?

An object interested in state changes.

---

### 4. Can observers be added at runtime?

Yes.

```java
addObserver()
removeObserver()
```

---

### 5. Which SOLID principles does Observer support?

- SRP
- OCP
- DIP

---

### 6. How is Observer related to Kafka?

Kafka producers publish events.

Consumers subscribe and react.

This is conceptually similar to Observer.

---

## Common Mistakes

### Mistake 1

Calling services directly inside Subject.

### Mistake 2

Putting business logic inside notifyObservers().

### Mistake 3

Making observers depend on each other.

Observers should remain independent.

---

## Key Takeaway

> The Subject does not know what each observer does.

It only knows:

```java
observer.update();
```

This creates a flexible, scalable, and loosely coupled system.