package com.zaid.lld.fundamentals.oops.inheritance;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(101, "Rahul", 50000);

        Manager manager = new Manager(201, "Neha", 120000, 8);

        Developer developer = new Developer(
                301,
                "Zaid",
                90000,
                "Java"
        );

        Tester tester = new Tester(
                401,
                "Aman",
                70000
        );

        System.out.println("===== Employee =====");
        employee.displayInfo();
        employee.login();
        employee.work();

        System.out.println();

        System.out.println("===== Manager =====");
        manager.displayInfo();
        manager.login();
        manager.work();
        manager.approveLeave();

        System.out.println();

        System.out.println("===== Developer =====");
        developer.displayInfo();
        developer.login();
        developer.work();
        developer.writeCode();

        System.out.println();

        System.out.println("===== Tester =====");
        tester.displayInfo();
        tester.login();
        tester.work();
        tester.executeTestCases();
    }
}