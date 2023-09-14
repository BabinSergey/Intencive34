package ru.aston.babin_sa.task1.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.babin_sa.task1.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImplTestJunit {

    @Test
    public void shouldGetUserById() throws SQLException {
        User user = new UserDaoImpl().getByIdUser(1);

        Assertions.assertEquals("Ivan", user.getName());
        Assertions.assertEquals("Ivanov", user.getSurname());
        Assertions.assertEquals(35, user.getAge());
    }

    @Test
    public void shouldAddNewUser() throws SQLException {
        User user = new User("Tomas", "Kuty", 32);
        new UserDaoImpl().addUser(user);

        User userDB = new UserDaoImpl().getUserDB("Tomas", "Kuty", 32);

        Assertions.assertEquals("Tomas", userDB.getName());
        Assertions.assertEquals("Kuty", userDB.getSurname());
        Assertions.assertEquals(32, userDB.getAge());
    }

    @Test
    void shouldDeleteUser() throws SQLException {
        boolean user = new UserDaoImpl().deleteUser(10);

        Assertions.assertFalse(user);
    }

    @Test
    void shouldUpdateUser() throws SQLException {
        User user = new UserDaoImpl().getByIdUser(5);
        user.setName("Vova");
        user.setSurname("Kim");
        user.setAge(25);
        new UserDaoImpl().updateUser(user);

        User actaulUser = new UserDaoImpl().getByIdUser(5);

        Assertions.assertEquals("Vova", actaulUser.getName());
        Assertions.assertEquals("Kim", actaulUser.getSurname());
        Assertions.assertEquals(25, actaulUser.getAge());
    }

    @Test
    void shouldFindAll() throws SQLException {
        List<User> users = new UserDaoImpl().findAll();

        Assertions.assertEquals(8, users.size());
        Assertions.assertNotNull(users);
    }
}
