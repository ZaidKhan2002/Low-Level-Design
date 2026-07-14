# Interface Segregation Principle (ISP)

## Definition

> Clients should not be forced to depend upon interfaces they do not use.

Instead of creating one large interface, split it into smaller, focused interfaces so that implementing classes only depend on the methods they actually need.

---

## Why do we need ISP?

A large interface often forces classes to implement methods that are irrelevant to them. This leads to:

- Empty method implementations
- `UnsupportedOperationException`
- Unnecessary coupling
- Difficult maintenance

ISP recommends designing small, cohesive interfaces representing a single capability.

---

## Bad Design

```
                Printer
      ┌─────────┼─────────┐
      │         │         │
    print()   scan()    fax()

            ▲
            │
     BasicPrinter
```

`BasicPrinter` only supports printing but is forced to implement scanning and faxing.

Developers usually leave the methods empty or throw `UnsupportedOperationException`.

This is an Interface Segregation Principle violation.

---

## Good Design

```
Printable

Scannable

Faxable
```

```
BasicPrinter
      │
      ▼
 Printable

-------------------------

AllInOnePrinter
      │
      ├── Printable
      ├── Scannable
      └── Faxable
```

Each class depends only on the interfaces it actually requires.

---

## Benefits

- Smaller interfaces
- Better readability
- Easier maintenance
- Reduced coupling
- Higher flexibility
- Better code reuse

---

## Real-World Example

A basic printer can only print.

An all-in-one printer can:

- Print
- Scan
- Fax

It doesn't make sense to force every printer to support all three capabilities.

Similarly, software interfaces should expose only the behavior that implementing classes actually need.

---

## Interview Questions

### What is the Interface Segregation Principle?

Clients should not be forced to depend on interfaces they do not use.

---

### How do you identify an ISP violation?

Common signs include:

- Empty method implementations
- `UnsupportedOperationException`
- Large interfaces with unrelated methods

---

### How is ISP different from SRP?

| SRP | ISP |
|------|-----|
| Focuses on classes | Focuses on interfaces |
| One reason to change | One purpose per interface |

---

### Does ISP mean every interface should contain only one method?

No.

An interface can have multiple methods as long as they belong to the same capability.

---

### Can a class implement multiple interfaces?

Yes.

A class can implement many small interfaces if it supports all those behaviors.

---

### What are the benefits of ISP?

- Lower coupling
- Better maintainability
- Easier testing
- Higher flexibility
- Better extensibility

---

## Key Takeaway

> Design small, focused interfaces so that classes implement only the behavior they actually support.

Avoid forcing clients to depend on methods they don't need.