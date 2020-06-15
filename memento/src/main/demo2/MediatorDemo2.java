package main.demo2;

public class MediatorDemo2 {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();

        employee.setName("Rafael Heredia");
        employee.setAddress("some place over there 001");
        employee.setPhone("99 9999 9999");
        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);

        employee.setPhone("444-555-6666");

        caretaker.save(employee);

        System.out.println("Employee after changed phone number save: " + employee);

        employee.setPhone("333-999-6666"); //<--- we haven't called save!

        caretaker.revert(employee);

        System.out.println("Reverts to las save point: " + employee);

        caretaker.revert(employee);

        System.out.println("Reverted to original: " + employee);
    }
}