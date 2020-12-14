package Adder;
import FileMaker.FileMaker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * in this class we add student to program and the program gets info about student's
 * name , lastname , id , major , level of major , username and password
 * @author Erfan Majedi
 * @since 2020.14.12
 */
public class AddStudent extends javax.swing.JFrame {
    /**
     * constructor for add student class that we call initComponents()
     * set close operation on clicking the close button on top right
     * we make comboBox to show suggestions from right to left
     * and force the program to start in center of the screen
     */
    public AddStudent() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxCourse.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
    }

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
                    int startuser = data.indexOf("username=");
                    int enduser = data.indexOf(";", startuser);
                    String _username = data.substring(startuser + 9, enduser);

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
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents()
     * we make the panel for the frame and we have labels for each section
     * text fields for that sections and we have a combBox for suggestions
     * and buttons for cancel and add student to list
     */
    private void initComponents() {
        // make panel for the frame
        jPanel2 = new javax.swing.JPanel();
        // make label for name
        jLabel1 = new javax.swing.JLabel();
        // make text field for writing name
        jTextFieldName = new javax.swing.JTextField();
        // make label for lastname
        jLabel2 = new javax.swing.JLabel();
        /// make text field for writing lastname
        jTextFieldFamily = new javax.swing.JTextField();
        // make label for student number or id
        jLabel3 = new javax.swing.JLabel();
        // make text field for write student number or id
        jTextFieldStudentNumber = new javax.swing.JTextField();
        // make label for comboBox
        jLabel4 = new javax.swing.JLabel();
        // make comboBox for level of majors
        jComboBoxCourse = new javax.swing.JComboBox<>();
        // make button for add students
        jButtonAddStudent = new javax.swing.JButton();
        // make button to cancel the action
        jButtonCancel = new javax.swing.JButton();
        // make label for major
        jLabel5 = new javax.swing.JLabel();
        // make text field for major
        jTextFieldCourse = new javax.swing.JTextField();
        // make label for username
        jLabel6 = new javax.swing.JLabel();
        // make text field for username
        jTextFieldUsername = new javax.swing.JTextField();
        // make label for password
        jLabel7 = new javax.swing.JLabel();
        // make text field for password
        jTextFieldPassword = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set font for frame
        setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        // set text for name label
        jLabel1.setText("نام:");
        // set text for lastname label
        jLabel2.setText("نام خانوادگی:");
        // set text for student number or id
        jLabel3.setText("شماره دانشجویی:");
        // set text for level of majors
        jLabel4.setText("مقطع تحصیلی:");
        // make a model for level of majors
        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کاردانی", "کارشناسی", "کارشناسی ارشد", "دکتری" }));
        // set text for add student button
        jButtonAddStudent.setText("افزودن");
        // add the button to the program
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });
        // set text for cancel button
        jButtonCancel.setText("انصراف");
        // add the button to the program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انصراف" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        // set text for major label
        jLabel5.setText("رشته تحصیلی:");
        // set text for username label
        jLabel6.setText("نام کاربری:");
        // set text for password label
        jLabel7.setText("رمز عبور:");
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        // set layout for jPanel2
        jPanel2.setLayout(jPanel2Layout);
        // we setHorizontalGroup for jPanel2Layout
        jPanel2Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxCourse, 0, 189, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextFieldName)
                                                        .addComponent(jTextFieldFamily)
                                                        .addComponent(jTextFieldCourse)
                                                        .addComponent(jTextFieldUsername)
                                                        .addComponent(jTextFieldPassword))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel6)
                                                                .addComponent(jLabel7))
                                                        .addComponent(jLabel1)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)))
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAddStudent)
                                        .addComponent(jButtonCancel))
                                .addContainerGap())
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * in this method :
     * first we check if all the fields are blank after click the ok button if each of them were empty we show the error massage
     * second we check if the username that is entered is already exits or not
     * third we use file to add the info of the students if there were no errors
     * @param evt
     */
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        if(jTextFieldName.getText().trim().equals("") ||
                jTextFieldFamily.getText().trim().equals("") ||
                jTextFieldCourse.getText().trim().equals("") ||
                jTextFieldStudentNumber.getText().trim().equals("") ||
                jTextFieldUsername.getText().trim().equals("") ||
                jTextFieldPassword.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(new JFrame(), "پر کردن همه فیلدها اجباری است و رمزعبور نمیتواند کمتر از 8 حرف باشد", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(IsExistUsername(jTextFieldUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }

        FileMaker fm = new FileMaker("D:\\Files\\Students.txt");
        String student = "name=" + jTextFieldName.getText() + " " + jTextFieldFamily.getText() + ";"+
                "username=" + jTextFieldUsername.getText().trim()+ ";" +
                "password=" + jTextFieldPassword.getText() + ";" +
                "studentNumber=" + jTextFieldStudentNumber.getText().trim() + ";" +
                "course=" + jTextFieldCourse.getText() + ";" +
                "grade=" + jComboBoxCourse.getSelectedItem() + ";" +
                "credit=0;reserveFood=000000000000000000000;";
        // here in the program after it was written in file we set all of them null again
        try {
            fm.FileWriter(student, true);
            jTextFieldUsername.setText("");
            jTextFieldCourse.setText("");
            jTextFieldFamily.setText("");
            jTextFieldName.setText("");
            jTextFieldPassword.setText("");
            jTextFieldStudentNumber.setText("");
            // show the massage after the program accept the student add
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت اضاف شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // check some exceptions and show error massage if it was necessary
        catch (IOException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldStudentNumber;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

