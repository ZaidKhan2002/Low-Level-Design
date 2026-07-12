package com.zaid.lld.fundamentals.solid.srp.good;

public class SalaryCalculator {

    public double calculate(Employee employee) {

        System.out.println("Calculating salary...");

        return employee.getBasicSalary() + 5000;
    }

}