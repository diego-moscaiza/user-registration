package DB;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    final String URL_DB = "jdbc:mysql://localhost:3306/user_registration";
    final String USER_DB = "root";
    final String PASS_DB = "123456789";

    public DBConnection() {

        try {
            DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
