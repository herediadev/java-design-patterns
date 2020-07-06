package main.demo2;

public class CSVAdapterToEmployee implements Employee {
    private final EmployeeCSV employeeCSV;

    public CSVAdapterToEmployee(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String toString() {
        return "CSVAdapterToEmployee{" +
                "employeeCSV=" + employeeCSV +
                '}';
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmail();
    }

}
