package List;

import FileMaker.FileMaker;
import Login.Login;

import java.awt.ComponentOrientation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * this class is about a list of classes that the master add
 * it will show some information about class such as the name , capacity , time and the unit
 * @author Erfan Majedi
 * @since 2020.14.12
 */
public class ListClasses extends javax.swing.JFrame {
    /**
     * constructor for the class , we call initComponents()
     * set the close operation base on clicking close button on top right
     * we make the table to show information from right to left
     * we force the program to start in the center of screen
     * and we call FillTable() at last
     */
    public ListClasses() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTableClasses.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);//Right to left JTable
        this.setLocationRelativeTo(null);//Start in center Screen
        FillTable();
    }

    /**
     * in this method we fill the table in the file
     * first we set a model then we use try-catch syntax to write the table in the file
     */
    private void FillTable(){
        // set a default model for the table
        DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel();
        try {
            // here we put the class file in an object from fileMaker class named file
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");
            // check if the file is not empty we read file and read the lines
            if(!file.IsEmptyFile()){
                String[] result = file.ReadFile();
                int CountLines = file.NumberOfLines();
                // for loop base on number of lines
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startName = data.indexOf("name=") + 5;
                    int endName = data.indexOf(";", startName);
                    String name = data.substring(startName, endName);
                    int startUnit = data.indexOf("countUnit=") + 11;
                    int endUnit = data.indexOf(";", startUnit);
                    String countUnit = data.substring(startUnit, endUnit);
                    int startCapa = data.indexOf("capacity=") + 9;
                    int endCapa = data.indexOf(";", startCapa);
                    String capacity = data.substring(startCapa, endCapa);
                    int startDate = data.indexOf("date=") + 5;
                    int endDate = data.indexOf(";", startDate);
                    String date = data.substring(startDate, endDate);
                    model.addRow(new Object[]{name, countUnit,date, capacity});
                }
            }
        }
        // here we check some exceptions and show an error massage if we need to
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents()
     * we make a panel for frame and the ability to scroll
     * here we have one button that exit the program
     */
    private void initComponents() {
        // make the panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make the ability to scroll over table
        jScrollPane1 = new javax.swing.JScrollPane();
        // make the table for classes
        jTableClasses = new javax.swing.JTable();
        // make the close button
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("لیست کلاس ها");
        // set model for table
        jTableClasses.setModel(new javax.swing.table.DefaultTableModel(
                // make the 2D arrays for each section and we don't put anything in it
                new Object [][] {

                },
                // here we write names for each section
                new String [] {
                        "نام ", "تعداد واحد", "زمان تشکیل", "ظرفیت"
                }
        ));
        // here we set view to give the ability to scroll
        jScrollPane1.setViewportView(jTableClasses);
        //set text for close button
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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonClose))
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
            java.util.logging.Logger.getLogger(ListClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListClasses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClasses;
    // End of variables declaration//GEN-END:variables
}

