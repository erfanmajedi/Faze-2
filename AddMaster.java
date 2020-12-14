package Adder;
import FileMaker.FileMaker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * this class add masters and gets info such as name , lastname , degree , university , email , username and password
 * @author Erfan Majedi
 * @since 2020.14.12
 */
public class AddMaster extends javax.swing.JFrame {
    /**
     * constructor for addMaster class that we call initComponents()
     * we set close operation on click the close button on top right
     * we force the program to start in center of screen
     */
    public AddMaster() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents()
     * we make panel for the frame
     * we have labels for each info we want and text field to fill them
     * we have ok and cancel button
     */
    private void initComponents() {
        // make our panel our panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make label for name
        jLabel1 = new javax.swing.JLabel();
        // make text field for name label
        jTextFieldName = new javax.swing.JTextField();
        // make label for lastname
        jLabel2 = new javax.swing.JLabel();
        // make text field for lastname label
        jTextFieldFamily = new javax.swing.JTextField();
        // make label for degree
        jLabel3 = new javax.swing.JLabel();
        // make label for university
        jLabel4 = new javax.swing.JLabel();
        // make label for email
        jLabel5 = new javax.swing.JLabel();
        // make add button for add master
        jButtonAdd = new javax.swing.JButton();
        // make button for cancel the action
        jButtonCancel = new javax.swing.JButton();
        // make text field for degree label
        jTextFieldDegree = new javax.swing.JTextField();
        // make text field for university label
        jTextFieldUniversity = new javax.swing.JTextField();
        // make text field for email label
        jTextFieldMail = new javax.swing.JTextField();
        // make text field username label
        jTextFieldUsername = new javax.swing.JTextField();
        // make label for username
        jLabel6 = new javax.swing.JLabel();
        // make label for password
        jLabel7 = new javax.swing.JLabel();
        // make text field for password label
        jTextFieldPassword = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for name label
        jLabel1.setText("نام:");
        // we don't have tool tip
        jTextFieldName.setToolTipText("");
        //Sets whether this component should use a buffer to paint.
        // If set to true, all the drawing from this component will be done in an offscreen painting buffer
        jTextFieldName.setDoubleBuffered(true);
        // set text for lastname label
        jLabel2.setText("نام خانوادگی:");
        // we don't have tool tip
        jLabel2.setToolTipText("");
        // set text for degree label
        jLabel3.setText("مدرک تحصیلی:");
        // set text for university label
        jLabel4.setText(" دانشگاه:");
        // set text for email label
        jLabel5.setText("ایمیل:");
        // set text for add button
        jButtonAdd.setText("افزودن");
        // add the button to the program
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
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
        // set text for username label
        jLabel6.setText("نام کاربری:");
        // set text for password label
        jLabel7.setText("رمز عبور:");
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldFamily)
                                                        .addComponent(jTextFieldName)
                                                        .addComponent(jTextFieldUniversity)
                                                        .addComponent(jTextFieldMail))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldPassword))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel6))
                                                .addGap(21, 21, 21)))
                                .addGap(28, 28, 28))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonCancel)
                                        .addComponent(jButtonAdd))
                                .addGap(21, 21, 21))
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * in this method :
     * first we check if all the fields are blank after click the ok button if each of them were empty we show the error massage
     * second we check if the username that is entered is already exits or not
     * third we use file to add the info of the masters if there were no errors
     * @param evt
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(jTextFieldName.getText().trim().equals("") ||
                jTextFieldFamily.getText().trim().equals("") ||
                jTextFieldDegree.getText().trim().equals("") ||
                jTextFieldMail.getText().trim().equals("") ||
                jTextFieldUsername.getText().trim().equals("") ||
                jTextFieldUniversity.getText().trim().equals("") ||
                jTextFieldPassword.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(new JFrame(), "پر کردن همه فیلدها اجباری است و رمزعبور نمیتواند کمتر از 8 حرف باشد", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(IsExistUsername(jTextFieldUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }

        FileMaker fm = new FileMaker("D:\\Files\\Masters.txt");
        String Master = "name=" + jTextFieldName.getText() + " " + jTextFieldFamily.getText() + ";"+
                "username=" + jTextFieldUsername.getText().trim() + ";" +
                "password=" + jTextFieldPassword.getText() + ";" +
                "mail=" + jTextFieldMail.getText() + ";" +
                "degree=" + jTextFieldDegree.getText() + ";" +
                "university=" + jTextFieldUniversity.getText() + ";";
        // here in the program after it was written in file we set all of them null again
        try {
            fm.FileWriter(Master, true);
            jTextFieldUsername.setText("");
            jTextFieldMail.setText("");
            jTextFieldFamily.setText("");
            jTextFieldName.setText("");
            jTextFieldPassword.setText("");
            jTextFieldDegree.setText("");
            jTextFieldUniversity.setText("");
            // show the massage after the program accept the master add
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت اضاف شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // check some exceptions and show error massage if it was necessary
        catch (IOException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    /**
     * in this method we're going to check if the given username is
     * exist in the specific file or not
     * @param Username
     * @return true or false base on what's going to happen
     */
    private boolean IsExistUsername(String Username){
        // set flag to false
        boolean Flag = false;
        // here we put the students file in an object from fileMaker class named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Students.txt");
            // check if the file is not empty we read file and read the lines
            if(!file.IsEmptyFile()){
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
        }
        // here we check some exceptions and show an error massage if we need to
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // here we put the masters file in an object from fileMaker class named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Masters.txt");
            // check if the file is not empty we read file and read the lines
            if(!file.IsEmptyFile()){
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
        }
        // here we check some exceptions and show an error massage if we need to
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // here we put the admin file in an object from fileMaker class named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Admin.txt");
            // check if the file is not empty we read file and read the lines
            if(!file.IsEmptyFile()){
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
        }
        // here we check some exceptions and show an error massage if we need to
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
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDegree;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUniversity;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

