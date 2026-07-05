package com.zaid.lld.fundamentals.oops.classesobjects;

public class Main {
    public static void main(String[] args){
        // Default Constructor
        Student s1 = new Student();

        // One Parameter Constructor
        Student s2 = new Student("ABC");

        // Two Parameter Constructor
        Student s3 = new Student("XYZ", 25);

        s1.display();
        s2.display();
        s3.display();

        Student.displayStudentCount();

        // Static variable is shared
        Student.college = "DY Patil University";

        System.out.println("\nAfter changing static variable:\n");

        s1.display();
        s2.display();
        s3.display();

        Student.displayStudentCount();
    }
}
