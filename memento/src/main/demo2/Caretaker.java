package main.demo2;

import java.util.Stack;

//caretaker
public class Caretaker {

    private final Stack<EmployeeMemento> employeeHistory;

    public Caretaker() {
        this.employeeHistory = new Stack<>();
    }

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());

    }
}
