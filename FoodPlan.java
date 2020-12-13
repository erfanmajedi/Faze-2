package FoodPlan;

import FileMaker.FileMaker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * food plan class represents the plan for each day and each meal for students
 * @author Erfan Majedi
 * @since 2020.13.12
 */
public class FoodPlan extends javax.swing.JFrame {
    /**
     * constructor for food plan class that we call initComponents()
     * set close operation on clicking the close button
     * and make the program to start in the center of screen
     */
    public FoodPlan() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we make panel and labels and buttons
     * we have text fields for every meal and their prices
     */
    private void initComponents() {
        // make the 1st panel for frame
        jPanel1 = new javax.swing.JPanel();
        // make the 1st label
        jLabel1 = new javax.swing.JLabel();
        // make the 2nd label
        jLabel2 = new javax.swing.JLabel();
        // make the 3rd label
        jLabel3 = new javax.swing.JLabel();
        // make the 4th label
        jLabel4 = new javax.swing.JLabel();
        // make the 5th label
        jLabel5 = new javax.swing.JLabel();
        // make the 6th label
        jLabel6 = new javax.swing.JLabel();
        // make the 2nd panel for frame
        jPanel2 = new javax.swing.JPanel();
        // make the 32th label
        jLabel32 = new javax.swing.JLabel();
        // make the 33th label
        jLabel33 = new javax.swing.JLabel();
        // make the 34th label
        jLabel34 = new javax.swing.JLabel();
        // make the 35th label
        jLabel35 = new javax.swing.JLabel();
        // make the 36th label
        jLabel36 = new javax.swing.JLabel();
        // make the 37th label
        jLabel37 = new javax.swing.JLabel();
        // make the 38th label
        jLabel38 = new javax.swing.JLabel();
        // make the ok button
        jButtonOK = new javax.swing.JButton();
        // make the cancel button
        jButtonCancel = new javax.swing.JButton();
        // make the 3rd panel for frame
        jPanel3 = new javax.swing.JPanel();
        // make text field for saturday dinner
        jTextFieldSatDinner = new javax.swing.JTextField();
        // make text field for sunday dinner
        jTextFieldSunDinner = new javax.swing.JTextField();
        // make text field for monday dinner
        jTextFieldMonDinner = new javax.swing.JTextField();
        // make text field for tuesday dinner
        jTextFieldTuesDinner = new javax.swing.JTextField();
        // make text field for wednesday dinner
        jTextFieldWedDinner = new javax.swing.JTextField();
        // make text field for thursday dinner
        jTextFieldThursDinner = new javax.swing.JTextField();
        // make text field for friday dinner
        jTextFieldFriDinner = new javax.swing.JTextField();
        // make text field for dinner price in friday
        jTextFieldFriDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in monday
        jTextFieldMonDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in saturday
        jTextFieldSatDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in sunday
        jTextFieldSunDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in tuesday
        jTextFieldTuesDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in wednesday
        jTextFieldWedDinnerPrice = new javax.swing.JTextField();
        // make text field for dinner price in thursday
        jTextFieldThursDinnerPrice = new javax.swing.JTextField();
        // make the 6th plan
        jPanel6 = new javax.swing.JPanel();
        // make text field for saturday breakfast
        jTextFieldSatBreak = new javax.swing.JTextField();
        // make text field for sunday breakfast
        jTextFieldSunBreak = new javax.swing.JTextField();
        // make text field for monday breakfast
        jTextFieldMonBreak = new javax.swing.JTextField();
        // make text field for tuesday breakfast
        jTextFieldTuesBreak = new javax.swing.JTextField();
        // make text field for wednesday breakfast
        jTextFieldWedBreak = new javax.swing.JTextField();
        // make text field for thursday breakfast
        jTextFieldThursBreak = new javax.swing.JTextField();
        // make text field for friday breakfast
        jTextFieldFriBreak = new javax.swing.JTextField();
        // make text field for friday breakfast price
        jTextFieldFriBreakPrice = new javax.swing.JTextField();
        // make text field for monday breakfast price
        jTextFieldMonBreakPrice = new javax.swing.JTextField();
        // make text field for saturday breakfast price
        jTextFieldSatBreakPrice = new javax.swing.JTextField();
        // make text field for sunday breakfast price
        jTextFieldSunBreakPrice = new javax.swing.JTextField();
        // make text field for tuesday breakfast price
        jTextFieldTuesBreakPrice = new javax.swing.JTextField();
        // make text field for wednesday breakfast price
        jTextFieldWedBreakPrice = new javax.swing.JTextField();
        // make text field for thursday breakfast price
        jTextFieldThursBreakPrice = new javax.swing.JTextField();
        // make the 7th panel
        jPanel7 = new javax.swing.JPanel();
        // make text field for saturday lunch
        jTextFieldSatLunch = new javax.swing.JTextField();
        // make text field for sunday lunch
        jTextFieldSunLunch = new javax.swing.JTextField();
        // make text field for monday lunch
        jTextFieldMonLunch = new javax.swing.JTextField();
        // make text field for tuesday lunch
        jTextFieldTuesLunch = new javax.swing.JTextField();
        // make text field for wednesday lunch
        jTextFieldWedLunch = new javax.swing.JTextField();
        // make text field for thursday lunch
        jTextFieldThursLunch = new javax.swing.JTextField();
        // make text field for friday lunch
        jTextFieldFriLunch = new javax.swing.JTextField();
        // make text field for friday lunch  price
        jTextFieldFriLunchPrice = new javax.swing.JTextField();
        // make text field for monday lunch price
        jTextFieldMonLunchPrice = new javax.swing.JTextField();
        // make text field for saturday lunch price
        jTextFieldSatLunchPrice = new javax.swing.JTextField();
        // make text field for sunday lunch price
        jTextFieldSunLunchPrice = new javax.swing.JTextField();
        // make text field for tuesday lunch price
        jTextFieldTuesLunchPrice = new javax.swing.JTextField();
        // make text field for wednesday lunch price
        jTextFieldWedLunchPrice = new javax.swing.JTextField();
        // make text field for thursday lunch price
        jTextFieldThursLunchPrice = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //set layout for each object in getContentPane()
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set layout for the 1st panel
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set foreground for the 1st label
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        // set text for the 1st label
        jLabel1.setText("صبحانه");
        // add the 1st label to the 1st panel
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 11, -1, -1));
        // set foreground for the 2nd label
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        // set text for the 2nd label
        jLabel2.setText("ناهار");
        // add the 2nd label to the 1st panel
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));
        // set foreground for the 3rd label
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        // set text for the 3rd label
        jLabel3.setText("شام");
        // add the 3rd label to the 1st panel
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        // set text for the 4th label
        jLabel4.setText("قیمت");
        // add the 4th label to the 1st panel
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        // set text for the 5th label
        jLabel5.setText("قیمت");
        // add the 5th label to the 1st panel
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));
        // set text for the 6th label
        jLabel6.setText("قیمت");
        // add the 6th label to the 1st panel
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));
        // add the 1st panel itself to the getContentPane()
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 610, -1));
        // set layout for the 2nd panel
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for the 32nd label
        jLabel32.setText("شنبه");
        // add the 32nd label to the 2nd panel
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));
        // set text for the 33rd label
        jLabel33.setText("یکشنبه");
        // add the 33rd label to the 2nd panel
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        // set text for the 34th label
        jLabel34.setText("دوشنبه");
        // add the 34th label to the 2nd panel
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        // set text for the 35th label
        jLabel35.setText("سه شنبه");
        // add the 35th label to the 2nd panel
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        // set text for the 36th label
        jLabel36.setText("چهارشنبه");
        // add the 36th label to the 2nd panel
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        // set text for the 37th label
        jLabel37.setText("جمعه");
        // add the 37th label to the 2nd panel
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        // set text for the 38th label
        jLabel38.setText("پنجشنبه");
        // add the 38th label to the 2nd panel
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        // add the 2nd panel itself to the getContentPane()
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, 300));
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
        // add ok button to the getContentPane()
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 213, -1));
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
        // add the cancel button to the getContentPane()
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 207, -1));
        // set layout for 3rd panel
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // add jTextFieldSatDinner to the 3rd panel
        jPanel3.add(jTextFieldSatDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));
        // add jTextFieldSunDinner to the 3rd panel
        jPanel3.add(jTextFieldSunDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));
        // add jTextFieldMonDinner to the 3rd panel
        jPanel3.add(jTextFieldMonDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));
        // add jTextFieldTuesDinner to the 3rd panel
        jPanel3.add(jTextFieldTuesDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, -1));
        // add jTextFieldWedDinner to the 3rd panel
        jPanel3.add(jTextFieldWedDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));
        // add jTextFieldThursDinner to the 3rd panel
        jPanel3.add(jTextFieldThursDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, -1));
        // add the text field to the program
        jTextFieldFriDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jTextFieldFriDinner
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFriDinnerActionPerformed(evt);
            }
        });
        // add jTextFieldFriDinner to the 3rd panel
        jPanel3.add(jTextFieldFriDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, -1));
        // add jTextFieldFriDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldFriDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));
        // add jTextFieldMonDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldMonDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));
        // add jTextFieldSatDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldSatDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        // add jTextFieldSunDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldSunDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));
        // add jTextFieldTuesDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldTuesDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));
        // add jTextFieldWedDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldWedDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));
        // add jTextFieldThursDinnerPrice to the 3rd panel
        jPanel3.add(jTextFieldThursDinnerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, -1));
        // add 3rd panel to the getContentPane()
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 280));
        // set layout for the 6th panel
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // add jTextFieldSatBreak to the 6th panel
        jPanel6.add(jTextFieldSatBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));
        // add jTextFieldSunBreak to the 6th panel
        jPanel6.add(jTextFieldSunBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));
        // add jTextFieldMonBreak to the 6th panel
        jPanel6.add(jTextFieldMonBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));
        // add jTextFieldTuesBreak to the 6th panel
        jPanel6.add(jTextFieldTuesBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, -1));
        // add jTextFieldWedBreak to the 6th panel
        jPanel6.add(jTextFieldWedBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));
        // add jTextFieldThursBreak to the 6th panel
        jPanel6.add(jTextFieldThursBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, -1));
        // add jTextFieldFriBreak to the program
        jTextFieldFriBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jTextFieldFriBreak
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFriBreakActionPerformed(evt);
            }
        });
        // add jTextFieldFriBreak to the 6th panel
        jPanel6.add(jTextFieldFriBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, -1));
        // add jTextFieldFriBreakPrice to the 6th panel
        jPanel6.add(jTextFieldFriBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));
        // add jTextFieldMonBreakPrice to the 6th panel
        jPanel6.add(jTextFieldMonBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));
        // add jTextFieldSatBreakPrice to the 6th panel
        jPanel6.add(jTextFieldSatBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        // add jTextFieldSunBreakPrice to the 6th panel
        jPanel6.add(jTextFieldSunBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));
        // add jTextFieldTuesBreakPrice to the 6th panel
        jPanel6.add(jTextFieldTuesBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));
        // add jTextFieldWedBreakPrice to the 6th panel
        jPanel6.add(jTextFieldWedBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));
        // add jTextFieldThursBreakPrice to the 6th panel
        jPanel6.add(jTextFieldThursBreakPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, -1));
        // add the 6th panel to the getContentPane()
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, 280));
        // set layout for 7th panel
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // add jTextFieldSatLunch to the 7th panel
        jPanel7.add(jTextFieldSatLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));
        // add jTextFieldSunLunch to the 7th panel
        jPanel7.add(jTextFieldSunLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, -1));
        // add jTextFieldMonLunch to the 7th panel
        jPanel7.add(jTextFieldMonLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));
        // add jTextFieldTuesLunch to the 7th panel
        jPanel7.add(jTextFieldTuesLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, -1));
        // add jTextFieldWedLunch to the 7th panel
        jPanel7.add(jTextFieldWedLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));
        // add jTextFieldThursLunch to the 7th panel
        jPanel7.add(jTextFieldThursLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, -1));
        // add jTextFieldFriLunch to the program
        jTextFieldFriLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jTextFieldFriLunch
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFriLunchActionPerformed(evt);
            }
        });
        // add jTextFieldFriLunch to the 7th panel
        jPanel7.add(jTextFieldFriLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, -1));
        // add jTextFieldFriLunchPrice to the 7th panel
        jPanel7.add(jTextFieldFriLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, -1));
        // add jTextFieldMonLunchPrice to the 7th panel
        jPanel7.add(jTextFieldMonLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));
        // add jTextFieldSatLunchPrice to the 7th panel
        jPanel7.add(jTextFieldSatLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        // add jTextFieldSunLunchPrice to the 7th panel
        jPanel7.add(jTextFieldSunLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));
        // add jTextFieldTuesLunchPrice to the 7th panel
        jPanel7.add(jTextFieldTuesLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));
        // add jTextFieldWedLunchPrice to the 7th panel
        jPanel7.add(jTextFieldWedLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));
        // add jTextFieldThursLunchPrice to the 7th panel
        jPanel7.add(jTextFieldThursLunchPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, -1));
        // add the 7th panel to the getContentPane()
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 280));
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * method for jTextFieldFriDinner
     * @param evt
     */
    private void jTextFieldFriDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFriDinnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFriDinnerActionPerformed
    /**
     * method for jButtonCancelAction
     * after clicking close button we can exit the frame
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * this method is for jTextFieldFriBreak
     * @param evt
     */
    private void jTextFieldFriBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFriBreakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFriBreakActionPerformed
    /**
     * this method is for jTextFieldFriLunch
     * @param evt
     */
    private void jTextFieldFriLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFriLunchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFriLunchActionPerformed

    /**
     * in this method after we click the ok button we check if all the blank fields are full or not
     * and because of this action we show a proper massage
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(jTextFieldSatBreak.getText().trim().equals("")|| jTextFieldSatBreakPrice.getText().trim().equals("")||
                jTextFieldSatLunch.getText().trim().equals("")|| jTextFieldSatLunchPrice.getText().trim().equals("")||
                jTextFieldSatDinner.getText().trim().equals("")|| jTextFieldSatDinnerPrice.getText().trim().equals("")||

                jTextFieldSunBreak.getText().trim().equals("")|| jTextFieldSunBreakPrice.getText().trim().equals("")||
                jTextFieldSunLunch.getText().trim().equals("")|| jTextFieldSunLunchPrice.getText().trim().equals("")||
                jTextFieldSunDinner.getText().trim().equals("")|| jTextFieldSunDinnerPrice.getText().trim().equals("")||

                jTextFieldMonBreak.getText().trim().equals("")|| jTextFieldMonBreakPrice.getText().trim().equals("")||
                jTextFieldMonLunch.getText().trim().equals("")|| jTextFieldMonLunchPrice.getText().trim().equals("")||
                jTextFieldMonDinner.getText().trim().equals("")|| jTextFieldMonDinnerPrice.getText().trim().equals("")||

                jTextFieldTuesBreak.getText().trim().equals("")|| jTextFieldTuesBreakPrice.getText().trim().equals("")||
                jTextFieldTuesLunch.getText().trim().equals("")|| jTextFieldTuesLunchPrice.getText().trim().equals("")||
                jTextFieldTuesDinner.getText().trim().equals("")|| jTextFieldTuesDinnerPrice.getText().trim().equals("")||

                jTextFieldWedBreak.getText().trim().equals("")|| jTextFieldWedBreakPrice.getText().trim().equals("")||
                jTextFieldWedLunch.getText().trim().equals("")|| jTextFieldWedLunchPrice.getText().trim().equals("")||
                jTextFieldWedDinner.getText().trim().equals("")|| jTextFieldWedDinnerPrice.getText().trim().equals("")||

                jTextFieldThursBreak.getText().trim().equals("")|| jTextFieldThursBreakPrice.getText().trim().equals("")||
                jTextFieldThursLunch.getText().trim().equals("")|| jTextFieldThursLunchPrice.getText().trim().equals("")||
                jTextFieldThursDinner.getText().trim().equals("")|| jTextFieldThursDinnerPrice.getText().trim().equals("")||

                jTextFieldFriBreak.getText().trim().equals("")|| jTextFieldFriBreakPrice.getText().trim().equals("")||
                jTextFieldFriLunch.getText().trim().equals("")|| jTextFieldFriLunchPrice.getText().trim().equals("")||
                jTextFieldFriDinner.getText().trim().equals("")|| jTextFieldFriDinnerPrice.getText().trim().equals(""))
        {JOptionPane.showMessageDialog(new JFrame(), "ورود همه فیلدها احباریست", "Dialog", JOptionPane.ERROR_MESSAGE);return;}
        // make a file for food plan
        FileMaker fm = new FileMaker("D:\\Files\\Food.txt");
        String Saturday = "day=saturday;"  + "breakfast=" + jTextFieldSatBreak.getText() +
                ";breakfastPrice=" + jTextFieldSatBreakPrice.getText() +
                ";lunch=" + jTextFieldSatLunch.getText() +
                ";lunchPrice=" + jTextFieldSatLunchPrice.getText() +
                ";dinner=" + jTextFieldSatDinner.getText() +
                ";dinnerPrice=" + jTextFieldSatDinnerPrice.getText() + ";";
        String Sunday = "day=sunday;"  + "breakfast=" + jTextFieldSunBreak.getText() +
                ";breakfastPrice=" + jTextFieldSunBreakPrice.getText() +
                ";lunch=" + jTextFieldSunLunch.getText() +
                ";lunchPrice=" + jTextFieldSunLunchPrice.getText() +
                ";dinner=" + jTextFieldSunDinner.getText() +
                ";dinnerPrice=" + jTextFieldSunDinnerPrice.getText() + ";";
        String Monday = "day=monday;"  + "breakfast=" + jTextFieldMonBreak.getText() +
                ";breakfastPrice=" + jTextFieldMonBreakPrice.getText() +
                ";lunch=" + jTextFieldMonLunch.getText() +
                ";lunchPrice=" + jTextFieldMonLunchPrice.getText() +
                ";dinner=" + jTextFieldMonDinner.getText() +
                ";dinnerPrice=" + jTextFieldMonDinnerPrice.getText() + ";";
        String Tuesday = "day=tuesday;"  + "breakfast=" + jTextFieldTuesBreak.getText() +
                ";breakfastPrice=" + jTextFieldTuesBreakPrice.getText() +
                ";lunch=" + jTextFieldTuesLunch.getText() +
                ";lunchPrice=" + jTextFieldTuesLunchPrice.getText() +
                ";dinner=" + jTextFieldTuesDinner.getText() +
                ";dinnerPrice=" + jTextFieldTuesDinnerPrice.getText() + ";";
        String Wednesday = "day=wednesday;"  + "breakfast=" + jTextFieldWedBreak.getText() +
                ";breakfastPrice=" + jTextFieldWedBreakPrice.getText() +
                ";lunch=" + jTextFieldWedLunch.getText() +
                ";lunchPrice=" + jTextFieldWedLunchPrice.getText() +
                ";dinner=" + jTextFieldWedDinner.getText() +
                ";dinnerPrice=" + jTextFieldWedDinnerPrice.getText() + ";";
        String Thursday = "day=thursday;"  + "breakfast=" + jTextFieldThursBreak.getText() +
                ";breakfastPrice=" + jTextFieldThursBreakPrice.getText() +
                ";lunch=" + jTextFieldThursLunch.getText() +
                ";lunchPrice=" + jTextFieldThursLunchPrice.getText() +
                ";dinner=" + jTextFieldThursDinner.getText() +
                ";dinnerPrice=" + jTextFieldThursDinnerPrice.getText() + ";";
        String Friday = "day=friday;"  + "breakfast=" + jTextFieldFriBreak.getText() +
                ";breakfastPrice=" + jTextFieldFriBreakPrice.getText() +
                ";lunch=" + jTextFieldFriLunch.getText() +
                ";lunchPrice=" + jTextFieldFriLunchPrice.getText() +
                ";dinner=" + jTextFieldFriDinner.getText() +
                ";dinnerPrice=" + jTextFieldFriDinnerPrice.getText() + ";";
        try {
            // here we call fileWriter for each day
            fm.FileWriter(Saturday, false);
            fm.FileWriter(Sunday, true);
            fm.FileWriter(Monday, true);
            fm.FileWriter(Tuesday, true);
            fm.FileWriter(Wednesday, true);
            fm.FileWriter(Thursday, true);
            fm.FileWriter(Friday, true);
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(FoodPlan.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextFieldFriBreak;
    private javax.swing.JTextField jTextFieldFriBreakPrice;
    private javax.swing.JTextField jTextFieldFriDinner;
    private javax.swing.JTextField jTextFieldFriDinnerPrice;
    private javax.swing.JTextField jTextFieldFriLunch;
    private javax.swing.JTextField jTextFieldFriLunchPrice;
    private javax.swing.JTextField jTextFieldMonBreak;
    private javax.swing.JTextField jTextFieldMonBreakPrice;
    private javax.swing.JTextField jTextFieldMonDinner;
    private javax.swing.JTextField jTextFieldMonDinnerPrice;
    private javax.swing.JTextField jTextFieldMonLunch;
    private javax.swing.JTextField jTextFieldMonLunchPrice;
    private javax.swing.JTextField jTextFieldSatBreak;
    private javax.swing.JTextField jTextFieldSatBreakPrice;
    private javax.swing.JTextField jTextFieldSatDinner;
    private javax.swing.JTextField jTextFieldSatDinnerPrice;
    private javax.swing.JTextField jTextFieldSatLunch;
    private javax.swing.JTextField jTextFieldSatLunchPrice;
    private javax.swing.JTextField jTextFieldSunBreak;
    private javax.swing.JTextField jTextFieldSunBreakPrice;
    private javax.swing.JTextField jTextFieldSunDinner;
    private javax.swing.JTextField jTextFieldSunDinnerPrice;
    private javax.swing.JTextField jTextFieldSunLunch;
    private javax.swing.JTextField jTextFieldSunLunchPrice;
    private javax.swing.JTextField jTextFieldThursBreak;
    private javax.swing.JTextField jTextFieldThursBreakPrice;
    private javax.swing.JTextField jTextFieldThursDinner;
    private javax.swing.JTextField jTextFieldThursDinnerPrice;
    private javax.swing.JTextField jTextFieldThursLunch;
    private javax.swing.JTextField jTextFieldThursLunchPrice;
    private javax.swing.JTextField jTextFieldTuesBreak;
    private javax.swing.JTextField jTextFieldTuesBreakPrice;
    private javax.swing.JTextField jTextFieldTuesDinner;
    private javax.swing.JTextField jTextFieldTuesDinnerPrice;
    private javax.swing.JTextField jTextFieldTuesLunch;
    private javax.swing.JTextField jTextFieldTuesLunchPrice;
    private javax.swing.JTextField jTextFieldWedBreak;
    private javax.swing.JTextField jTextFieldWedBreakPrice;
    private javax.swing.JTextField jTextFieldWedDinner;
    private javax.swing.JTextField jTextFieldWedDinnerPrice;
    private javax.swing.JTextField jTextFieldWedLunch;
    private javax.swing.JTextField jTextFieldWedLunchPrice;
    // End of variables declaration//GEN-END:variables
}
