package ru.aston.babin_sa.task1.service;

import org.junit.Test;
import ru.aston.babin_sa.task1.User;

import java.sql.*;


public class jdbcExTest {

    @Test
    public void shouldConnection() throws SQLException, ClassNotFoundException {
        jdbcConnection.getConnection();
    }

    @Test
    public void shouldGetUserById() throws SQLException {
        User user = new UserService().getByIdUser(1);
        System.out.println(user);
    }

    @Test
    public void shouldAddNewUser() throws SQLException {
        User user = new User("Bob", "Kim", 22);
        new UserService().addUser(user);
    }

}
