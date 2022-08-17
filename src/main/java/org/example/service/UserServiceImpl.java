package org.example.service;
import org.example.model.User;
import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException {
        userDao.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDao.cleanUsersTable();
    }


}
