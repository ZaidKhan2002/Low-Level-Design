# Day 3 - Abstraction

## Definition

Abstraction is the process of hiding implementation details and exposing only the essential functionality.

In simple words:

> Show **what** an object does, not **how** it does it.

---

## Why do we need Abstraction?

- Reduces complexity.
- Hides unnecessary implementation details.
- Provides a common blueprint for related classes.
- Improves code maintainability and extensibility.

---

## Real World Example

An ATM exposes operations like:

- Withdraw
- Deposit
- Check Balance

The customer does not know:

- Database queries
- Cash dispensing mechanism
- Authentication process

Only the required functionality is exposed.

---

## Abstract Class

An abstract class is an incomplete blueprint that **cannot be instantiated**.

```java
public abstract class Payment {

}
```

❌ Not Allowed

```java
Payment payment = new Payment();
```

---

## Abstract Methods

An abstract method has no implementation.

```java
public abstract void process();
```

Every concrete subclass must provide its own implementation.

---

## Concrete Methods

Abstract classes can also contain implemented methods.

```java
public void validate() {
    System.out.println("Validating Payment");
}
```

These methods are inherited by all subclasses.

---

## Constructors

Abstract classes can have constructors.

```java
public Payment(double amount) {
    this.amount = amount;
}
```

The constructor is executed when a subclass object is created using `super()`.

---

## Instance Variables

Abstract classes can have fields.

```java
protected double amount;
protected String transactionId;
```

These are inherited by subclasses.

---

## Static Methods

Abstract classes can contain static methods.

```java
public static void printInfo() {

}
```

Called using the class name.

---

## Final Methods

Abstract classes can contain final methods.

```java
public final void generateReceipt() {

}
```

Subclasses cannot override them.

---

## Private Methods

(Java 9+)

Abstract classes can contain private helper methods.

---

## When should we use an Abstract Class?

Use an abstract class when:

- Related classes share common state.
- Related classes share common behavior.
- Some methods should be implemented once.
- Some methods should be implemented differently by subclasses.

Example:

```text
Payment
│
├── validate()
├── generateReceipt()
└── process()   <-- implemented differently
```

---

## Encapsulation vs Abstraction

| Encapsulation | Abstraction |
|---------------|-------------|
| Hides data | Hides implementation |
| Achieved using access modifiers | Achieved using abstract classes and interfaces |
| Protects object state | Reduces complexity |
| Focuses on "How data is accessed" | Focuses on "What an object does" |

---

## Best Practices

- Keep common logic inside the abstract class.
- Keep only varying behavior abstract.
- Don't create an abstract class unless it represents a meaningful abstraction.
- Don't force inheritance where composition is a better choice.

---

## Interview Questions

### What is Abstraction?

Hiding implementation details while exposing only the required functionality.

---

### Can we create an object of an abstract class?

No.

Abstract classes cannot be instantiated.

---

### Can an abstract class have constructors?

Yes.

They are invoked by subclasses using `super()`.

---

### Can an abstract class have instance variables?

Yes.

---

### Can an abstract class have static methods?

Yes.

---

### Can an abstract class have final methods?

Yes.

---

### Can an abstract class have private methods?

Yes (Java 9+).

---

### Can an abstract class have no abstract methods?

Yes.

It may still be declared abstract to prevent direct instantiation.

---

### Can an abstract class be final?

No.

`abstract` requires inheritance, whereas `final` prevents inheritance.

---

## Key Takeaways

- Hide implementation, not functionality.
- Abstract classes provide partial implementation.
- Subclasses complete the implementation.
- Use abstract classes when related classes share state and behavior.
- Think of an abstract class as an incomplete blueprint.