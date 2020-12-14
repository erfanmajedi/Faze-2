package Adder;

import FileMaker.FileMaker;
import Student.StudentSetting;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * this class will add credit for students to buy food for themself
 * here we get card number , password and the deposit
 * @author Erfan Majedi
 * @since 2020.14.12
 */
public class AddCredit extends javax.swing.JFrame {
    // field for student username
    private String username;
    /**
     * constructor for add credit class that we call initComponents()
     * initialize the username field
     * force the program to start in center of screen
     */
    public AddCredit(String Username) {
        initComponents();
        this.username = Username;
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents()
     * we make panel for the frame
     * labels for each section and text fields
     * we have close and ok button
     */
    private void initComponents() {
        // make panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make label for card number
        jLabel1 = new javax.swing.JLabel();
        // make label for card password
        jLabel2 = new javax.swing.JLabel();
        // make text field for card password
        jTextFieldCardPass = new javax.swing.JTextField();
        // make text field for credit
        jTextFieldCredit = new javax.swing.JTextField();
        // make label for credit
        jLabel3 = new javax.swing.JLabel();
        // make text field for card number
        jTextFieldCardNumber = new javax.swing.JTextField();
        // make close button
        jButtonClose = new javax.swing.JButton();
        // make ok button
        jButtonOK = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("افزایش موجودی حساب");
        // set text for card number label
        jLabel1.setText("شماره کارت:");
        // set text for card password label
        jLabel2.setText("رمز عبور کارت:");
        // set text for credit label
        jLabel3.setText("مبلغ:");

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
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldCredit, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCardPass)
                                        .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(60, 60, 60))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldCardPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );
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
        // set text for ok button
        jButtonOK.setText("پرداخت");
        // add the button to the program
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "پرداخت" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonClose)
                                        .addComponent(jButtonOK))
                                .addGap(18, 18, 18))
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
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCloseActionPerformed

    /**
     * in this method:
     * first we check the conditions that we have to handle
     * second we make a file for credit and we add the new credit to their old credit
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(jTextFieldCardNumber.getText().trim().length() != 16 ||
                jTextFieldCardPass.getText().length() < 1 ||
                jTextFieldCredit.getText().trim().length() < 1){
            JOptionPane.showMessageDialog(new JFrame(), "شماره کارت باید 16 رقم باشد و رمز و مبلغ به درستی وارد شود","Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int CountLines = 0;
        String Credit = null, Username;
        // here we put the students file in an object from fileMaker class named file
        try {
            FileMaker fm = new FileMaker("D:\\Files\\Students.txt");
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            // for loop base on studentRow
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                Username = data.substring(startUser + 9, endUser);
                int startCredit = data.indexOf("credit=");
                int endCredit = data.indexOf(";", startCredit);
                Credit = data.substring(startCredit + 7, endCredit);
                if(this.username.equals(Username))
                { break;}
            }
            String FoundStudent = result[studentRow];
            int NewCredit = Integer.valueOf(Credit) + Integer.valueOf(jTextFieldCredit.getText());
            FoundStudent = FoundStudent.replace("credit=" + Credit, "credit=" + NewCredit);

            result[studentRow] = FoundStudent;
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else
                    fm.FileWriter(result[i], true);
            }
            //this. = jTextFieldNewUsername.getText();

            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // here we check some exceptions and show an error massage if we need to
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonOKActionPerformed

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
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCredit(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCardNumber;
    private javax.swing.JTextField jTextFieldCardPass;
    private javax.swing.JTextField jTextFieldCredit;
    // End of variables declaration//GEN-END:variables
}

