package ru.aston.babin_sa.task1.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.aston.babin_sa.task1.model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class UserDaoImplTestMock {

    @Mock
    UserDaoImpl userDao;

    @Test
    public void shouldGetUserById() throws SQLException {
        // Сравниваем реальный объект с ожидаемым Mock объектом
        User user = new UserDaoImpl().getByIdUser(1);

        userDao = Mockito.mock(UserDaoImpl.class);

        User expectedUser = new User();
        expectedUser.setName("Ivan");
        expectedUser.setSurname("Ivanov");
        expectedUser.setAge(35);

        when(userDao.getByIdUser(1)).thenReturn(expectedUser);

        Assertions.assertEquals(expectedUser, user);

        // Сравниваем Mock объект с данными
        Assertions.assertEquals("Ivan", expectedUser.getName());
        Assertions.assertEquals("Ivanov", expectedUser.getSurname());
        Assertions.assertEquals(35, expectedUser.getAge());
    }

    @Test
    public void shouldAddNewUser() throws SQLException {
        userDao = Mockito.mock(UserDaoImpl.class);

        User expectedUser = new User();
        expectedUser.setName("Petr");
        expectedUser.setSurname("Petrov");
        expectedUser.setAge(25);

        when(userDao.addUser(expectedUser)).thenReturn(expectedUser);

        // Проверяем, что метод не был вызван
        verify(userDao, never()).addUser(expectedUser);

        // Сравниваем Mock с данными
        Assertions.assertEquals("Petr", expectedUser.getName());
        Assertions.assertEquals("Petrov", expectedUser.getSurname());
        Assertions.assertEquals(25, expectedUser.getAge());
    }

    @Test
    void shouldDeleteUser() throws SQLException {
        userDao = Mockito.mock(UserDaoImpl.class);

        when(userDao.deleteUser(10)).thenReturn(false);
        verify(userDao, never()).deleteUser(10);

        Assertions.assertFalse(userDao.deleteUser(10));
    }

    @Test
    void shouldUpdateUser() throws SQLException {
        userDao = Mockito.mock(UserDaoImpl.class);

        User expectedUser = new User();
        expectedUser.setName("Vova");
        expectedUser.setSurname("Kim");
        expectedUser.setAge(25);

        when(userDao.updateUser(expectedUser)).thenReturn(expectedUser);

        User user = new User("Vova", "Kim", 25);

        Assertions.assertEquals(user, expectedUser);;
    }

    @Test
    void shouldFindAll() throws SQLException {
        userDao = Mockito.mock(UserDaoImpl.class);

        List<User> expectedUserList = new ArrayList<>();
        User user1 = new User("Ivan", "Ivanov", 35);
        User user2 = new User("Petr", "Sidorov", 18);
        User user3 = new User("Katy", "Mironova", 21);
        User user4 = new User("Mariya", "Evseeva", 31);
        expectedUserList.add(user1);
        expectedUserList.add(user2);
        expectedUserList.add(user3);
        expectedUserList.add(user4);

        when(userDao.findAll()).thenReturn(expectedUserList);

        Assertions.assertEquals(4, expectedUserList.size());
        Assertions.assertNotNull(expectedUserList);
    }
}
