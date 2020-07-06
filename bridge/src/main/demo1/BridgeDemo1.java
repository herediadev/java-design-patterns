package main.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo1 {

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // <- Driver
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection connection = DriverManager.getConnection(dbUrl);
            Statement statement = connection.createStatement();
            //this client is an abstraction and can work with any database that has a driver
            statement.executeUpdate("create table Address(id int, streetName varchar(20), city varchar(20))");
            System.out.println("Table created");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
