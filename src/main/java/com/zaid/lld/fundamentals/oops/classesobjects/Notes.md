# Day 1 - Classes, Objects & Constructors

## Class
A class is a user-defined blueprint that groups state (fields) and behavior (methods).

Example

```java
class Student {
    String name;
    int age;
}
```

---

## Object

Objects are created using the `new` keyword.

```java
Student s = new Student();
```

`new` performs:

1. Allocates memory on Heap
2. Initializes variables with default values
3. Executes constructor
4. Returns object reference

---

## Constructor

A constructor:

- Has same name as class
- Has no return type
- Executes automatically during object creation

---

## Constructor Overloading

Multiple constructors with different parameter lists.

```java
Student()

Student(String name)

Student(String name, int age)
```

---

## this keyword

Used to refer to current object.

Correct

```java
this.name = name;
```

Wrong

```java
name = name;
```

---

## Constructor Chaining

Use

```java
this(...)
```

Must be first statement.

Example

```java
Student() {
    this("Unknown");
}
```

---

## Static Variables

Shared among all objects.

Only one copy exists.

Example

```java
static String college;
```

---

## Instance Variables

Each object has its own copy.

Example

```java
String name;
```

---

## Static Methods

Can access only static members directly.

Called using

```java
Student.displayStudentCount();
```

---

## Interview Questions

- Difference between Class and Object
- Default Constructor vs No-Argument Constructor
- Can constructor be private?
- Can constructor be static?
- Why is main() static?
- Why use this keyword?
- Difference between static and instance members?