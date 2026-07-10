package com.zaid.lld.fundamentals.oops.inheritance;


public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int employeeId,
                     String name,
                     double salary,
                     String programmingLanguage) {

        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(name + " is writing " + programmingLanguage + " code.");
    }

    @Override
    public void work() {
        System.out.println(name + " is developing backend services using " + programmingLanguage + ".");
    }
}
