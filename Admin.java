package Admin;

import Adder.AddMaster;
import Adder.AddStudent;
import FoodPlan.FoodPlan;
import List.ListClasses;
import List.ListMasters;
import List.ListStudent;

import javax.swing.JFrame;

/**
 * this class is for admin that can do all the jobs such as food planing , adding masters and students
 * see the list of students and masters and changing username and password
 */
public class Admin extends javax.swing.JFrame {
    /**
     * constructor for admin class that we call initComponents()
     * we set the closing the program on clicking on the exit button
     * we make the program in the center of the screen
     */
    public Admin() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we make our panel and buttons for each section
     */
    private void initComponents() {
        // make the main panel
        jPanel1 = new javax.swing.JPanel();
        // make add master button
        jButtonAddMaster = new javax.swing.JButton();
        // make add student button
        jButtonAddStudent = new javax.swing.JButton();
        // make setting button
        jButtonSetting = new javax.swing.JButton();
        // make food plan button
        jButtonFoodPlan = new javax.swing.JButton();
        // male class list button
        jButtonListClass = new javax.swing.JButton();
        // make student list button
        jButtonListStudents = new javax.swing.JButton();
        // make master list button
        jButtonListMasters = new javax.swing.JButton();
        // make close button
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for add master button
        jButtonAddMaster.setText("افزودن استاد");
        // add this button to the program
        jButtonAddMaster.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن استاد" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMasterActionPerformed(evt);
            }
        });
        // set text for add student button
        jButtonAddStudent.setText("افزودن دانشجو");
        // add this button to the program
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن دانشجو" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });
        //set text for setting button
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
        // set text for food plan button
        jButtonFoodPlan.setText("تنظیم برنامه غذایی");
        // add the button to the program
        jButtonFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "تنظیم برنامه غذایی" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodPlanActionPerformed(evt);
            }
        });
        // set text for class list button
        jButtonListClass.setText("لیست کلاس ها");
        // add the button to the program
        jButtonListClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "لیست کلاس ها" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListClassActionPerformed(evt);
            }
        });
        // set text for student list button
        jButtonListStudents.setText("لیست دانشجویان");
        // add the button to the program
        jButtonListStudents.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "لیست دانشجویان" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListStudentsActionPerformed(evt);
            }
        });
        // set text for masters list
        jButtonListMasters.setText("لیست اساتید");
        // add the button to the program
        jButtonListMasters.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "لیست اساتید" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListMastersActionPerformed(evt);
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
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonListMasters, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonListStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonListClass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonFoodPlan)
                                        .addComponent(jButtonSetting))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonListStudents)
                                        .addComponent(jButtonListMasters))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonListClass)
                                        .addComponent(jButtonAddMaster))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAddStudent)
                                        .addComponent(jButtonClose))
                                .addContainerGap(40, Short.MAX_VALUE))
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
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * in this method we create a frame for add student and set it to visible
     * @param evt
     */
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        AddStudent f = new AddStudent();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonAddStudentActionPerformed
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCloseActionPerformed
    /**
     * in this method we create a frame for food plan and set it to visible
     * @param evt
     */
    private void jButtonFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodPlanActionPerformed
        FoodPlan f = new FoodPlan();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonFoodPlanActionPerformed
    /**
     * in this method we create a frame for admin setting and set it to visible
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        AdminSetting f = new AdminSetting();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed
    /**
     * in this method we create a frame for student list and set it to visible
     * @param evt
     */
    private void jButtonListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListStudentsActionPerformed
        ListStudent f = new ListStudent();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListStudentsActionPerformed

    private void jButtonListMastersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListMastersActionPerformed
        ListMasters f = new ListMasters();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListMastersActionPerformed
    /**
     * in this method we create a frame for class list and set it to visible
     * @param evt
     */
    private void jButtonListClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListClassActionPerformed
        ListClasses f = new ListClasses();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListClassActionPerformed
    /**
     * in this method we create a frame for add master and set it to visible
     * @param evt
     */
    private void jButtonAddMasterActionPerformed(java.awt.event.ActionEvent evt) {
        AddMaster f = new AddMaster();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMaster;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonFoodPlan;
    private javax.swing.JButton jButtonListClass;
    private javax.swing.JButton jButtonListMasters;
    private javax.swing.JButton jButtonListStudents;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

