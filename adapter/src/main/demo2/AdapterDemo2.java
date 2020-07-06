package main.demo2;

import java.util.List;

public class AdapterDemo2 {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
