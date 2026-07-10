package com.zaid.lld.fundamentals.oops.inheritance;

/**
 * Parent class representing a generic employee.
 */
public class Employee {

    protected int employeeId;
    protected String name;
    protected double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void login() {
        System.out.println(name + " logged into the system.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : ₹" + salary);
    }
}
