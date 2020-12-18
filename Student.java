package Student;

import Adder.AddCredit;
import FileMaker.FileMaker;
import Login.Login;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * this class is for students
 * they can add credit , reserve food , choose class , change their username and password
 * @author Erfan Majedi
 * @since 2020.17.12
 */
public class Student extends javax.swing.JFrame {
    // username and password field
    public static String username , password;

    /**
     * constructor for the student class that we call initComponents()
     * initialize the fields
     * set username and password for their text fields
     * make the close operation on clicking the close button on top right
     * force the program to start in center of the screen
     * call the necessary methods at last
     * @param Username
     * @param Password
     */
    public Student(String Username , String Password) {
        initComponents();
        this.setUsername(Username);
        this.password = Password;
        this.jTextFieldUsername.setText(this.getUsername());
        this.jTextFieldPassword.setText(this.password);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Start in center Screen

        SetCredit();
        FillTable();
        SetAverage();
    }

    /**
     * getter method for field
     * @return
     */
    public static String getUsername() {
        return username;
    }

    /**
     * setter method for field
     * @param username
     */
    public static void setUsername(String username) {
        Student.username = username;
    }

    /**
     * in this method we go SelectUnit file and read it for getting the grades of the student
     * because in here we want to calculate the average
     */
    private void SetAverage(){
        float AVG = 0;
        int countUnit= 0;
        try {
            // put SelectUnit file in an object named file
            FileMaker file = new FileMaker("d:\\Files\\SelectUnit.txt");
            // check if the file is not empty read the file and its lines
            if(!file.IsEmptyFile()){
                String[] result = file.ReadFile();
                int CountLines = file.NumberOfLines();
                // for loop base on number of lines
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startUser = data.indexOf("studentUsername=");
                    int endUser = data.indexOf(";", startUser);
                    String _Username = data.substring(startUser + 16, endUser);

                    int _startClass = data.indexOf("classname=");
                    int _endClass = data.indexOf(";", _startClass);
                    String _ClassName = data.substring(_startClass + 10, _endClass);

                    int _startScore = data.indexOf("score=");
                    int _endScore = data.indexOf(";", _startScore);
                    String _Score = data.substring(_startScore + 6, _endScore);
                    // check if the score in not null
                    if(!_Score.equals("null")){
                        //Returns an Integer object holding the value of the specified String
                        int ScoreTemp = Integer.valueOf(_Score);
                        int CountUnitTemp = this.GetCountUnit(_ClassName);
                        AVG = ((AVG * countUnit) + (ScoreTemp * CountUnitTemp)) / (countUnit + CountUnitTemp);
                        countUnit += CountUnitTemp;
                    }
                }
            }

        }
        // here we check some exceptions and if something went wrong we show the error massage
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        // in here we put the AVG in the average text field that we created
        this.jTextFieldAverage.setText(String.valueOf(AVG));
    }

    /**
     * in this method we go to classes file to find amount of units
     * because we need it for calculating the average for the students
     * @param ClassName
     * @return
     */
    private int GetCountUnit(String ClassName){
        // set the variable null
        String CountVahed = null;
        // put classes file in an object named file the read it and count the lines
        try {
            FileMaker file = new FileMaker("d:\\Files\\Classes.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startClassName = data.indexOf("name=");
                int endClassName = data.indexOf(";", startClassName);
                String _ClassName = data.substring(startClassName + 5, endClassName);

                int _startCountUnit = data.indexOf("countUnit=");
                int _endCountUnit = data.indexOf(";", _startCountUnit);
                String _CountUnit = data.substring(_startCountUnit + 11, _endCountUnit);

                if(ClassName.equals(_ClassName))
                {CountVahed = _CountUnit; break;}
            }

        }
        // here we check some exceptions and show the error massage if it's necessary
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        return Integer.valueOf(CountVahed);
    }

    /**
     * in this method we go to SelectUnit file again
     * but this time for fill the table
     * this table shows the classname , time and amount of units that the student choose
     */
    private void FillTable(){
        // put SelectUnit file in an object named fileOFSelectedClassNames
        try {
            FileMaker fileOFSelectedClassNames = new FileMaker("d:\\Files\\SelectUnit.txt");
            // check if the file is empty or not then read it and count the lines
            if(!fileOFSelectedClassNames.IsEmptyFile()){
                String[] resultClassNames = fileOFSelectedClassNames.ReadFile();
                int _CountLines = fileOFSelectedClassNames.NumberOfLines();

                String[] _ListClasses = new String[_CountLines];
                int _CountClasses = 0;
                // for loop base on _CountClasses
                for(int i = 0; i < _CountLines; i++){
                    String data = resultClassNames[i];
                    int startSTUUsername = data.indexOf("studentUsername=") + 16;
                    int endSTUUsername = data.indexOf(";", startSTUUsername);
                    String _STUDENTUserName = data.substring(startSTUUsername, endSTUUsername);
                    int startClassName = data.indexOf("classname=") + 10;
                    int endClassName = data.indexOf(";", startClassName);
                    String _ClassName = data.substring(startClassName, endClassName);
                    // if the student username is equal to the username in the file
                    if(Student.username.equals(_STUDENTUserName)){
                        _ListClasses[_CountClasses] = _ClassName;
                        _CountClasses++;
                    }
                }
                // set a model for the class table
                DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel();
                // put Classes file in an object named fileOFSelectedClasses
                FileMaker fileOFSelectedClasses = new FileMaker("d:\\Files\\Classes.txt");
                String[] resultSelectedClasses = fileOFSelectedClasses.ReadFile();
                int _CountLineClasses = fileOFSelectedClasses.NumberOfLines();
                // for loop base on _CountLineClasses
                for(int i = 0; i < _CountLineClasses; i++){
                    String data = resultSelectedClasses[i];
                    int startClassName = data.indexOf("name=") + 5;
                    int endSClassName = data.indexOf(";", startClassName);
                    String _ClassName = data.substring(startClassName, endSClassName);

                    int startClassDate = data.indexOf("date=") + 5;
                    int endClassDate = data.indexOf(";", startClassDate);
                    String _ClassDate = data.substring(startClassDate, endClassDate);

                    int startCountUnit = data.indexOf("countUnit=") + 11;
                    int endCountUnit = data.indexOf(";", startCountUnit);
                    String _CountUnit = data.substring(startCountUnit, endCountUnit);
                    // if the search was successful
                    if(SearchArray(_ListClasses, _ClassName)){
                        // add one row
                        model.addRow(new Object[]{_ClassDate, _CountUnit, _ClassName});
                    }
                }
            }

        }
        // check some exception and show the error massage if it's necessary
        catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * in this method we search the list of classes and
     * if the classname was in the list we return it
     * @param arr
     * @param toSearchValue
     * @return
     */
    private boolean SearchArray(String[] arr, String toSearchValue)
    {
        return Arrays.asList(arr).contains(toSearchValue);
    }

    /**
     * in this method we set credit for student by read the Student file
     */
    private void SetCredit()
    {
        // set username
        String _Username;
        // set password
        String _Password;
        // here we put Students file in an object named file and then we read the file and count lines
        try {
            FileMaker file = new FileMaker("d:\\Files\\Students.txt");
            String[] result = file.ReadFile();
            int CountLines = file.NumberOfLines();
            // for loop base on number of lines
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startUser = data.indexOf("username=");
                int endUser = data.indexOf(";", startUser);
                _Username = data.substring(startUser + 9, endUser);
                int startPass = data.indexOf("password=");
                int endPass = data.indexOf(";", startPass);
                _Password = data.substring(startPass + 9, endPass);
                if(this.getUsername().equals(_Username) &&
                        this.password.equals(_Password))
                {
                    int startCredit = data.indexOf("credit=");
                    int endCredit = data.indexOf(";", startCredit);
                    String _Credit = data.substring(startCredit + 7, endCredit);
                    this.jTextFieldCredit.setText(_Credit);
                    break;
                }
            }

        }
        // check some exceptions and show the necessary error massage
        catch (IOException ex) {
            //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we generate initComponents() :
     * we make panels for the frame and we have four buttons
     * and then we have labels and text fields for each section
     * we have a table for list of chosen classes and the ability to scroll
     */
    private void initComponents() {
        // make the panel for the frame
        jPanel1 = new javax.swing.JPanel();
        // make the setting button
        jButtonSetting = new javax.swing.JButton();
        // make the add credit button
        jButtonAddCredit = new javax.swing.JButton();
        // make reserve food button
        jButtonReserveFood = new javax.swing.JButton();
        // make choose class button
        jButtonChooseClass = new javax.swing.JButton();
        // make the second panel fo the frame
        jPanel2 = new javax.swing.JPanel();
        // make label for credit
        jLabel3 = new javax.swing.JLabel();
        // make text field for credit label
        jTextFieldCredit = new javax.swing.JTextField();
        // make label for password
        jLabel2 = new javax.swing.JLabel();
        // make text field for password label
        jTextFieldPassword = new javax.swing.JTextField();
        // make label for username
        jLabel1 = new javax.swing.JLabel();
        // make text field for username label
        jTextFieldUsername = new javax.swing.JTextField();
        // make text field for average
        jTextFieldAverage = new javax.swing.JTextField();
        // make label for average
        jLabel4 = new javax.swing.JLabel();
        // make the ability to scroll
        jScrollPane1 = new javax.swing.JScrollPane();
        // make table for classes
        jTableClasses = new javax.swing.JTable();
        // make close button
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for the frame
        setTitle("پنل دانشجو");
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
        // set text for add credit button
        jButtonAddCredit.setText("افزایش موجودی حساب");
        // add the button to the program
        jButtonAddCredit.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزایش موجودی حساب" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCreditActionPerformed(evt);
            }
        });
        // set text for reserve food button
        jButtonReserveFood.setText("رزرو غذا");
        // add the button to the program
        jButtonReserveFood.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "رزرو غذا" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserveFoodActionPerformed(evt);
            }
        });
        // set text for choose class button
        jButtonChooseClass.setText("انتخاب کلاس جدید");
        // add the button to the program
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انتخاب کلاس جدید" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
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
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonAddCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonReserveFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonAddCredit))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonReserveFood)
                                        .addComponent(jButtonChooseClass))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        // set text for credit label
        jLabel3.setText("موجودی حساب:");
        // we can't edit the text field
        jTextFieldCredit.setEditable(false);
        // set text field for password label
        jLabel2.setText("رمز عبور:");
        // we can't edit the text field
        jTextFieldPassword.setEditable(false);
        // m=set text for username label
        jLabel1.setText("نام کاربری:");
        // we can't edit the text field
        jTextFieldUsername.setEditable(false);
        // we can't edit the text field
        jTextFieldAverage.setEditable(false);
        // set text for average label
        jLabel4.setText("معدل:");
        // set model for table , we set a 2D array but null and we have the titles of each section
        // we can edit only the first and second row
        jTableClasses.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "زمان برگزاری", "تعداد واحد", "نام کلاس"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        // the ability to scroll the classes table
        jScrollPane1.setViewportView(jTableClasses);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        // set layout for jPanel2
        jPanel2.setLayout(jPanel2Layout);
        // we setHorizontalGroup for jPanel2Layout
        jPanel2Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldPassword)
                                                        .addComponent(jTextFieldAverage))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(45, 45, 45))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(35, 35, 35)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3)
                                                                .addGap(19, 19, 19))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1)
                                                                .addGap(41, 41, 41))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
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
                                .addGap(87, 87, 87)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonClose)
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * method for student setting we create the frame for it and set it visible
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        StudentSetting f = new StudentSetting(this.getUsername());//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed

    /**
     * create frame for add credit and show it and we call SetCredit() in this method
     * @param evt
     */
    private void jButtonAddCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCreditActionPerformed
        AddCredit f = new AddCredit(this.jTextFieldUsername.getText());//Create JFrame
        f.setVisible(true);//Show JFrame
        SetCredit();
    }//GEN-LAST:event_jButtonAddCreditActionPerformed

    /**
     * in this method we go to food file and read it
     * we check if the admin planned the food or not
     * @param evt
     */
    private void jButtonReserveFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserveFoodActionPerformed
        // put food file in an object named fm
        FileMaker fm = new FileMaker("D:\\Files\\Food.txt");
        try {
            // check if fm is empty or not
            if(fm.IsEmptyFile())
                // if it is show the proper error massage
                JOptionPane.showMessageDialog(new JFrame(), "ابتدا برنامه غذایی باید توسط ادمین تنظیم شود", "Dialog", JOptionPane.ERROR_MESSAGE);
            else{
                // here we create frame for reserve food
                StudentReserveFood f = new StudentReserveFood(this.jTextFieldCredit.getText());//Create JFrame
                // set the frame visible
                f.setVisible(true);//Show JFrame
                // call setCredit()
                SetCredit();
            }

        }
        // here we check some exceptions
        catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonReserveFoodActionPerformed

    /**
     * in this method we make a frame for choose class and set it visible
     * @param evt
     */
    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed
        StudentChooseClass f = new StudentChooseClass(Float.valueOf(jTextFieldAverage.getText()));//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonChooseClassActionPerformed
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // please for run the program write username and password instead of null parts
                new Student(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCredit;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JButton jButtonReserveFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClasses;
    private javax.swing.JTextField jTextFieldAverage;
    private javax.swing.JTextField jTextFieldCredit;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

