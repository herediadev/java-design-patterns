package main.demo2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacadeDemo2 {
    public static void main(String[] args) {
        try {
            DbSingleton instance = DbSingleton.getInstance();

            Connection connection = instance.getConnection();

            Statement statement = connection.createStatement();
            int count = statement.executeUpdate("create table Address(id integer, streetName varchar(20),city varchar(20))");
            System.out.println("tabled created");
            System.out.println(count);
            statement.close();

            statement = connection.createStatement();
            count = statement.executeUpdate("insert into Address(id,streetName,city) values (1,'1234 some street','Layton')");
            System.out.println(count + " record(s) created");
            statement.close();

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Address");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
