package com.zaid.lld.fundamentals.oops.inheritance;

public class Tester extends Employee {

    public Tester(int employeeId,
                  String name,
                  double salary) {

        super(employeeId, name, salary);
    }

    public void executeTestCases() {
        System.out.println(name + " is executing test cases.");
    }

    @Override
    public void work() {
        System.out.println(name + " is testing the application.");
    }
}
