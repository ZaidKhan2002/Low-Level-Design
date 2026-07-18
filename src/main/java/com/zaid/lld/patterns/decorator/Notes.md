# Decorator Pattern

## Intent

> Attach additional responsibilities to an object dynamically without modifying its structure.

Decorator allows us to add new behavior by wrapping an existing object instead of creating new subclasses.

---

## Problem Statement

Suppose we have a Coffee class.

Customers can choose:

- Milk
- Sugar
- Whipped Cream

Using inheritance leads to classes such as:

- MilkCoffee
- SugarCoffee
- MilkSugarCoffee
- MilkSugarWhippedCreamCoffee

As combinations increase, the number of subclasses grows rapidly.

This is known as **Subclass Explosion**.

---

## Bad Design

```
Coffee
   ▲
   │
MilkCoffee

SugarCoffee

MilkSugarCoffee

MilkSugarWhippedCreamCoffee
```

Problems:

- Too many subclasses
- Difficult to maintain
- Difficult to extend

---

## Good Design

```
SimpleCoffee

↓

MilkDecorator

↓

SugarDecorator

↓

WhippedCreamDecorator
```

Each decorator wraps another Coffee object and adds new behavior.

---

## Components

### Component

Defines the common interface.

Example:

```java
Coffee
```

---

### Concrete Component

The original object.

Example:

```java
SimpleCoffee
```

---

### Decorator

Abstract wrapper implementing the same interface.

Example:

```java
CoffeeDecorator
```

---

### Concrete Decorators

Examples:

- MilkDecorator
- SugarDecorator
- WhippedCreamDecorator

---

## Advantages

- Prevents subclass explosion
- Follows Open/Closed Principle
- Supports runtime behavior changes
- Encourages composition over inheritance
- Easy to add new decorators

---

## Disadvantages

- More classes
- Long chains of decorators may reduce readability
- Debugging nested decorators can be harder

---

## Real World Examples

### Java I/O

```java
new BufferedInputStream(
    new FileInputStream("file.txt"));
```

---

### Spring Boot

- Logging Decorator
- Security Filters
- Caching Layers

---

### Food Delivery Apps

Base Pizza

↓

Cheese

↓

Olives

↓

Corn

↓

Extra Cheese

---

## Interview Questions

### 1. What problem does Decorator solve?

It adds behavior dynamically without modifying existing classes.

---

### 2. Why not use inheritance?

Inheritance creates subclass explosion when many feature combinations exist.

---

### 3. Which OOP principle is the foundation of Decorator?

**Composition over Inheritance.**

---

### 4. Which SOLID principles does Decorator support?

- SRP
- OCP
- DIP

---

### 5. Can decorators be chained?

Yes.

```java
Coffee coffee =
    new SugarDecorator(
        new MilkDecorator(
            new SimpleCoffee()));
```

---

### 6. Where is Decorator used in Java?

- BufferedInputStream
- BufferedReader
- DataInputStream
- GZIPInputStream

---

## Common Mistakes

### Mistake 1

Using inheritance for every combination.

---

### Mistake 2

Adding business logic inside the abstract decorator.

---

### Mistake 3

Confusing Decorator with Proxy.

Decorator adds behavior.

Proxy controls access.

---

## Key Takeaway

> **Decorator wraps an existing object to add new behavior dynamically while keeping the original object unchanged.**