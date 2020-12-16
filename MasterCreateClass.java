package Master;

import Adder.AddStudent;
import FileMaker.FileMaker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * in this class master create class and say the name of the lesson , amount of unit
 * choose day and time from comboBox and write the capacity of class
 * @author Erfan Majedi
 * @since 2020.15.12
 */
public class MasterCreateClass extends javax.swing.JFrame {
    // field for master's username
    private String masterUsername;

    /**
     * constructor for the class that we call initComponents()
     * initialize masterUsername
     * set close operation on clicking the close button on top right
     * make the day and time comboBox shows info from right to left
     * force the program to start in the center of screen
     * @param MasterUsername
     */
    public MasterCreateClass(String MasterUsername) {
        initComponents();
        this.masterUsername = MasterUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxDay.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        ((JLabel)jComboBoxHour.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents():
     * we create panels for the frame
     * then we use labels for names and text fields for input info
     * we have two buttons for ok and cancel the action
     * we have two comboBox for time and day
     */
    private void initComponents() {
        // make the 1st panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make the 2nd panel for the frame
        jPanel2 = new javax.swing.JPanel();
        // make label for class name
        jLabel1 = new javax.swing.JLabel();
        // make text field for name class label
        jTextFieldClassName = new javax.swing.JTextField();
        // make the 3rd panel for the frame
        jPanel3 = new javax.swing.JPanel();
        // make label for class unit
        jLabel2 = new javax.swing.JLabel();
        // make text field for class unit label
        jTextFieldClassUnit = new javax.swing.JTextField();
        // make the 4th panel for the frame
        jPanel4 = new javax.swing.JPanel();
        // make label for day combo box
        jLabel3 = new javax.swing.JLabel();
        // make combo box for days
        jComboBoxDay = new javax.swing.JComboBox<>();
        // make combo for hour of class
        jComboBoxHour = new javax.swing.JComboBox<>();
        // make label for time combo box
        jLabel5 = new javax.swing.JLabel();
        // make the 5th panel for the frame
        jPanel5 = new javax.swing.JPanel();
        // make label for capacity
        jLabel4 = new javax.swing.JLabel();
        // make text field for capacity label
        jTextFieldCapacity = new javax.swing.JTextField();
        // make button for ok
        jButtonOK = new javax.swing.JButton();
        // make button for close
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("ایجاد کلاس جدید");
        // set layout for the 2th panel
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for name class label
        jLabel1.setText("نام کلاس:");
        // add name class label to the 2nd panel
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        // add text field for class name to the 2nd panel
        jPanel2.add(jTextFieldClassName, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 11, 186, -1));
        // set layout for the 3rd panel
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for class unit label
        jLabel2.setText("تعداد واحد:");
        // add class unit label to the 2nd panel
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        // add class unit text field to the 3rd panel
        jPanel3.add(jTextFieldClassUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 11, 186, -1));
        // add the 3rd panel to the 2nd panel
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 48));
        // set layout for the 4th panel
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for time of class label
        jLabel3.setText("زمان تشکیل:");
        // add time class label to the 4th panel
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 9, -1, -1));
        // set model for comboBox for for days
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "شنبه", "یکشنبه", "دوشنبه", "سه شنبه", "چهارشنبه" }));
        // add the comboBox for days to the 4th panel
        jPanel4.add(jComboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 188, -1));
        // set model for comboBox for time
        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 تا 10", "10 تا 12", "14 تا 16" }));
        // add the comboBox day to the 4th panel
        jPanel4.add(jComboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 188, -1));
        // set text for time label
        jLabel5.setText("ساعت:");
        // add the time label to the 4th panel
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));
        // set text for the capacity label
        jLabel4.setText("ظرفیت:");
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        // set layout for jPanel5
        jPanel5.setLayout(jPanel5Layout);
        // we setHorizontalGroup for jPanel5Layout
        jPanel5Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22))
        );
        // we setVerticalGroup for jPanel5Layout
        jPanel5Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        // set layout for jPanel1
        jPanel1.setLayout(jPanel1Layout);
        // we setHorizontalGroup for jPanel1Layout
        jPanel1Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        // set text for ok button
        jButtonOK.setText("تایید");
        // add the button to the program
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "تایید" button
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
                                .addGap(9, 9, 9)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonOK)
                                        .addComponent(jButtonClose))
                                .addContainerGap(27, Short.MAX_VALUE))
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
     * in this method :
     * first check if all the blanks are fulled or any of them or empty or not
     * second we make file for it
     * third we handle exceptions
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(jTextFieldClassName.getText().trim().equals("") ||
                jTextFieldCapacity.getText().trim().equals("") ||
                jTextFieldClassUnit.getText().trim().equals(""))
        {JOptionPane.showMessageDialog(new JFrame(),"پر کردن همه فیلدها اجباریست", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        FileMaker fm = new FileMaker("D:\\Files\\Classes.txt");
        String NewClass = "name=" + jTextFieldClassName.getText() + ";" +
                "countUnit=" + jTextFieldClassUnit.getText() + ";" +
                "capacity=" + jTextFieldCapacity.getText() + ";" +
                "date=" + jComboBoxDay.getSelectedItem() + " " + jComboBoxHour.getSelectedItem() + ";" +
                "masterUsername=" + this.masterUsername + ";";

        try {
            fm.FileWriter(NewClass, true);
            jTextFieldClassName.setText("");
            jTextFieldCapacity.setText("");
            jTextFieldClassUnit.setText("");

            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت اضاف شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (IOException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterCreateClass(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxHour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextFieldCapacity;
    private javax.swing.JTextField jTextFieldClassName;
    private javax.swing.JTextField jTextFieldClassUnit;
    // End of variables declaration//GEN-END:variables
}

