package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserService userDao = new UserServiceImpl();
        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Ivanov", (byte) 25);
        userDao.saveUser("Petr", "Petrov", (byte) 30);
        userDao.saveUser("Sidor", "Sidorov", (byte) 35);
        userDao.saveUser("Vasilii", "Fet", (byte) 74);

        userDao.removeUserById(2);

       userDao.getAllUsers();

        userDao.cleanUsersTable();

        userDao.dropUsersTable();
    }

}

