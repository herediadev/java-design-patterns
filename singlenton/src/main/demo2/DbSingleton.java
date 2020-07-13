package main.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static volatile DbSingleton instance;
    private static volatile Connection connection;

    private DbSingleton() {
        if (connection != null) throw new RuntimeException("Use getInstance() method to create");

        if (instance != null) throw new RuntimeException("Use getInstance() method to create");
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null)
                    instance = new DbSingleton();
            }
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            synchronized (DbSingleton.class) {
                if (connection == null || connection.isClosed()) {
                    String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
