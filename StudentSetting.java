package Student;

import FileMaker.FileMaker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * this class is for change username and password of the student
 * @author Erfan Majedi
 * @since 2020.17.12
 */
public class StudentSetting extends javax.swing.JFrame {
    // set a field for username
    private String username;
    /**
     * constructor for the class that we call initComponents()
     * initialize the field
     * put close operation on exit by clicking the close button on top right
     * and force the program to start in center of screen
     * @param Username
     */
    public StudentSetting(String Username) {
        this.username = Username;
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
        this.setVisible(true);
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents() :
     * first we make the panel for the frame
     * labels and text field for the inputs
     * and we have the cancel and ok button
     */
    private void initComponents() {
        // make the main panel
        jPanel1 = new javax.swing.JPanel();
        // make label for password
        jLabel2 = new javax.swing.JLabel();
        // make text field for password
        jPasswordFieldNewPass = new javax.swing.JPasswordField();
        // make text field for username
        jTextFieldNewUsername = new javax.swing.JTextField();
        // make label for username
        jLabel1 = new javax.swing.JLabel();
        // make ok button
        jButtonOk = new javax.swing.JButton();
        // make cancel button
        jButtonCancel = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("تغییرنام کاربری و رمز عبور");
        // set text for 2nd label
        jLabel2.setText("رمز عبور جدید:");
        // set text for 1st label
        jLabel1.setText("نام کاربری جدید:");
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
                                .addContainerGap(4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordFieldNewPass)
                                        .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jPasswordFieldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
        );
        // set text for ok button
        jButtonOk.setText("تایید");
        // add the button to the program
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "تایید" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonOk)
                                        .addComponent(jButtonCancel))
                                .addGap(0, 24, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * after we click ok button :
     * first we check the conditions
     * second we check each file for usernames because we don't want the new and old username be the same
     * @param evt
     */
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        if(jTextFieldNewUsername.getText().trim().length() < 1 ||
                new String(jPasswordFieldNewPass.getPassword()).length() < 8){
            JOptionPane.showMessageDialog(new JFrame(), "نام کاربری نباید کمتر از یک حرف و رمزعبور نباید کمتر از هشت حرف باشد", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(IsExistUsername(jTextFieldNewUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String OldUsername = null, OldPassword = null;
            FileMaker fm = new FileMaker("D:\\Files\\Students.txt");
            String[] result = fm.ReadFile();
            int CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                OldUsername = data.substring(startUser + 9, endUser);
                int startPass = data.indexOf("password=");
                int endPass = data.indexOf(";", startPass);
                OldPassword = data.substring(startPass + 9, endPass);
                if(this.username.equals(OldUsername))
                { break;}
            }
            // here we replace the new username and password with the old ones
            String FoundStudent = result[studentRow];
            FoundStudent = FoundStudent.replace(OldUsername, jTextFieldNewUsername.getText());
            FoundStudent = FoundStudent.replace(OldPassword, new String(jPasswordFieldNewPass.getPassword()));
            result[studentRow] = FoundStudent;
            // for loop base on number of lines
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else
                    fm.FileWriter(result[i], true);
            }
        }
        // check some exceptions and if it is necessary show the error massage
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String OldUsername = null, OldPassword = null;
            FileMaker fm = new FileMaker("D:\\Files\\SelectUnit.txt");
            // check the file is not empty
            if(!fm.IsEmptyFile()){
                String[] result = fm.ReadFile();
                int CountLines = fm.NumberOfLines();
                int studentRow;
                for(studentRow = 0; studentRow < CountLines; studentRow++){
                    String data = result[studentRow];
                    int startUser = data.indexOf("studentUsername=");
                    int endUser = data.indexOf(";", startUser);
                    OldUsername = data.substring(startUser + 16, endUser);
                    // if the new username is the same as the old one
                    if(this.username.equals(OldUsername)){
                        String FoundStudent = result[studentRow];
                        FoundStudent = FoundStudent.replace(OldUsername, jTextFieldNewUsername.getText());
                        result[studentRow] = FoundStudent;
                    }
                }
                // for loop base on count lines
                for(int i = 0 ; i < CountLines; i++){
                    if(i ==0)
                        fm.FileWriter(result[i], false);
                    else
                        fm.FileWriter(result[i], true);
                }
            }
            // here we get info again after click ok button and show the successful action massage
            Student.setUsername(this.username = jTextFieldNewUsername.getText());
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // we check some exceptions and if it is necessary show the error massage
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    /**
     * here in this method we check if the username is already exist in either admin
     * student or master file or not
     * @param Username
     * @return
     */
    private boolean IsExistUsername(String Username){
        // set flag on false
        boolean Flag = false;
        // here we put students file to an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Students.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                String _username = data.substring(startUser + 9, endUser);

                if(Username.equals(_username))
                {Flag = true; break;}
            }

        }
        // we check some exceptions and if it is necessary show the error massage
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // here we put masters file to an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Masters.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                String _username = data.substring(startUser + 9, endUser);

                if(Username.equals(_username))
                {Flag = true; break;}
            }

        }
        // we check some exceptions and if it is necessary show the error massage
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // here we put admin file to an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Admin.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                String _username = data.substring(startUser + 9, endUser);

                if(Username.equals(_username))
                {Flag = true; break;}
            }

        }
        // we check some exceptions and if it is necessary show the error massage
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        return Flag;
    }
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSetting(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldNewPass;
    private javax.swing.JTextField jTextFieldNewUsername;
    // End of variables declaration//GEN-END:variables
}
