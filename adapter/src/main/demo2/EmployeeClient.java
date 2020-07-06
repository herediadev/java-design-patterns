package main.demo2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        //Will not work! This is where the adapter comes into play
        //Employee employeeLdap = new EmployeeLdap("4321","Solo","Han","solo@han.com");

        EmployeeLdap employeeLdap = new EmployeeLdap("4321", "Solo", "Han", "solo@han.com");

        employees.add(new LdapAdapterToEmployee(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

        employees.add(new CSVAdapterToEmployee(employeeCSV));

        return employees;
    }
}
