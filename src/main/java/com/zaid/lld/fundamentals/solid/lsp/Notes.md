# Liskov Substitution Principle (LSP)

## Definition

> Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.

In simple terms, if class `B` extends class `A`, then an object of `B` should be usable wherever an object of `A` is expected without changing the program's behavior.

---

## Why do we need LSP?

Inheritance should model behavior, not just an "is-a" relationship.

A subclass must honor the contract established by its parent. If replacing a parent object with its child changes the expected behavior, the design violates the Liskov Substitution Principle.

---

## Bad Design

```
Rectangle
    ▲
    │
 Square
```

The `Square` class overrides `setWidth()` and `setHeight()` to keep all sides equal.

This changes the behavior expected from `Rectangle`.

Example:

```java
Rectangle rectangle = new Square();

rectangle.setWidth(5);
rectangle.setHeight(10);

System.out.println(rectangle.getArea());
```

Expected Output:

```
50
```

Actual Output:

```
100
```

The subclass breaks the contract of the parent.

---

## Good Design

```
            Shape
              ▲
        ┌─────┴─────┐
        │           │
   Rectangle     Square
```

Instead of forcing inheritance, both classes implement a common abstraction.

Each class manages its own dimensions independently.

---

## Benefits

- Correct use of inheritance
- Predictable behavior
- Better maintainability
- Improved extensibility
- Reduced runtime bugs

---

## Real-World Example

Imagine a USB keyboard.

If your computer supports a USB keyboard, replacing one brand with another should not change how typing works.

Similarly, a subclass should behave as expected wherever its parent is used.

---

## Interview Questions

### What is the Liskov Substitution Principle?

A subclass should be replaceable for its parent without altering the correctness or expected behavior of the program.

---

### Why does `Square` extending `Rectangle` violate LSP?

A `Rectangle` allows width and height to change independently.

A `Square` cannot do this because all sides must remain equal.

Overriding the setters changes the expected behavior, violating the parent's contract.

---

### Is inheritance always a violation of LSP?

No.

Inheritance is perfectly valid as long as the subclass preserves the behavior promised by the parent.

---

### What is meant by a "behavioral contract"?

A parent class defines certain expectations through its methods.

A subclass must honor those expectations without introducing unexpected behavior.

---

### How can LSP violations be avoided?

- Prefer composition when inheritance doesn't represent behavior correctly.
- Ensure subclasses don't weaken or change the parent's contract.
- Design abstractions around shared behavior.

---

### Which SOLID principle is most closely related to inheritance?

Liskov Substitution Principle (LSP).

It ensures inheritance is used correctly.

---

## Key Takeaway

> Inheritance is about behavioral compatibility, not just "is-a" relationships.

If replacing a parent object with its child changes the program's expected behavior, the design violates the Liskov Substitution Principle.