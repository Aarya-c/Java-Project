import javax.swing.JFrame;

import javax.swing.JMenuBar;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JPanel;

import javax.swing.JLabel;

import javax.swingJTextArea;

import javax.swing.JTextField;

import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JMenuItem;

import javax.swing.JOptionPane;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JToggleButton;

import javax.swing.ImageIcon;

import javax.swing.*;

import javax.swing.JLayeredPane;  //IMPORT

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class StudentGUI1 implements ActionListener{

 

    ArrayList <Student> StudentsList = new ArrayList<Student>();

    //Regular class

    private JFrame Regular_student,rFrame,regular_student;

    private JButton JButton_obj,JButton_obj1,button,button1,button2,button3,button4,button5;

    private JPanel panel,rPanel;

    private JButton changeTO,changeTO1;

    private ImageIcon ddIcon;

    private JLabel lblBackground,Regularstudent,student_name,Sname,LABEL3,LABEL4,LABEL5,LABEL6,course,enrollmentID,DOB,DOE;

    private JTextField LABEL_3, Sname_,LABEL_4,LABEL_5,LABEL_6,course_, enrollmentID_txt,student_name_txt;

    private JComboBox year_combo,months_combo,day_combo,year_combo_1,months_combo_1,day_combo_1;


 

    //Dropout class

    private JFrame dropout_student;

    private JButton Dropoutbutton,Dropoutbutton1,Dropoutbutton2,Dropoutbutton3,Dropoutbutton4,Dropoutbutton5;

    private JPanel box1,dPanel;

    private JLabel Dropoutstudent,DropoutDOD, Dropoutstudent_name,DropoutEnrollid ,DropoutSname,DropoutLABEL3,DropoutLABEL4,DropoutLABEL5,DropoutLABEL6,Dropoutcourse,DropoutDOB,DropoutDOE;

    private JComboBox Dropoutyear_combo,Dropoutmonths_combo,Dropoutday_combo,Dropoutday_combo_1,Dropoutmonths_combo_1,Dropoutyear_combo_1,DDay,DYear,DMonth;

    private JTextField Dropoutstudent_name_txt,DropoutEnrollid_,DropoutSname_,DropoutLABEL_3,DropoutLABEL_4,DropoutLABEL_5,DropoutLABEL_6,Dropoutcourse_;

 

   

    public void button(){

        student_name_txt.setText("");

        Sname_.setText("");

        LABEL_3.setText("");

        LABEL_4.setText("");

        LABEL_5.setText("");

        LABEL_6.setText("");

        course_.setText("");

        enrollmentID_txt.setText("");

        year_combo.setSelectedIndex(0);

        months_combo.setSelectedIndex(0);

        day_combo.setSelectedIndex(0);

        year_combo_1.setSelectedIndex(0); 

        months_combo_1.setSelectedIndex(0);

        day_combo.setSelectedIndex(0);

        Dropoutstudent_name_txt.setText("");

        DropoutEnrollid_.setText("");

        DropoutSname_.setText("");

        DropoutLABEL_3.setText("");

        DropoutLABEL_4.setText("");

        DropoutLABEL_5.setText("");

        DropoutLABEL_6.setText("");

        Dropoutcourse_.setText("");

        Dropoutyear_combosetSelectedIndex(0);

        Dropoutmonths_combo.setSelectedIndex(0);

        Dropoutday_combo.setSelectedIndex(0);

        Dropoutyear_combo_1.setSelectedIndex(0); 

        Dropoutmonths_combo_1.setSelectedIndex(0);

        Dropoutday_combo.setSelectedIndex(0);

 

    }

   

    public StudentGUI1() {

        //=======================================================================================FOR REGULAR FORM===============================================================================================

        //creating JFrame

        Regular_student = new JFrame();

        rPanel = new JPanel();

 

        //creating JLayeredPane

        JLayeredPane lpane = new JLayeredPane();

        lpane.setBounds(0,0,900,700);

        rPanel.add(lpane);

 

        Regular_student.setTitle("Regular_student");

        Regular_student.setBounds(0,0,900,700);

        Regular_student.setLayout(null);

        Regular_student.setResizable(false);

 

        Regular_student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Regular_student.setLocationRelativeTo(null);

 

        //creating JPanel

        rPanel.setBounds(0,0,900,680);

        rPanel.setBackground(Color.LIGHT_GRAY);

        rPanel.setLayout(null);

        Regular_student.add(rPanel);

 

        //creating ImageIcon

        ImageIcon img = new ImageIcon("mmg.jpg");

        lblBackground= new JLabel("",img, JLabel.CENTER);

        lblBackground.setBounds(0, 0, 900, 680);

        lpane.add(lblBackground);

        lpanesetLayer(lblBackground,0);

 

        //creating JLabel

        Regularstudent = new JLabel(" Regularstudent");

        Regularstudent.setBounds(350,50,300,55);

        RegularstudentsetFont(new Font("Serif",Font.BOLD,30));

        lpane.add(Regularstudent);

        lpane.setLayer(Regularstudent, 1);

        Regularstudent.setFont(new Font("Arial", Font.BOLD, 33));

        Regularstudent.setForeground(Color.WHITE);

 

        //for Student Name

        student_name = new JLabel("Student Name: ");

        student_name.setBounds(50,150,180,25);

        lpane.add(student_name);

        lpane.setLayer(student_name, 1);

        student_name.setFont(new Font("Arial", Font.BOLD, 12));

        student_name.setForeground(Color.WHITE);

 

        //JTextField

        student_name_txt = new JTextField();

        student_name_txt.setBounds(190,150,200,25);

        lpane.add(student_name_txt);

        lpane.setLayer(student_name_txt, 1);

 

        //for Course Nmae

        Sname = new JLabel("Course Name");

        Sname.setBounds(50,190,180,25);

        lpane.add(Sname);

        lpane.setLayer( Sname, 1);

        Sname.setFont(new Font("Arial", Font.BOLD, 12));

        Sname.setForeground(Color.WHITE);

 

        Sname_ = new JTextField();

        Sname_.setBounds(190,190,200,25);

        lpane.add( Sname_);

        lpane.setLayer( Sname_, 1);

 

        //for Course Duration

        LABEL3 = new JLabel("Course Duration");

        LABEL3.setBounds(50,230,180,25);

        lpane.add(LABEL3);

        lpane.setLayer(LABEL3, 1);

        LABEL3 .setFont(new Font("Arial", Font.BOLD, 12));

        LABEL3.setForeground(Color.WHITE);

 

        LABEL_3 = new JTextField();

        LABEL_3setBounds(190,230,200,25);

        lpane.add(LABEL_3);

        lpane.setLayer(LABEL_3, 1);

 

        LABEL4 = new JLabel("Tuition Fee");

        LABEL4.setBounds(50,270,180,25);

        lpane.add(LABEL4 );

        lpane.setLayer(LABEL4 , 1);

        LABEL4.setFont(new Font("Arial", Font.BOLD, 12));

        LABEL4.setForeground(Color.WHITE);

 

        LABEL_4 = new JTextField();

        LABEL_4.setBounds(190,270,200,25);

        lpaneadd(LABEL_4);

        lpane.setLayer(LABEL_4, 1);

 

        LABEL5 = new JLabel("Number Of Modules");

        LABEL5.setBounds(50,310,180,25);

        lpane.add(LABEL5);

        lpane.setLayer(LABEL5, 1);

        LABEL5.setFont(new Font("Arial", Font.BOLD, 12));

        LABEL5.setForeground(Color.WHITE);

 

        LABEL_5 = new JTextField();

        LABEL_5.setBounds(190,310,200,25);

        lpane.add(LABEL_5);

        lpane.setLayer(LABEL_5, 1);

 

        LABEL6 = new JLabel("Credit Hours");

        LABEL6.setBounds(50,350,180,25);

        lpane.add(LABEL6);

        lpane.setLayer(LABEL6, 1);

        LABEL6.setFont(new Font("Arial", Font.BOLD, 12));

        LABEL6.setForeground(Color.WHITE);

 

        LABEL_6 = new JTextField();

        LABEL_6.setBounds(190,350,200,25);

        lpane.add(LABEL_6);

        lpane.setLayer(LABEL_6, 1);

 

        course = new JLabel("Days Present");

        course.setBounds(450,150,180,25);

        lpane.add(course);

        lpane.setLayer(course, 1);

        course.setFont(new Font("Arial", Font.BOLD, 12));

        course.setForeground(Color.WHITE);

 

        course_ = new JTextField();

        course_.setBounds(550,150,195,25);

        lpane.add(course_ );

        lpane.setLayer(course_ ,1);

 

        enrollmentID = new JLabel("Enrollment ID");

        enrollmentID.setBounds(450,190, 180, 25);

        lpane.add(enrollmentID );

        lpane.setLayer(enrollmentID ,1);

        enrollmentID.setFont(new Font("Arial", Font.BOLD, 12));

        enrollmentID .setForeground(Color.WHITE);

 

        enrollmentID_txt = new JTextField();

        enrollmentID_txt.setBounds(550, 190, 195,25);

        lpane.add(enrollmentID_txt );

        lpane.setLayer(enrollmentID_txt,1);

 

        DOB = new JLabel("Date Of Birth");

        DOB.setBounds(50,400,180,25);

        lpane.add(DOB );

        lpane.setLayer(DOB,1);

        DOB.setFont(new Font("Arial", Font.BOLD, 12));

        DOB.setForeground(Color.WHITE);

 

        //JComboBox

        String[] year = {"2000", "2001", "2002", "2003", "2004", "2005",

                "2006","2007","2008","2009","2010"};

        year_combo = new JComboBox(year);

        year_combo.setBounds(410, 400, 100, 25);

        lpane.add(year_combo );

        lpane.setLayer(year_combo,1);

 

        String[] months = {"Jan", "Feb", "March","April","May", "June","July",

                "August", "September", "October", "November", "December"};

        months_combo = new JComboBox(months);

        months_combosetBounds(300,400,100,25);

        lpane.add(months_combo );

        lpane.setLayer(months_combo,1);

 

        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9","10",

                "11","12"};

        day_combo = new JComboBox(day);

        day_combosetBounds(190, 400, 100, 25);

        lpane.add(day_combo );

        lpane.setLayer(day_combo,1);

 

        DOE = new JLabel("Date Of Enrollment");

        DOEsetBounds(50,450,180,25);

        lpane.add(DOE );

        lpane.setLayer(DOE,1);

        DOE.setFont(new Font("Arial", Font.BOLD, 12));

        DOE.setForeground(Color.WHITE);

 

        year_combo_1 = new JComboBox(year);

        year_combo_1.setBounds(410, 450, 100, 25);

        lpaneadd(year_combo_1  );

        lpane.setLayer(year_combo_1 ,1);

 

        months_combo_1 = new JComboBox(months);

        months_combo_1.setBounds(300,450,100,25);

        lpane.add(months_combo_1 );

        lpane.setLayer(months_combo_1,1);

 

        day_combo_1 = new JComboBox(day);

        day_combo_1.setBounds(190, 450, 100, 25);

        lpane.add(day_combo_1 );

        lpane.setLayer(day_combo_1,1);

 

        //JButton

        button = new JButton("CLEAR");

        button.setBounds(50, 70, 180, 50);;

        lpane.add(button );

        lpane.setLayer(button,1);

 

        button.addActionListener(new ActionListener()

            {public void actionPerformed(ActionEvent e)

                {

                    student_name_txt.setText("");

                    Sname_.setText("");

                    LABEL_3.setText("");

                    LABEL_4.setText("");

                    LABEL_5.setText("");

                    LABEL_6.setText("");

                    course_.setText("");

 

                    enrollmentID_txt.setText("");

                    year_combo.setSelectedIndex(0);

                    months_combo.setSelectedIndex(0);

                    day_combo.setSelectedIndex(0);

                    year_combo_1.setSelectedIndex(0); 

                    months_combo_1.setSelectedIndex(0);

                    day_combo.setSelectedIndex(0);

 

                }

            });

 

        changeTO = new JButton();

        changeTO.setText("DROPOUT");

        changeTO.addActionListener(this);

        Font changeTo_font1= new Font("Arial",Font.PLAIN,15);

        changeTO.setFont(changeTo_font1);

        changeTO.setBounds(700,70,150,50);

 

        lpane.add(changeTO);

        lpane.setLayer(changeTO,1);

 

        /*changeTO.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e)

        {

        if(changeTO.isSelected()){

        Regular_student.setVisible(false);

        dropout_student.setVisible(true);

        }

 

        else{

        dropout_student.setVisible(false);

        Regular_student.setVisible(true);

        }

        }

        });*/

 

        button3 = new JButton("GRANT CERTIFICATE");

        button3.setBounds(50, 550, 160, 50);

        lpane.add(button3);

        lpane.setLayer(button3,1);

 

        button3.addActionListener(new ActionListener()

            {

                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == button3) {

                        if (enrollmentID_txt.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(Regular_student, "All the fields are required.", "Alert",

                                JOptionPane.WARNING_MESSAGE);

                            return;

                        }

                        // Get the Enrollment ID, course name, and date of enrollment from the text fields

                        int enrollmentID;

                        String courseName = Sname_.getText();;

                        String dateOfEnrollment;

 

                        enrollmentID = Integer.parseInt(enrollmentID_txt.getText());

                        String dayOfEnroll = day_combo.getSelectedItem().toString();

                        String monthOfEnroll = months_combo.getSelectedItem().toString();

                        String yearOfEnroll = year_combo.getSelectedItem().toString();

                        dateOfEnrollment = dayOfEnroll + " " + monthOfEnroll + " " + yearOfEnroll;

 

                        // Find the Regular Student object with the given Enrollment ID

                        Regular checkStudent = null;

                        for (Student student : StudentsList) {

                            if (student instanceof Regular) {

                                Regular regularStudent = (Regular) student;

                                if (regularStudent.getenrollmentID() == enrollmentID) {

                                    checkStudent = regularStudent;

                                    break; // Exit the loop since we found a match

                                }

                            }

                        }

 

                        if (checkStudent != null) {

                            // Grant the certificate for the found Regular Student

                            checkStudent.grantCertificate(courseName,enrollmentID, dateOfEnrollment);

 

                            String printmessage = "Enrollment ID: " + checkStudent.getenrollmentID() + "\n";

 

                            printmessage += "------------------------------\n";

                            printmessage += "StdentName: " + checkStudent.getstudentName() + "\n";

 

                            // Display the information dialog with the certificate message

                            JOptionPane.showMessageDialog(Regular_student, printmessage, "Certificate is Granted.", JOptionPane.INFORMATION_MESSAGE);

                            button();

                        } else {

                            JOptionPane.showMessageDialog(Regular_student, "No Regular Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);

                            button();

                        }

                    }

                }

            });

 

        button2 = new JButton("ADD");

        button2setBounds(230, 550, 180, 50);

        lpane.add(button2);

        lpane.setLayer(button2,1);

 

        button2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent f) {

                    if (student_name_txt.getText().isEmpty() || Sname_.getText().isEmpty() ||

                    LABEL_3.getText().isEmpty() || LABEL_4.getText().isEmpty() ||

                    LABEL_5.getText().isEmpty() || LABEL_6.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(Regular_student, "All the fields are required.", "Alert", JOptionPane.WARNING_MESSAGE);

                        return;

                    }

 

                    String day= day_combo.getSelectedItem().toString();

                    String month = months_combogetSelectedItem().toString();

                    String year = year_combo.getSelectedItem().toString();

                    String day1 = day_combo_1.getSelectedItem().toString();

                    String month1 = months_combo_1getSelectedItem().toString();

                    String year1 = year_combo_1.getSelectedItem().toString();

 

                    String doB = day + " " + month + " " + year;

                    String doE = day1 + " " + month1 + " " + year1;

 

                    String studentName = student_name_txt.getText();

                    String courseName = Sname.getText();

 

                    if (!studentName.matches("[a-zA-Z]+")){

                        JOptionPane.showMessageDialog(Regular_student, "Invalid input. Only letters (a-z) and (A-Z) are allowed for student name.", "Alert",

                            JOptionPane.WARNING_MESSAGE);

                        return;

                    }

 

                    int Nomodules;

                    double Daysp;

                    int Credithours;

                    int Coursedue;

                    int Tuitionfee;

                    int eID;

 

                    try

                    {

                        Nomodules = Integer.parseInt(LABEL_5.getText());

                        Daysp = Double.parseDouble(course_.getText());

                        Credithours = Integer.parseInt(LABEL_6.getText());

                        Coursedue = Integer.parseInt(LABEL_3.getText());

                        Tuitionfee = Integer.parseInt(LABEL_4.getText());

                        eID = Integer.parseInt( enrollmentID_txt.getText());

 

                    } catch (NumberFormatException ex)

                    {

                        JOptionPane.showMessageDialog(Regular_student, "Invalid number format. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);

                        return;

                    }

 

                    Regular regularStudent = new Regular(doB, studentName, Coursedue, Tuitionfee, Nomodules, Credithours, Daysp, doE, courseName, eID);

                    // Check if the enrollment ID already exists in the studentList

                    boolean Check = false;

                    for (Student student : StudentsList)

                    {

                        if (student instanceof Regular)

                        {

                            Regular StudentsList = (Regular) student;

                            if (StudentsList.getenrollmentID() == eID)

                            {

                                Check = true;

                                break; // Exit the loop since we found a match

                            }

                        }

                    }

 

                    if (Check == true)

                    {

                        JOptionPane.showMessageDialog(Regular_student, "Enrollment ID is  already registered.", "Alert", JOptionPane.WARNING_MESSAGE);

                        button();

                    } else

                    {

                        StudentsList.add(regularStudent);

                        JOptionPane.showMessageDialog(Regular_student, "A new student is successfully registered.");

                        button();

                    }

                }

 

            });

        button4 = new JButton("PRESENT PERCENTAGE");

        button4.setBounds(480, 550, 180, 50);

        rPanel.add(button4);

        //lpane.add(button4);

        lpane.add(button4);

        lpane.setLayer(button4,1);

 

        button4.addActionListener(new ActionListener()

            {

                public void actionPerformed(ActionEvent p)

                {

                    if (p.getSource() == button4)

                    {

                        if (enrollmentID_txt.getText().isEmpty() || LABEL_3.getText().isEmpty() ||

                        course_.getText().isEmpty())

                        {

                            JOptionPane.showMessageDialog(Regular_student, "All the fields are required.", "Alert",

                                JOptionPaneWARNING_MESSAGE);

                            return;

                        }

                        // Get the Enrollment ID and number of days present from the text fields

                        int enrollmentIDSearch;

                        double daysPresent;

                        int courseDurations;

                        try {

                            enrollmentIDSearch = Integer.parseInt(enrollmentID_txt.getText());

                            courseDurations = Integer.parseInt(LABEL_3.getText());

                            daysPresent = Double.parseDouble(course_.getText());

                        } catch (NumberFormatException ex) {

                            JOptionPane.showMessageDialog(Regular_student, "Invalid input. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);

                            return;

                        }

 

                        // Find the Regular Student object with the given Enrollment ID

                        Regular checkStd = null;

                        for (Student student : StudentsList)

                        {

                            if (student instanceof Regular)

                            {

                                Regular regularStudent = (Regular) student;

                                if (regularStudent.getenrollmentID() == enrollmentIDSearch)

                                {

                                    checkStd = regularStudent;

                                    break; // Exit the loop since we found a match

                                }

                            }

                        }

 

                        if (checkStd != null) {

 

                            double courseDuration = checkStd.getcourseDuration();

                            double presentPercentage = (daysPresent / courseDurations) * 100;

                            checkStd.presentPercentage(daysPresent);

 

                            // Display the information dialog with the present percentage

                            //String printmessage = "Enrollment ID: " + enrollmentIDSearch + "\n";

                            String printmessage = "Enrollment ID: " + checkStd.getenrollmentID() + "\n";

 

                            printmessage += "------------------------------\n";

                            printmessage += "Attendance Grade is: " + checkStd.presentPercentage(daysPresent);

                            JOptionPane.showMessageDialog(Regular_student, printmessage, "Present Percentage is: ", JOptionPane.INFORMATION_MESSAGE);

                            button();

                        } else

                        {

                            JOptionPane.showMessageDialog(Regular_student, "No Regular Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);

                            button();

                        }

                    }

                }

            });

 

        button5 = new JButton("DISPALY");

        button5.setBounds(700, 550, 160, 50);

        lpane.add(button5);

        lpane.setLayer(button5,1);

        button5.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent l) {

                    StringBuilder displayMessage = new StringBuilder("Student List:\n");

                    // Display the information in a dialog

                    for (Student student: StudentsList){

                        if (student instanceof Regular){

                            Regular regularStudent = (Regular) student;

                            displayMessage.append("--------------------------------------------\n");

                            displayMessageappend("Student Name: ").append(regularStudent.getstudentName()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Enrollment ID: ").append(regularStudent.getenrollmentID()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Date of Birth: ").append(regularStudent.getdateOfBirth()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Course Name: ").append(regularStudent.getcourseName()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Course Duration: ").append(regularStudent.getcourseDuration()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Tuition Fee: ").append(regularStudent.gettuitionFee()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Number of Modules: ").append(regularStudent.getnumOfModules()).append("\n");

                            displayMessageappend("--------------------------------------------\n");

                            displayMessage.append("Number of Credit Hours: ").append(regularStudent.getnumOfCreditHours()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Days Present: ").append(regularStudent.getdaysPresent()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                            displayMessage.append("Date of Enrollment: ").append(regularStudent.getdateOfEnrollment()).append("\n");

                            displayMessage.append("--------------------------------------------\n");

                        }

                    }

                    // Create a JTextArea to display the information

                    JTextArea textArea = new JTextArea(displayMessage.toString());

                    textArea.setEditable(false);

 

                    // Create a JScrollPane and add the JTextArea to it

                    JScrollPane scrollPane = new JScrollPane(textArea);

 

                    // Display the information in a dialog box with the scroll pane

                    JOptionPane.showMessageDialog(Regular_student, scrollPane, "Student List", JOptionPane.INFORMATION_MESSAGE);

 

                }

 

            });

 

        Regular_student.add(rPanel);

        Regular_student.setVisible(true);

 

        //============================================================================FOR DROPOUT FORM========================================================================================================

        //creating JFrame

        dropout_student = new JFrame();

        dropout_student.setTitle("Dropout_student");

        dropout_student.setBounds(50,50,900,700);

        dropout_student.setLayout(null);

        dropout_student.setResizable(false);

 

        JLayeredPane lpane1 = new JLayeredPane();

        lpane1.setBounds(0,0,900,700);

        rPaneladd(lpane1);

 

        ImageIcon img1 = new ImageIcon("mmg.jpg");

        lblBackground= new JLabel("",img1, JLabelCENTER);

        lblBackground.setBounds(0, 0, 900, 680);

        lpane1.add(lblBackground);

        lpane1.setLayer(lblBackground,0);

 

        dropout_student.add(lpane1);

 

        //creating JLabel

        Dropoutstudent = new JLabel(" Dropoutstudent");

        Dropoutstudent.setBounds(350,50,300,55);

        Dropoutstudent.setFont(new Font("Serif",Font.BOLD,30));

        lpane1.add(Dropoutstudent );

        lpane1.setLayer(Dropoutstudent,1);

        Dropoutstudent.setFont(new Font("Arial", Font.BOLD, 33));

        Dropoutstudent.setForeground(Color.WHITE);

 

        Dropoutstudent_name = new JLabel("Student Name");

        Dropoutstudent_name.setBounds(50,150,180,25);

        lpane1.add(Dropoutstudent_name );

        lpane1.setLayer(Dropoutstudent_name,1);

        Dropoutstudent_name.setFont(new Font("Arial", Font.BOLD, 12));

        Dropoutstudent_name.setForeground(Color.WHITE);

 

        //JTextField

        Dropoutstudent_name_txt = new JTextField();

        Dropoutstudent_name_txt.setBounds(190,150,200,25);

        lpane1.add(Dropoutstudent_name_txt );

        lpane1.setLayer(Dropoutstudent_name_txt,1);

 

        DropoutEnrollid = new JLabel("Enrollment ID");

        DropoutEnrollid.setBounds(450,190,180,25);

        lpane1.add(DropoutEnrollid );

        lpane1.setLayer(DropoutEnrollid,1);

        DropoutEnrollid.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutEnrollid.setForeground(Color.WHITE);

 

        //JTextField

        DropoutEnrollid_ = new JTextField();

        DropoutEnrollid_.setBounds(550,190,195,25);

        lpane1.add(DropoutEnrollid_ );

        lpane1.setLayer(DropoutEnrollid_,1);

 

        DropoutSname = new JLabel("Course Name");

        DropoutSname.setBounds(50,190,180,25);

        lpane1.add(DropoutSname );

        lpane1setLayer(DropoutSname,1);

        DropoutSname.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutSname.setForeground(Color.WHITE);

 

        DropoutSname_ = new JTextField();

        DropoutSname_.setBounds(190,190,200,25);

        lpane1.add(DropoutSname_);

        lpane1.setLayer(DropoutSname_,1);

 

        DropoutLABEL3 = new JLabel("Course Duration");

       DropoutLABEL3.setBounds(50,230,180,25);

        lpane1.add(DropoutLABEL3 );

        lpane1.setLayer(DropoutLABEL3,1);

        DropoutLABEL3.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutLABEL3.setForeground(Color.WHITE);

 

        DropoutLABEL_3 = new JTextField();

        DropoutLABEL_3.setBounds(190,230,200,25);

        lpane1.add(DropoutLABEL_3  );

        lpane1.setLayer(DropoutLABEL_3 ,1);

 

        DropoutLABEL4 = new JLabel("Tuition Fee");

        DropoutLABEL4.setBounds(50,270,180,25);

        lpane1.add(DropoutLABEL4 );

        lpane1.setLayer(DropoutLABEL4,1);

        DropoutLABEL4.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutLABEL4.setForeground(Color.WHITE);

 

        DropoutLABEL_4 = new JTextField();

        DropoutLABEL_4.setBounds(190,270,200,25);

        lpane1.add(DropoutLABEL_4  );

        lpane1.setLayer(DropoutLABEL_4 ,1);

 

        DropoutLABEL5 = new JLabel("Number Of Remaining Modules");

        DropoutLABEL5.setBounds(50,310,180,25);

        lpane1.add(DropoutLABEL5 );

        lpane1.setLayer(DropoutLABEL5,1);

        DropoutLABEL5.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutLABEL5.setForeground(Color.WHITE);

 

        DropoutLABEL_5 = new JTextField();

        DropoutLABEL_5.setBounds(250,310,200,25);

        lpane1.add(DropoutLABEL_5 );

        lpane1.setLayer(DropoutLABEL_5,1);

 

        DropoutLABEL6 = new JLabel("Number Of Months Attended");

        DropoutLABEL6.setBounds(50,350,180,25);

        lpane1.add(DropoutLABEL6 );

        lpane1.setLayer(DropoutLABEL6,1);

        DropoutLABEL6 .setFont(new Font("Arial", Font.BOLD, 12));

        DropoutLABEL6 .setForeground(Color.WHITE);

 

        DropoutLABEL_6 = new JTextField();

        DropoutLABEL_6.setBounds(250,350,200,25);

        lpane1.add(DropoutLABEL_6 );

        lpane1.setLayer(DropoutLABEL_6,1);

 

        Dropoutcourse = new JLabel("Days Present");

        Dropoutcourse.setBounds(450,150,180,25);

        lpane1.add(Dropoutcourse );

        lpane1.setLayer(Dropoutcourse,1);

        Dropoutcourse.setFont(new Font("Arial", Font.BOLD, 12));

        Dropoutcourse.setForeground(Color.WHITE);

 

        Dropoutcourse_ = new JTextField();

        Dropoutcourse_.setBounds(550,150,195,25);

        lpane1.add(Dropoutcourse_ );

        lpane1.setLayer(Dropoutcourse_,1);

 

        DropoutDOB = new JLabel("Date Of Birth");

        DropoutDOB.setBounds(50,400,180,25);

        lpane1.add(DropoutDOB );

        lpane1.setLayer(DropoutDOB,1);

        DropoutDOB.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutDOB.setForeground(Color.WHITE);

 

        //JComboBox

        String[] year1 = {"2000", "2001", "2002", "2003", "2004", "2005",

                "2006","2007","2008","2009","2010"};

        Dropoutyear_combo = new JComboBox(year);

        Dropoutyear_combo.setBounds(410, 400, 100, 25);

        lpane1.add(Dropoutyear_combo );

        lpane1.setLayer(Dropoutyear_combo,1);

 

        String[] months1 = {"Jan", "Feb", "March","April","May", "June","July",

                "August", "September", "October", "November", "December"};

        Dropoutmonths_combo = new JComboBox(months);

        Dropoutmonths_combo.setBounds(300,400,100,25);

        lpane1.add(Dropoutmonths_combo );

        lpane1.setLayer( Dropoutmonths_combo,1);

 

        String[] day1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9","10",

                "11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        Dropoutday_combo = new JComboBox(day);

        Dropoutday_combo.setBounds(190, 400, 100, 25);

        lpane1.add(Dropoutday_combo );

        lpane1.setLayer(Dropoutday_combo,1);

 

        DropoutDOE = new JLabel("Date Of Enrollment");

        DropoutDOE.setBounds(50,450,180,25);

        lpane1.add(DropoutDOE );

        lpane1.setLayer(DropoutDOE,1);

        DropoutDOE.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutDOE.setForeground(Color.WHITE);

 

        Dropoutyear_combo_1 = new JComboBox(year);

        Dropoutyear_combo_1.setBounds(410, 450, 100, 25);

        lpane1.add(Dropoutyear_combo_1 );

        lpane1.setLayer(Dropoutyear_combo_1,1);

 

        Dropoutmonths_combo_1 = new JComboBox(months);

        Dropoutmonths_combo_1.setBounds(300,450,100,25);

        lpane1.add(Dropoutmonths_combo_1 );

        lpane1.setLayer(Dropoutmonths_combo_1,1);

 

        Dropoutday_combo_1 = new JComboBox(day);

        Dropoutday_combo_1.setBounds(190, 450, 100, 25);

        lpane1.add(Dropoutday_combo_1 );

        lpane1.setLayer(Dropoutday_combo_1,1);

 

        DropoutDOD = new JLabel("Date Of Dropout");///////////////////////////////////////

        DropoutDOD.setBounds(50,500,180,25);

        lpane1.add( DropoutDOD );

        lpane1.setLayer( DropoutDOD,1);

        DropoutDOD.setFont(new Font("Arial", Font.BOLD, 12));

        DropoutDOD.setForeground(Color.WHITE);

 

        JComboBox DYear = new JComboBox(year);

        DYear.setBounds(410, 500, 100, 25);

        lpane1.add(DYear );

        lpane1.setLayer(DYear,1);

 

        DMonth = new JComboBox(months);

        DMonthsetBounds(300,500,100,25);

        lpane1.add(DMonth );

        lpane1.setLayer(DMonth,1);

 

        DDay = new JComboBox(day);

        DDay.setBounds(190, 500, 100, 25);

        lpane1.add(DDay );

        lpane1.setLayer(DDay,1);

 

        //JButton

        Dropoutbutton = new JButton("CLEAR");

        Dropoutbutton.setBounds(50, 70, 180, 50);

        lpane1.add(Dropoutbutton );

        lpane1.setLayer(Dropoutbutton,1);

 

        Dropoutbutton.addActionListener(new ActionListener()

            {public void actionPerformed(ActionEvent e)

                {

                    Dropoutstudent_name_txt.setText("");

                    DropoutEnrollid_.setText("");

                    DropoutSname_.setText("");

                    DropoutLABEL_3.setText("");

                    DropoutLABEL_4.setText("");

                    DropoutLABEL_5.setText("");

                    DropoutLABEL_6.setText("");

                    Dropoutcourse_setText("");

                    Dropoutyear_combo.setSelectedIndex(0);

                    Dropoutmonths_combo.setSelectedIndex(0);

                    Dropoutday_combo.setSelectedIndex(0);

                    Dropoutyear_combo_1.setSelectedIndex(0); 

                    Dropoutmonths_combo_1.setSelectedIndex(0);

                    Dropoutday_combo.setSelectedIndex(0);

 

                }

            });

 

        changeTO1 = new JButton();

        changeTO1.setText("Regular");

        Font changeTo1_font2= new Font("Arial",Font.PLAIN,15);

        changeTO1.addActionListener(this);

        changeTO1.setFont(changeTo1_font2);

        changeTO1.setBounds(700,70,150,50);

 

        lpane1.add(changeTO1 );

        lpane1.setLayer(changeTO1,1);

       

        Dropoutbutton3 = new JButton("BILLS PAYABLE");

        Dropoutbutton3.setBounds(50, 550, 160, 50);

        lpane1.add(Dropoutbutton3 );

        lpane1.setLayer(Dropoutbutton3,1);

 

        Dropoutbutton3.addActionListener(new ActionListener(){

                // Check if the "Bills Payable" button is clicked

                public void actionPerformed(ActionEvent e){

                    if (e.getSource() == Dropoutbutton3) {

 

                        // Check if any required field is empty

                        if ( DropoutEnrollid_.getText().isEmpty() || DropoutLABEL_6.getText().isEmpty() ||

                        DropoutLABEL_3.getText().isEmpty() ||    DropoutLABEL_4.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(dropout_student, "All the fields are required.", "Alert",

                                JOptionPane.WARNING_MESSAGE);

                            return;

                        }

                        // Get the Enrollment ID from the text field

                        int enrollmentID;

                        int remainingAmount;

                        int numOfMonthsAttended;

                        int tuitionFee;

                        int courseDuration;

 

                        try {

                            enrollmentID = Integer.parseInt(DropoutEnrollid_.getText());

                            numOfMonthsAttended = Integer.parseInt(DropoutLABEL_6.getText());

                            tuitionFee = Integer.parseInt(DropoutLABEL_4.getText());

                            courseDuration = Integer.parseInt( DropoutLABEL_3.getText());

                        } catch (NumberFormatException ex) {

                            JOptionPane.showMessageDialog(dropout_student, "Invalid input. Please enter a valid values.", "Alert", JOptionPane.WARNING_MESSAGE);

                            return;

                        }

 

                        // Find the Dropout Student object with the given Enrollment ID

                        Dropout dropoutStudent = null;

                        for (Student student : StudentsList) {

                            if (student instanceof Dropout) {

                                Dropout dropStudent = (Dropout) student;

                                // Check if the Enrollment ID matches the one in the Dropout Student object

                                if (dropStudent.getenrollmentID() == enrollmentID) {

                                    dropoutStudent = dropStudent;

                                    break; // Exit the loop since we found a match

                                }

                            }

                        }

 

                        if (dropoutStudent != null) {

 

                            remainingAmount = (courseDuration - numOfMonthsAttended) * tuitionFee;

                            // Call the method to pay the bills of the dropout student

                            dropoutStudent.billsPayable();

 

                            String displayMessage  = "Remaining Amount: " + remainingAmount + "\n";

                            displayMessage += "----------------------------------------------------\n";

 

                            JOptionPane.showMessageDialog(dropout_student, displayMessage, "Bills has been Paid.",  JOptionPane.INFORMATION_MESSAGE);

                            button();

 

                        } else {

                            JOptionPane.showMessageDialog(dropout_student, "No Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);

                            button();

                        }

                    }

                }

 

            });

 

        Dropoutbutton2 = new JButton("ADD");

        Dropoutbutton2.setBounds(230, 550, 180, 50);

        lpane1.add(Dropoutbutton2 );

        lpane1.setLayer(Dropoutbutton2,1);

 

        Dropoutbutton2.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent s){

                    if (s.getSource() == Dropoutbutton2)

                    {

                        if (Dropoutstudent_name_txt.getText().isEmpty() || DropoutSname_.getText().isEmpty() ||

                        DropoutLABEL_3.getText().isEmpty() || DropoutLABEL_4.getText().isEmpty() ||

                        DropoutLABEL_5.getText().isEmpty() || DropoutLABEL_6.getText().isEmpty()) {

                            JOptionPaneshowMessageDialog(dropout_student, "All the fields are required.", "Alert", JOptionPane.WARNING_MESSAGE);

                            return;

                        }

 

                        String day= Dropoutday_combo.getSelectedItem().toString();

                        String month = Dropoutmonths_combo.getSelectedItem().toString();

                        String year = Dropoutyear_combo.getSelectedItem().toString();

                        String day1 = Dropoutday_combo_1.getSelectedItem().toString();

                        String month1 = Dropoutmonths_combo_1.getSelectedItem().toString();

                        String year1 = Dropoutyear_combo_1.getSelectedItem().toString();

                        String day2 = DDay.getSelectedItem().toString();

                        String month2 = DMonth.getSelectedItem().toString();

                        String year2 =  DYear.getSelectedItem().toString();

 

                        String doB = day + " " + month + " " + year;

                        String doE = day1 + " " + month1 + " " + year1;

                        String doD = day2 + "" + month2 + "" + year2;

 

                        String studentName = Dropoutstudent_name_txt.getText();

                        String Sname1 = DropoutSname_.getText();

 

                        if (!studentName.matches("[a-zA-Z]+")){

                            JOptionPane.showMessageDialog(dropout_student, "Invalid input. Only letters (a-z) and (A-Z) are allowed for student name.", "Alert",

                                JOptionPane.WARNING_MESSAGE);

                            return;

                        }

 

                        int noRmodules;

                        int NoMonthsAttended;

                        int Coursedue;

                        int Tuitionfee;

                        int Eid11;

 

                        try

                        {

                            noRmodules = Integer.parseInt(DropoutLABEL_5.getText());

                            NoMonthsAttended = Integer.parseInt(DropoutLABEL_6.getText());

                            Coursedue = Integer.parseInt(DropoutLABEL_3.getText());

                            Tuitionfee = Integer.parseInt(DropoutLABEL_4.getText());

                            Eid11= Integer.parseInt(DropoutEnrollid_.getText());

 

                        } catch (NumberFormatException ex)

                        {

                            JOptionPane.showMessageDialog(dropout_student, "Invalid number format. Please enter valid numeric values.", "Alert", JOptionPane.WARNING_MESSAGE);

                            return;

                        }

 

                        Dropout dropoutStudent = new Dropout(doB, studentName, Coursedue, Tuitionfee, noRmodules, NoMonthsAttended, doE,doD, Sname1, Eid11);

                        // Check if the enrollment ID already exists in the studentList

                        boolean Check = false;

                        for (Student student : StudentsList)

                        {

                            if (student instanceof Dropout)

                            {

                                Dropout studentList = (Dropout) student;

                                if (studentList.getenrollmentID() == Eid11)

                                {

                                    Check = true;

                                    break; // Exit the loop since we found a match

                                }

                            }

                        }

 

                        if (Check == true)

                        {

                            JOptionPane.showMessageDialog(dropout_student, "Enrollment ID is  already registered.", "Alert", JOptionPane.WARNING_MESSAGE);

                            button();

                        } else

                        {

                            StudentsList.add(dropoutStudent);

                            JOptionPane.showMessageDialog(dropout_student, "A new student is successfully registered.");

 

                            button();

                        }

                    }

                }

 

            });

 

        JButton Dropoutbutton4 = new JButton("REMOVE STUDENT");

        Dropoutbutton4.setBounds(480, 550, 180, 50);

        lpane1.add(Dropoutbutton4 );

        lpane1.setLayer(Dropoutbutton4,1);

 

        Dropoutbutton4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

 

                    // Get the Enrollment ID from the text field

                    int enrollmentID;

 

                    try {

                        enrollmentID = Integer.parseInt(DropoutEnrollid_.getText());

 

                    } catch (NumberFormatException ex) {

                        JOptionPane.showMessageDialog(dropout_student, "Invalid input. Please enter a valid Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);

                        return;

                    }

 

                    // Find the Dropout Student object with the given Enrollment ID

                    Dropout dropoutStudent = null;

                    for (Student student : StudentsList) {

                        if (student instanceof Dropout) {

                            Dropout dropStudent = (Dropout) student;

                            // Check if the Enrollment ID matches the one in the Dropout Student object

                            if (dropStudent.getenrollmentID() == enrollmentID) {

                                dropoutStudent = dropStudent;

                                break;

                            }

                        }

                    }

 

                    if (dropoutStudent != null) {

                        // Check if the student has paid

                        if (dropoutStudent.gethasPaid()) {

                            // Call the method to remove the student

                            dropoutStudent.removeStudent();

 

                            // Display the success message in the dialog box

                            String Message = "Student with Enrollment ID " + enrollmentID + " has been removed.";

                            JOptionPane.showMessageDialog(dropout_student, Message, "Student Removed Successfully!", JOptionPane.INFORMATION_MESSAGE);

                            button();

                        } else {

                            JOptionPane.showMessageDialog(dropout_student, "Student with Enrollment ID " + enrollmentID + " has pending bills and cannot be removed.", "Alert", JOptionPane.WARNING_MESSAGE);

                            button();

                        }

                    } else {

                        JOptionPane.showMessageDialog(dropout_student, "No Student found with the given Enrollment ID.", "Alert", JOptionPane.WARNING_MESSAGE);

                        button();

                    }

                }

            });

 

        Dropoutbutton5 = new JButton("DISPALY");

        Dropoutbutton5setBounds(700, 550, 160, 50);

        lpane1.add(Dropoutbutton5 );

        lpane1.setLayer(Dropoutbutton5,1);

 

        Dropoutbutton5.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e) {

                    StringBuilder displayMessage = new StringBuilder("Student List:\n");

                    // Display the information in a dialog

                    for (Student student: StudentsList){

                        if (student instanceof Dropout){

                            Dropout dropoutStudent = (Dropout) student;

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Student Name: ").append(dropoutStudent.getstudentName()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Enrollment ID: ").append(dropoutStudent.getenrollmentID()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Date of Birth: ").append(dropoutStudent.getdateOfBirth()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Course Name: ").append(dropoutStudent.getcourseName()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Course Duration: ").append(dropoutStudent.getcourseDuration()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Tuition Fee: ").append(dropoutStudent.gettuitionFee()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Number of Modules: ").append(dropoutStudent.getnumOfRemainingModules()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Days Present: ").append(dropoutStudent.getnumOfMonthsAttended()).append("\n");

                            displayMessage.append("-----------------------------\n");

                            displayMessage.append("Date of Enrollment: ").append(dropoutStudent.getdateOfEnrollment()).append("\n");

                            displayMessage.append("-----------------------------\n");

                        }

                    }

 

                    // Create a JTextArea to display the information

                    JTextArea textArea = new JTextArea(displayMessage.toString());

                    textArea.setEditable(false);

 

                    // Create a JScrollPane and add the JTextArea to it

                    JScrollPane scrollPane = new JScrollPane(textArea);

 

                    // Display the information in a dialog box with the scroll pane

                    JOptionPane.showMessageDialog(panel, scrollPane, "Student List", JOptionPane.INFORMATION_MESSAGE);

 

                }

            });

 

        dropout_student.add(lpane1);

        dropout_student.setVisible(false);

 

    }

 

    public void actionPerformed(ActionEvent ex) {

        if(ex.getSource() == changeTO) {

            Regular_student.setVisible(false);

            dropout_student.setVisible(true);

       }

 

        if(ex.getSource() == changeTO1) {

            Regular_student.setVisible(true);

            dropout_student.setVisible(false);

        }}

 

    public static void main(String[] args){

        new StudentGUI1();

    }

 

}