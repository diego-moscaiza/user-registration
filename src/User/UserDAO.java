package User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private final Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void createUser(UserModel user) {
        String query = "{CALL create_user(?, ?, ?, ?)}";
        try {
            CallableStatement statement = connection.prepareCall(query);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getUserSurname());
            statement.setInt(3, user.getUserAge());
            statement.setString(4, user.getUserAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public List<UserModel> getAllUser() {
        List<UserModel> users = new ArrayList<>();
        String query = "{CALL get_all_users()}";
        try {
            CallableStatement statement = connection.prepareCall(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                UserModel user = new UserModel(resultSet.getString("name"), resultSet.getString("email"), resultSet.getInt("password"), resultSet.getString("name"));
                user.setUserId(resultSet.getInt("id"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return users;
    }
}
