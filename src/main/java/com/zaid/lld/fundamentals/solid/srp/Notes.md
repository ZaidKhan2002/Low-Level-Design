# Single Responsibility Principle (SRP)

## Definition

> A class should have only one reason to change.

A class should focus on a single responsibility. If a class handles multiple responsibilities, it becomes difficult to maintain, test, and extend.

---

## Why do we need SRP?

As software evolves, different parts of a system change for different reasons. If a single class handles multiple responsibilities, even a small requirement change can force modifications to unrelated code, increasing the chances of bugs and making maintenance difficult.

By assigning one responsibility per class, changes remain localized and the code becomes easier to understand, test, and extend.

---

## Bad Design

The `Employee` class is responsible for:

- Holding employee information
- Calculating salary
- Saving data to the database
- Generating payslips
- Sending emails

This means changes in salary rules, database technology, email provider, or payslip format all require modifications to the same class.

---

## Good Design

Responsibilities are separated into different classes:

- `Employee` → Employee data
- `SalaryCalculator` → Salary calculation
- `EmployeeRepository` → Database operations
- `PayslipGenerator` → Payslip generation
- `EmailService` → Email notifications

Each class now has exactly one reason to change.

---

## Benefits

- Easier to maintain
- Easier to test
- Better readability
- Lower coupling
- Higher cohesion
- Smaller and focused classes
- Reduced merge conflicts in team environments

---

## Real-World Example

Consider a restaurant:

- Chef → Cooks food
- Cashier → Handles billing
- Waiter → Serves customers
- Cleaner → Cleans tables

Each role has a single responsibility. If GST rules change, only the cashier's work changes—not the chef's or waiter's.

Similarly, in software, each class should have one responsibility and therefore one reason to change.

---

## Interview Questions

### What is the Single Responsibility Principle?

A class should have only one reason to change. It should focus on a single responsibility or concern.

---

### What does "one reason to change" mean?

It means a class should change only when its own responsibility changes. If a class changes because of multiple independent business requirements, it is likely violating SRP.

---

### Does SRP mean a class should have only one method?

**No.**

A class can have multiple methods as long as they all contribute to the same responsibility.

Example:

```java
class Calculator {
    add();
    subtract();
    multiply();
    divide();
}
```

This follows SRP because every method is related to mathematical calculations.

---

### How do you identify an SRP violation?

Ask yourself:

- Does this class have multiple responsibilities?
- Could different teams modify this class for different reasons?
- Does it interact with unrelated systems (database, email, logging, etc.)?

If the answer is **yes**, the class is likely violating SRP.

---

### What are the advantages of SRP?

- Easier maintenance
- Better readability
- Easier unit testing
- Lower coupling
- Higher cohesion
- Reduced regression bugs
- Improved code reusability

---

### Is it okay to have many methods in a class?

Yes, provided all methods contribute to the same responsibility.

The number of methods is **not** what SRP measures.

---

### Which SOLID principle is most closely related to cohesion?

**Single Responsibility Principle (SRP)** because it encourages high cohesion by keeping related behavior together.

---

### Can applying SRP too aggressively be a problem?

Yes.

Creating a separate class for every tiny operation can lead to an excessive number of classes, making the codebase harder to navigate.

The goal is **logical separation of responsibilities**, not maximizing the number of classes.

---

## Key Takeaway

> A class should have only one reason to change—not necessarily one method or one function.

If multiple independent requirements can force changes to the same class, consider splitting the responsibilities into separate classes.