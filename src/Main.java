import User.*;

/**
 *
 * @author Diego Moscaiza
 */
public class Main {
    
    public static void main(String[] args) {
        UserJFrame userJFrame = new UserJFrame();
        UserDao userDao = new UserDao();
        UserController userController = new UserController(userDao, userJFrame);
        
        userController.getClass();
        
        userJFrame.setVisible(true);
        userJFrame.setLocationRelativeTo(null);
    }
}
