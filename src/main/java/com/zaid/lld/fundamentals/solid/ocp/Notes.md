# Open Closed Principle (OCP)

## Definition

> Software entities (classes, modules, functions, etc.) should be **open for extension but closed for modification**.

This means we should be able to introduce new behavior without changing already tested and stable code.

---

# Why do we need OCP?

Suppose an application supports Card and UPI payments.

Tomorrow the business asks for:

- Wallet
- PayPal
- Net Banking
- Apple Pay

If we keep modifying the same PaymentService class every time, the code becomes:

- Hard to maintain
- Error-prone
- Difficult to test
- Full of merge conflicts

Instead, we should extend the application by adding new classes.

---

# Bad Design

```text
PaymentService

if(Card)
else if(UPI)
else if(Wallet)
else if(PayPal)
...
```

Every new payment method requires modifying existing code.

---

# Good Design

```text
                 Payment
                    ▲
      ┌─────────────┼──────────────┐
      │             │              │
 CardPayment   UpiPayment   WalletPayment
```

Each payment type implements the same interface.

Adding a new payment method requires creating a new implementation instead of modifying existing code.

---

# Advantages

- Easy to extend
- Low risk of regression bugs
- Cleaner code
- Better scalability
- Encourages polymorphism

---

# Real World Example

Visual Studio Code supports extensions.

Adding Python support doesn't require changing the editor itself.

A new extension is simply added.

This is an example of the Open Closed Principle.

---

# Interview Questions

### What is OCP?

A class should be open for extension but closed for modification.

---

### Why is if-else considered a violation?

Because every new requirement forces modification of existing code.

---

### Which OOP concept helps implement OCP?

- Abstraction
- Interfaces
- Polymorphism

---

### Does using interfaces always guarantee OCP?

No.

If the code still uses `if`, `switch`, or `instanceof` to distinguish implementations, OCP is still violated.

---

# Key Takeaway

> Don't modify existing, tested code for every new feature.

Instead,

> Add new classes that extend the system's behavior.