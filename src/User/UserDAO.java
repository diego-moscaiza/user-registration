package User;

import DB.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class UserDao {

    DBConnection connection;

    public UserDao() {
        connection = new DBConnection();
    }
    
   public ArrayList<UserModel> selectAllUser() {
        ArrayList<UserModel> userLists = new ArrayList<>();
        String query = "{CALL sp_select_all_users()}";
        try {
            Connection accessDB = connection.getConnetion();
            CallableStatement statement = accessDB.prepareCall(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                UserModel userModel = new UserModel();
                userModel.setUserId(rs.getInt(1));
                userModel.setUserName(rs.getString(2));
                userModel.setUserSurname(rs.getString(3));
                userModel.setUserAge(rs.getInt(4));
                userModel.setUserAddress(rs.getString(5));
                userLists.add(userModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userLists;
    }

    public String createUser(String userName, String userSurname, int userAge, String userAddress) {
        String responseRegistration = null;
        String query = "{CALL sp_create_user(?, ?, ?, ?)}";
        try {
            Connection accessDB = connection.getConnetion();
            CallableStatement statement = accessDB.prepareCall(query);
            statement.setString(1, userName);
            statement.setString(2, userSurname);
            statement.setInt(3, userAge);
            statement.setString(4, userAddress);
            
            int numberRowAffected = statement.executeUpdate();
            
            if(numberRowAffected > 0){
                responseRegistration = "Registro Existoso";
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return responseRegistration;
    }

}
