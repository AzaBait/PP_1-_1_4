package org.example;

import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;
import org.example.util.Util;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) throws SQLException {

        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();
        userDao.saveUser("Azamat", "Baitashov", (byte) 35);
        userDao.saveUser("Ruslan", "Maratov", (byte) 29);
        userDao.saveUser("Anvar", "Mirzaev", (byte) 25);
        userDao.saveUser("Nikolay", "Petrov", (byte) 38);
//        List<User> users= daoJdbc.getAllUsers();
//        System.out.println(users);
//              daoJdbc.cleanUsersTable();
//        userDao.dropUsersTable();

    }
}
