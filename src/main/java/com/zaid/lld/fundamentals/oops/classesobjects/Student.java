package com.zaid.lld.fundamentals.oops.classesobjects;


/**
 * Demonstrates:
 * 1. Instance variables
 * 2. Static variables
 * 3. Constructors
 * 4. Constructor Overloading
 * 5. this keyword
 * 6. Instance methods
 * 7. Static methods
 */

public class Student {
    // Static variable (shared across all objects)
    static String college = "RAIT";

    // Static variable to count objects
    static int studentCount = 0;

    // Instance Variable
    String name;
    int age;

    // Default Constructor
    public Student() {
        this("Unknown", 18);
    }

    // Constructor Overloading
    public Student(String name) {
        this(name, 18);
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    // Instance Method
    public void display() {
        System.out.println("----------------------");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("College  : " + college);
    }

    // Static Method
    public static void displayStudentCount() {
        System.out.println("Students Created : " + studentCount);
    }
}

