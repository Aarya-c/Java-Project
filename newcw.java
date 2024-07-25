// importing____________________________________________________________________________________________
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class newcw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class newcw implements ActionListener
{
    //declairing instance 
    private JFrame frame;
    
    private JPanel panel_frame, panel_frame2,panel_frame3;
    
    private JLabel frame_label,frame2_label,frame3_label,label_name,label_course,label_ID,label_duration,label_fee,label_present,label_name_D,
                label_course_D,label_ID_D,label_duration_D,label_fee_D,label_present_D,label_birth,label_dateE,label_name5,label_name6,label_name7,
                label_credit,label_modules,label_modules_D,label_ID_C,label_present_C,label_ID_G,label_name_G,label_amount_D,label_ID_B,label_ID_R;
                
    private JTextField Textfield_name,Textfield_course,Textfield_ID,Textfield_duration,Textfield_fee,Textfield_present,Textfield_name_D,
                Textfield_course_D,Textfield_ID_D,Textfield_duration_D,Textfield_fee_D,Textfield_present_D,Textfield_modules_D,Textfield_modules,
                Textfield_credit,Textfield_ID_C,Textfield_present_C,Textfield_ID_G,Textfield_name_G,Textfield_amount_D,Textfield_ID_B,Textfield_ID_R;
                
    private JButton button_add,button_calculate,button_grant,button_display,button_clear,button6,button7,button8,button_display_1,button_clear_1,
                button_add_D,button_remove,button_bill;
                
    private JComboBox box1,box2,box3,box4,box5;
    
    
    //creating a main method____________________________________________________________________________
    public static void main(String [] args)
    {
        newcw frame = new newcw();
        frame.HOME();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //Add regualr student button _________________________________________________________________   
        if(e.getSource() == button_add)
        {
            try{
                //student name TEXTFIELD
                String name = Textfield_name.getText();
                //course name TEXTFIELD
                String course = Textfield_course.getText();
                //enrollment id TEXTFIELD
                int ID = Integer.valueOf(Textfield_ID.getText());
                //CREDIT HOURS TEXTFIELD
                int credit_hours = Integer.valueOf(Textfield_credit.getText());
                //COURSE DURATION TEXTFIELD
                int duration = Integer.valueOf(Textfield_duration.getText());
                //TUITION FEE TEXTFIELD
                int fee = Integer.valueOf(Textfield_fee.getText());
                //days present TEXTFIELD
                int days_present = Integer.valueOf(Textfield_present.getText());
                // number of modules TEXTFIELD
                int modules = Integer.valueOf(Textfield_modules.getText());
            
                // date of BIRTH
                String box_B = box1.getSelectedItem().toString();
                
                // date of ENROLLMENT
                String box_E = box2.getSelectedItem().toString();
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                }
                //credit hours
                if(Textfield_credit.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Number of credit hours is empty."); 
                }
                // course duration
                if(Textfield_duration.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Course duration is empty."); 
                }
                // tuition fee
                if(Textfield_fee.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Tuition fee is empty."); 
                }
                // days present
                if(Textfield_present.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Days present is empty."); 
                }
                // no.of modules
                if(Textfield_modules.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Number of modules is empty."); 
                }
                //student name
                if(Textfield_name.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(frame_label, "Student name is empty."); 
                }
                // course name
                if(Textfield_course.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(frame_label, "Course name is empty."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }
        }
        
        
        //calculate BUTTON______________________________________________________________________________________
        else if(e.getSource() == button_calculate)
        {
            try{
                //enrollment id TEXTFIELD
                int ID_C = Integer.valueOf(Textfield_ID_C.getText());
                //days present TEXTFIELD
                int days_present_C = Integer.valueOf(Textfield_present_C.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID_C.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                }
                // days present
                if(Textfield_present_C.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Days present is empty."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }
        }
        //GRANT BUTTON_____________________________________________________________________________________________
        else if(e.getSource() == button_grant)
        {
            try{
                //enrollment id TEXTFIELD
                int ID_G = Integer.valueOf(Textfield_ID_G.getText());
                //course name TEXTFIELD
                String course_G = Textfield_name_G.getText();
                
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID_G.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                }
                // course name
                if(Textfield_name_G.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(frame_label, "Course name is empty."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }
        }
        
        //DISPLAY BUTTON___________________________________________________________________________________________
        else if(e.getSource() == button_display)
        {
            
        }
        //CLEAR BUTTON_______________________________________________________________________________________________
        else if(e.getSource() == button_clear)
        {
            Textfield_name.setText("");
            Textfield_course.setText("");
            Textfield_ID.setText("");
            Textfield_credit.setText("");
            Textfield_duration.setText("");
            Textfield_fee.setText("");
            Textfield_present.setText("");
            Textfield_modules.setText("");
            Textfield_ID_C.setText("");
            Textfield_present_C.setText("");
            Textfield_ID_G.setText("");
            Textfield_name_G.setText("");
          
        }
        //Add DROPOUT BUTTON_________________________________________________________________________________________
        else if(e.getSource() == button_add_D)
        {
            try{
                //student name TEXTFIELD
                String name_D = Textfield_name_D.getText();
                //course name TEXTFIELD
                String course_D = Textfield_course_D.getText();
                //enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(Textfield_ID_D.getText());
                //TUITION FEE TEXTFIELD
                int FEE_D = Integer.valueOf(Textfield_fee_D.getText());
                //COURSE DURATION TEXTFIELD
                int duration_D = Integer.valueOf(Textfield_duration_D.getText());
                //REMAINING AMOUNT TEXTFIELD
                int R_AMOUNT_D = Integer.valueOf(Textfield_amount_D.getText());
                //days present TEXTFIELD
                int days_present_D = Integer.valueOf(Textfield_present_D.getText());
                // number of modules TEXTFIELD
                int modules_D = Integer.valueOf(Textfield_modules_D.getText());
            
                // date of BIRTH 
                String box_B2 = box3.getSelectedItem().toString();
            
                // date of ENROLLMENT 
                String box_E2 = box4.getSelectedItem().toString();
            
                // date of DROPOUT 
                String box_D = box5.getSelectedItem().toString();
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                }
                //remaining amount
                if(Textfield_amount_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Remaining amount is empty."); 
                }
                // course duration
                if(Textfield_duration_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Course duration is empty."); 
                }
                // tuition fee
                if(Textfield_fee_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Tuition fee is empty."); 
                }
                // days present
                if(Textfield_present_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Days present is empty."); 
                }
                // no.of modules
                if(Textfield_modules_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Number of modules is empty."); 
                }
                //student name
                if(Textfield_name_D.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(frame_label, "Student name is empty."); 
                }
                // course name
                if(Textfield_course_D.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(frame_label, "Course name is empty."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }            
        }
        //PAY THE BILL BUTTON________________________________________________________________________________________
        else if(e.getSource() == button_bill)
        {
            try{//enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(Textfield_ID_B.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID_B.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                } 
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }
        } 
        //REMOVE BUTTON_______________________________________________________________________________________________
        else if(e.getSource() == button_remove)
        {
            try{
                //enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(Textfield_ID_R.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID_R.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(frame_label, "Enrollment ID is empty."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(frame_label, "Please enter valid data."); 
                }
            }
        }
        //DISPLAY BUTTON______________________________________________________________________________________________
        else if(e.getSource() == button_display_1)
        {
            
        }
        //CLEAR BUTTON______________________________________________________________________________________________
        else if(e.getSource() == button_clear_1)
        {
            
            Textfield_name_D.setText("");
            Textfield_course_D.setText("");
            Textfield_ID_D.setText("");
            Textfield_fee_D.setText("");
            Textfield_duration_D.setText("");
            Textfield_present_D.setText("");
            Textfield_modules_D.setText("");
            Textfield_amount_D.setText("");
            Textfield_ID_B.setText("");
            Textfield_ID_R.setText("");

        }
        
    }
    public void HOME()
    {
       //jframe of Home
        frame = new JFrame();
        frame.setTitle("CourseWork2_GUI");
        frame.setBounds(0, 0,1270,700);
        frame.setResizable(false);
        frame.setLayout(null);
        
        /**JPanel OF Regular frame________________________________________________________________________________________**/

        panel_frame= new JPanel();
        panel_frame.setBounds(0, 0, 620, 670);
        panel_frame.setBackground(Color.PINK);
        //setting layout null of jpanel
        panel_frame.setLayout(null);
        
        frame_label = new JLabel("Regular Frame");
        frame_label.setBounds(250, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.BOLD,20);
        frame_label. setFont(hh);
        //adding jlabel to jpanel
        panel_frame.add(frame_label);
        
        // client name of debit card method
        label_name = new JLabel("Student name");
        label_name.setBounds(20, 100, 100, 30);
        Font ff = new Font("Arial",Font.PLAIN,16);
        label_name. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_name);
        
        Textfield_name= new JTextField();
        Textfield_name.setBounds(118, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_name);
        
        label_course = new JLabel("Course name");
        label_course.setBounds(20, 140, 100, 30);
        label_course. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_course);
        
        Textfield_course= new JTextField();
        Textfield_course.setBounds(118, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_course);
        
        label_ID = new JLabel("Enrollment ID");
        label_ID.setBounds(20, 180, 100, 30);
        label_ID. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_ID);
        
        Textfield_ID= new JTextField();
        Textfield_ID.setBounds(118, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_ID);
        
        
        label_credit = new JLabel("Tuition fee");
        label_credit.setBounds(20, 220, 100, 30);
        label_credit. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_credit);
        
        Textfield_credit= new JTextField();
        Textfield_credit.setBounds(118, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_credit);
        
        label_duration = new JLabel("Course duration");
        label_duration.setBounds(340, 100, 180, 30);
        label_duration. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_duration);
        
        Textfield_duration= new JTextField();
        Textfield_duration.setBounds(460, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_duration);
        
        label_fee = new JLabel("Credit hours");
        label_fee.setBounds(340, 140, 180, 30);
        label_fee. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_fee);
        
        Textfield_fee= new JTextField();
        Textfield_fee.setBounds(460, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_fee);
        
        label_present = new JLabel("Days present");
        label_present.setBounds(340, 180, 100, 30);
        label_present. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_present);
        
        Textfield_present= new JTextField();
        Textfield_present.setBounds(460, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_present);
    
        
        label_modules = new JLabel("No. of modules");
        label_modules.setBounds(340, 220, 180, 30);
        label_modules. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_modules);
        
        Textfield_modules = new JTextField();
        Textfield_modules.setBounds(460, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_modules);
        
        
        //FOR CALCULATION BUTTON______________________________________________________________________
        label_ID_C = new JLabel("Enrollment ID");
        label_ID_C.setBounds(20, 380, 100, 30);
        label_ID_C. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_ID_C);
        
        Textfield_ID_C= new JTextField();
        Textfield_ID_C.setBounds(118, 380, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_ID_C);
        
        
        label_present_C = new JLabel("Days present");
        label_present_C.setBounds(340, 380, 100, 30);
        label_present_C. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_present_C);
        
        Textfield_present_C= new JTextField();
        Textfield_present_C.setBounds(460, 380, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_present_C);
        
        
        
        
        //FOR GRANT BUTTON___________________________________________________________________________
        label_ID_G = new JLabel("Enrollment ID");
        label_ID_G.setBounds(20, 500, 100, 30);
        label_ID_G. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_ID_G);
        
        Textfield_ID_G= new JTextField();
        Textfield_ID_G.setBounds(118, 500, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_ID_G);
        
        
        label_name_G = new JLabel("Course name");
        label_name_G.setBounds(340, 500, 100, 30);
        label_name_G. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_name_G);
        
        Textfield_name_G= new JTextField();
        Textfield_name_G.setBounds(460, 500, 140, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_name_G);
        
        
        //Date of birth_________________________________________________________________________________
        label_birth = new JLabel();
        label_birth.setText("Date of birth:");
        label_birth.setBounds(20,260,150,30);
        label_birth.setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_birth);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980; i--)
        {
            year.addElement(String.valueOf(i));
        }
        box1 = new JComboBox(year);
        box1.setBounds(120,260,100,30);
        //adding combobox to jpanel
        panel_frame.add(box1);
        
        //Date of enrollment__________________________________________________________________________
        label_dateE = new JLabel();
        label_dateE.setText("Date of enrollment:");
        label_dateE.setBounds(340,260,150,30);
        label_dateE.setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(label_dateE);
        
        box2 = new JComboBox(year);
        box2.setBounds(480,260,100,30);
        //adding combobox to jpanel
        panel_frame.add(box2);
        
        
        //add button__________________________________________________________________________________
        button_add = new JButton();
        button_add.setText("Add Student");
        button_add.setBounds(210, 320, 200, 40);
        button_add.setOpaque(true);
        button_add.setBackground(Color.CYAN);
        button_add.setForeground(Color.BLACK);
        Font gg = new Font("Times new Roman",Font.BOLD,18);
        button_add. setFont(gg);
        button_add.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(button_add);
        
        //CALCULATE button______________________________________________________________________________
        button_calculate = new JButton();
        button_calculate.setText("Calculate percentage ");
        button_calculate.setBounds(210, 430, 200, 40);
        button_calculate.setOpaque(true);
        button_calculate.setBackground(Color.CYAN);
        button_calculate.setForeground(Color.BLACK);
        button_calculate. setFont(gg);
        button_calculate.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(button_calculate);
        
        //GRANT button__________________________________________________________________________________
        button_grant = new JButton();
        button_grant.setText("Grant certifiacte");
        button_grant.setBounds(210, 550, 180, 40);
        button_grant.setOpaque(true);
        button_grant.setBackground(Color.CYAN);
        button_grant.setForeground(Color.BLACK);
        button_grant. setFont(gg);
        button_grant.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(button_grant);
        
        //DISPLAY button ___________________________________________________________________________________
        button_display = new JButton();
        button_display.setText("Display");
        button_display.setBounds(30, 600, 100, 50);
        button_display.setOpaque(true);
        button_display.setBackground(Color.CYAN);
        button_display.setForeground(Color.BLACK);
        button_display. setFont(gg);
        button_display.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(button_display);
        
        //CLEAR button__________________________________________________________________________________
        button_clear = new JButton();
        button_clear.setText("Clear");
        button_clear.setBounds(470, 600, 100, 50);
        button_clear.setOpaque(true);
        button_clear.setBackground(Color.CYAN);
        button_clear.setForeground(Color.BLACK);
        button_clear. setFont(gg);
        button_clear.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(button_clear);
        
        
        
        
        //adding jpanel to jframe____________________________________________________________
        frame.add(panel_frame);
        
        
        
        
        /**JPanel of Dropout ________________________________________________________________________________________________________**/

        panel_frame2= new JPanel();
        panel_frame2.setBounds(630, 0, 650, 670);
        panel_frame2.setBackground(Color.PINK);
        //setting layout null of jpanel
        panel_frame2.setLayout(null);
        
        frame2_label = new JLabel("Dropout Frame");
        frame2_label.setBounds(250, 5, 400, 60);
        frame2_label. setFont(hh);
        //adding jlabel to jpanel
        panel_frame2.add(frame2_label);
        
        label_name_D = new JLabel("Student name");
        label_name_D.setBounds(20, 100, 100, 30);
        //Font ff = new Font("Arial",Font.PLAIN,16);
        label_name_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_name_D);
        
        Textfield_name_D= new JTextField();
        Textfield_name_D.setBounds(118, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_name_D);
        
        label_course_D = new JLabel("Course name");
        label_course_D.setBounds(20, 140, 100, 30);
        label_course_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_course_D);
        
        Textfield_course_D= new JTextField();
        Textfield_course_D.setBounds(118, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_course_D);
        
        label_ID_D = new JLabel("Enrollment ID");
        label_ID_D.setBounds(20, 180, 100, 30);
        label_ID_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_ID_D);
        
        Textfield_ID_D= new JTextField();
        Textfield_ID_D.setBounds(118, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_ID_D);
        
        
        label_fee_D = new JLabel("Tuition fee");
        label_fee_D.setBounds(20, 220, 100, 30);
        label_fee_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_fee_D);
        
        Textfield_fee_D= new JTextField();
        Textfield_fee_D.setBounds(118, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_fee_D);
        
        label_duration_D = new JLabel("Course duration");
        label_duration_D.setBounds(340, 100, 180, 30);
        label_duration_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_duration_D);
        
        Textfield_duration_D = new JTextField();
        Textfield_duration_D.setBounds(480, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_duration_D);
        
        label_present_D = new JLabel("Days present");
        label_present_D.setBounds(340, 180, 100, 30);
        label_present_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_present_D);
        
        Textfield_present_D= new JTextField();
        Textfield_present_D.setBounds(480, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_present_D);
    
        
        label_modules_D = new JLabel("No. of remaining modules");
        label_modules_D.setBounds(300, 220, 200, 30);
        label_modules_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_modules_D);
        
        Textfield_modules_D = new JTextField();
        Textfield_modules_D.setBounds(480, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_modules_D);
        
        label_amount_D = new JLabel("Remaining amount");
        label_amount_D.setBounds(340, 140, 180, 30);
        label_amount_D. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_amount_D);
        
        Textfield_amount_D = new JTextField();
        Textfield_amount_D.setBounds(480, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_amount_D);
        
        
        //FOR BILL BUTTON___________________________________________________________________________
        label_ID_B = new JLabel("Enrollment ID");
        label_ID_B.setBounds(20, 430, 100, 30);
        label_ID_B. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_ID_B);
        
        Textfield_ID_B= new JTextField();
        Textfield_ID_B.setBounds(118, 430, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_ID_B);
        
        
        
        //FOR REMOVE BUTTON___________________________________________________________________________
        label_ID_R = new JLabel("Enrollment ID");
        label_ID_R.setBounds(20, 500, 100, 30);
        label_ID_R. setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_ID_R);
        
        Textfield_ID_R= new JTextField();
        Textfield_ID_R.setBounds(118, 500, 140, 25);
        //adding jtextfield to jpanel
        panel_frame2.add(Textfield_ID_R);
        
        
        
        
        //Date of birth_________________________________________________________________________________
        label_name5 = new JLabel();
        label_name5.setText("Date of birth:");
        label_name5.setBounds(20,260,150,30);
        label_name5.setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_name5);
        
        box3 = new JComboBox(year);
        box3.setBounds(160,260,100,30);
        //adding combobox to jpanel
        panel_frame2.add(box3);
              
        
        //Date of enrollment____________________________________________________________________________
        label_name6 = new JLabel();
        label_name6.setText("Date of enrollment:");
        label_name6.setBounds(20,300,150,30);
        label_name6.setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_name6);
        
        box4 = new JComboBox(year);
        box4.setBounds(160,300,100,30);
        //adding combobox to jpanel
        panel_frame2.add(box4);
        
        
        //Date of dropout_________________________________________________________________________________
        label_name7 = new JLabel();
        label_name7.setText("Date of dropout:");
        label_name7.setBounds(340,260,150,30);
        label_name7.setFont(ff);
        //adding jlabel to jpanel
        panel_frame2.add(label_name7);
        
        box5 = new JComboBox(year);
        box5.setBounds(460,260,100,30);
        //adding combobox to jpanel
        panel_frame2.add(box5);
        
        
        
        //add button__________________________________________________________________________________
        button_add_D = new JButton();
        button_add_D.setText("Add Student");
        button_add_D.setBounds(210, 350, 200, 40);
        button_add_D.setOpaque(true);
        button_add_D.setBackground(Color.CYAN);
        button_add_D.setForeground(Color.BLACK);
       // Font gg = new Font("Times new Roman",Font.BOLD,18);
        button_add_D. setFont(gg);
        button_add_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame2.add(button_add_D);
        
        
        //BILL button______________________________________________________________________________
        button_bill = new JButton();
        button_bill.setText("Pay bill ");
        button_bill.setBounds(410, 420, 200, 40);
        button_bill.setOpaque(true);
        button_bill.setBackground(Color.CYAN);
        button_bill.setForeground(Color.BLACK);
        button_bill. setFont(gg);
        button_bill.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame2.add(button_bill);
        
        //REMOVE button__________________________________________________________________________________
        button_remove = new JButton();
        button_remove.setText("Remove");
        button_remove.setBounds(430, 490, 180, 40);
        button_remove.setOpaque(true);
        button_remove.setBackground(Color.CYAN);
        button_remove.setForeground(Color.BLACK);
        button_remove. setFont(gg);
        button_remove.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame2.add(button_remove);
        
        //DISPLAY button_________________________________________________________________________________________________
        button_display_1 = new JButton();
        button_display_1.setText("Display");
        button_display_1.setBounds(30, 600, 100, 50);
        button_display_1.setOpaque(true);
        button_display_1.setBackground(Color.CYAN);
        button_display_1.setForeground(Color.BLACK);
        button_display_1. setFont(gg);
        button_display_1.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame2.add(button_display_1);
        
        //CLEAR button______________________________________________________________________________________________________
        button_clear_1 = new JButton();
        button_clear_1.setText("Clear");
        button_clear_1.setBounds(510, 600, 100, 50);
        button_clear_1.setOpaque(true);
        button_clear_1.setBackground(Color.CYAN);
        button_clear_1.setForeground(Color.BLACK);
        button_clear_1. setFont(gg);
        button_clear_1.addActionListener(this);

        //adding jlabel to jpanel
        panel_frame2.add(button_clear_1);
              
         
        //adding jpanel to jframe
        frame.add(panel_frame2);
        
        
        /**JPanel 3**/
        
        panel_frame3= new JPanel();
        panel_frame3.setBounds(620, 0, 10, 670);
        panel_frame3.setBackground(Color.CYAN);
        //setting layout null of jpanel
        panel_frame3.setLayout(null);
        frame.add(panel_frame3);
        
       
        //setting visible to jframe
        frame.setVisible(true);
     
    }
}
