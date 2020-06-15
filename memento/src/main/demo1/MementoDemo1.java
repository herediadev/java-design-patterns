package main.demo1;

import java.io.*;

public class MementoDemo1 {

    private static Employee deserialize() {
        Employee employee = null;
        try (FileInputStream fileInputStream = new FileInputStream("memento/resources/employee.ser")) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                employee = (Employee) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return employee;
    }

    private static void serialize(Employee employee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("memento/resources/employee.ser");
            ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(employee);
            objectOutput.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Rafael Heredia");
        employee.setAddress("Some place there 001");
        employee.setPhone("99 9999 9999");

        serialize(employee);

        Employee newEmployee = deserialize();

        System.out.println(newEmployee.getName());
    }

}
