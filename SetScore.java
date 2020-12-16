package Master;

import FileMaker.FileMaker;
import Student.StudentSetting;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * in this class master set score for students
 * @author Erfan Majedi
 * @since 2020.16.12
 */
public class SetScore extends javax.swing.JFrame {
    // field for masterUsername , student name , student number and classname
    private String masterUsername, stdName, stdNum, classname;

    /**
     * constructor for the class that we call initComponents()
     * we initialize the fields and set text for text fields
     * make the frame close operation in click the close button on top right
     * force the program to start in the center of screen
     * at last we call checkNumber method
     * @param MasterUsername
     * @param STDName
     * @param STDNum
     * @param ClassName
     */
    public SetScore(String MasterUsername, String STDName, String STDNum, String ClassName) {
        initComponents();
        this.masterUsername = MasterUsername;
        this.stdName = STDName;
        this.stdNum = STDNum;
        this.classname = ClassName;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen

        this.jTextFieldSTDName.setText(this.stdName);
        this.jTextFieldSTDNum.setText(this.stdNum);
        this.jTextFieldClassName.setText(this.classname);
        CheckNumber();
    }

    /**
     * this is the getter method for student username
     * we check the student file for it
     * @param Name
     * @param STDNumber
     * @return student username
     */
    private String GetStudentUsername(String Name, String STDNumber){
        // set _Username null
        String _Username = null;
        // here we put students file in an object named file and then read and count number of lines
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
                _Username = data.substring(startUser + 9, endUser);

                int startName = data.indexOf("name=");
                int endName = data.indexOf(";", startName);
                String _Name = data.substring(startName + 5, endName);

                int startNum = data.indexOf("studentNumber=");
                int endNum = data.indexOf(";", startNum);
                String _StudentNumber = data.substring(startNum + 14, endNum);
                //here we check if student name is the same as the one in the student file
                if(jTextFieldSTDName.getText().equals(_Name) &&
                        new String(jTextFieldSTDNum.getText()).equals(_StudentNumber))
                { break;}
            }

        }
        // here we check some exceptions and show error massage if it's necessary
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        return _Username;
    }

    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in here we generate initComponents() :
     * first we make the panel for the frame
     * we have labels for student name , id
     * and we have one label for classname and one for set the score
     * we have text field for each section
     * we have an ok and a close button too
     */
    private void initComponents() {
        // make panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make label for student name
        jLabel1 = new javax.swing.JLabel();
        // make text field for student name label
        jTextFieldSTDName = new javax.swing.JTextField();
        // make label for student number or id
        jLabel2 = new javax.swing.JLabel();
        // make text field for student number or id label
        jTextFieldSTDNum = new javax.swing.JTextField();
        // make label for classname
        jLabel3 = new javax.swing.JLabel();
        // make text field for classname label
        jTextFieldClassName = new javax.swing.JTextField();
        // make label for score
        jLabel4 = new javax.swing.JLabel();
        // make text field for score label
        jTextFieldScore = new javax.swing.JTextField();
        // make the ok button
        jButtonOK = new javax.swing.JButton();
        // make the close button
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for student name label
        jLabel1.setText("نام و نام خانوادگی دانشجو:");
        // we can't edit the text field for student name
        jTextFieldSTDName.setEditable(false);
        // set text field for student number label
        jLabel2.setText("شماره دانشجویی:");
        // we can't edit the text field for student number
        jTextFieldSTDNum.setEditable(false);
        // set text for classname label
        jLabel3.setText("اسم کلاس:");
        // we can't edit the text field for classname
        jTextFieldClassName.setEditable(false);
        // set text for score label
        jLabel4.setText("نمره:");
        // set text for ok button
        jButtonOK.setText("ثبت نمره");
        // add the button to the program
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ثبت نمره" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        // set text for close button
        jButtonClose.setText("خروج");
        // add the button to the program
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextFieldSTDName)
                                                        .addComponent(jTextFieldSTDNum)
                                                        .addComponent(jTextFieldClassName)
                                                        .addComponent(jTextFieldScore))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))))
                                .addGap(34, 34, 34))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldSTDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldSTDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonOK)
                                        .addComponent(jButtonClose))
                                .addContainerGap(25, Short.MAX_VALUE))
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
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    /**
     * in this method we check if the master put in the score the right way or not
     */
    private void CheckNumber()
    {
        //jLabelStudentNumberWarning.setText("");
        // Adds the specified key listener to receive key events from this component
        jTextFieldScore.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = jTextFieldScore.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    jTextFieldScore.setEditable(true);
                    //jLabelStudentNumberWarning.setText("");
                } else {
                    jTextFieldScore.setEditable(false);
                    JOptionPane.showMessageDialog(new JFrame(), "نمره فقط به عدد قابل قبول است", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    /**
     * in this method first we check if the score input section is empty or not
     * then we go to SelectUnit file and read it
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(jTextFieldScore.getText().trim().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "لطفا نمره را وارد کنید", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            return;
        }


        int CountLines;
        String _StudentUsername;
        try {
            // put SelectUnit file in an object from FileMaker Class named file
            FileMaker fm = new FileMaker("D:\\Files\\SelectUnit.txt");
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("studentUsername=");
                int endUser = data.indexOf(";", startUser);
                _StudentUsername = data.substring(startUser + 16, endUser);

                int startMasterUsername = data.indexOf("masterUsername=");
                int endMasterUsername = data.indexOf(";", startMasterUsername);
                String _MasterUsername = data.substring(startMasterUsername + 15, endMasterUsername);

                int startClassname = data.indexOf("classname=");
                int endClassname = data.indexOf(";", startClassname);
                String _ClassName = data.substring(startClassname + 10, endClassname);
                /* here we check if the field is equal to the one in the file
                   then we check if the student username is the same or not
                   and we do this for classname
                 */
                if(this.masterUsername.equals(_MasterUsername) &&
                        this.GetStudentUsername(this.jTextFieldSTDName.getText(), jTextFieldSTDNum.getText()).equals(_StudentUsername)
                        && this.jTextFieldClassName.getText().equals(_ClassName))
                { break;}
            }
            // here we find the student that the master want to grade
            String FoundStudent = result[studentRow];
            int startScore = FoundStudent.indexOf("score=");
            int endScore = FoundStudent.indexOf(";", startScore);
            String OldScore = FoundStudent.substring(startScore + 6, endScore);
            // replace the old score with the new one
            FoundStudent = FoundStudent.replace("score=" + OldScore, "score=" + this.jTextFieldScore.getText());
            //JOptionPane.showMessageDialog(new JFrame(), FoundStudent, "Dialog", JOptionPane.INFORMATION_MESSAGE);
            result[studentRow] = FoundStudent;
            // for loop base on number of lines
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else
                    fm.FileWriter(result[i], true);
            }
            //this. = jTextFieldNewUsername.getText();
            // show the successful massage
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // check some exceptions
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_jButtonOKActionPerformed

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
            java.util.logging.Logger.getLogger(SetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // if use wanna see the change we have to change the null in the constructor input
                new SetScore(null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClassName;
    private javax.swing.JTextField jTextFieldSTDName;
    private javax.swing.JTextField jTextFieldSTDNum;
    private javax.swing.JTextField jTextFieldScore;
    // End of variables declaration//GEN-END:variables
}
