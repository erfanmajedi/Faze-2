package Master;

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
 * this class is for master grading students and show it in a table
 * @author Erfan Majedi
 * @since 2020.15.12
 */
public class MasterGrading extends javax.swing.JFrame {
    // field for masterUsername
    private String masterUsername;

    /**
     * constructor for the class that we call initComponents()
     * set the close operation on click on the close button on top right
     * initialize the field
     * make the table to come up from right to left
     * force the program to start in the center of screen
     * call the FillTable()
     * @param MasterUsername
     */
    public MasterGrading(String MasterUsername) {
        initComponents();
        this.masterUsername = MasterUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTableStudents.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);//Right to left JTable
        this.setLocationRelativeTo(null);//Start in center Screen
        FillTable();
    }

    /**
     * in here we first a default model
     * then we make file for reading info from it
     */
    private void FillTable(){
        //this.jTableStudents.removeAll();
        DefaultTableModel dtm = (DefaultTableModel) jTableStudents.getModel();
        // set row count method on 0
        dtm.setRowCount(0);
        DefaultTableModel model = (DefaultTableModel) jTableStudents.getModel();
        // put SelectUnit file to the the class fileMaker with an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\SelectUnit.txt");
            // check if file is not empty read from it and count the lines
            if(!file.IsEmptyFile()){
                String[] result = file.ReadFile();
                int CountLines = file.NumberOfLines();
                // for loop base on count lines
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startMasterUsername = data.indexOf("masterUsername=") + 15;
                    int endMasterUsername = data.indexOf(";", startMasterUsername);
                    String MasterUsername = data.substring(startMasterUsername, endMasterUsername);

                    int startStudentUsername = data.indexOf("studentUsername=") + 16;
                    int endStudentUsername = data.indexOf(";", startStudentUsername);
                    String StudentUsername = data.substring(startStudentUsername, endStudentUsername);

                    int startClassName = data.indexOf("classname=") + 10;
                    int endClassName = data.indexOf(";", startClassName);
                    String ClassName = data.substring(startClassName, endClassName);
                    // check if the masterUsername is the same as we initialize as field
                    if(this.masterUsername.equals(MasterUsername)){

                        FileMaker readStudentName = new FileMaker("d:\\Files\\Students.txt");
                        String[] resultClassNames = readStudentName.ReadFile();
                        int _CountLines = readStudentName.NumberOfLines();

                        String[] _ListStudents = new String[_CountLines];

                        for(int j = 0; j < _CountLines; j++){
                            String std = resultClassNames[j];
                            int startSTUUsername = std.indexOf("username=") + 9;
                            int endSTUUserName = std.indexOf(";", startSTUUsername);
                            String _STDUserName = std.substring(startSTUUsername, endSTUUserName);
                            int _startSTDName = std.indexOf("name=") + 5;
                            int _endSTDName = std.indexOf(";", _startSTDName);
                            String _STDName = std.substring(_startSTDName, _endSTDName);
                            int _startSTDNUM = std.indexOf("studentNumber=") + 14;
                            int _endSTDNum = std.indexOf(";", _startSTDNUM);
                            String _STDNum = std.substring(_startSTDNUM, _endSTDNum);
                            // check if StudentUsername is the _STDUserName add one row
                            if(StudentUsername.equals(_STDUserName)){
                                model.addRow(new Object[]{_STDName, _STDNum, ClassName, "ثبت نمره"});
                            }

                        }
                    }
                    //
                }//end for
            }//end first if

        }
        // check some exceptions
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
        // make the table for students
        jTableStudents = new javax.swing.JTable();
        // make the ok button
        jButtonOK = new javax.swing.JButton();
        // make the close button
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("لیست دانشجویان");
        // set model for table
        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
                // make the 2D arrays for each section and we don't put anything in it
                new Object [][] {

                },
                // here we write names for each section
                new String [] {
                        "نام و نام خانوادگی", "شماره دانشجویی", "نام کلاس", "ثبت نمره"
                }
        )
                /**
                 * this is a method for make the ability to edit the table
                 * we set only one false and we check if each cell is editable
                 */
        {
            boolean[] canEdit = new boolean [] {
                    true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        // add mouse clicking listener to the program
        jTableStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            /**
             * this method invoke th mouse clicking listener
             * @param evt
             */
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentsMouseClicked(evt);
            }
        });
        // make the ability to scroll the table
        jScrollPane1.setViewportView(jTableStudents);
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
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );
        // set text for ok button
        jButtonOK.setText("تایید");
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonOK)
                                        .addComponent(jButtonClose))
                                .addGap(0, 28, Short.MAX_VALUE))
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
     * this method is about the mouse click listener
     * we get column and row and check if we are in the third column we can write name , student number
     * and class name then we make an object from set score class and give grades to students
     * at last we set it visible
     * @param evt
     */
    private void jTableStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentsMouseClicked
        int column = jTableStudents.columnAtPoint(evt.getPoint());
        int row = jTableStudents.rowAtPoint(evt.getPoint());

        if(column == 3){
            String stdName = jTableStudents.getModel().getValueAt(row, 0).toString();
            String stdNum = jTableStudents.getModel().getValueAt(row, 1).toString();
            String classname = jTableStudents.getModel().getValueAt(row, 2).toString();
            SetScore ss = new SetScore(this.masterUsername, stdName, stdNum, classname);
            ss.setVisible(true);
        }
        FillTable();
    }//GEN-LAST:event_jTableStudentsMouseClicked

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
            java.util.logging.Logger.getLogger(MasterGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterGrading(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    // End of variables declaration//GEN-END:variables
}

