package ru.aston.babin_sa.task1.dao;

import ru.aston.babin_sa.task1.model.User;
import ru.aston.babin_sa.task1.db.JdbcConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    @Override
    public User addUser(User user) throws SQLException {

        try {
            String sql = "INSERT INTO db_users (name, surname, age) VALUES (?, ?, ?);";

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);
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
    public boolean deleteUser(int id) throws SQLException {
        try {
            String sql = "DELETE FROM db_users WHERE ID=?";

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            return preparedStatement.executeUpdate() > 0;

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
    }

    @Override
    public User updateUser(User user) throws SQLException {
        try {
            String sql = "UPDATE db_users SET name=?, surname=?, age=? WHERE id=?";

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setInt(3, user.getAge());
            preparedStatement.setInt(4, user.getId());

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

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user.setId(resultSet.getInt(1));
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

    @Override
    public List<User> findAll() throws SQLException {
        List<User> users = new ArrayList<>();

        try {
            String sql = "SELECT * FROM db_users";

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");

                User user = new User(name, surname, age);

                users.add(user);
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
        return users;
    }

    public User getUserDB(String name, String surname, int age) throws SQLException {
        User user = new User();

        try {
            String sql = "SELECT * FROM db_users WHERE name=? AND surname=? AND age=?";

            preparedStatement = JdbcConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, age);

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

