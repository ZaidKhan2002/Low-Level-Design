package com.zaid.lld.fundamentals.oops.inheritance;

public class Manager extends Employee {

    private int teamSize;

    public Manager(int employeeId,
                   String name,
                   double salary,
                   int teamSize) {

        super(employeeId, name, salary);
        this.teamSize = teamSize;
    }

    public void approveLeave() {
        System.out.println(name + " approved leave.");
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " members.");
    }
}