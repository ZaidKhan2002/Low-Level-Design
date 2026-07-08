# Day 2 - Encapsulation

## Definition

Encapsulation is the process of protecting an object's internal state by restricting direct access and exposing only controlled operations.

In simple words:

> Hide the data. Expose the behavior.

---

## Why do we need Encapsulation?

Without encapsulation:

- Anyone can modify object data.
- Invalid object states become possible.
- Business rules are bypassed.

Example:

```java
account.balance = -5000;
```

This should never be allowed.

---

## Solution

Keep fields private.

```java
private double balance;
```

Expose methods that validate data.

```java
deposit()

withdraw()
```

Instead of

```java
setBalance()
```

---

## Getters

Getter provides read-only access.

Example

```java
public double getBalance() {
    return balance;
}
```

Reading data is different from modifying data.

---

## Setters

Avoid generating setters blindly.

Bad

```java
setBalance(double balance)
```

Good

```java
deposit()

withdraw()

transfer()
```

Expose business operations instead of raw data modification.

---

## Access Modifiers

| Modifier | Same Class | Same Package | Child Class | Other Package |
|------------|:----------:|:------------:|:-----------:|:-------------:|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ✅* |
| public | ✅ | ✅ | ✅ | ✅ |

*Protected is also accessible in subclasses outside the package.

---

## Best Practices

- Keep fields private.
- Validate input before modifying state.
- Don't expose unnecessary setters.
- Expose behavior instead of data.
- Objects should always remain in a valid state.

---

## Interview Questions

### What is Encapsulation?

Protecting an object's state by restricting direct access and exposing controlled operations.

---

### Is Encapsulation the same as Data Hiding?

No.

Data hiding is achieved using access modifiers.

Encapsulation is the broader principle of controlling access to an object's state.

---

### Why shouldn't every field have a setter?

Because setters can bypass business rules and allow invalid object states.

---

### Why is getBalance() acceptable?

It provides read-only access while still protecting modification through controlled methods.

---

### Which is better?

```java
employee.setSalary(80000);
```

OR

```java
employee.giveRaise(10);
```

Answer:

`giveRaise()` because it represents a business operation and preserves business rules.

---

## Key Takeaways

- Hide implementation details.
- Protect object state.
- Expose meaningful behavior.
- Think in terms of business operations, not raw data manipulation.