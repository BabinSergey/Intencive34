package ru.aston.babin_sa.task1.dao;

import ru.aston.babin_sa.task1.User;

import java.sql.SQLException;

public interface UserDao {
    User addUser(User user) throws SQLException, ClassNotFoundException;
    User getByIdUser(int id) throws SQLException;
}
