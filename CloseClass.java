package CloseClass;

import FileMaker.FileMaker;
import Student.StudentSetting;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * CloseClass represents that after the master add a class
 * in this class master can choose between classes and delete it
 * @author Erfan Majedi
 * @since 2020.12.12
 */
public class CloseClass extends javax.swing.JFrame {
    // field for close class
    private String masterUsername;

    /**
     * in this class we call initComponent() and initialize the field
     * make the frame to stop operate by clicking the close button
     * make a comboBox for the classes that the master want to close
     * and we read classes for each master
     * @param MasterUsername
     */
    public CloseClass(String MasterUsername) {
        initComponents();
        this.masterUsername = MasterUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxClasses.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
        ReadClasses(this.masterUsername);
    }

    /**
     * in this method first we remove all the items from comboBox and
     * we make a file for classes to read them from that file
     * we have two situation if the file is empty or not
     * if it is not we can remove the class by clicking the close button
     * if it is empty we show the error massage to the master
     * @param MasterUsername
     */
    public void ReadClasses(String MasterUsername){
        this.jComboBoxClasses.removeAllItems();
        try {
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");

            if(!file.IsEmptyFile()){
                String[] result = file.ReadFile();
                int CountLines = file.NumberOfLines();
                //JOptionPane.showMessageDialog(new JFrame(), CountLines, "Dialog", JOptionPane.ERROR_MESSAGE);
                if(CountLines == 0)
                    return;
                String[] Classes = new String[CountLines];
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startUser = data.indexOf("masterUsername=");
                    int endUser = data.indexOf(";", startUser);
                    String Username = data.substring(startUser + 15, endUser);
                    int startClass = data.indexOf("name=");
                    int endClass = data.indexOf(";", startClass);
                    String Class = data.substring(startClass + 5, endClass);
                    if(masterUsername.equals(Username))
                        Classes[i] = Class;
                }

                for(int i = 0; i < CountLines; i++)
                    if(Classes[i] == null) {}
                    else
                        jComboBoxClasses.addItem(Classes[i]);
            }

        } catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make the panel and label
     * we have a comboBox for lessons suggestions
     * and we have two button , one for close and one for delete the class
     */
    private void initComponents() {
        // make panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make 1st label
        jLabel1 = new javax.swing.JLabel();
        // make a comboBox for lessons
        jComboBoxClasses = new javax.swing.JComboBox<>();
        // make a close button
        jButtonClose = new javax.swing.JButton();
        // make a delete button for deleting classes
        jButtonDeleteClass = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for 1st label
        jLabel1.setText("انتخاب کلاس:");
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
                                .addContainerGap()
                                .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(20, 20, 20))
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
        // set text for delete class button
        jButtonDeleteClass.setText("حذف کلاس");
        // add the button to the program
        jButtonDeleteClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "حذف کلاس" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClassActionPerformed(evt);
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
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonDeleteClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 13, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonClose)
                                        .addComponent(jButtonDeleteClass))
                                .addGap(26, 26, 26))
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
     * in this method we delete the class that the master want
     * @param evt
     */
    private void jButtonDeleteClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClassActionPerformed
        // first we create a file for classes
        try {
            FileMaker fm = new FileMaker("D:\\Files\\Classes.txt");
            // check if file is not empty
            if(!fm.IsEmptyFile()){
                String[] result = fm.ReadFile();
                int CountLines = fm.NumberOfLines();

                for(int i = 0; i < CountLines; i++){
                    String data = result[i];
                    int startName = data.indexOf("name=") + 5;
                    int endName = data.indexOf(";",startName);
                    String ClassName = data.substring(startName, endName);

                    if(jComboBoxClasses.getSelectedItem().equals(ClassName))
                    { result[i]=""; break;}
                }
                // we clear the file then check if it got cleared or not
                fm.ClearFile();
                for(int i = 0 ; i < CountLines; i++){
                    if(result[i] != "")
                        if(i ==0)
                            fm.FileWriter(result[i], false);
                        else
                            fm.FileWriter(result[i], true);
                }
            }
        // exception check
        } catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
        // first we create a file for select unit
        try {
            FileMaker fm = new FileMaker("D:\\Files\\SelectUnit.txt");
            // check if the file is empty or not
            if(!fm.IsEmptyFile()){
                String[] result = fm.ReadFile();
                int CountLines = fm.NumberOfLines();

                for(int i = 0; i < CountLines; i++){
                    String data = result[i];
                    int startClassname = data.indexOf("classname=") + 10;
                    int endClassname = data.indexOf(";",startClassname);
                    String ClassName = data.substring(startClassname, endClassname);

                    if(jComboBoxClasses.getSelectedItem().equals(ClassName))
                    { result[i]=""; break;}
                }
                // we clear the file then check if it got cleared or not
                fm.ClearFile();
                for(int i = 0 ; i < CountLines; i++){
                    if(result[i] != "")
                        if(i ==0)
                            fm.FileWriter(result[i], false);
                        else
                            fm.FileWriter(result[i], true);

                }
                // here we call read class method
                ReadClasses(this.masterUsername);
                // we show the massage if the class got deleted
                JOptionPane.showMessageDialog(new JFrame(), "با موفقیت حذف شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);

            }
        // check exception
        } catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteClassActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(CloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // when we add master and this master add the class we have change the null
                // unless it won't run
                new CloseClass(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonDeleteClass;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

