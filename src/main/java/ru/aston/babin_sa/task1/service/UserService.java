package ru.aston.babin_sa.task1.service;

import ru.aston.babin_sa.task1.User;
import ru.aston.babin_sa.task1.dao.UserDao;

import java.sql.*;

public class UserService implements UserDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    @Override
    public User addUser(User user) throws SQLException {

        try {
            connection = jdbcConnection.getConnection();


            String sql = "INSERT INTO db_users (name, surname, age) VALUES (?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getAge());

            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return user;
    }

    @Override
    public User getByIdUser(int id) throws SQLException {
        User user = new User();

        try {

            String sql = "SELECT * FROM db_users WHERE ID=?";

            preparedStatement = jdbcConnection.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user.setName(resultSet.getString(2));
                user.setSurname(resultSet.getString(3));
                user.setAge(resultSet.getInt(4));
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return user;
    }
}

