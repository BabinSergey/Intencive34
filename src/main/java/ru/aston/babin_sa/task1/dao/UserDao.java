package ru.aston.babin_sa.task1.dao;

import ru.aston.babin_sa.task1.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    User addUser(User user) throws SQLException, ClassNotFoundException;

    boolean deleteUser(int id) throws SQLException;

    User updateUser(User user) throws SQLException;

    User getByIdUser(int id) throws SQLException;

    List<User> findAll() throws SQLException;
}
