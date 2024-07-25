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
 * Write a description of class newcw1 here.
 *
 * @author (your Student)
 * @version (a version number or a date)
 */
public class newcw1 implements ActionListener
{
    //declairing instance 
    private JFrame J_Frame,J_Frame2;
    
    private JPanel panel_1, panel_2,New_panel,New_panel_2,New_panel_3;
    
    private JLabel J_panel_2,J_Frame2_label,J_Frame3_label,label_Student,label_course_name,label_ID,label_course_duration,label_T_fee,label_present,label_Student_D,
                Cname_D,ID_D,Cduration_D,TFee_D,DPresent_D,Label_DOB,Label_DOE,LABEL_DOB_D,LABEL_DOE_D,LABEL_DOD_D,
                label_credit_hrs,label_modules,RModule_D,label_C_ID,label_CPresent,label_G_ID,CName_g,RAmount_D,Bill_ID,Remove_ID;
                
    private JTextField Textfield_Student,Textfield_course_name,Textfield_ID,Textfield_course_duration,Textfield_T_fee,Textfield_present,Textfield_Student_D,
                TF_Cname_D,TF_ID_D,TF_Cduration_D,TF_TFee_D,TF_DPresent_D,TF_RModule_D,Textfield_modules,
                Textfield_credit_hrs,Textfield_C_ID,Textfield_CPresent,Textfield_G_ID,TF_CName_g,TF_RAmount_D,TF_Bill_ID,TF_Remove_ID;
                
    private JButton button_add_R,button_calculate_R,button_grant_R,button_display_R,button_clear_R,button6,button7,button8,Display_button_D,Clear_button_D,
                button_add_D,Remove_button_D,Bill_button_D,Back_Button_D,GO_Back;
                
    private JComboBox DOB_R,DOE_R,DOB_D,DOE_D,DOD_D;
    
    
    //creating a main method____________________________________________________________________________
    public static void main(String [] args)
    {
        newcw1 J_Frame = new newcw1();
        J_Frame.Home_GUI();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //Add regualr student button _________________________________________________________________   
        if(e.getSource() == button_add_R)
        {
            try{
                
                //student Student TEXTFIELD
                String Student = Textfield_Student.getText();
                //course_name Student TEXTFIELD
                String course_name = Textfield_course_name.getText();
                //enrollment id TEXTFIELD
                int ID = Integer.valueOf(Textfield_ID.getText());
                //credit_hrs HOURS TEXTFIELD
                int credit_hrs = Integer.valueOf(Textfield_credit_hrs.getText());
                //course_name course_duration TEXTFIELD
                int course_duration = Integer.valueOf(Textfield_course_duration.getText());
                //TUITION T_fee TEXTFIELD
                int T_fee = Integer.valueOf(Textfield_T_fee.getText());
                //days present TEXTFIELD
                int days_present = Integer.valueOf(Textfield_present.getText());
                // number of modules TEXTFIELD
                int modules = Integer.valueOf(Textfield_modules.getText());
            
                // date of BIRTH
                String box_B = DOB_R.getSelectedItem().toString();
                
                // date of ENROLLMENT
                String box_E = DOE_R.getSelectedItem().toString();
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Enrollment ID."); 
                }
                //credit hours
                if(Textfield_credit_hrs.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Number of credit hours."); 
                }
                // course duration
                if(Textfield_course_duration.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Course duration."); 
                }
                // tuition fee
                if(Textfield_T_fee.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Tuition fee."); 
                }
                // days present
                if(Textfield_present.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Days present."); 
                }
                // no.of modules
                if(Textfield_modules.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Number of modules."); 
                }
                //student name
                if(Textfield_Student.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Student name."); 
                }
                // course name
                if(Textfield_course_name.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_1, "enter Course name."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_1, "Your data is incorrect.Please enter valid data"); 
                }
            }
            
        }
        //calculate BUTTON______________________________________________________________________________________
        else if(e.getSource() == button_calculate_R)
        {
            try{
                //enrollment id TEXTFIELD
                int C_ID = Integer.valueOf(Textfield_C_ID.getText());
                //days present TEXTFIELD
                int days_CPresent = Integer.valueOf(Textfield_CPresent.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_C_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "Enter Enrollment ID."); 
                }
                // days present
                if(Textfield_CPresent.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "Enter Days present."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_1, "Your data is incorrect.Please enter valid data"); 
                }
            }
        }
        //GRANT BUTTON_____________________________________________________________________________________________
        else if(e.getSource() == button_grant_R)
        {
            try{
                //enrollment id TEXTFIELD
                int G_ID = Integer.valueOf(Textfield_G_ID.getText());
                //course_name Student TEXTFIELD
                String Days_present = TF_CName_g.getText();
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(Textfield_G_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_1, "Enter Enrollment ID."); 
                }
                // course name
                if(TF_CName_g.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_1, "Enter Course name."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_1, "Your data is incorrect.Please enter valid data"); 
                }
            }
        }
        
        //DISPLAY BUTTON___________________________________________________________________________________________
        else if(e.getSource() == button_display_R)
        {

        }
        //CLEAR BUTTON_______________________________________________________________________________________________
        else if(e.getSource() == button_clear_R)
        {
            Textfield_Student.setText("");
            Textfield_course_name.setText("");
            Textfield_ID.setText("");
            Textfield_credit_hrs.setText("");
            Textfield_course_duration.setText("");
            Textfield_T_fee.setText("");
            Textfield_present.setText("");
            Textfield_modules.setText("");
            Textfield_C_ID.setText("");
            Textfield_CPresent.setText("");
            Textfield_G_ID.setText("");
            TF_CName_g.setText("");
          
        }
        //BACK BUTTON______________________________________________________________________________________________
        else if(e.getSource() == GO_Back)
        {
            Home_GUI2();
        }
        //Add DROPOUT BUTTON_________________________________________________________________________________________
        else if(e.getSource() == button_add_D)
        {
            try{
                //student Student TEXTFIELD
                String Student_D = Textfield_Student_D.getText();
                //course_name Student TEXTFIELD
                String course_name_D = TF_Cname_D.getText();
                //enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(TF_ID_D.getText());
                //TUITION T_fee TEXTFIELD
                int T_fee_D = Integer.valueOf(TF_TFee_D.getText());
                //course_duration TEXTFIELD
                int course_duration_D = Integer.valueOf(TF_Cduration_D.getText());
                //REMAINING AMOUNT TEXTFIELD
                int R_AMOUNT_D = Integer.valueOf(TF_RAmount_D.getText());
                //days present TEXTFIELD
                int days_present_D = Integer.valueOf(TF_DPresent_D.getText());
                // number of modules TEXTFIELD
                int modules_D = Integer.valueOf(TF_RModule_D.getText());
                
                // date of BIRTH 
                String box_B2 = DOB_D.getSelectedItem().toString();
                
                // date of ENROLLMENT 
                String box_E2 = DOE_D.getSelectedItem().toString();
                
                // date of DROPOUT 
                String box_D = DOD_D.getSelectedItem().toString();
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(TF_ID_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Enrollment ID."); 
                }
                //remaining amount
                if(TF_RAmount_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Remaining amount."); 
                }
                // course duration
                if(TF_Cduration_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Course duration."); 
                }
                // tuition fee
                if(TF_TFee_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Tuition fee ."); 
                }
                // days present
                if(TF_DPresent_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Days present."); 
                }
                // no.of modules
                if(TF_RModule_D.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Number of modules."); 
                }
                //student name
                if(Textfield_Student_D.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Student name ."); 
                }
                // course name
                if(TF_Cname_D.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Course name."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_2, "Your data is incorrect.Please enter valid data"); 
                }
            } 
            
        }
        //PAY THE BILL BUTTON________________________________________________________________________________________
        else if(e.getSource() == Bill_button_D)
        {
            try{
                //enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(TF_Bill_ID.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(TF_Bill_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Enrollment ID."); 
                } 
                else
                {
                    JOptionPane.showMessageDialog(panel_2, "Your data is incorrect.Please enter valid data"); 
                }
            }
        }
        //REMOVE BUTTON_______________________________________________________________________________________________
        else if(e.getSource() == Remove_button_D)
        {
            try{
                //enrollment id TEXTFIELD
                int ID_D = Integer.valueOf(TF_Remove_ID.getText());
            }catch(NumberFormatException exception)
            {
                //enrollment ID
                if(TF_Remove_ID.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_2, "Enter Enrollment ID."); 
                } 
                else
                {
                    JOptionPane.showMessageDialog(panel_2, "Your data is incorrect.Please enter valid data"); 
                }
            }
        }
        //DISPLAY BUTTON______________________________________________________________________________________________
        else if(e.getSource() == Display_button_D)
        {

        }
        //CLEAR BUTTON______________________________________________________________________________________________
        else if(e.getSource() == Clear_button_D)
        {
            
            Textfield_Student_D.setText("");
            TF_Cname_D.setText("");
            TF_ID_D.setText("");
            TF_TFee_D.setText("");
            TF_Cduration_D.setText("");
            TF_DPresent_D.setText("");
            TF_RModule_D.setText("");
            TF_RAmount_D.setText("");
            TF_Bill_ID.setText("");
            TF_Remove_ID.setText("");

        }
        //BACK BUTTON______________________________________________________________________________________________
        else if(e.getSource() == Back_Button_D)
        {
            Home_GUI();
        }
        
    }
    public void Home_GUI()
    {
       //jJ_Frame of Home_GUI
        J_Frame = new JFrame();
        J_Frame.setTitle("Regular_GUI");
        J_Frame.setBounds(350, 0, 800, 700);
        J_Frame.setResizable(false);
        J_Frame.setLayout(null);
        

        panel_1= new JPanel();
        panel_1.setBounds(10, 0, 780, 670);
        panel_1.setBackground(Color.PINK);
        //setting layout null of jpanel
        panel_1.setLayout(null);
        
        J_panel_2 = new JLabel("REGULAR");
        J_panel_2.setBounds(320, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.CENTER_BASELINE,20);
        J_panel_2. setFont(hh);
        //adding jlabel to jpanel
        panel_1.add(J_panel_2);
        
        // client Student of debit card method
        label_Student = new JLabel("Student Name");
        label_Student.setBounds(50, 100, 180, 30);
        Font L_font = new Font("Arial",Font.PLAIN,16);
        label_Student. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_Student);
        
        Textfield_Student= new JTextField();
        Textfield_Student.setBounds(155, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_Student);
        
        label_course_name = new JLabel("Course name");
        label_course_name.setBounds(50, 140, 100, 30);
        label_course_name. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_course_name);
        
        Textfield_course_name= new JTextField();
        Textfield_course_name.setBounds(155, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_course_name);
        
        label_ID = new JLabel("Enrollment ID");
        label_ID.setBounds(50, 180, 100, 30);
        label_ID. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_ID);
        
        Textfield_ID= new JTextField();
        Textfield_ID.setBounds(155, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_ID);
        
        
        label_T_fee = new JLabel("Tuition fee");
        label_T_fee.setBounds(50, 220, 100, 30);
        label_T_fee. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_T_fee);
        
        Textfield_T_fee= new JTextField();
        Textfield_T_fee.setBounds(155, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_T_fee);
        
        
        
        label_course_duration = new JLabel("Course duration");
        label_course_duration.setBounds(430, 100, 180, 30);
        label_course_duration. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_course_duration);
        
        Textfield_course_duration= new JTextField();
        Textfield_course_duration.setBounds(610, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_course_duration);
        
        label_present = new JLabel("Days present");
        label_present.setBounds(430, 180, 100, 30);
        label_present. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_present);
        
        Textfield_present= new JTextField();
        Textfield_present.setBounds(610, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_present);
    
        label_credit_hrs = new JLabel("credit hours");
        label_credit_hrs.setBounds(430, 140, 180, 30);
        label_credit_hrs. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_credit_hrs);
        
        Textfield_credit_hrs= new JTextField();
        Textfield_credit_hrs.setBounds(610, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_credit_hrs);
        
        
        label_modules = new JLabel("No. of modules");
        label_modules.setBounds(430, 220, 180, 30);
        label_modules. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_modules);
        
        Textfield_modules = new JTextField();
        Textfield_modules.setBounds(610, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_modules);
        
        
        //FOR CALCULATION BUTTON______________________________________________________________________
        label_C_ID = new JLabel("Enrollment ID");
        label_C_ID.setBounds(50, 410, 100, 30);
        label_C_ID. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_C_ID);
        
        Textfield_C_ID= new JTextField();
        Textfield_C_ID.setBounds(155, 410, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_C_ID);
        
        
        label_CPresent = new JLabel("Days present");
        label_CPresent.setBounds(430, 410, 100, 30);
        label_CPresent. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_CPresent);
        
        Textfield_CPresent= new JTextField();
        Textfield_CPresent.setBounds(535, 410, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_CPresent);
        
        
        
        
        //FOR GRANT BUTTON___________________________________________________________________________
        label_G_ID = new JLabel("Enrollment ID");
        label_G_ID.setBounds(50, 540, 100, 30);
        label_G_ID. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(label_G_ID);
        
        Textfield_G_ID= new JTextField();
        Textfield_G_ID.setBounds(155, 540, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(Textfield_G_ID);
        
        
        CName_g = new JLabel("Course name");
        CName_g.setBounds(430, 540, 100, 30);
        CName_g. setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(CName_g);
        
        TF_CName_g= new JTextField();
        TF_CName_g.setBounds(535, 540, 140, 25);
        //adding jtextfield to jpanel
        panel_1.add(TF_CName_g);
        
        
        //Date of birth_________________________________________________________________________________
        Label_DOB = new JLabel();
        Label_DOB.setText("Date of birth:");
        Label_DOB.setBounds(50,260,150,30);
        Label_DOB.setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(Label_DOB);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980; i--)
        {
            year.addElement(String.valueOf(i));
        }
        DOB_R = new JComboBox(year);
        DOB_R.setBounds(180,260,100,30);
        //adding combobox to jpanel
        panel_1.add(DOB_R);
        
        //Date of enrollment__________________________________________________________________________
        Label_DOE = new JLabel();
        Label_DOE.setText("Date of enrollment:");
        Label_DOE.setBounds(430,260,150,30);
        Label_DOE.setFont(L_font);
        //adding jlabel to jpanel
        panel_1.add(Label_DOE);
        
        DOE_R = new JComboBox(year);
        DOE_R.setBounds(630,260,100,30);
        //adding combobox to jpanel
        panel_1.add(DOE_R);
        
        
        //add button__________________________________________________________________________________
        button_add_R = new JButton();
        button_add_R.setText("Add Student");
        button_add_R.setBounds(310, 320, 200, 50);
        button_add_R.setOpaque(true);
        button_add_R.setBackground(Color.WHITE);
        button_add_R.setForeground(Color.BLACK);
        Font B_font = new Font("Times new Roman",Font.BOLD,18);
        button_add_R. setFont(B_font);
        button_add_R.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(button_add_R);
        
        //CALCULATE button______________________________________________________________________________
        button_calculate_R = new JButton();
        button_calculate_R.setText("Calculate percentage ");
        button_calculate_R.setBounds(310, 460, 200, 50);
        button_calculate_R.setOpaque(true);
        button_calculate_R.setBackground(Color.WHITE);
        button_calculate_R.setForeground(Color.BLACK);
        button_calculate_R. setFont(B_font);
        button_calculate_R.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(button_calculate_R);
        
        //GRANT button__________________________________________________________________________________
        button_grant_R = new JButton();
        button_grant_R.setText("Grant certifiacte");
        button_grant_R.setBounds(320, 600, 180, 50);
        button_grant_R.setOpaque(true);
        button_grant_R.setBackground(Color.WHITE);
        button_grant_R.setForeground(Color.BLACK);
        button_grant_R. setFont(B_font);
        button_grant_R.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(button_grant_R);
        
        //DISPLAY button ___________________________________________________________________________________
        button_display_R = new JButton();
        button_display_R.setText("Display");
        button_display_R.setBounds(610, 600, 100, 50);
        button_display_R.setOpaque(true);
        button_display_R.setBackground(Color.WHITE);
        button_display_R.setForeground(Color.BLACK);
        button_display_R. setFont(B_font);
        button_display_R.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(button_display_R);
        
        //CLEAR button__________________________________________________________________________________
        button_clear_R = new JButton();
        button_clear_R.setText("Clear");
        button_clear_R.setBounds(30, 600, 100, 50);
        button_clear_R.setOpaque(true);
        button_clear_R.setBackground(Color.WHITE);
        button_clear_R.setForeground(Color.BLACK);
        button_clear_R. setFont(B_font);
        button_clear_R.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(button_clear_R);
        
        
        //BACK button__________________________________________________________________________________
        GO_Back = new JButton();
        GO_Back.setText("Back");
        GO_Back.setBounds(610, 20, 100, 50);
        GO_Back.setOpaque(true);
        GO_Back.setBackground(Color.WHITE);
        GO_Back.setForeground(Color.RED);
        GO_Back. setFont(B_font);
        GO_Back.addActionListener(this);
        //adding jlabel to jpanel
        panel_1.add(GO_Back);
        

        //adding jpanel to jJ_Frame____________________________________________________________
        J_Frame.add(panel_1);
        
        
        /**JPanel 2**/
        
        New_panel= new JPanel();
        New_panel.setBounds(620, 0, 10, 670);
        New_panel.setBackground(Color.CYAN);
        //setting layout null of jpanel
        New_panel.setLayout(null);
        J_Frame.add(New_panel);
        
       
        //setting visible to jJ_Frame
        J_Frame.setVisible(true);
     
    }
    
    public void Home_GUI2()
    {
       //jJ_Frame of Home_GUI
        J_Frame2 = new JFrame();
        J_Frame2.setTitle("Dropout_GUI");
        J_Frame2.setBounds(350, 0,800,700);
        J_Frame2.setResizable(false);
        J_Frame2.setLayout(null);
    
        panel_2= new JPanel();
        panel_2.setBounds(10, 0, 780, 670);
        panel_2.setBackground(Color.PINK);
        //setting layout null of jpanel
        panel_2.setLayout(null);
        
        J_Frame2_label = new JLabel("DROPOUT");
        J_Frame2_label.setBounds(320, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.CENTER_BASELINE,40);
        J_Frame2_label. setFont(hh);
        //adding jlabel to jpanel
        panel_2.add(J_Frame2_label);
        
        label_Student_D = new JLabel("Student Name");
        label_Student_D.setBounds(50, 100, 180, 30);
        Font L_font = new Font("Arial",Font.PLAIN,16);
        label_Student_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(label_Student_D);
        
        Textfield_Student_D= new JTextField();
        Textfield_Student_D.setBounds(155, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(Textfield_Student_D);
        
        Cname_D = new JLabel("Course name");
        Cname_D.setBounds(50, 140, 180, 30);
        Cname_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(Cname_D);
        
        TF_Cname_D= new JTextField();
        TF_Cname_D.setBounds(155, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_Cname_D);
        
        ID_D = new JLabel("Enrollment ID");
        ID_D.setBounds(50, 180, 180, 30);
        ID_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(ID_D);
        
        TF_ID_D= new JTextField();
        TF_ID_D.setBounds(155, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_ID_D);
        
        
        TFee_D = new JLabel("Tuition fee");
        TFee_D.setBounds(50, 220, 180, 30);
        TFee_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(TFee_D);
        
        TF_TFee_D= new JTextField();
        TF_TFee_D.setBounds(155, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_TFee_D);
        
        Cduration_D = new JLabel("Course Duration");
        Cduration_D.setBounds(430, 100, 180, 30);
        Cduration_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(Cduration_D);
        
        TF_Cduration_D = new JTextField();
        TF_Cduration_D.setBounds(610, 100, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_Cduration_D);
        
        DPresent_D = new JLabel("Days present");
        DPresent_D.setBounds(430, 180, 180, 30);
        DPresent_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(DPresent_D);
        
        TF_DPresent_D= new JTextField();
        TF_DPresent_D.setBounds(610, 180, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_DPresent_D);
    
        
        RModule_D = new JLabel("No. of remaining modules");
        RModule_D.setBounds(430, 220, 200, 30);
        RModule_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(RModule_D);
        
        TF_RModule_D = new JTextField();
        TF_RModule_D.setBounds(610, 220, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_RModule_D);
        
        RAmount_D = new JLabel("Remaining amount");
        RAmount_D.setBounds(430, 140, 180, 30);
        RAmount_D. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(RAmount_D);
        
        TF_RAmount_D = new JTextField();
        TF_RAmount_D.setBounds(610, 140, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_RAmount_D);
        
        
        //FOR BILL BUTTON___________________________________________________________________________
        Bill_ID = new JLabel("Enrollment ID");
        Bill_ID.setBounds(50, 430, 100, 30);
        Bill_ID. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(Bill_ID);
        
        TF_Bill_ID= new JTextField();
        TF_Bill_ID.setBounds(155, 430, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_Bill_ID);
        
        
        
        //FOR REMOVE BUTTON___________________________________________________________________________
        Remove_ID = new JLabel("Enrollment ID");
        Remove_ID.setBounds(50, 500, 100, 30);
        Remove_ID. setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(Remove_ID);
        
        TF_Remove_ID= new JTextField();
        TF_Remove_ID.setBounds(155, 500, 140, 25);
        //adding jtextfield to jpanel
        panel_2.add(TF_Remove_ID);
        
        
        
        
        //Date of birth_________________________________________________________________________________
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980; i--)
        {
            year.addElement(String.valueOf(i));
        }

        LABEL_DOB_D = new JLabel();
        LABEL_DOB_D.setText("Date of birth:");
        LABEL_DOB_D.setBounds(50,260,150,30);
        LABEL_DOB_D.setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(LABEL_DOB_D);
        
        
        DOB_D = new JComboBox(year);
        DOB_D.setBounds(180,260,100,30);
        //adding combobox to jpanel
        panel_2.add(DOB_D);
              
        
        //Date of enrollment____________________________________________________________________________
        LABEL_DOE_D = new JLabel();
        LABEL_DOE_D.setText("Date of enrollment:");
        LABEL_DOE_D.setBounds(50,300,150,30);
        LABEL_DOE_D.setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(LABEL_DOE_D);
        
        DOE_D = new JComboBox(year);
        DOE_D.setBounds(180,300,100,30);
        //adding combobox to jpanel
        panel_2.add(DOE_D);
        
        
        //Date of dropout_________________________________________________________________________________
        LABEL_DOD_D = new JLabel();
        LABEL_DOD_D.setText("Date of dropout:");
        LABEL_DOD_D.setBounds(430,260,150,30);
        LABEL_DOD_D.setFont(L_font);
        //adding jlabel to jpanel
        panel_2.add(LABEL_DOD_D);
        
        DOD_D = new JComboBox(year);
        DOD_D.setBounds(610,260,100,30);
        //adding combobox to jpanel
        panel_2.add(DOD_D);
        
        
        
        //add button__________________________________________________________________________________
        button_add_D = new JButton();
        button_add_D.setText("Add Student");
        button_add_D.setBounds(310, 320, 200, 50);
        button_add_D.setOpaque(true);
        button_add_D.setBackground(Color.CYAN);
        button_add_D.setForeground(Color.BLACK);
        Font B_font = new Font("Times new Roman",Font.BOLD,18);
        button_add_D. setFont(B_font);
        button_add_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(button_add_D);
        
        
        //BILL button______________________________________________________________________________
        Bill_button_D = new JButton();
        Bill_button_D.setText("Pay bill ");
        Bill_button_D.setBounds(310, 460, 200, 50);
        Bill_button_D.setOpaque(true);
        Bill_button_D.setBackground(Color.CYAN);
        Bill_button_D.setForeground(Color.BLACK);
        Bill_button_D. setFont(B_font);
        Bill_button_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(Bill_button_D);
        
        //REMOVE button__________________________________________________________________________________
        Remove_button_D = new JButton();
        Remove_button_D.setText("Remove");
        Remove_button_D.setBounds(320, 600, 180, 50);
        Remove_button_D.setOpaque(true);
        Remove_button_D.setBackground(Color.CYAN);
        Remove_button_D.setForeground(Color.BLACK);
        Remove_button_D. setFont(B_font);
        Remove_button_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(Remove_button_D);
        
        //DISPLAY button_________________________________________________________________________________________________
        Display_button_D = new JButton();
        Display_button_D.setText("Display");
        Display_button_D.setBounds(610, 600, 100, 50);
        Display_button_D.setOpaque(true);
        Display_button_D.setBackground(Color.CYAN);
        Display_button_D.setForeground(Color.BLACK);
        Display_button_D. setFont(B_font);
        Display_button_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(Display_button_D);
        
        //CLEAR button______________________________________________________________________________________________________
        Clear_button_D = new JButton();
        Clear_button_D.setText("Clear");
        Clear_button_D.setBounds(30, 600, 100, 50);
        Clear_button_D.setOpaque(true);
        Clear_button_D.setBackground(Color.WHITE);
        Clear_button_D.setForeground(Color.RED);
        Clear_button_D. setFont(B_font);
        Clear_button_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(Clear_button_D);
        
        //CLEAR button______________________________________________________________________________________________________
        Back_Button_D = new JButton();
        Back_Button_D.setText("Back");
        Back_Button_D.setBounds(610, 20, 100, 50);
        Back_Button_D.setOpaque(true);
        Back_Button_D.setBackground(Color.WHITE);
        Back_Button_D.setForeground(Color.RED);
        Back_Button_D. setFont(B_font);
        Back_Button_D.addActionListener(this);
        //adding jlabel to jpanel
        panel_2.add(Back_Button_D);
              
         
        //adding jpanel to jJ_Frame
        J_Frame2.add(panel_2);
        
        /**JPanel 2**/
        
        New_panel_2= new JPanel();
        New_panel_2.setBounds(790, 0, 10, 670);
        New_panel_2.setBackground(Color.CYAN);
        //setting layout null of jpanel
        New_panel_2.setLayout(null);
        J_Frame2.add(New_panel_2);
        
        New_panel_3= new JPanel();
        New_panel_3.setBounds(0, 0, 10, 670);
        New_panel_3.setBackground(Color. CYAN);
        //setting layout null of jpanel
        New_panel_3.setLayout(null);
        J_Frame2.add(New_panel_3);
        
        //setting visible to jJ_Frame
        J_Frame2.setVisible(true);
     
    }
}
