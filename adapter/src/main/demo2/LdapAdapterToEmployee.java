package main.demo2;

public class LdapAdapterToEmployee implements Employee {
    private final EmployeeLdap employeeLdap;

    public LdapAdapterToEmployee(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "employeeLdap=" + employeeLdap +
                '}';
    }
}
