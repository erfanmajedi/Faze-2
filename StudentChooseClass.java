package Student;

import FileMaker.FileMaker;
import Login.Login;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * in this class student can choose the class and it will show in the table under it and after
 * the student checked it , can click ok button
 * @author Erfan Majedi
 * @since 2020.17.12
 */
public class StudentChooseClass extends javax.swing.JFrame {
    // field for average
    private float average;

    /**
     * constructor for the class that we call initComponents()
     * initialize the field
     * make the close operation on click the close button on the top bar
     * make the comboBox to show suggestions from right to left
     * force the program to start in the center of the screen
     * at last we call two methods : FillComBoBox() , FillTable();
     * @param Average
     */
    public StudentChooseClass(float Average) {
        initComponents();
        this.average = Average;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxClasses.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JCombobox
        this.setLocationRelativeTo(null);//Start in center Screen
        FillComBoBox();
        FillTable();
    }

    /**
     * in this method we go to file classes and put the classes in the combo box
     * so that the student can choose the class he/she wants
     */
    private void FillComBoBox(){
        // here we put classes file in an object named file and then read it and count the lines
        try {
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startName = data.indexOf("name=") + 5;
                int endName = data.indexOf(";", startName);
                String name = data.substring(startName, endName);
                // add the classname to comboBox
                jComboBoxClasses.addItem(name);
            }
        }
        // we check some exception and show the error massage if it is necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * in this method we want to fill the table
     * so we go to SelectUnit file and with its information we fill the table
     */
    private void FillTable(){
        // here we put SelectUnit file in an object named fileOFSelectedClassNames and then read it and count the lines
        try {
            FileMaker fileOFSelectedClassNames = new FileMaker("d:\\Files\\SelectUnit.txt");
            // check if fileOFSelectedClassNames is empty or not
            if(!fileOFSelectedClassNames.IsEmptyFile()){
                String[] resultClassNames = fileOFSelectedClassNames.ReadFile();
                int _CountLines = fileOFSelectedClassNames.NumberOfLines();

                String[] _ListClasses = new String[_CountLines];
                int _CountClasses = 0;
                // for loop base on number of lines
                for(int i = 0; i < _CountLines; i++){
                    String data = resultClassNames[i];
                    int startSTUUsername = data.indexOf("studentUsername=") + 16;
                    int endSTUUserName = data.indexOf(";", startSTUUsername);
                    String _STUDENTUserName = data.substring(startSTUUsername, endSTUUserName);
                    int startClassName = data.indexOf("classname=") + 10;
                    int endClassName = data.indexOf(";", startClassName);
                    String _ClassName = data.substring(startClassName, endClassName);
                    // check if student username is the same as the one in the file
                    if(Student.getUsername().equals(_STUDENTUserName)){
                        _ListClasses[_CountClasses] = _ClassName;
                        _CountClasses++;
                    }
                }
                // here we set model for the table
                DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel();
                // here we put Classes file in an object named fileOFSelectedClasses and then read it and count the lines
                FileMaker fileOFSelectedClasses = new FileMaker("d:\\Files\\Classes.txt");
                String[] resultSelectedClasses = fileOFSelectedClasses.ReadFile();
                int _CountLineClasses = fileOFSelectedClasses.NumberOfLines();
                // for loop base on CountLineClasses
                for(int i = 0; i < _CountLineClasses; i++){
                    String data = resultSelectedClasses[i];
                    int startClassName = data.indexOf("name=") + 5;
                    int endSClassName = data.indexOf(";", startClassName);
                    String _ClassName = data.substring(startClassName, endSClassName);

                    int startClassDate = data.indexOf("date=") + 5;
                    int endClassDate = data.indexOf(";", startClassDate);
                    String _ClassDate = data.substring(startClassDate, endClassDate);

                    int startCountUnit = data.indexOf("countVahed=") + 11;
                    int endCountUnit = data.indexOf(";", startCountUnit);
                    String _CountUnit = data.substring(startCountUnit, endCountUnit);
                    // we search the name in the class list
                    if(SearchArray(_ListClasses, _ClassName)){
                        // add one row base date , unit and name of class
                        model.addRow(new Object[]{_ClassDate, _CountUnit, _ClassName});
                    }
                }
            }


        }
        // we check some exceptions and show the error massage if it's necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * in here we search the classname in the class list
     * @param arr
     * @param toSearchValue
     * @return
     */
    private boolean SearchArray(String[] arr, String toSearchValue)
    {
        return Arrays.asList(arr).contains(toSearchValue);
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents() :
     * first we make the panel for the frame
     * then we have label and a combo box for classes
     * we have a table for show the info of the chosen class
     * we have the ability to scroll and three buttons
     */
    private void initComponents() {
        // make the panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make label for combo box
        jLabel1 = new javax.swing.JLabel();
        // make combo box for classes
        jComboBoxClasses = new javax.swing.JComboBox<>();
        // make button for choose class
        jButtonChooseClass = new javax.swing.JButton();
        // make the scroll pane
        jScrollPane2 = new javax.swing.JScrollPane();
        // make the table for classes
        jTableClasses = new javax.swing.JTable();
        // make ok button
        jButtonOK = new javax.swing.JButton();
        // make cancel button
        jButtonCancel = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set layout for getContentPane()
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for class suggestion combo box
        jLabel1.setText("انتخاب کلاس:");
        // set text for choose class button
        jButtonChooseClass.setText("انتخاب کلاس");
        // add the button to the program
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انتخاب کلاس" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
            }
        });
        // set model for table , we have 2D  array for each section then we name each section
        jTableClasses.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                // here we name each section
                new String [] {
                        "زمان برگزاری", "تعداد واحد", "نام کلاس"
                }
        ));
        // set the ability to scroll over class table
        jScrollPane2.setViewportView(jTableClasses);
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
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)))
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonChooseClass))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // add the panel to the getContentPane()
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 290));
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
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 230, -1));
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
        // add cancel button to the getContentPane()
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * here we handle the choose class button and what will happen when we click it
     * @param evt
     */
    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed
        // if the class was in full capacity we show the error massage
        if(GetCapacityOfClass(this.jComboBoxClasses.getSelectedItem().toString()) < 1){
            JOptionPane.showMessageDialog(new JFrame(),"ظرفیت کلاس پر است", "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // here we get model of the table
        DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel();
        // put classes file in an object named file and read the file and count lines
        try {
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startName = data.indexOf("name=") + 5;
                int endName = data.indexOf(";", startName);
                String name = data.substring(startName, endName);
                int startUnit = data.indexOf("countVahed=") + 11;
                int endUnit = data.indexOf(";", startUnit);
                String countUnit= data.substring(startUnit, endUnit);
                int startCapa = data.indexOf("capacity=") + 9;
                int endCapa = data.indexOf(";", startCapa);
                String capacity = data.substring(startCapa, endCapa);
                int startDate = data.indexOf("date=") + 5;
                int endDate = data.indexOf(";", startDate);
                String date = data.substring(startDate, endDate);
                // here we check if the amount of units are more than 24 and the average is greater than 17
                if(this.CountVahed() + Integer.valueOf(countUnit) > 24 && this.average > 17)
                {
                    // we show the error message if the amount of units are more than 24
                    JOptionPane.showMessageDialog(new JFrame(),"نمیتوانید بیشتر از 24 واحد بردارید", "Dialog", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                // in here we check if the amount of units are more than 20 and the average is less than 17
                if(this.CountVahed() + Integer.valueOf(countUnit) > 20 && this.average < 17)
                {
                    // we show the error massage if the if condition becomes true
                    JOptionPane.showMessageDialog(new JFrame(),"نمیتوانید بیشتر از 20 واحد بردارید", "Dialog", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                // here we check if the class is already chosen or not
                if(IsRepetitive(name) && jComboBoxClasses.getSelectedItem().equals(name))
                    // if the condition is true we show the error massage
                    JOptionPane.showMessageDialog(new JFrame(), "این کلاس قبلا انتخاب شده است", "Dialog", JOptionPane.ERROR_MESSAGE);
                // we add row if the class was not chosen
                else if(jComboBoxClasses.getSelectedItem().equals(name))
                {model.addRow(new Object[]{date, countUnit,name}); break;}
            }
        }
        // check some exceptions and show the error message if it's necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonChooseClassActionPerformed

    /**
     * in this class we get the capacity of the class from the file
     * if it had capacity we can choose it if it is not well we can't :)
     * @param Classname
     * @return
     */
    private int GetCapacityOfClass(String Classname){
        int CountSelectedClass = 0;
        int _capacity = 0;
        // put classes file in an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");
            // check if the file is not empty then read the file and count tle number of lines
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

                    int startCapa = data.indexOf("capacity=") + 9;
                    int endCapa = data.indexOf(";", startCapa);
                    String capacity = data.substring(startCapa, endCapa);
                    // check if they are equal
                    if(Classname.equals(name)){
                        _capacity = Integer.valueOf(capacity);
                    }
                }
            }

        }
        // check some exceptions and show the error massage if it is necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // put SelectUnit file in an object named file
        try {
            FileMaker file = new FileMaker("d:\\Files\\SelectUnit.txt");
            // check if the file is not empty then read the file and count the lines
            if(!file.IsEmptyFile()){
                String[] result = file.ReadFile();
                int CountLines = file.NumberOfLines();
                // for loop base on number of lines
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startName = data.indexOf("classname=") + 10;
                    int endName = data.indexOf(";", startName);
                    String name = data.substring(startName, endName);

                    if(Classname.equals(name)){
                        CountSelectedClass++;
                    }
                }
            }

        }
        // check some exceptions and show the error massage if it is necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }

        return _capacity - CountSelectedClass;
    }

    /**
     * in this method after the student check the chosen class and want to continue
     * we show the classes in the table in the main panel
     * @param evt
     */
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        // put SelectUnit file in an object named file
        try {
            FileMaker fm = new FileMaker("D:\\Files\\SelectUnit.txt");
            // for loop base on the number of rows that the table have
            for(int i = 0; i < jTableClasses.getRowCount(); i++){
                String _ClassName = (String) jTableClasses.getModel().getValueAt(i, 2);
                if(IsExistLessonForStudent(_ClassName))
                    continue;
                else
                {
                    String _SelectUnit = "studentUsername=" + Student.getUsername() +
                            ";masterUsername=" + this.GetMasterUsernameOfClassName(_ClassName) +
                            ";classname=" + _ClassName  +
                            ";score=null;";
                    fm.FileWriter(_SelectUnit, true);
                }
            }
            // here we show the successful massage
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
        // check some exceptions and show the error massage if it is necessary
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    /**
     * in this method we get username of master that created the class
     * @param ClassName
     * @return
     */
    private String GetMasterUsernameOfClassName(String ClassName){
        int CountLines = 0;
        String _MasterUsername = null, _ClassName;
        try {
            FileMaker fm = new FileMaker("D:\\Files\\Classes.txt");
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];

                int startClassname = data.indexOf("name=");
                int endClassname= data.indexOf(";", startClassname);
                //JOptionPane.showMessageDialog(new JFrame(), startClassname+"="+endClassname, "Dialog", JOptionPane.INFORMATION_MESSAGE);
                _ClassName = data.substring(startClassname + 5, endClassname);

                int startUser = data.indexOf("masterUsername=");
                int endUser = data.indexOf(";", startUser);
                _MasterUsername = data.substring(startUser + 15, endUser);

                if( ClassName.equals(_ClassName))
                {break;}
            }
        } catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
        return _MasterUsername;
    }

    /**
     * in this method we check if the class is available or not for the student
     * @param ClassName
     * @return
     */
    private boolean IsExistLessonForStudent(String ClassName)
    {
        boolean Flag = false;
        int CountLines = 0;
        String _Username, _ClassName;
        try {
            FileMaker fm = new FileMaker("D:\\Files\\SelectUnit.txt");
            //JOptionPane.showMessageDialog(new JFrame(), "=" +fm.IsEmptyFile()+"=", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            if(fm.IsEmptyFile())
                return false;
            String[] result = fm.ReadFile();
            CountLines = fm.NumberOfLines();
            int studentRow;
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startUser = data.indexOf("studentUsername=");
                int endUser = data.indexOf(";", startUser);
                _Username = data.substring(startUser + 16, endUser);

                int startClassname = data.indexOf("classname=");
                int endClassname= data.indexOf(";", startClassname);
                _ClassName = data.substring(startClassname + 10, endClassname);

                if(Student.getUsername().equals(_Username) && ClassName.equals(_ClassName))
                {Flag = true; break;}
            }
        }
        // check some exceptions
        catch (IOException ex) {
            Logger.getLogger(StudentSetting.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Flag;
    }

    /**
     * in this method we check if the class name repeated or not
     * @param ClassName
     * @return
     */
    private boolean IsRepetitive(String ClassName){
        boolean Flag = false;
        for(int i = 0; i < jTableClasses.getRowCount(); i++){
            if(jTableClasses.getModel().getValueAt(i, 2).equals(ClassName))
            { Flag = true; break;}
        }
        return Flag;
    }

    /**
     * in this method we count the amount of units
     * @return
     */
    private int CountVahed(){
        int sum = 0 ;
        for(int i = 0; i < jTableClasses.getRowCount(); i++)
            sum += Integer.valueOf((String) jTableClasses.getModel().getValueAt(i, 1));
        return sum;
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
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentChooseClass(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClasses;
    // End of variables declaration//GEN-END:variables
}

