# Single Responsibility Principle (SRP)

## Definition

> A class should have only one reason to change.

A class should focus on a single responsibility. If a class handles multiple responsibilities, it becomes difficult to maintain, test, and extend.

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