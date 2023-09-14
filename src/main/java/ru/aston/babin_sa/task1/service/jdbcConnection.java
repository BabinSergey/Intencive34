package ru.aston.babin_sa.task1.service;

import java.sql.*;
import java.util.ResourceBundle;

public class jdbcConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        ResourceBundle resource = ResourceBundle.getBundle("database");
        String dbUrl = resource.getString("dbUrl");
        String dbUser = resource.getString("dbUser");
        String dbPass = resource.getString("dbPass");


        return DriverManager.getConnection(dbUrl, dbUser, dbPass);
    }
}
