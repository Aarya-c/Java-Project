import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
/**
* Write a description of class StudentGUI here.
*
* @author (Rakesh Chaurasiya)
* @version (a version number or a date)
*/
public class StudentGUI implements ActionListener
{
    private JFrame GUI_frame;
    private JPanel regular_panel;
    private JLabel label_RegularGUI;
    private JLabel label_studentname;
    private JLabel label_enrollmentid;
    private JLabel label_coursename;
    private JLabel label_courseduration;
    private JLabel label_tutionfee;
    private JLabel label_numofmodules;
    private JLabel label_numofcredits;
    private JLabel label_numofdayspresent;

    //tabbed pane
    private JTabbedPane tabbed_pane;

    private JLabel label_dateofbirth;
    private JComboBox dob_day;
    private JComboBox dob_month;
    private JComboBox dob_year;

    private JLabel label_dateofenrollment;
    private JComboBox doe_day;
    private JComboBox doe_month;
    private JComboBox doe_year;

    private JTextField text_studentname;
    private JTextField text_enrollmentid;
    private JTextField text_coursename;
    private JTextField text_courseduration;
    private JTextField text_tutionfee;
    private JTextField text_numofmodules;
    private JTextField text_numofcredits;
    private JTextField text_numofdayspresent;

    private JButton button_display;
    private JButton button_clear;
    private JButton button_addaregularstudent;
    private JButton button_calculatepercentage;
    private JButton button_grantcertificateofRS;

    // for dropout

    //private JFrame drop_frame;
    private JPanel drop_panel;
    private JLabel label_drop_DropoutGUI;
    private JLabel label_drop_studentname;
    private JLabel label_drop_enrollmentid;
    private JLabel label_drop_coursename;
    private JLabel label_drop_courseduration;
    private JLabel label_drop_tutionfee;
    private JLabel label_drop_numofremainingmodules;
    private JLabel label_drop_numofmonthattended;
    private JLabel label_drop_remainingamount;

    private JLabel label_drop_dateofbirth;
    private JComboBox dob_days;
    private JComboBox dob_months;
    private JComboBox dob_years;

    private JLabel label_drop_dateofenrollment;
    private JComboBox doe_days;
    private JComboBox doe_months;
    private JComboBox doe_years;

    private JLabel label_drop_dateofdropout;
    private JComboBox dod_days;
    private JComboBox dod_months;
    private JComboBox dod_years;


    private JTextField text_drop_studentname;
    private JTextField text_drop_enrollmentid;
    private JTextField text_drop_coursename;
    private JTextField text_drop_courseduration;
    private JTextField text_drop_tutionfee;
    private JTextField text_drop_numofremainingmodules;
    private JTextField text_drop_numofmonthattended;
    private JTextField text_drop_remainingamount;
    private JTextField text_drop_numofdayspresent;

    private JButton button_drop_display;
    private JButton button_drop_clear;
    private JButton button_drop_addtodropoutstudent;
    private JButton button_drop_paytobillofdropoutstudent;
    private JButton button_drop_removedropoutstudent;

    // for regular button
    private String dob;
    private String studentname;
    private int courseduration;
    private int tutionfee;
    private int enrollmentid;
    private String coursename;
    private String doe;
    private int numofmodules;
    private int numofcredits;
    private int numofdayspresent;
    private String birthday;
    private String birthmonth;
    private String birthyear;
    private String enrollmentday;
    private String enrollmentmonth;
    private String enrollmentyear;

    //for dropout button
    private String drop_dob;
    private String drop_studentname;
    private int drop_courseduration;
    private int drop_tutionfee;
    private int drop_enrollmentid;
    private String drop_coursename;
    private String drop_doe;
    private int drop_numofremainingmodules;
    private int drop_remainingamount;
    private int drop_numofmonthattended;
    private String drop_birthday;
    private String drop_birthmonth;
    private String drop_birthyear;
    private String drop_enrollmentday;
    private String drop_enrollmentmonth;
    private String drop_enrollmentyear;
    private String drop_dod;
    private String drop_dropday;
    private String drop_dropmonth;
    private String drop_dropyear;

    ArrayList<Student> array_list = new ArrayList<Student>();

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() ==  button_display)
        {
          boolean regularExist = false; 
            for(Student student:array_list){
                if(student instanceof Regular){
                    regularExist = true;
                    Regular regular_student = (Regular) student;//downcasting
                    student.display();
            }
        }

        if(regularExist == false){
            JOptionPane.showMessageDialog(GUI_frame,"There is no regular object in Student list","error",JOptionPane.ERROR_MESSAGE);
        }
    }   
        else if(e.getSource() == button_clear)
        {
            text_studentname.setText("");
            text_enrollmentid.setText("");
            text_coursename.setText("");
            text_courseduration.setText("");
            text_tutionfee.setText("");
            text_numofmodules.setText("");
            text_numofcredits.setText("");
            text_numofdayspresent.setText("");

        }
        else if(e.getSource() == button_addaregularstudent)
        {
           if( text_studentname.getText().isEmpty() || text_enrollmentid.getText().isEmpty() || text_coursename.getText().isEmpty() || text_courseduration.getText().isEmpty() || text_tutionfee.getText().isEmpty() || text_numofmodules.getText().isEmpty() || text_numofcredits.getText().isEmpty() || text_numofdayspresent.getText().isEmpty()){
               JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
           }
           else{
               try{
                    studentname = text_studentname.getText();
                    enrollmentid = Integer.valueOf(text_enrollmentid.getText());
                    coursename = text_coursename.getText();
                    courseduration = Integer.valueOf(text_courseduration.getText());
                    tutionfee = Integer.valueOf(text_tutionfee.getText());
                    numofmodules = Integer.valueOf(text_numofmodules.getText());
                    numofcredits = Integer.valueOf(text_numofcredits.getText());
                    numofdayspresent = Integer.valueOf(text_numofdayspresent.getText());

                    birthday = (String) dob_day.getSelectedItem();
                    birthmonth = (String) dob_month.getSelectedItem();
                    birthyear = (String) dob_year.getSelectedItem();

                    dob = birthday + birthmonth + birthyear;

                    enrollmentday = (String) doe_day.getSelectedItem();
                    enrollmentmonth = (String) doe_month.getSelectedItem();
                    enrollmentyear = (String) doe_year.getSelectedItem();

                    doe = enrollmentday + enrollmentmonth + enrollmentyear;

                    Student regular = new Regular(dob,studentname, courseduration, tutionfee, enrollmentid, coursename, doe, numofmodules, numofcredits, numofdayspresent);

                   if(array_list.isEmpty()){
                       array_list.add(regular);
                       JOptionPane.showMessageDialog(GUI_frame,"Regular Student added successfully");
                   }
                   else{
                       boolean isDuplicate = false;

                       for(Student student:array_list){
                            if(student instanceof Regular){
                                if(student.getEnrollmentID() == regular.getEnrollmentID()){
                                    isDuplicate = true;
                                    break;
                                }
                            }
                       }

                       if(isDuplicate == true){
                            JOptionPane.showMessageDialog(GUI_frame,"Duplicate enrollment ID","error",JOptionPane.ERROR_MESSAGE);
                       }

                       else{
                            array_list.add(regular);
                            JOptionPane.showMessageDialog(GUI_frame,"Regular Student added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                       }

                }}catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
                } 
           }
        }
        else if(e.getSource() == button_calculatepercentage)
        {
           if(text_enrollmentid.getText().isEmpty() || text_numofdayspresent.getText().isEmpty()){
                JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
            }
           else{
            try{
                   int enrollmentID = Integer.parseInt(text_enrollmentid.getText());
                   double days_present = Integer.parseInt(text_numofdayspresent.getText());

            boolean regularExist = false;
           for(Student student:array_list){
                if(student instanceof Regular){
                    Regular regular_student = (Regular) student;
                    if(regular_student.getEnrollmentID() == Integer.parseInt(text_enrollmentid.getText())){
                        regularExist = true;
                        char attendance_grade = regular_student.presentPercentage(days_present);
                        JOptionPane.showMessageDialog(GUI_frame,"Successfully calculated present percentage of student");
                        break;
                    }
                }
           }

           if(regularExist == false){
                JOptionPane.showMessageDialog(GUI_frame,"There are no regular students in the studenht list.");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
        }
        }
        }

        else if(e.getSource() == button_grantcertificateofRS)
        {
           if(text_enrollmentid.getText().isEmpty() || text_coursename.getText().isEmpty()){
                JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
            }
           else{
               String coursename = text_courseduration.getText();

                enrollmentday = (String) doe_day.getSelectedItem();
                enrollmentmonth = (String) doe_month.getSelectedItem();
                enrollmentyear = (String) doe_year.getSelectedItem();

                doe = enrollmentday + enrollmentmonth + enrollmentyear;
            try{
                   int enrollmentID = Integer.parseInt(text_enrollmentid.getText());

            boolean regularExist = false;
           for(Student student:array_list){
                if(student instanceof Regular){
                    Regular regular_student = (Regular) student;
                    if(regular_student.getEnrollmentID() == Integer.parseInt(text_enrollmentid.getText())){
                        regularExist = true;
                        regular_student.grantCertificate(coursename, enrollmentID, doe);
                        JOptionPane.showMessageDialog(GUI_frame,"Successfully calculated present percentage of student");
                        break;
                    }
                }
           }

           if(regularExist == false){
                JOptionPane.showMessageDialog(GUI_frame,"There are no regular students in the studenht list.");
            }
            }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
            }
        }
        }
        else if(e.getSource() == button_drop_display)
        {
            boolean dropoutExist = false; 
                for(Student student:array_list){
                    if(student instanceof Dropout){
                        dropoutExist = true;
                        Dropout dropout_student = (Dropout) student;//downcasting
                        student.display();
                }
            }

            if(dropoutExist == false){
                JOptionPane.showMessageDialog(GUI_frame,"There is no dropout object in Student list","error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == button_drop_clear)
        {
         text_drop_studentname.setText("");
         text_drop_enrollmentid.setText("");
         text_drop_coursename.setText("");
         text_drop_courseduration.setText("");
         text_drop_tutionfee.setText("");
         text_drop_numofremainingmodules.setText("");
         text_drop_numofmonthattended.setText("");
         text_drop_remainingamount.setText("");
         text_drop_numofdayspresent.setText("");

        }
        else if(e.getSource() == button_drop_addtodropoutstudent)
        {
           if( text_drop_studentname.getText().isEmpty() || text_drop_enrollmentid.getText().isEmpty() || text_drop_coursename.getText().isEmpty() || text_drop_courseduration.getText().isEmpty() || text_drop_tutionfee.getText().isEmpty() || text_drop_numofremainingmodules.getText().isEmpty() || text_drop_remainingamount.getText().isEmpty() || text_drop_numofmonthattended.getText().isEmpty()){
               JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
           }
           else{
               try{
                    //dropout button
                    drop_studentname = text_drop_studentname.getText();
                    drop_enrollmentid = Integer.valueOf(text_drop_enrollmentid.getText());
                    drop_coursename = text_drop_coursename.getText();
                    drop_courseduration = Integer.valueOf(text_drop_courseduration.getText());
                    drop_tutionfee = Integer.valueOf(text_drop_tutionfee.getText());
                    drop_numofremainingmodules = Integer.valueOf(text_drop_numofremainingmodules.getText());
                    drop_numofmonthattended = Integer.valueOf(text_drop_numofmonthattended.getText());
                    drop_remainingamount = Integer.valueOf(text_drop_remainingamount.getText());

                    drop_birthday = (String) dob_days.getSelectedItem();
                    drop_birthmonth = (String) dob_months.getSelectedItem();
                    drop_birthyear = (String) dob_years.getSelectedItem();

                    drop_dob = birthday + birthmonth + birthyear;

                    drop_enrollmentday = (String) doe_days.getSelectedItem();
                    drop_enrollmentmonth = (String) doe_months.getSelectedItem();
                    drop_enrollmentyear = (String) doe_years.getSelectedItem();

                    drop_doe = enrollmentday + enrollmentmonth + enrollmentyear;

                    drop_dropday = (String) dod_days.getSelectedItem();
                    drop_dropmonth = (String) dod_months.getSelectedItem();
                    drop_dropyear = (String) dod_years.getSelectedItem();

                    drop_dod = drop_dropday + drop_dropmonth + drop_dropyear;

                    Student drop = new Dropout(drop_dob, drop_studentname, drop_courseduration, drop_tutionfee, drop_enrollmentid, drop_coursename, drop_doe,
                                               drop_numofremainingmodules, drop_numofmonthattended, drop_dod);

                   if(array_list.isEmpty()){
                       array_list.add(drop);
                       JOptionPane.showMessageDialog(GUI_frame,"Dropout Student added successfully");
                   }
                   else{
                        boolean isDuplicate = false;

                       for(Student student:array_list){
                            if(student instanceof Dropout){
                                if(student.getEnrollmentID() == drop.getEnrollmentID()){
                                    isDuplicate = true;
                                    break;
                                }
                            }
                       }

                       if(isDuplicate == true){
                            JOptionPane.showMessageDialog(GUI_frame,"Duplicate enrollment ID","error",JOptionPane.ERROR_MESSAGE);
                       }

                       else{
                            array_list.add(drop);
                            JOptionPane.showMessageDialog(GUI_frame,"Dropout Student added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                       }

                   }
               }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
               }
        }

        }

        else if(e.getSource() == button_drop_paytobillofdropoutstudent)
        {
           if(text_drop_enrollmentid.getText().isEmpty()){
                JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
            }
                    else{
                    try{
                    drop_enrollmentid = Integer.valueOf(text_drop_enrollmentid.getText());
                    boolean dropoutExist = false;
                   for(Student student:array_list){
                        if(student instanceof Dropout){
                            Dropout drop_student = (Dropout) student;
                            if(drop_student.getEnrollmentID() == drop_enrollmentid){
                                dropoutExist = true;
                                drop_student.billsPayable();
                                JOptionPane.showMessageDialog(GUI_frame,"Successfully paid bills of student");
                                break;
                            }
                        }
                   }
                   if(dropoutExist == false){
                        JOptionPane.showMessageDialog(GUI_frame,"There are no dropout students in the studenht list.");
                    }
                    }catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
                       }
            }
        }

        else if(e.getSource() == button_drop_removedropoutstudent)
        {
           if(text_drop_enrollmentid.getText().isEmpty()){
                JOptionPane.showMessageDialog(GUI_frame,"Please fill all fields");
            }
            else{
                try{
                    drop_enrollmentid = Integer.valueOf(text_drop_enrollmentid.getText());
                    boolean dropoutExist = false;
               for(Student student:array_list){
                    if(student instanceof Dropout){
                        Dropout drop_student = (Dropout) student;
                        if(drop_student.getEnrollmentID() == drop_enrollmentid){
                            dropoutExist = true;
                            drop_student.removeStudent();
                            JOptionPane.showMessageDialog(GUI_frame,"Successfully removed student");
                            break;
                        }
                    }
               }

               if(dropoutExist == false){
                    JOptionPane.showMessageDialog(GUI_frame,"There are no dropout students in the studenht list.");
                }
                }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(GUI_frame,"Please enter valid numbers");
                       }
            }
        }
    }

    public static void main (String[]args)
    {
        StudentGUI obj = new StudentGUI();
        obj.Regularstudents();
    }

    public void Regularstudents()
    {
        //frame settings
        GUI_frame = new JFrame();//creating frame
        GUI_frame.setTitle("Student GUI");//setting frame title
        GUI_frame.setBounds(400,0,1100,900);//setting bounds
        GUI_frame.setBackground(Color.CYAN);//setting background color
        GUI_frame.setResizable(false);//making frame resizable
        GUI_frame.setLayout(null);//setting default layout to null

        //regular student panel settings
        regular_panel = new JPanel();//creating panel
        regular_panel.setBounds(0,0,1100,900);//setting bounds
        regular_panel.setBackground(new Color(176,224,230));//setting background color
        regular_panel.setLayout(null);//setting default layout to null

        //regularGUI label setting
        label_RegularGUI = new JLabel("Regular GUI");//creating label
        label_RegularGUI.setBounds(400,10,250,60);//setting bounds
        Font a = new Font("Times New roman",Font.BOLD,30);//creating text font
        label_RegularGUI.setFont(a);//setting font
        regular_panel.add(label_RegularGUI);//adding label to regular_panel


        //enrollmentid label setting
        label_enrollmentid = new JLabel("Enrollment ID :");//creating label
        label_enrollmentid.setBounds(50,130,200,60);//setting bounds
        Font b = new Font("Arial",Font.PLAIN, 18);//selecting text font
        label_enrollmentid.setFont(b);//setting font
        regular_panel.add(label_enrollmentid);//adding label to regular_panel

        //enrollmentid text setting
        text_enrollmentid = new JTextField();//creating textfield
        text_enrollmentid.setBounds(190,140,220,32);//setting bounds
        regular_panel.add(text_enrollmentid);//adding text to regular_panel

        //studentname label setting
        label_studentname = new JLabel("Student Name :");//creating label
        label_studentname.setBounds(50,190,200,60);//setting bounds
        label_studentname.setFont(b);//setting font
        regular_panel.add(label_studentname);//adding label to regular_panel

        //studentname text setting
        text_studentname = new JTextField();//creating textfield
        text_studentname.setBounds(190,200,220,32);//setting bounds
        regular_panel.add(text_studentname);//adding text to regular_panel

        //dateofbirth label setting
        label_dateofbirth = new JLabel();//creating label
        label_dateofbirth.setText("Date Of Birth :");//creating label
        label_dateofbirth.setBounds(50,238,200,60);//setting bounds
        label_dateofbirth.setFont(b);//setting font
        regular_panel.add(label_dateofbirth);//adding label to regular_panel

        String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] year = {"2020","2021","2022","2023","2024","2025"};

        //combobox setting
        dob_day = new JComboBox(days);//creating combobox
        dob_day.setBounds(190,250,70,40);//setting bounds
        regular_panel.add(dob_day);//adding combobox to regular_panel

        //combobox setting
        dob_month = new JComboBox(months);//creating combobox
        dob_month.setBounds(250,250,80,40);//setting bounds
        regular_panel.add(dob_month);//adding combobox to regular_panel

        //combobox setting
        dob_year = new JComboBox(year);//creating combobox
        dob_year.setBounds(320,250,85,40);//setting bounds
        regular_panel.add(dob_year);//adding combobox to regular_panel

        //coursename label setting
        label_coursename = new JLabel("Course Name :");//creating label
        label_coursename.setBounds(50,285,200,60);//setting bounds
        label_coursename.setFont(b);//setting font
        regular_panel.add(label_coursename);//adding label to regular_panel

        //coursename text setting
        text_coursename = new JTextField();//creating textfield
        text_coursename.setBounds(190,295,220,32);//setting bounds
        regular_panel.add(text_coursename);//adding text to regular_panel

        //courseduration label setting
        label_courseduration = new JLabel("Course Duration :");//creating label
        label_courseduration.setBounds(50,345,200,60);//setting bounds
        label_courseduration.setFont(b);//setting font
        regular_panel.add(label_courseduration);//adding label to regular_panel

        //courseduration text setting
        text_courseduration = new JTextField();//creating textfield
        text_courseduration.setBounds(190,355,220,32);//setting bounds
        regular_panel.add(text_courseduration);//adding text to regular_panel

        //dateofenrollment label setting
        label_dateofenrollment = new JLabel();//creating label
        label_dateofenrollment.setText("Date Of Enrollment :");//creating label
        label_dateofenrollment.setBounds(600,130,200,60);//setting bounds
        label_dateofenrollment.setFont(b);//setting font
        regular_panel.add(label_dateofenrollment);//adding label to regular_panel

        String[] day = new String[31];
        String[] month = new String[12];
        String[] years = new String[60];

        for(int i=0; i<31; i++){
            day[i] = String.valueOf(i+1);
        }

        for(int i=0; i<12; i++){
            month[i] = String.valueOf(i+1);
        }

        int yearvalue = 1990;
        for(int i=0; i<60; i++){
            years[i] = String.valueOf(yearvalue);
            yearvalue += 1;
        }

        //combobox setting
        doe_day = new JComboBox(day);//creating combobox
        doe_day.setBounds(790,140,70,40);//setting bounds
        regular_panel.add(doe_day);//adding combobox to regular_panel

        //combobox setting
        doe_month = new JComboBox(month);//creating combobox
        doe_month.setBounds(850,140,80,40);//setting bounds
        regular_panel.add(doe_month);//adding combobox to regular_panel

        //combobox setting
        doe_year = new JComboBox(years);//creating combobox
        doe_year.setBounds(920,140,85,40);//setting bounds
        regular_panel.add(doe_year);//adding combobox to regular_panel

        //numofmodules label setting
        label_numofmodules = new JLabel("Num Of Modules :");//creating label
        label_numofmodules.setBounds(600,180,200,60);//setting bounds
        label_numofmodules.setFont(b);//setting font
        regular_panel.add(label_numofmodules);//adding label to regular_panel

        //numofmodules text setting
        text_numofmodules = new JTextField();//creating textfield
        text_numofmodules.setBounds(790,185,220,32);//setting bounds
        regular_panel.add(text_numofmodules);//adding text to regular_panel

        //numofcredits label setting
        label_numofcredits = new JLabel("Num Of Credits :");//creating label
        label_numofcredits.setBounds(600,230,200,60);//setting bounds
        label_numofcredits.setFont(b);//setting font
        regular_panel.add(label_numofcredits);//adding label to regular_panel

        //numofcredits text setting
        text_numofcredits = new JTextField();//creating textfield
        text_numofcredits.setBounds(790,240,220,32);//setting bounds
        regular_panel.add(text_numofcredits);//adding text to regular_panel

        //numofdayspresent label setting
        label_numofdayspresent = new JLabel("Num Of Days Present :");//creating label
        label_numofdayspresent.setBounds(600,285,200,60);//setting bounds
        label_numofdayspresent.setFont(b);//setting font
        regular_panel.add(label_numofdayspresent);//adding label to regular_panel

        //numofdayspresent text setting
        text_numofdayspresent = new JTextField();//creating textfield
        text_numofdayspresent.setBounds(790,295,220,32);//setting bounds
        regular_panel.add(text_numofdayspresent);//adding text to regular_panel

        //tutionfee label setting
        label_tutionfee = new JLabel("Tuition Fee :");//creating label
        label_tutionfee.setBounds(600,345,200,60);//setting bounds
        label_tutionfee.setFont(b);//setting font
        regular_panel.add(label_tutionfee);//adding label to regular_panel

        //tutionfee text setting
        text_tutionfee = new JTextField();//creating textfield
        text_tutionfee.setBounds(790,355,220,32);//setting bounds
        regular_panel.add(text_tutionfee);//adding text to regular_panel

        //addaregularstudent button setting
        button_addaregularstudent = new JButton();//creating button
        button_addaregularstudent.setText("Add a Regular Student");//setting button text
        button_addaregularstudent.setBounds(325,450,350,45);//setting bounds
        Font c = new Font("Arial",Font.PLAIN,18);//creating text font
        button_addaregularstudent.setFont(c);//setting font
        button_addaregularstudent.setOpaque(true);//setting opaque to true
        button_addaregularstudent.setBackground(new Color(128,0,128));//setting background color
        button_addaregularstudent.setForeground(new Color(0,0,128));//setting foreground color
        button_addaregularstudent.addActionListener(this);//setting action listener
        regular_panel.add(button_addaregularstudent);//adding to regular_panel

        //calculatepercentage button setting
        button_calculatepercentage = new JButton();//creating button
        button_calculatepercentage.setText("Calculate Percentage");//setting button text
        button_calculatepercentage.setBounds(50,550,420,45);//setting bounds
        button_calculatepercentage.setFont(c);//setting font
        button_calculatepercentage.setOpaque(true);//setting opaque to true
        button_calculatepercentage.setBackground(new Color(128,0,128));//setting background color
        button_calculatepercentage.setForeground(new Color(0,0,128));//setting foreground color
        button_calculatepercentage.addActionListener(this);//setting action listener
        regular_panel.add(button_calculatepercentage);//adding to regular_panel

        //grantcertificateofRS button setting
        button_grantcertificateofRS = new JButton();//creating button
        button_grantcertificateofRS.setText("Grant a Certificate of Regular Student");//setting button text
        button_grantcertificateofRS.setBounds(550,550,450,45);//setting bounds
        button_grantcertificateofRS.setFont(c);//setting font
        button_grantcertificateofRS.setOpaque(true);//setting opaque to true
        button_grantcertificateofRS.setBackground(new Color(128,0,128));//setting background color
        button_grantcertificateofRS.setForeground(new Color(0,0,128));//setting foreground color
        button_grantcertificateofRS.addActionListener(this);//setting action listener
        regular_panel.add(button_grantcertificateofRS);//adding to regular_panel

        //display button setting
        button_display = new JButton();//creating button
        button_display.setText("Display");//setting button text
        button_display.setBounds(50,700,150,45);//setting bounds
        button_display.setFont(c);//setting font
        button_display.setOpaque(true);//setting opaque to true
        button_display.setBackground(new Color(139,69,19));//setting background color
        button_display.setForeground(new Color(210,105,30));//setting foreground color
        button_display.addActionListener(this);//setting action listener
        regular_panel.add(button_display);//adding to regular_panel

        //clear button setting
        button_clear = new JButton();//creating button
        button_clear.setText("Clear");//setting button text
        button_clear.setBounds(850,700,150,45);//setting bounds
        button_clear.setFont(c);//setting font
        button_clear.setOpaque(true);//setting opaque to true
        button_clear.setBackground(new Color(139,69,19));//setting background color
        button_clear.setForeground(new Color(210,105,30));//setting foreground color
        button_clear.addActionListener(this);//setting action listener
        regular_panel.add(button_clear);//adding to regular_panel


        GUI_frame.add(regular_panel);



        //Dropout Panel

        //dropout student panel settings
        drop_panel = new JPanel();//creating panel
        drop_panel.setBounds(0,0,1100,900);//setting bonds
        drop_panel.setBackground(new Color(176,224,230));//setting background color
        drop_panel.setLayout(null);//setting default layout to null

        //dropoutGUI label setting
        label_drop_DropoutGUI = new JLabel("Dropout GUI");//creating label
        label_drop_DropoutGUI.setBounds(400,10,250,60);//setting bounds
        label_drop_DropoutGUI.setFont(a);//setting font
        drop_panel.add(label_drop_DropoutGUI);//adding label to drop_panel

        //enrollmentid label setting
        label_drop_enrollmentid = new JLabel("Enrollment ID :");//creating label
        label_drop_enrollmentid.setBounds(50,130,200,60);//setting bounds
        label_drop_enrollmentid.setFont(b);//setting font
        drop_panel.add(label_drop_enrollmentid);//adding to drop_panel

        //enrollmentid text setting
        text_drop_enrollmentid = new JTextField();//creating textfield
        text_drop_enrollmentid.setBounds(190,140,220,32);//setting bounds
        drop_panel.add(text_drop_enrollmentid);//adding to drop_panel

        //studentname label setting
        label_drop_studentname = new JLabel("Student Name :");//creating label
        label_drop_studentname.setBounds(50,190,200,60);//setting bounds
        label_drop_studentname.setFont(b);//setting font
        drop_panel.add(label_drop_studentname);//adding to drop_panel

        //studentname label setting
        text_drop_studentname = new JTextField();//creating textfield
        text_drop_studentname.setBounds(190,200,220,32);//setting bounds
        drop_panel.add(text_drop_studentname);//adding to drop_panel

        //dateofbirth label setting
        label_drop_dateofbirth = new JLabel();//creating label
        label_drop_dateofbirth.setText("Date Of Birth :");//creating label
        label_drop_dateofbirth.setBounds(50,238,200,60);//setting bounds
        label_drop_dateofbirth.setFont(b);//setting font
        drop_panel.add(label_drop_dateofbirth);//adding to drop_panel

        //combobox setting
        dob_days = new JComboBox(days);//creating combobox
        dob_days.setBounds(190,250,70,40);//setting bounds
        drop_panel.add(dob_days);//adding to drop_panel

        //combobox setting
        dob_months = new JComboBox(months);//creating combobox
        dob_months.setBounds(250,250,80,40);//setting bounds
        drop_panel.add(dob_months);//adding to drop_panel

        //combobox setting
        dob_years = new JComboBox(year);//creating combobox
        dob_years.setBounds(320,250,85,40);//setting bounds
        drop_panel.add(dob_years);//adding to drop_panel

        //coursename label setting
        label_drop_coursename = new JLabel("Course Name :");//creating label
        label_drop_coursename.setBounds(50,285,200,60);//setting bounds
        label_drop_coursename.setFont(b);//setting font
        drop_panel.add(label_drop_coursename);//adding to drop_panel

        //coursename text setting
        text_drop_coursename = new JTextField();
        text_drop_coursename.setBounds(190,295,220,32);//setting bounds
        drop_panel.add(text_drop_coursename);//adding to drop_panel

        //courseduration label setting
        label_drop_courseduration = new JLabel("Course Duration :");//creating label
        label_drop_courseduration.setBounds(50,345,200,60);//setting bounds
        label_drop_courseduration.setFont(b);//setting font
        drop_panel.add(label_drop_courseduration);//adding to drop_panel

        //courseduration text setting
        text_drop_courseduration = new JTextField();
        text_drop_courseduration.setBounds(190,355,220,32);//setting bounds
        drop_panel.add(text_drop_courseduration);//adding to drop_panel

        //dateofenrollment label setting
        label_drop_dateofenrollment = new JLabel();
        label_drop_dateofenrollment.setText("Date Of Enrollment :");//creating label
        label_drop_dateofenrollment.setBounds(550,130,200,60);//setting bounds
        label_drop_dateofenrollment.setFont(b);//setting font
        drop_panel.add(label_drop_dateofenrollment);//adding to drop_panel


        //combobox setting
        doe_days = new JComboBox(day);//creating combobox
        doe_days.setBounds(790,140,70,40);//setting bounds
        drop_panel.add(doe_days);//adding to drop_panel

        //combobox setting
        doe_months = new JComboBox(month);//creating combobox
        doe_months.setBounds(850,140,80,40);//setting bounds
        drop_panel.add(doe_months);//adding to drop_panel

        //combobox setting
        doe_years = new JComboBox(years);//creating combobox
        doe_years.setBounds(920,140,85,40);//setting bounds
        drop_panel.add(doe_years);//adding to drop_panel

        //numofremainingmodules label setting
        label_drop_numofremainingmodules = new JLabel("Num Of Remaining Modules:");//creating label
        label_drop_numofremainingmodules.setBounds(550,180,240,60);//setting bounds
        label_drop_numofremainingmodules.setFont(b);//setting font
        drop_panel.add(label_drop_numofremainingmodules);//adding to drop_panel

        //numofremainingmodules text setting
        text_drop_numofremainingmodules = new JTextField();
        text_drop_numofremainingmodules.setBounds(790,190,220,32);//setting bounds
        drop_panel.add(text_drop_numofremainingmodules);//adding to drop_panel

        //numofmonthattended label setting
        label_drop_numofmonthattended = new JLabel("Num Of month attended :");//creating label
        label_drop_numofmonthattended.setBounds(550,230,240,60);//setting bounds
        label_drop_numofmonthattended.setFont(b);//setting font
        drop_panel.add(label_drop_numofmonthattended);//adding to drop_panel

        //numofmonthattended text setting
        text_drop_numofmonthattended = new JTextField();
        text_drop_numofmonthattended.setBounds(790,240,220,32);//setting bounds
        drop_panel.add(text_drop_numofmonthattended);//adding to drop_panel

        //tutionfee label setting
        label_drop_tutionfee = new JLabel("Tuition Fee :");//creating label
        label_drop_tutionfee.setBounds(550,285,200,60);//setting bounds
        label_drop_tutionfee.setFont(b);//setting font
        drop_panel.add(label_drop_tutionfee);//adding to drop_panel

        //tutionfee text setting
        text_drop_tutionfee = new JTextField();
        text_drop_tutionfee.setBounds(790,295,220,32);//setting bounds
        drop_panel.add(text_drop_tutionfee);//adding to drop_panel


        //remainingamount label setting
        label_drop_remainingamount = new JLabel("Remaining Amount :");//creating label
        label_drop_remainingamount.setBounds(550,345,200,60);//setting bounds
        label_drop_remainingamount.setFont(b);//setting font
        drop_panel.add(label_drop_remainingamount);//adding to drop_panel

        //tutionfee text setting
        text_drop_remainingamount = new JTextField();
        text_drop_remainingamount.setBounds(790,355,220,32);//setting bounds
        drop_panel.add(text_drop_remainingamount);//adding to drop_panel

        //dateofdropout label setting
        label_drop_dateofdropout = new JLabel();
        label_drop_dateofdropout.setText("Date Of Dropout :");//creating label
        label_drop_dateofdropout.setBounds(325,415,200,60);//setting bounds
        label_drop_dateofdropout.setFont(b);//setting font
        drop_panel.add(label_drop_dateofdropout);//adding to drop_panel

        String[] day1 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String[] month1 = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] year1 = {"2020","2021","2022","2023","2024","2025"};

        //combobox setting
        dod_days = new JComboBox(day1);//creating combobox
        dod_days.setBounds(470,425,70,40);//setting bounds
        drop_panel.add(dod_days);//adding to drop_panel

        //combobox setting
        dod_months = new JComboBox(month1);//creating combobox
        dod_months.setBounds(530,425,80,40);//setting bounds
        drop_panel.add(dod_months);//adding to drop_panel

        //combobox setting
        dod_years = new JComboBox(year1);//creating combobox
        dod_years.setBounds(600,425,85,40);//setting bounds
        drop_panel.add(dod_years);//adding to drop_panel

        //addtodropoutstudent button setting
        button_drop_addtodropoutstudent = new JButton();//creating button
        button_drop_addtodropoutstudent.setText("Add to Dropout Student");//setting button text
        button_drop_addtodropoutstudent.setBounds(325,480,350,45);//setting bounds
        button_drop_addtodropoutstudent.setFont(c);//setting font
        button_drop_addtodropoutstudent.setOpaque(true);//setting opaque to true
        button_drop_addtodropoutstudent.setBackground(new Color(139,69,19));//setting background color
        button_drop_addtodropoutstudent.setForeground(new Color(210,105,30));//setting foreground color
        button_drop_addtodropoutstudent.addActionListener(this);//setting action listener
        drop_panel.add(button_drop_addtodropoutstudent);//adding to drop_panel

        //paytobillofdropoutstudent button setting
        button_drop_paytobillofdropoutstudent = new JButton();//creating button
        button_drop_paytobillofdropoutstudent.setText("Pay to Bill Of Dropout Student");//setting button text
        button_drop_paytobillofdropoutstudent.setBounds(50,550,450,45);//setting bounds
        button_drop_paytobillofdropoutstudent.setFont(c);//setting font
        button_drop_paytobillofdropoutstudent.setOpaque(true);//setting opaque to true
        button_drop_paytobillofdropoutstudent.setBackground(new Color(139,69,19));//setting background color
        button_drop_paytobillofdropoutstudent.setForeground(new Color(210,105,30));//setting foreground color
        button_drop_paytobillofdropoutstudent.addActionListener(this);//setting action listener
        drop_panel.add(button_drop_paytobillofdropoutstudent);//adding to drop_panel

        //removedropoutstudent button setting
        button_drop_removedropoutstudent = new JButton();//creating button
        button_drop_removedropoutstudent.setText("Remove Dropout Student");//setting button text
        button_drop_removedropoutstudent.setBounds(550,550,420,45);//setting bounds
        button_drop_removedropoutstudent.setFont(c);//setting font
        button_drop_removedropoutstudent.setOpaque(true);//setting opaque to true
        button_drop_removedropoutstudent.setBackground(new Color(139,69,19));//setting background color
        button_drop_removedropoutstudent.setForeground(new Color(210,105,30));//setting foreground color
        button_drop_removedropoutstudent.addActionListener(this);//setting action listener
        drop_panel.add(button_drop_removedropoutstudent);//adding to drop_panel

        //display button setting
        button_drop_display = new JButton();//creating button
        button_drop_display.setText("Display");//setting button text
        button_drop_display.setBounds(50,700,150,45);//setting bounds
        button_drop_display.setFont(c);//setting font
        button_drop_display.setOpaque(true);//setting opaque to true
        button_drop_display.setBackground(new Color(139,69,19));//setting background color
        button_drop_display.setForeground(new Color(210,105,30));//setting foreground color
        button_drop_display.addActionListener(this);//setting action listener
        drop_panel.add(button_drop_display);//adding to drop_panel

        //clear button setting
        button_drop_clear = new JButton();//creating button
        button_drop_clear.setText("Clear");//setting button text
        button_drop_clear.setBounds(850,700,150,45);//setting bounds
        button_drop_clear.setFont(c);//setting font
        button_drop_clear.setOpaque(true);//setting opaque to true
        button_drop_clear.setBackground(new Color(139,69,19));//setting background color
        button_drop_clear.setForeground(new Color(210,105,30));//setting foreground color
        button_drop_clear.addActionListener(this);//setting action listener
        drop_panel.add(button_drop_clear);//adding to drop_panel



        tabbed_pane = new JTabbedPane();
        tabbed_pane.add("Regular",regular_panel);
        tabbed_pane.add("Dropout",drop_panel);
        tabbed_pane.setBounds(0,0,1100,900);

        GUI_frame.add(tabbed_pane);

        GUI_frame.setVisible(true);
    }
}
