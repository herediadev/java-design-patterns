package main.demo2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private final DbSingleton instance;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();

            Statement statement = connection.createStatement();
            count = statement.executeUpdate("create table Address(id integer, streetName varchar(20),city varchar(20))");
            System.out.println("tabled created");
            System.out.println(count);
            statement.close();
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("insert into Address(id,streetName,city) values (1,'1234 some street','Layton')");
            System.out.println(count + " record(s) created");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Address");

            while (resultSet.next()) {
                addresses.add(new Address(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
            }

            connection.close();
            statement.close();
            resultSet.close();

            return addresses;
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return addresses;
    }
}
