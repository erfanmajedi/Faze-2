package Student;

import FileMaker.FileMaker;
import Login.Login;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * this class is for the students that want to reserve food for themself
 * @author Erfan Majedi
 * @since 2020.18.12
 */
public class StudentReserveFood extends javax.swing.JFrame {
    // field for credit
    private String Credit;

    /**
     * constructor for student reserve food class that we call initComponents()
     * initialize the field
     * set close operation on click the close button on top right
     * force the program to start in the center of screen
     * call the methods that are necessary and set text for credit label
     * @param Credit
     */
    public StudentReserveFood(String Credit) {
        initComponents();
        this.Credit = Credit;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen
        ReadFoodPlan();
        //ReadSelectedFoods();
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }
    // global variable
    String SatBreakfastPrice,SatLunchPrice,SatDinnerPrice,SunBreakfastPrice,SunLunchPrice,SunDinnerPrice,MonBreakfastPrice,MonLunchPrice,
            MonDinnerPrice,TuesBreakfastPrice,TuesLunchPrice,TuesDinnerPrice,WedBreakfastPrice,WedLunchPrice,WedDinnerPrice,ThursBreakfastPrice,
            ThursLunchPrice,ThursDinnerPrice,FriBreakfastPrice,FriLunchPrice,FriDinnerPrice;

    /**
     * in this method we go to food file and check if is empty show the error massage
     * we don't let the program become visible
     * and if it is not empty we set the food plan
     */
    private void ReadFoodPlan(){

        try {
            FileMaker file = new FileMaker("d:\\Files\\Food.txt");

            if(file.IsEmptyFile()){
                JOptionPane.showMessageDialog(new JFrame(), "ابتدا برنامه غذایی باید تنظیم شود", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                return;
            }


            // we read from it and put in an array
            String[] result = file.ReadFile();

            //شنبه
            String Saturday = result[0];
            int startSatBreak = Saturday.indexOf("breakfast=") + 10;
            int endSatBreak = Saturday.indexOf(";", startSatBreak);
            String SatBreakfast = Saturday.substring(startSatBreak, endSatBreak);

            int startSatBreakPrice = Saturday.indexOf("breakfastPrice=") + 15;
            int endSatBreakPrice = Saturday.indexOf(";", startSatBreakPrice);
            SatBreakfastPrice = Saturday.substring(startSatBreakPrice, endSatBreakPrice);

            int startSatLunch = Saturday.indexOf("lunch=") + 6;
            int endSatLunch = Saturday.indexOf(";", startSatLunch);
            String SatLunch = Saturday.substring(startSatLunch, endSatLunch);

            int startSatLunchPrice = Saturday.indexOf("lunchPrice=") + 11;
            int endSatLunchPrice = Saturday.indexOf(";", startSatLunchPrice);
            SatLunchPrice = Saturday.substring(startSatLunchPrice, endSatLunchPrice);

            int startSatDinner = Saturday.indexOf("dinner=") + 7;
            int endSatDinner = Saturday.indexOf(";", startSatDinner);
            String SatDinner = Saturday.substring(startSatDinner, endSatDinner);

            int startSatDinnerPrice = Saturday.indexOf("dinnerPrice=") + 12;
            int endSatDinnerPrice = Saturday.indexOf(";", startSatDinnerPrice);
            SatDinnerPrice = Saturday.substring(startSatDinnerPrice, endSatDinnerPrice);
            // set text for jCheckBoxSatBreak
            jCheckBoxSatBreak.setText(SatBreakfast + " " + SatBreakfastPrice);
            // set text for jCheckBoxSatLunch
            jCheckBoxSatLunch.setText(SatLunch + " " + SatLunchPrice);
            // set text for jCheckBoxSatDinner
            jCheckBoxSatDinner.setText(SatDinner + " " + SatDinnerPrice);

            //یکشنیه
            String Sunday = result[1];
            int startSunBreak = Sunday.indexOf("breakfast=") + 10;
            int endSunBreak = Sunday.indexOf(";", startSunBreak);
            String SunBreakfast = Sunday.substring(startSunBreak, endSunBreak);

            int startSunBreakPrice = Sunday.indexOf("breakfastPrice=") + 15;
            int endSunBreakPrice = Sunday.indexOf(";", startSunBreakPrice);
            SunBreakfastPrice = Sunday.substring(startSunBreakPrice, endSunBreakPrice);

            int startSunLunch = Sunday.indexOf("lunch=") + 6;
            int endSunLunch = Sunday.indexOf(";", startSunLunch);
            String SunLunch = Sunday.substring(startSunLunch, endSunLunch);

            int startSunLunchPrice = Sunday.indexOf("lunchPrice=") + 11;
            int endSunLunchPrice = Sunday.indexOf(";", startSunLunchPrice);
            SunLunchPrice = Sunday.substring(startSunLunchPrice, endSunLunchPrice);

            int startSunDinner = Sunday.indexOf("dinner=") + 7;
            int endSunDinner = Sunday.indexOf(";", startSunDinner);
            String SunDinner = Sunday.substring(startSunDinner, endSunDinner);

            int startSunDinnerPrice = Sunday.indexOf("dinnerPrice=") + 12;
            int endSunDinnerPrice = Sunday.indexOf(";", startSunDinnerPrice);
            SunDinnerPrice = Sunday.substring(startSunDinnerPrice, endSunDinnerPrice);
            // set text for jCheckBoxSunBreak
            jCheckBoxSunBreak.setText(SunBreakfast + " " + SunBreakfastPrice);
            // set text for jCheckBoxSunLunch
            jCheckBoxSunLunch.setText(SunLunch + " " + SunLunchPrice);
            // set text for jCheckBoxSunDinner
            jCheckBoxSunDinner.setText(SunDinner + " " + SunDinnerPrice);

            //دوشنبه
            String Monday = result[2];

            int startMonBreak = Monday.indexOf("breakfast=") + 10;
            int endMonBreak = Monday.indexOf(";", startMonBreak);
            String MonBreakfast = Monday.substring(startMonBreak, endMonBreak);

            int startMonBreakPrice = Monday.indexOf("breakfastPrice=") + 15;
            int endMonBreakPrice = Monday.indexOf(";", startMonBreakPrice);
            MonBreakfastPrice = Monday.substring(startMonBreakPrice, endMonBreakPrice);

            int startMonLunch = Monday.indexOf("lunch=") + 6;
            int endMonLunch = Monday.indexOf(";", startMonLunch);
            String MonLunch = Monday.substring(startMonLunch, endMonLunch);

            int startMonLunchPrice = Monday.indexOf("lunchPrice=") + 11;
            int endMonLunchPrice = Monday.indexOf(";", startMonLunchPrice);
            MonLunchPrice = Monday.substring(startMonLunchPrice, endMonLunchPrice);

            int startMonDinner = Monday.indexOf("dinner=") + 7;
            int endMonDinner = Monday.indexOf(";", startMonDinner);
            String MonDinner = Monday.substring(startMonDinner, endMonDinner);

            int startMonDinnerPrice = Monday.indexOf("dinnerPrice=") + 12;
            int endMonDinnerPrice = Monday.indexOf(";", startMonDinnerPrice);
            MonDinnerPrice = Monday.substring(startMonDinnerPrice, endMonDinnerPrice);
            // set text for jCheckBoxMonBreak
            jCheckBoxMonBreak.setText(MonBreakfast + " " + MonBreakfastPrice);
            // set text for jCheckBoxMonLunch
            jCheckBoxMonLunch.setText(MonLunch + " " + MonLunchPrice);
            // set text for jCheckBoxMonDinner
            jCheckBoxMonDinner.setText(MonDinner + " " + MonDinnerPrice);

            //سه شنبه
            String Tuesday = result[3];

            int startTuesBreak = Tuesday.indexOf("breakfast=") + 10;
            int endTuesBreak = Tuesday.indexOf(";", startTuesBreak);
            String TuesBreakfast = Tuesday.substring(startTuesBreak, endTuesBreak);

            int startTuesBreakPrice = Tuesday.indexOf("breakfastPrice=") + 15;
            int endTuesBreakPrice = Tuesday.indexOf(";", startTuesBreakPrice);
            TuesBreakfastPrice = Tuesday.substring(startTuesBreakPrice, endTuesBreakPrice);

            int startTuesLunch = Tuesday.indexOf("lunch=") + 6;
            int endTuesLunch = Tuesday.indexOf(";", startTuesLunch);
            String TuesLunch = Tuesday.substring(startTuesLunch, endTuesLunch);

            int startTuesLunchPrice = Tuesday.indexOf("lunchPrice=") + 11;
            int endTuesLunchPrice = Tuesday.indexOf(";", startTuesLunchPrice);
            TuesLunchPrice = Tuesday.substring(startTuesLunchPrice, endTuesLunchPrice);

            int startTuesDinner = Tuesday.indexOf("dinner=") + 7;
            int endTuesDinner = Tuesday.indexOf(";", startTuesDinner);
            String TuesDinner = Tuesday.substring(startTuesDinner, endTuesDinner);

            int startTuesDinnerPrice = Tuesday.indexOf("dinnerPrice=") + 12;
            int endTuesDinnerPrice = Tuesday.indexOf(";", startTuesDinnerPrice);
            TuesDinnerPrice = Tuesday.substring(startTuesDinnerPrice, endTuesDinnerPrice);
            // set text for jCheckBoxTuesBreak
            jCheckBoxTuesBreak.setText(TuesBreakfast + " " + TuesBreakfastPrice);
            // set text for jCheckBoxTuesLunch
            jCheckBoxTuesLunch.setText(TuesLunch + " " + TuesLunchPrice);
            // set text for jCheckBoxTuesDinner
            jCheckBoxTuesDinner.setText(TuesDinner + " " + TuesDinnerPrice);

            //چهارشنبه
            String Wednesday = result[4];
            int startWedBreak = Wednesday.indexOf("breakfast=") + 10;
            int endWedBreak = Wednesday.indexOf(";", startWedBreak);
            String WedBreakfast = Wednesday.substring(startWedBreak, endWedBreak);

            int startWedBreakPrice = Wednesday.indexOf("breakfastPrice=") + 15;
            int endWedBreakPrice = Wednesday.indexOf(";", startWedBreakPrice);
            WedBreakfastPrice = Wednesday.substring(startWedBreakPrice, endWedBreakPrice);

            int startWedLunch = Wednesday.indexOf("lunch=") + 6;
            int endWedLunch = Wednesday.indexOf(";", startWedLunch);
            String WedLunch = Wednesday.substring(startWedLunch, endWedLunch);

            int startWedLunchPrice = Wednesday.indexOf("lunchPrice=") + 11;
            int endWedLunchPrice = Wednesday.indexOf(";", startWedLunchPrice);
            WedLunchPrice = Wednesday.substring(startWedLunchPrice, endWedLunchPrice);

            int startWedDinner = Wednesday.indexOf("dinner=") + 7;
            int endWedDinner = Wednesday.indexOf(";", startWedDinner);
            String WedDinner = Wednesday.substring(startWedDinner, endWedDinner);

            int startWedDinnerPrice = Wednesday.indexOf("dinnerPrice=") + 12;
            int endWedDinnerPrice = Wednesday.indexOf(";", startWedDinnerPrice);
            WedDinnerPrice = Wednesday.substring(startWedDinnerPrice, endWedDinnerPrice);
            // set text for jCheckBoxWedBreak
            jCheckBoxWedBreak.setText(WedBreakfast + " " + WedBreakfastPrice);
            // set text for jCheckBoxWedLunch
            jCheckBoxWedLunch.setText(WedLunch + " " + WedLunchPrice);
            // set text for jCheckBoxWedDinner
            jCheckBoxWedDinner.setText(WedDinner + " " + WedDinnerPrice);

            //پنجشنبه
            String Thursday = result[5];
            int startThursBreak = Thursday.indexOf("breakfast=") + 10;
            int endThursBreak = Thursday.indexOf(";", startThursBreak);
            String ThursBreakfast = Thursday.substring(startThursBreak, endThursBreak);

            int startThursBreakPrice = Thursday.indexOf("breakfastPrice=") + 15;
            int endThursBreakPrice = Thursday.indexOf(";", startThursBreakPrice);
            ThursBreakfastPrice = Thursday.substring(startThursBreakPrice, endThursBreakPrice);

            int startThursLunch = Thursday.indexOf("lunch=") + 6;
            int endThursLunch = Thursday.indexOf(";", startThursLunch);
            String ThursLunch = Thursday.substring(startThursLunch, endThursLunch);

            int startThursLunchPrice = Thursday.indexOf("lunchPrice=") + 11;
            int endThursLunchPrice = Thursday.indexOf(";", startThursLunchPrice);
            ThursLunchPrice = Thursday.substring(startThursLunchPrice, endThursLunchPrice);

            int startThursDinner = Thursday.indexOf("dinner=") + 7;
            int endThursDinner = Thursday.indexOf(";", startThursDinner);
            String ThursDinner = Thursday.substring(startThursDinner, endThursDinner);

            int startThursDinnerPrice = Thursday.indexOf("dinnerPrice=") + 12;
            int endThursDinnerPrice = Thursday.indexOf(";", startThursDinnerPrice);
            ThursDinnerPrice = Thursday.substring(startThursDinnerPrice, endThursDinnerPrice);
            // set text for jCheckBoxThursBreak
            jCheckBoxThursBreak.setText(ThursBreakfast + " " + ThursBreakfastPrice);
            // set text for jCheckBoxThursLunch
            jCheckBoxThursLunch.setText(ThursLunch + " " + ThursLunchPrice);
            // set text for jCheckBoxThursDinner
            jCheckBoxThursDinner.setText(ThursDinner + " " + ThursDinnerPrice);

            //جمعه
            String Friday = result[6];
            int startFriBreak = Friday.indexOf("breakfast=") + 10;
            int endFriBreak = Friday.indexOf(";", startFriBreak);
            String FriBreakfast = Friday.substring(startFriBreak, endFriBreak);

            int startFriBreakPrice = Friday.indexOf("breakfastPrice=") + 15;
            int endFriBreakPrice = Friday.indexOf(";", startFriBreakPrice);
            FriBreakfastPrice = Friday.substring(startFriBreakPrice, endFriBreakPrice);

            int startFriLunch = Friday.indexOf("lunch=") + 6;
            int endFriLunch = Friday.indexOf(";", startFriLunch);
            String FriLunch = Friday.substring(startFriLunch, endFriLunch);

            int startFriLunchPrice = Friday.indexOf("lunchPrice=") + 11;
            int endFriLunchPrice = Friday.indexOf(";", startFriLunchPrice);
            FriLunchPrice = Friday.substring(startFriLunchPrice, endFriLunchPrice);

            int startFriDinner = Friday.indexOf("dinner=") + 7;
            int endFriDinner = Friday.indexOf(";", startFriDinner);
            String FriDinner = Friday.substring(startFriDinner, endFriDinner);

            int startFriDinnerPrice = Friday.indexOf("dinnerPrice=") + 12;
            int endFriDinnerPrice = Friday.indexOf(";", startFriDinnerPrice);
            FriDinnerPrice = Friday.substring(startFriDinnerPrice, endFriDinnerPrice);
            // set text for jCheckBoxFriBreak
            jCheckBoxFriBreak.setText(FriBreakfast + " " + FriBreakfastPrice);
            // set text for jCheckBoxFriLunch
            jCheckBoxFriLunch.setText(FriLunch + " " + FriLunchPrice);
            // set text for jCheckBoxFriDinner
            jCheckBoxFriDinner.setText(FriDinner + " " + FriDinnerPrice);

        }
        // here we check exceptions and show the error massage if it is necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }

    }

    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we make panel and labels and buttons
     * we have text fields for every meal and their prices
     */
    private void initComponents() {
        // make close button
        jButtonClose = new javax.swing.JButton();
        // make ok button
        jButtonOK = new javax.swing.JButton();
        // make the 4th panel for the frame
        jPanel4 = new javax.swing.JPanel();
        // make check box for saturday lunch
        jCheckBoxSatLunch = new javax.swing.JCheckBox();
        // make check box for saturday dinner
        jCheckBoxSatDinner = new javax.swing.JCheckBox();
        // make check box for saturday breakfast
        jCheckBoxSatBreak = new javax.swing.JCheckBox();
        // make check box for sunday breakfast
        jCheckBoxSunBreak = new javax.swing.JCheckBox();
        // make check box for sunday lunch
        jCheckBoxSunLunch = new javax.swing.JCheckBox();
        // make check box for thursday dinner
        jCheckBoxThursDinner = new javax.swing.JCheckBox();
        // make check box for monday breakfast
        jCheckBoxMonBreak = new javax.swing.JCheckBox();
        // make check box for monday lunch
        jCheckBoxMonLunch = new javax.swing.JCheckBox();
        // make check box for sunday dinner
        jCheckBoxSunDinner = new javax.swing.JCheckBox();
        // make check box tuesday breakfast
        jCheckBoxTuesBreak = new javax.swing.JCheckBox();
        // make check box for tuesday lunch
        jCheckBoxTuesLunch = new javax.swing.JCheckBox();
        // make check box for monday dinner
        jCheckBoxMonDinner = new javax.swing.JCheckBox();
        // make check box for wednesday breakfast
        jCheckBoxWedBreak = new javax.swing.JCheckBox();
        // make check box for wednesday lunch
        jCheckBoxWedLunch = new javax.swing.JCheckBox();
        // make check box for tuesday dinner
        jCheckBoxTuesDinner = new javax.swing.JCheckBox();
        // make check box for thursday breakfast
        jCheckBoxThursBreak = new javax.swing.JCheckBox();
        // make check box for thursday lunch
        jCheckBoxThursLunch = new javax.swing.JCheckBox();
        // make check box for wednesday dinner
        jCheckBoxWedDinner = new javax.swing.JCheckBox();
        // make check box for friday breakfast
        jCheckBoxFriBreak = new javax.swing.JCheckBox();
        // make check box for friday lunch
        jCheckBoxFriLunch = new javax.swing.JCheckBox();
        // make check box for friday dinner
        jCheckBoxFriDinner = new javax.swing.JCheckBox();
        // make the second panel for the frame
        jPanel2 = new javax.swing.JPanel();
        // make the 10th label
        jLabel10 = new javax.swing.JLabel();
        // make the 11th label
        jLabel11 = new javax.swing.JLabel();
        // make the 9th label
        jLabel9 = new javax.swing.JLabel();
        // make the 8th label
        jLabel8 = new javax.swing.JLabel();
        // make the 6th label
        jLabel6 = new javax.swing.JLabel();
        // make the 5th label
        jLabel5 = new javax.swing.JLabel();
        // make the 4th label
        jLabel4 = new javax.swing.JLabel();
        // make the 3rd panel for the frame
        jPanel3 = new javax.swing.JPanel();
        // make the 1st label
        jLabel1 = new javax.swing.JLabel();
        // make the 2nd label
        jLabel2 = new javax.swing.JLabel();
        // make the 3rd label
        jLabel3 = new javax.swing.JLabel();
        // make label for credit
        jLabelCredit = new javax.swing.JLabel();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("برنامه غذایی");
        // set layout for getContentPane()
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
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
        // add close button to getContentPane()
        getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 376, 262, -1));
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
        // add ok button to getContentPane()
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 376, 262, -1));
        // set layout for the 4th panel
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for saturday lunch check box
        jCheckBoxSatLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxSatLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatLunchActionPerformed(evt);
            }
        });
        // add saturday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxSatLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 102, -1, 30));
        // set text for saturday dinner check box
        jCheckBoxSatDinner.setText("شام");
        // add the check box to the program
        jCheckBoxSatDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatDinnerActionPerformed(evt);
            }
        });
        // add saturday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxSatDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 211, -1, 30));
        // set text for saturday breakfast check box
        jCheckBoxSatBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxSatBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatBreakActionPerformed(evt);
            }
        });
        // add saturday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxSatBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 7, -1, 30));
        // set text for sunday breakfast check box
        jCheckBoxSunBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxSunBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunBreakActionPerformed(evt);
            }
        });
        // add sunday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxSunBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 30));
        // set text for sunday lunch check box
        jCheckBoxSunLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxSunLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunLunchActionPerformed(evt);
            }
        });
        // add sunday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxSunLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, 30));
        // set text for thursday dinner check box
        jCheckBoxThursDinner.setText("شام");
        // add the check box to the program
        jCheckBoxThursDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursDinnerActionPerformed(evt);
            }
        });
        // add thursday dinner check box to th 4th panel
        jPanel4.add(jCheckBoxThursDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));
        // set text for monday breakfast check box
        jCheckBoxMonBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxMonBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonBreakActionPerformed(evt);
            }
        });
        // add monday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxMonBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 30));
        // set text for monday lunch check box
        jCheckBoxMonLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxMonLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonLunchActionPerformed(evt);
            }
        });
        // add monday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxMonLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, 30));
        // set text for sunday dinner check box
        jCheckBoxSunDinner.setText("شام");
        // add the check box to the program
        jCheckBoxSunDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunDinnerActionPerformed(evt);
            }
        });
        // add sunday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxSunDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, 30));
        // set text for tuesday breakfast
        jCheckBoxTuesBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxTuesBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuesBreakActionPerformed(evt);
            }
        });
        // add tuesday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxTuesBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 30));
        // set text for tuesday lunch check box
        jCheckBoxTuesLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxTuesLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuesLunchActionPerformed(evt);
            }
        });
        // add tuesday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxTuesLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 30));
        // set text for monday dinner check box
        jCheckBoxMonDinner.setText("شام");
        // add the check box to the program
        jCheckBoxMonDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonDinnerActionPerformed(evt);
            }
        });
        // add monday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxMonDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, 30));
        // set text for wednesday breakfast check box
        jCheckBoxWedBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxWedBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedBreakActionPerformed(evt);
            }
        });
        // add the wednesday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxWedBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));
        // set text for wednesday lunch check box
        jCheckBoxWedLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxWedLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedLunchActionPerformed(evt);
            }
        });
        // add the wednesday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxWedLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, 30));
        // set text for tuesday dinner check box
        jCheckBoxTuesDinner.setText("شام");
        // add the check box to the program
        jCheckBoxTuesDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuesDinnerActionPerformed(evt);
            }
        });
        // add the tuesday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxTuesDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 30));
        // set text for thursday breakfast check box
        jCheckBoxThursBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxThursBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursBreakActionPerformed(evt);
            }
        });
        // add the thursday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxThursBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 30));
        // set text for thursday lunch check box
        jCheckBoxThursLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxThursLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursLunchActionPerformed(evt);
            }
        });
        // add the thursday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxThursLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 30));
        // set text for wednesday dinner check box
        jCheckBoxWedDinner.setText("شام");
        // add the check box to the program
        jCheckBoxWedDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedDinnerActionPerformed(evt);
            }
        });
        // add the wednesday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxWedDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 30));
        // set text for friday breakfast check box
        jCheckBoxFriBreak.setText("صبحانه");
        // add the check box to the program
        jCheckBoxFriBreak.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "صبحانه" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriBreakActionPerformed(evt);
            }
        });
        // add the friday breakfast check box to the 4th panel
        jPanel4.add(jCheckBoxFriBreak, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));
        // set text for friday lunch check box
        jCheckBoxFriLunch.setText("ناهار");
        // add the check box to the program
        jCheckBoxFriLunch.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriLunchActionPerformed(evt);
            }
        });
        // add the friday lunch check box to the 4th panel
        jPanel4.add(jCheckBoxFriLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));
        // set text for friday dinner check box
        jCheckBoxFriDinner.setText("شام");
        // add the check box to the program
        jCheckBoxFriDinner.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "شام" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriDinnerActionPerformed(evt);
            }
        });
        // add the friday dinner check box to the 4th panel
        jPanel4.add(jCheckBoxFriDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));
        // add the 4th panel to getContentPane()
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1080, -1));
        // set text for 10th label
        jLabel10.setText("جمعه");
        // set text for 11th label
        jLabel11.setText("پنجشنبه");
        // set text for 9th label
        jLabel9.setText("چهارشنبه");
        // set text for 8th label
        jLabel8.setText("سه شنبه");
        // set text for 6th label
        jLabel6.setText("دوشنبه");
        // set text for 5th label
        jLabel5.setText("یکشنبه");
        // set text for 4th label
        jLabel4.setText("شنبه");
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
                                .addGap(67, 67, 67)
                                .addComponent(jLabel10)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel11)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel6)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel5)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25))
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                .addContainerGap())
        );
        // add the 2th panel to getContentPane()
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 1020, -1));
        // set font for the 1st label
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for the 1st label
        jLabel1.setText("صبحانه");
        // set font for the 2nd label
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for the 2nd label
        jLabel2.setText("ناهار");
        // set font for the 3rd label
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for the 3rd label
        jLabel3.setText("شام");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        // set layout for jPanel3
        jPanel3.setLayout(jPanel3Layout);
        // we setHorizontalGroup for jPanel3Layout
        jPanel3Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel3Layout
        jPanel3Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28))
        );
        // add the 3rd panel to getContentPane()
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, -1, -1));
        // set text for credit label
        jLabelCredit.setText("jLabel7");
        // add the credit label to getContentPane()
        getContentPane().add(jLabelCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * in this method we handle the thursday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxThursLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);
        if(jCheckBoxThursLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست ", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxThursLunch.setSelected(!jCheckBoxThursLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursLunchActionPerformed
    /**
     * in this method we handle the friday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxFriLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.FriLunchPrice);
        if(jCheckBoxFriLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست ", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxFriLunch.setSelected(!jCheckBoxFriLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriLunchActionPerformed
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    /**
     * in this method we handle the thursday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxThursDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursDinnerPrice);
        if(jCheckBoxThursDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxThursDinner.setSelected(!jCheckBoxThursDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursDinnerActionPerformed

    /**
     * in this method we handle the sunday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxSunLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.SunLunchPrice);
        if(jCheckBoxSunLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSunLunch.setSelected(!jCheckBoxSunLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunLunchActionPerformed

    /**
     * this method is about handle the ok button's perform :
     * we set a string and when the student check some boxes for reserving we add to the string variable
     * then we go to the student file to check the username of the student
     * if we find the student we replace the old credit with new one and we add the reserved food name
     * after that if the action was successful we show the information massage
     * and at last we check exceptions
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        String ReservedFood = "";
        if(jCheckBoxSatBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSatLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSatDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuesBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuesLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuesDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";

        int CountLines;
        String Credit = null, Username, Food = null;
        try {
            FileMaker fm = new FileMaker("D:\\Files\\Students.txt");
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                Username = data.substring(startUser + 9, endUser);
                int startCredit = data.indexOf("credit=");
                int endCredit = data.indexOf(";", startCredit);
                Credit = data.substring(startCredit + 7, endCredit);
                int startFood = data.indexOf("reserveFood=");
                int endFood = data.indexOf(";", startFood);
                Food = data.substring(startFood + 12, endFood);

                if(Student.username.equals(Username))
                { break;}
            }
            String FoundStudent = result[studentRow];
            //int NewCredit = Integer.valueOf(Credit) + Integer.valueOf(jTextFieldCredit.getText());
            FoundStudent = FoundStudent.replace("credit=" + Credit, "credit=" + this.Credit);
            FoundStudent = FoundStudent.replace("reserveFood=" + Food, "reserveFood=" + ReservedFood);

            //JOptionPane.showMessageDialog(new JFrame(), FoundStudent, "Dialog", JOptionPane.INFORMATION_MESSAGE);
            result[studentRow] = FoundStudent;
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else
                    fm.FileWriter(result[i], true);
            }
            //this. = jTextFieldNewUsername.getText();

            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonOKActionPerformed
    /**
     * in this method we handle the saturday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxSatBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatBreakActionPerformed
        if(jCheckBoxSatBreak.isSelected()){
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatBreakfastPrice);
            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSatBreak.setSelected(!jCheckBoxSatBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else{
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatBreakfastPrice);
            this.Credit = String.valueOf(_credit + _price);
        }
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatBreakActionPerformed
    /**
     * in this method we handle the saturday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxSatLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatLunchActionPerformed
        if(jCheckBoxSatLunch.isSelected()){
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatLunchPrice);
            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSatLunch.setSelected(!jCheckBoxSatLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else{
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatLunchPrice);
            this.Credit = String.valueOf(_credit + _price);
        }
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatLunchActionPerformed

    /**
     * in this method we handle the saturday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxSatDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatDinnerActionPerformed
        if(jCheckBoxSatDinner.isSelected()){
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatDinnerPrice);
            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSatDinner.setSelected(!jCheckBoxSatDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else{
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SatDinnerPrice);
            this.Credit = String.valueOf(_credit + _price);
        }
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatDinnerActionPerformed
    /**
     * in this method we handle the sunday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxSunBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunBreakActionPerformed
        if(jCheckBoxSunBreak.isSelected()){
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SunBreakfastPrice);
            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSunBreak.setSelected(!jCheckBoxSunBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else{
            int _credit = Integer.valueOf(this.Credit);
            int _price = Integer.valueOf(this.SunBreakfastPrice);
            this.Credit = String.valueOf(_credit + _price);
        }
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunBreakActionPerformed
    /**
     * in this method we handle the sunday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxSunDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.SunDinnerPrice);
        if(jCheckBoxSunDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxSunDinner.setSelected(!jCheckBoxSunDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunDinnerActionPerformed
    /**
     * in this method we handle the monday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxMonBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.MonBreakfastPrice);
        if(jCheckBoxMonBreak.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxMonBreak.setSelected(!jCheckBoxMonBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonBreakActionPerformed
    /**
     * in this method we handle the monday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxMonLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.MonLunchPrice);
        if(jCheckBoxMonLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxMonLunch.setSelected(!jCheckBoxMonLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonLunchActionPerformed
    /**
     * in this method we handle the monday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxMonDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.MonDinnerPrice);
        if(jCheckBoxMonDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxMonDinner.setSelected(!jCheckBoxMonDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonDinnerActionPerformed
    /**
     * in this method we handle the tuesday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxTuesBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuesBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.TuesBreakfastPrice);
        if(jCheckBoxTuesBreak.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxTuesBreak.setSelected(!jCheckBoxTuesBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuesBreakActionPerformed
    /**
     * in this method we handle the tuesday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxTuesLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuesLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.TuesLunchPrice);
        if(jCheckBoxTuesLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxTuesLunch.setSelected(!jCheckBoxTuesLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuesLunchActionPerformed
    /**
     * in this method we handle the tuesday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxTuesDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuesDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.TuesDinnerPrice);
        if(jCheckBoxTuesDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxTuesDinner.setSelected(!jCheckBoxTuesDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuesDinnerActionPerformed
    /**
     * in this method we handle the wednesday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxWedBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.WedBreakfastPrice);
        if(jCheckBoxWedBreak.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست ", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxWedBreak.setSelected(!jCheckBoxWedBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedBreakActionPerformed
    /**
     * in this method we handle the wednesday lunch check box's perform
     * @param evt
     */
    private void jCheckBoxWedLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.WedLunchPrice);
        if(jCheckBoxWedLunch.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxWedLunch.setSelected(!jCheckBoxWedLunch.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedLunchActionPerformed
    /**
     * in this method we handle the wednesday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxWedDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.WedDinnerPrice);
        if(jCheckBoxWedDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxWedDinner.setSelected(!jCheckBoxWedDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedDinnerActionPerformed

    /**
     * in this method we handle the thursday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxThursBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursBreakfastPrice);
        if(jCheckBoxThursBreak.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxThursBreak.setSelected(!jCheckBoxThursBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursBreakActionPerformed
    /**
     * in this method we handle the friday breakfast check box's perform
     * @param evt
     */
    private void jCheckBoxFriBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.FriBreakfastPrice);
        if(jCheckBoxFriBreak.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxFriBreak.setSelected(!jCheckBoxFriBreak.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriBreakActionPerformed
    /**
     * in this method we handle the friday dinner check box's perform
     * @param evt
     */
    private void jCheckBoxFriDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.FriDinnerPrice);
        if(jCheckBoxFriDinner.isSelected()){

            if(_credit - _price < 0){
                JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
                jCheckBoxFriDinner.setSelected(!jCheckBoxFriDinner.isSelected());
                return;
            }
            this.Credit = String.valueOf(_credit - _price);
        }
        else
            this.Credit = String.valueOf(_credit + _price);

        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriDinnerActionPerformed

    /**
     * in this method we check which boxes are selected and then we check exceptions
     */
    private void ReadSelectedFoods(){
        String ReserveFood = null;
        int CountLines = 0;
        try {
            FileMaker fm = new FileMaker("D:\\Files\\Students.txt");
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                String Username = data.substring(startUser + 9, endUser);
                int startFood = data.indexOf("reserveFood=");
                int endFood = data.indexOf(";", startFood);
                ReserveFood = data.substring(startFood + 12, endFood);
                if(Student.username.equals(Username))
                { break;}
            }

            if(ReserveFood.substring(0, 1).equals("1"))
                jCheckBoxSatBreak.setSelected(true);
            else
                jCheckBoxSatBreak.setSelected(false);

            if(ReserveFood.substring(1, 2).equals("1"))
                jCheckBoxSatLunch.setSelected(true);
            else
                jCheckBoxSatLunch.setSelected(false);

            if(ReserveFood.substring(2, 3).equals("1"))
                jCheckBoxSatDinner.setSelected(true);
            else
                jCheckBoxSatDinner.setSelected(false);

            if(ReserveFood.substring(3, 4).equals("1"))
                jCheckBoxSunBreak.setSelected(true);
            else
                jCheckBoxSunBreak.setSelected(false);

            if(ReserveFood.substring(4, 5).equals("1"))
                jCheckBoxSunLunch.setSelected(true);
            else
                jCheckBoxSunLunch.setSelected(false);

            if(ReserveFood.substring(5, 6).equals("1"))
                jCheckBoxSunDinner.setSelected(true);
            else
                jCheckBoxSunDinner.setSelected(false);

            if(ReserveFood.substring(6, 7).equals("1"))
                jCheckBoxMonBreak.setSelected(true);
            else
                jCheckBoxMonBreak.setSelected(false);

            if(ReserveFood.substring(7, 8).equals("1"))
                jCheckBoxMonLunch.setSelected(true);
            else
                jCheckBoxMonLunch.setSelected(false);

            if(ReserveFood.substring(8, 9).equals("1"))
                jCheckBoxMonDinner.setSelected(true);
            else
                jCheckBoxMonDinner.setSelected(false);

            if(ReserveFood.substring(9, 10).equals("1"))
                jCheckBoxTuesBreak.setSelected(true);
            else
                jCheckBoxTuesBreak.setSelected(false);

            if(ReserveFood.substring(10, 11).equals("1"))
                jCheckBoxTuesLunch.setSelected(true);
            else
                jCheckBoxTuesLunch.setSelected(false);

            if(ReserveFood.substring(11, 12).equals("1"))
                jCheckBoxTuesDinner.setSelected(true);
            else
                jCheckBoxTuesDinner.setSelected(false);

            if(ReserveFood.substring(12, 13).equals("1"))
                jCheckBoxWedBreak.setSelected(true);
            else
                jCheckBoxWedBreak.setSelected(false);

            if(ReserveFood.substring(13, 14).equals("1"))
                jCheckBoxWedLunch.setSelected(true);
            else
                jCheckBoxWedLunch.setSelected(false);

            if(ReserveFood.substring(14, 15).equals("1"))
                jCheckBoxWedDinner.setSelected(true);
            else
                jCheckBoxWedDinner.setSelected(false);

            if(ReserveFood.substring(15, 16).equals("1"))
                jCheckBoxThursBreak.setSelected(true);
            else
                jCheckBoxThursBreak.setSelected(false);

            if(ReserveFood.substring(16, 17).equals("1"))
                jCheckBoxThursLunch.setSelected(true);
            else
                jCheckBoxThursLunch.setSelected(false);

            if(ReserveFood.substring(17, 18).equals("1"))
                jCheckBoxThursDinner.setSelected(true);
            else
                jCheckBoxThursDinner.setSelected(false);

            if(ReserveFood.substring(18, 19).equals("1"))
                jCheckBoxFriBreak.setSelected(true);
            else
                jCheckBoxFriBreak.setSelected(false);

            if(ReserveFood.substring(19, 20).equals("1"))
                jCheckBoxFriLunch.setSelected(true);
            else
                jCheckBoxFriLunch.setSelected(false);

            if(ReserveFood.substring(20, 21).equals("1"))
                jCheckBoxFriDinner.setSelected(true);
            else
                jCheckBoxFriDinner.setSelected(false);



//Student.username = this.username = jTextFieldNewUsername.getText();

//JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReserveFood(null).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxFriBreak;
    private javax.swing.JCheckBox jCheckBoxFriDinner;
    private javax.swing.JCheckBox jCheckBoxFriLunch;
    private javax.swing.JCheckBox jCheckBoxMonBreak;
    private javax.swing.JCheckBox jCheckBoxMonDinner;
    private javax.swing.JCheckBox jCheckBoxMonLunch;
    private javax.swing.JCheckBox jCheckBoxSatBreak;
    private javax.swing.JCheckBox jCheckBoxSatDinner;
    private javax.swing.JCheckBox jCheckBoxSatLunch;
    private javax.swing.JCheckBox jCheckBoxSunBreak;
    private javax.swing.JCheckBox jCheckBoxSunDinner;
    private javax.swing.JCheckBox jCheckBoxSunLunch;
    private javax.swing.JCheckBox jCheckBoxThursBreak;
    private javax.swing.JCheckBox jCheckBoxThursDinner;
    private javax.swing.JCheckBox jCheckBoxThursLunch;
    private javax.swing.JCheckBox jCheckBoxTuesBreak;
    private javax.swing.JCheckBox jCheckBoxTuesDinner;
    private javax.swing.JCheckBox jCheckBoxTuesLunch;
    private javax.swing.JCheckBox jCheckBoxWedBreak;
    private javax.swing.JCheckBox jCheckBoxWedDinner;
    private javax.swing.JCheckBox jCheckBoxWedLunch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCredit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
