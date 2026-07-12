package com.zaid.lld.fundamentals.solid.srp.good;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
                101,
                "Zaid",
                50000
        );

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeRepository repository = new EmployeeRepository();
        PayslipGenerator payslipGenerator = new PayslipGenerator();
        EmailService emailService = new EmailService();

        double salary = salaryCalculator.calculate(employee);

        repository.save(employee);

        payslipGenerator.generate(employee);

        emailService.send(employee);

        System.out.println("Net Salary : " + salary);

    }

}