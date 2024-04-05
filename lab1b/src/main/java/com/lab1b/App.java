package com.lab1b;

import com.lab1b.model.Employee;
import com.lab1b.model.PensionPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = readEmployeeData();

        employeeList(employees);

        upcomingEnrolleesReport(employees);
    }

    private static List<Employee> readEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "Daniel", "Agar", LocalDate.of(2018, 01, 17), 105945.50,
                new PensionPlan("EX1089", LocalDate.of(2023, 01, 17), 100.00)));
        employees.add(new Employee(2L, "Benard", "Shaw", LocalDate.of(2019, 04, 03), 197750.00));
        employees.add(new Employee(3L, "Carly", "Agar", LocalDate.of(2014, 05, 16), 842000.75,
                new PensionPlan("EX1089", LocalDate.of(2019, 11, 04), 100.00)));
        employees.add(new Employee(4L, "Wesley", "Schneider", LocalDate.of(2019, 05, 02), 74500.00));
        return employees;
    }

    private static void employeeList(List<Employee> employees) {

        // employees.sort((e1, e2) -> {
        // int lastNameComparison = e1.getLastName().compareTo(e2.getLastName());
        // if (lastNameComparison != 0) {
        // return lastNameComparison;
        // }
        // return Double.compare(e2.getYearlySalary(), e1.getYearlySalary()); // for
        // descending order
        // });
        System.out.println();
        System.out.println("<--------- List of sorted Employees under condition: ----------->");
        System.out.println("[");
        employees.stream().sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary,
                Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("]");
        System.out.println();
    }

    private static void upcomingEnrolleesReport(List<Employee> employees) {

        System.out.println("<--------- Monthly Upcoming Enrollees report: ----------->");

        // employees.sort((e1, e2) -> {
        // return e1.getEmploymentDate().compareTo(e2.getEmploymentDate());
        // });

        System.out.println("[");
        employees.stream().sorted(Comparator.comparing(Employee::getEmploymentDate))
                .filter((x) -> (x.getEmploymentDate().plusYears(5).minusMonths(1).isBefore(LocalDate.now())
                        &&
                        x.getEmploymentDate().plusYears(5).isAfter(LocalDate.now())))
                .forEach(System.out::println);
        System.out.println("]");
        System.out.println();

    }
}
