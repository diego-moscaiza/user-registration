package User;

/**
 *
 * @author Diego Moscaiza
 */
public class UserJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioFrame
     */
    public UserJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFields = new javax.swing.JPanel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldUserSurname = new javax.swing.JTextField();
        jLabelUserName = new javax.swing.JLabel();
        jLabelUserSurname = new javax.swing.JLabel();
        jLabelUserAge = new javax.swing.JLabel();
        jLabelUserAddress = new javax.swing.JLabel();
        jTextFieldUserAge = new javax.swing.JTextField();
        jTextFieldUserAddress = new javax.swing.JTextField();
        jPanelButtons = new javax.swing.JPanel();
        jButtonAddUser = new javax.swing.JButton();
        jButtonUpdateUser = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonSearchUser = new javax.swing.JButton();
        jButtonListUsers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelFields.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, -1));
        jPanelFields.add(jTextFieldUserSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, -1));

        jLabelUserName.setText("Nombre");
        jPanelFields.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        jLabelUserSurname.setText("Apellido");
        jPanelFields.add(jLabelUserSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelUserAge.setText("Edad");
        jPanelFields.add(jLabelUserAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelUserAddress.setText("Dirección");
        jPanelFields.add(jLabelUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanelFields.add(jTextFieldUserAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));
        jPanelFields.add(jTextFieldUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, -1));

        getContentPane().add(jPanelFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 268, 234));

        jPanelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAddUser.setText("Agregar");
        jPanelButtons.add(jButtonAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 41, 85, -1));

        jButtonUpdateUser.setText("Modificar");
        jPanelButtons.add(jButtonUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 74, -1, -1));

        jButtonDeleteUser.setText("Eliminar");
        jPanelButtons.add(jButtonDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 107, 85, -1));

        jButtonSearchUser.setText("Buscar");
        jPanelButtons.add(jButtonSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 173, 85, -1));

        jButtonListUsers.setText("Listar");
        jPanelButtons.add(jButtonListUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 140, 85, -1));

        getContentPane().add(jPanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 120, 240));

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAddUser;
    public javax.swing.JButton jButtonDeleteUser;
    public javax.swing.JButton jButtonListUsers;
    public javax.swing.JButton jButtonSearchUser;
    public javax.swing.JButton jButtonUpdateUser;
    private javax.swing.JLabel jLabelUserAddress;
    private javax.swing.JLabel jLabelUserAge;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserSurname;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelFields;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableUser;
    public javax.swing.JTextField jTextFieldUserAddress;
    public javax.swing.JTextField jTextFieldUserAge;
    public javax.swing.JTextField jTextFieldUserName;
    public javax.swing.JTextField jTextFieldUserSurname;
    // End of variables declaration//GEN-END:variables
}
