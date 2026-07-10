# Day 5 - Inheritance

## Definition

Inheritance allows one class to acquire the properties and behaviors of another class.

It represents an **is-a** relationship.

Example:

Developer **is an** Employee.

Manager **is an** Employee.

---

## Why do we need Inheritance?

- Avoid code duplication.
- Reuse common fields and methods.
- Improve maintainability.
- Support runtime polymorphism.
- Model real-world relationships.

---

## Syntax

```java
class Child extends Parent {

}
```

---

## Example

```java
class Employee {

    void login() {}

}

class Developer extends Employee {

}
```

Developer inherits all accessible members of Employee.

---

## Constructor Chaining

Parent constructors are not inherited.

When creating a child object:

```java
new Developer(...)
```

Execution order:

```text
Developer()

↓

super()

↓

Employee()

↓

Developer()
```

The compiler automatically inserts `super()` if you don't write it.

---

## What is Inherited?

✅ Public methods

✅ Protected methods

✅ Public fields

✅ Protected fields

✅ Package-private members (same package)

---

## What is NOT Inherited?

❌ Constructors

❌ Private methods

❌ Private fields

---

## Method Overriding

A subclass can provide its own implementation of an inherited method.

```java
@Override
public void work() {

}
```

Runtime decides which implementation to execute.

---

## super Keyword

Used to:

- Call parent constructor

```java
super(...)
```

- Access parent methods

```java
super.work();
```

- Access parent fields

```java
super.salary;
```

---

## Types of Inheritance in Java

### Single

```
Employee
   ▲
Developer
```

Supported.

---

### Multilevel

```
Person
   ▲
Employee
   ▲
Manager
```

Supported.

---

### Hierarchical

```
        Employee
      /     |     \
Manager Developer Tester
```

Supported.

---

### Multiple

```
A     B
 \   /
  Child
```

Not supported for classes.

Achieved using interfaces.

---

## Best Practices

- Use inheritance only for true **is-a** relationships.
- Prefer composition when the relationship is **has-a**.
- Keep parent classes focused on common behavior.
- Don't create deep inheritance hierarchies.

---

## Interview Questions

### What is Inheritance?

Mechanism by which one class acquires the properties and behaviors of another.

---

### What is the purpose of `extends`?

To inherit accessible members from the parent class.

---

### Are constructors inherited?

No.

---

### Can private methods be inherited?

No.

---

### Can static methods be overridden?

No.

They are hidden.

---

### Difference between Overloading and Overriding?

Overloading:

- Same method name
- Different parameters
- Compile-time

Overriding:

- Same signature
- Different implementation
- Runtime

---

### What is Constructor Chaining?

Calling parent constructors using `super()` before executing the child constructor.

---

## Key Takeaways

- Inheritance models an **is-a** relationship.
- Constructors are not inherited.
- Parent constructor executes before the child constructor.
- Method overriding enables runtime polymorphism.
- Prefer composition over inheritance when appropriate.