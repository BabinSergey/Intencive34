package ru.aston.babin_sa.task1.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.sql.*;

public class JdbcConnectionTest {

    Exception ex;

    @Test
    void getConnection_shouldConnection() {
        try {
            JdbcConnection.getConnection();
        } catch (SQLException | ClassNotFoundException e) {
            ex = e;
        }
        Assertions.assertNull(ex);
    }

    @Test
    void getConnection_shouldNotConnection_SQLException() {
        try (MockedStatic<JdbcConnection> conn = Mockito.mockStatic(JdbcConnection.class)) {
            conn.when(JdbcConnection::getConnection).thenThrow(SQLException.class);

            Assertions.assertThrows(SQLException.class, JdbcConnection::getConnection);
        }
    }

    @Test
    void getConnection_shouldNotConnection_ClassNotFoundException() {
        try (MockedStatic<JdbcConnection> conn = Mockito.mockStatic(JdbcConnection.class)) {
            conn.when(JdbcConnection::getConnection).thenThrow(ClassNotFoundException.class);

            Assertions.assertThrows(ClassNotFoundException.class, JdbcConnection::getConnection);
        }
    }
}
