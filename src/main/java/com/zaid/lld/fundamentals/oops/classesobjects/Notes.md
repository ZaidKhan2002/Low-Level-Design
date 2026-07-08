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

### 1. Difference between Class and Object

**Class:** A blueprint or template that defines properties (fields) and behavior (methods).

**Object:** A runtime instance of a class that occupies memory and can access the class's members.

---

### 2. Default Constructor vs No-Argument Constructor

**Default Constructor:** Automatically provided by the compiler only if no constructor is defined.

**No-Argument Constructor:** Explicitly written by the developer with no parameters.

---

### 3. Can a constructor be private?

**Yes.**

Used to restrict object creation, commonly in the Singleton Pattern, Utility classes, or Factory Methods.

---

### 4. Can a constructor be static?

**No.**

Constructors are used to initialize objects, while `static` members belong to the class and are loaded before any object is created.

---

### 5. Why is `main()` static?

The JVM needs an entry point to start program execution without creating an object of the class. Therefore, `main()` must be `static`.

---

### 6. Why use the `this` keyword?

`this` refers to the current object.

It is commonly used to:
- Resolve naming conflicts between instance variables and parameters.
- Call another constructor using `this()`.
- Pass or return the current object.

---

### 7. Difference between Static and Instance Members

| Static Members | Instance Members |
|----------------|------------------|
| Belong to the class | Belong to an object |
| One shared copy | Separate copy for each object |
| Accessed using the class name | Accessed using an object reference |
| Created when the class is loaded | Created when an object is instantiated |
| Can directly access only static members | Can access both static and instance members |