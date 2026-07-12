package com.zaid.lld.fundamentals.solid.srp.bad;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
                101,
                "Zaid",
                50000
        );

        employee.calculateSalary();
        employee.saveToDatabase();
        employee.generatePayslip();
        employee.sendEmail();

    }

}
