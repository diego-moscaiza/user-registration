package User;

import java.sql.*;
import java.util.List;


/**
 *
 * @author Diego Moscaiza
 */
public class UserController {
    private final UserDao userDao;

    public UserController(Connection connection) {
        this.userDao = new UserDao(connection);
    }

    public void createUser(String name, String surname, int age, String address) {
        UserModel user = new UserModel(name, surname, age, address);
        userDao.createUser(user);
    }

    public List<UserModel> getAllUsers() {
        return userDao.getAllUser();
    }
}
