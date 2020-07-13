package main.demo2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo2 {

    public static void main(String[] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0L;
        long timeAfter = 0L;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        try {
            Statement statement = connection.createStatement();
            int count = statement.executeUpdate("create table Address (Id int, StreetName varchar(20), City varchar(20))");
            System.out.println("Table created");
            statement.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
    }
}
