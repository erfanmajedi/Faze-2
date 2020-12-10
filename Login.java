package Login;

import Admin.Admin;
import FileMaker.FileMaker;
import Master.Master;
import Student.Student;

import java.io.IOException;
import  javax.swing.*;

/**
 * this class is the login panel , here we can login as student,master and admin
 * by writing the username and password
 * @author Erfan Majedi
 * @since 2020.10.12
 */
public class Login extends javax.swing.JFrame {
    /**
     * constructor for login class , in here we call initComponents() and
     * we set the closing on clicking on the close icon on top right
     * we make the program to start in center of the screen then
     * we have a combo box for the suggestions that pop up from right to left
     */
    public Login() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
        ((JLabel)jComboBoxRole.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make our panel and labels
     * we have a combo box for the suggestions
     * two text fields for username and password
     * we have buttons to login and cancel the action
     *
     */
    private void initComponents() {
        // make a panel for our frame
        jPanel1 = new javax.swing.JPanel();
        // make the 1st label
        jLabel1 = new javax.swing.JLabel();
        // make the 2nd label
        jLabel2 = new javax.swing.JLabel();
        // make the 3rd label
        jLabel3 = new javax.swing.JLabel();
        // make combo box for the rules
        jComboBoxRole = new javax.swing.JComboBox<>();
        // make a text field for username
        jTextFieldUsername = new javax.swing.JTextField();
        // make a text field for password
        jPasswordField = new javax.swing.JPasswordField();
        // make a button for login
        jButtonLogin = new javax.swing.JButton();
        // make a button for cancel
        jButtonCancel = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for the 1st label
        jLabel1.setText("ورود به عنوان:");
        // set text for the 2nd label
        jLabel2.setText("نام کاربری:");
        // set text for the 3rd label
        jLabel3.setText("رمز عبور:");
        // set three model for combo box cause we have three rules
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ادمین", "استاد", "دانشجو" }));
        // set tool tip null
        jComboBoxRole.setToolTipText("");
        // set font for username
        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        // set font for password
        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        // set text for login button
        jButtonLogin.setText("ورود");
        // add the button to the program
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ورود" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        // set text for cancel button
        jButtonCancel.setText("خروج");
        // add the button to the program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        // set layout for jPanel1
        jPanel1.setLayout(jPanel1Layout);
        // we setHorizontalGroup for jPanel1Layout
        jPanel1Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxRole, 0, 217, Short.MAX_VALUE)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        /**
         *  In Java Swing, the layer that is used to hold objects is called the content pane.
         *  Objects are added to the content pane layer of the container.
         *  The getContentPane() method retrieves the content pane layer so that you can add an object to it
         *  so here we use javax.swing.GroupLayout for objects that are in content pane
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        //set layout for each object in content pane
        getContentPane().setLayout(layout);
        // we setHorizontalGroup for layout
        layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed
    /**
     * after we click the "ورود" button
     * this method comes out of the specific icon and goes to the next panel
     * @param evt
     */
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // set flag false
        boolean Flag = false;
        // make a switch-case in combo box of rules
        switch(jComboBoxRole.getSelectedIndex())//decide to choose Admin or Master or Student
        {
            // this case is for admin
            case 0:
            {
                // here we try these actions and if it worked we set false to true
                // then if the try part could not do anything we have the catch part that
                // we make it for show the error message
                try {
                    FileMaker file = new FileMaker("d:\\Files\\Admin.txt");
                    String[] result = file.ReadFile();
                    String data = result[0];
                    int startUser = data.indexOf("username=");
                    int endUser = data.indexOf(";");
                    String Username = data.substring(startUser + 9, endUser);
                    int startPass = data.indexOf("password=");
                    String Password = data.substring(startPass + 9);
                    if(jTextFieldUsername.getText().equals(Username) &&
                            new String(jPasswordField.getPassword()).equals(Password))
                        Flag = true;
                } catch (IOException ex) {
                    //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
            // we create a admin for frame and make it visible
            if(Flag){
                Admin fa = new Admin();//Create JFrame
                fa.setVisible(true);//Show JFrame
            }
            // we set the error massage if we put either username or password of admin wrong
            else
                JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", "Dialog", JOptionPane.ERROR_MESSAGE);
            break;
            // this case is for master
            case 1:
                // here we try these actions and if it worked we set false to true
                // then if the try part could not do anything we have the catch part that
                // we make it for show the error message
                try {
                    FileMaker file = new FileMaker("d:\\Files\\Masters.txt");
                    String[] result = file.ReadFile();
                    int CountLines = file.NumberOfLines();
                    for(int i = 0; i < CountLines; i++)
                    {
                        String data = result[i];
                        int startUser = data.indexOf("username=");
                        int endUser = data.indexOf(";", startUser);
                        String Username = data.substring(startUser + 9, endUser);
                        int startPass = data.indexOf("password=");
                        int endPass = data.indexOf(";", startPass);
                        String Password = data.substring(startPass + 9, endPass);
                        if(jTextFieldUsername.getText().equals(Username) &&
                                new String(jPasswordField.getPassword()).equals(Password))
                        {Flag = true; break;}
                    }

                } catch (IOException ex) {
                    //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
                }
                // create frame for masters and make it visible
                if(Flag){
                    Master fm = new Master(this.jTextFieldUsername.getText());//Create JFrame
                    fm.setVisible(true);//Show JFrame
                }
                // set the error massage if we put either username or password of admin wrong
                else
                    JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", "Dialog", JOptionPane.ERROR_MESSAGE);
                break;
            // this case is for students
            case 2:
                // here we try these actions and if it worked we set false to true
                // then if the try part could not do anything we have the catch part that
                // we make it for show the error message
                // set username null
                String Username = null;
                // set password null
                String Password = null;
                try {
                    FileMaker file = new FileMaker("d:\\Files\\Students.txt");
                    String[] result = file.ReadFile();
                    int CountLines = file.NumberOfLines();
                    for(int i = 0; i < CountLines; i++)
                    {
                        String data = result[i];
                        int startUser = data.indexOf("username=");
                        int endUser = data.indexOf(";", startUser);
                        Username = data.substring(startUser + 9, endUser);
                        int startPass = data.indexOf("password=");
                        int endPass = data.indexOf(";", startPass);
                        Password = data.substring(startPass + 9, endPass);
                        if(jTextFieldUsername.getText().equals(Username) &&
                                new String(jPasswordField.getPassword()).equals(Password))
                        {Flag = true; break;}
                    }

                } catch (IOException ex) {
                    //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
                }
                // make frame for student and set it visible
                if(Flag){
                    Student fs = new Student(Username, Password);//Create JFrame
                    fs.setVisible(true);//Show JFrame
                }
                // set the error massage if we put either username or password of admin wrong
                else
                    JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", "Dialog", JOptionPane.ERROR_MESSAGE);


                break;
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultState="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    public javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

