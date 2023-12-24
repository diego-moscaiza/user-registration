package User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Moscaiza
 */
public class UserController implements ActionListener {

    UserDao userDao = new UserDao();
    UserJFrame userJFrame = new UserJFrame();
    
    public UserController(UserDao userDao, UserJFrame userJFrame) {
        this.userDao = userDao;
        this.userJFrame = userJFrame;
        ButtonAction();
    }
    
    private void ButtonAction() {
        userJFrame.jButtonAddUser.addActionListener(this);
        userJFrame.jButtonListUsers.addActionListener(this);
    }

    private void FillTable(JTable userTable) {
        DefaultTableModel userTableModel = new DefaultTableModel();
        userTable.setModel(userTableModel);

        userTableModel.addColumn("Id");
        userTableModel.addColumn("Nombre");
        userTableModel.addColumn("Apellidos");
        userTableModel.addColumn("Edad");
        userTableModel.addColumn("Dirección");

        ArrayList<UserModel> users = userDao.selectAllUser();
        
        for (UserModel user : users) {
            Object[] column = {
                user.getUserId(),
                user.getUserName(),
                user.getUserSurname(),
                user.getUserAge(),
                user.getUserAddress()
            };
            userTableModel.addRow(column);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnAddUser = userJFrame.jButtonAddUser;
        JButton btnListUsers = userJFrame.jButtonListUsers;
        
        if(e.getSource() == btnAddUser){
            String userName = userJFrame.jTextFieldUserName.getText();
            String userSurname = userJFrame.jTextFieldUserSurname.getText();
            int userAge = Integer.parseInt(userJFrame.jTextFieldUserAge.getText()); // parse the age from string to int
            String userAddress = userJFrame.jTextFieldUserAddress.getText();
            
            String responseRegistration = userDao.createUser(userName, userSurname, userAge, userAddress);
            
            if(responseRegistration != null){
                JOptionPane.showMessageDialog(null, responseRegistration);
            } else {
                JOptionPane.showMessageDialog(null, "Registro erroneo");                
            }
        }
        
        if(e.getSource() == btnListUsers){
            FillTable(userJFrame.jTableUser);
        }
    }
}
