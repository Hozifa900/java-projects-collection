package com.lab1b.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    private PensionPlan pensionPlan;

    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary,
            PensionPlan pensionPlan) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = pensionPlan;

    }

    // employee with out pension plan
    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    @Override
    public String toString() {
        StringBuilder json = new StringBuilder();
        json.append("{")
                .append("\"#\":").append(employeeId).append(",")
                .append("\"Plan Reference Number\":\"")
                .append(pensionPlan == null ? "" : pensionPlan.getPlanReferenceNumber()).append("\",")
                .append("\"First Name\":\"").append(firstName).append("\",")
                .append("\"Last Name\":\"").append(lastName).append("\",")
                .append("\"yearlySalary\":").append(yearlySalary)
                .append("\"Employment Date\":\"").append(employmentDate).append("\",")
                .append("\"Enrollment Date\":\"")
                .append(pensionPlan == null ? "" : pensionPlan.getEnrollmentDate()).append("\",")
                .append("\"Monthly Contribution\":\"")
                .append(pensionPlan == null ? "null" : pensionPlan.getMonthlyContribution()).append("\",")
                .append("}");
        return json.toString();
    }

}
