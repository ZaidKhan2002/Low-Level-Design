package com.zaid.lld.fundamentals.solid.srp.bad;

public class Employee {

    private int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        System.out.println("Calculating salary...");
        return basicSalary + 5000;
    }

    public void saveToDatabase() {
        System.out.println("Saving employee to database...");
    }

    public void generatePayslip() {
        System.out.println("Generating payslip...");
    }

    public void sendEmail() {
        System.out.println("Sending email to employee...");
    }
}