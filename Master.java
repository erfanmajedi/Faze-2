package Master;

import CloseClass.CloseClass;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;

/**
 * this class is for masters
 * they can add class , remove class , grade students and change username and password
 * @author Erfan Majedi
 * @since 2020.15.12
 */
public class Master extends javax.swing.JFrame {
    // field for masterUsername
    private String masterUsername;

    /**
     * constructor for master class that we call initComponents()
     * initialize the field
     * put close operation on exit by clicking the close button on top right
     * and force the program to start in center of screen
     * @param MasterUsername
     */
    public Master(String MasterUsername) {
        initComponents();
        this.masterUsername = MasterUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents() :
     * first we make the panel for the frame
     * then we have buttons for each section
     */
    private void initComponents() {
        // make panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make button for setting
        jButtonSetting = new javax.swing.JButton();
        // make button for class creating
        jButtonCreateClass = new javax.swing.JButton();
        // make button for grading students
        jButtonGradeStudents = new javax.swing.JButton();
        // make button for close class
        jButtonCloseClass = new javax.swing.JButton();
        // make button for close
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for setting button
        jButtonSetting.setText("تغییر نام کاربری و رمز عبور");
        // add the button to the program
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "تغییر نام کاربری و رمز عبور" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });
        // set text for create class button
        jButtonCreateClass.setText("ایجاد کلاس جدید");
        // add the button to the program
        jButtonCreateClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ایجاد کلاس جدید" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateClassActionPerformed(evt);
            }
        });
        // set text for grading student button
        jButtonGradeStudents.setText("نمره دهی ");
        // add the button to the program
        jButtonGradeStudents.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "نمره دهی" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGradeStudentsActionPerformed(evt);
            }
        });
        // set text for close class button
        jButtonCloseClass.setText("بستن کلاس");
        // add the button to the program
        jButtonCloseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "بستن کلاس" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseClassActionPerformed(evt);
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonCreateClass, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addComponent(jButtonCloseClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonGradeStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonCreateClass))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonGradeStudents)
                                        .addComponent(jButtonCloseClass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButtonClose)
                                .addGap(24, 24, 24))
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
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * create frame for setting button and set it visible
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        MasterSetting f = new MasterSetting(this.masterUsername);//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed

    /**
     * create frame for create class button and set it visible
     * @param evt
     */
    private void jButtonCreateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateClassActionPerformed
        MasterCreateClass f = new MasterCreateClass(this.masterUsername);//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonCreateClassActionPerformed

    /**
     * create frame for grade students button and set it visible
     * @param evt
     */
    private void jButtonGradeStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGradeStudentsActionPerformed
        MasterGrading f = new MasterGrading(this.masterUsername);//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonGradeStudentsActionPerformed

    /**
     * create frame for close class button and set it visible
     * @param evt
     */
    private void jButtonCloseClassActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonCloseClassActionPerformed
        CloseClass f = new CloseClass(this.masterUsername);//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonCloseClassActionPerformed
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCloseClass;
    private javax.swing.JButton jButtonCreateClass;
    private javax.swing.JButton jButtonGradeStudents;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

