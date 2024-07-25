// importing
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class class1 //implements ActionListener
{
    //declairing instance variable of Debit Card
    private JFrame frame;
    private JPanel panel_frame;
    private JLabel debit_label;
    private JLabel debit_name;
    private JLabel debit_account;
    private JLabel debit_ID;
    private JLabel debit_ID_W;
    private JLabel debit_bank;
    private JLabel debit_amount;
    private JLabel debit_number;
    private JLabel debit_number_W;
    private JLabel debit_withdrawal;
    private JLabel debit_date;
    private JTextField Textfield_name;
    private JTextField Textfield_account;
    private JTextField Textfield_amount;
    private JTextField Textfield_withdrawal;
    private JTextField Textfield_Id;
    private JTextField Textfield_Id_W;
    private JTextField Textfield_bank;
    private JTextField Textfield_number;
    private JTextField Textfield_number_W;
    private JButton JButton_add;
    private JButton JButton_display;
    private JButton JButton_clear;
    private JButton JButton_withdraw;
    private JButton JButton_back;
    private JComboBox box1;
    private JComboBox box2;
    private JComboBox box3;
    
    //declairing instance variable of Credit Card
    private JFrame frame1;
    private JPanel panel_frame1;
    private JLabel credit_label1;
    private JLabel credit_name1;
    private JLabel credit_account1;
    private JLabel credit_ID1;
    private JLabel credit_ID1_S;
    private JLabel credit_ID1_C;
    private JLabel credit_interest1;
    private JLabel credit_limit1;
    private JLabel credit_bank1;
    private JLabel credit_amount1;
    private JLabel credit_number1;
    private JLabel credit_withdrawal1;
    private JLabel credit_date1;
    private JLabel credit_grace1;
    private JTextField Textfield_name1;
    private JTextField Textfield_account1;
    private JTextField Textfield_amount1;
    private JTextField Textfield_interest1;
    private JTextField Textfield_limit1;
    private JTextField Textfield_Id1;
    private JTextField Textfield_Id1_S;
    private JTextField Textfield_Id1_C;
    private JTextField Textfield_bank1;
    private JTextField Textfield_number1;
    private JTextField Textfield_grace1;
    private JButton JButton_add1;
    private JButton JButton_cancel1;
    private JButton JButton_set1;
    private JButton JButton_clear1;
    private JButton JButton_display1;
    private JButton JButton_back1;
    private JComboBox box4;
    private JComboBox box5;
    private JComboBox box6;

    //declairing instance variable of Home_GUI
    private JFrame frame2;
    private JPanel panel_frame2;
    private JButton credit_button;
    private JButton debit_button;
    
    
    //making a arraylist for the BankCard class type
    //ArrayList<BankCard> Alist = new ArrayList<BankCard>();
    
    //BUTTON FUNCTIONING
    /**
     * Method actionPerformed
     *
     * @param e A parameter
     */
    //creating a main method
    public static void main(String [] args)
    {
        Bank_GUI frame = new Bank_GUI();
        frame.Home_GUI();
    }
    public void actionPerformed(ActionEvent e)
    {
        //Add debit card button    
        if(e.getSource() == JButton_add)
        {
            
        }
        //Display of debit card
        else if(e.getSource() == JButton_display)
        {
            
        }
        //Withdraw of debit card
        else if(e.getSource() == JButton_withdraw)
        {
            
        }
        
        //Clear of debit card
        else if(e.getSource() == JButton_clear)
        {
            
        }
        //Go back of debit card
        else if(e.getSource() == JButton_back)
        {
            
          
        }
        //Add credit card 
        else if(e.getSource() == JButton_add1)
        {
            
        }
        //Cancel credit card
        else if(e.getSource() == JButton_cancel1)
        {
            
        } 
        //Set credit card
        else if(e.getSource() == JButton_set1)
        {
            
        }
        //Clear of credit card 
        else if(e.getSource() == JButton_clear1)
        {
            
        }
        //Display of credit card
        else if(e.getSource() == JButton_display1)
        {
            
        }
        //Go back of credit card
        else if(e.getSource() == JButton_back1)
        {
            
        }
        //Debit card
        else if(e.getSource() == debit_button)
        {
            
        }
        //Credit card
        else if(e.getSource() == credit_button)
        {
            
        }
    }
    public void Home_GUI()
    {
        //jframe of Home_GUI
        frame2 = new JFrame();
        frame2.setTitle("CourseWork2_GUI");
        frame2.setBounds(205, 100,750,600);
        frame2.setResizable(false);
        frame2.setLayout(null);
        
        //JPanel of Home_GUI
        panel_frame2= new JPanel();
        panel_frame2.setBounds(0, 0, 740, 590);
        panel_frame2.setBackground(Color.LIGHT_GRAY);
        //setting layout null of jpanel
        panel_frame2.setLayout(null);
        
        //debit card of Home_GUI
        debit_button = new JButton();
        debit_button.setText("Debit Card");
        debit_button.setBounds(200, 200, 350, 130);
        debit_button.setOpaque(true);
        debit_button.setBorder(null);
        debit_button.setBackground(Color.PINK);
        debit_button.setForeground(Color.BLACK);
        Font ff = new Font("Times new Roman",Font.BOLD,40);
        debit_button. setFont(ff);
        debit_button.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame2.add(debit_button);
        
        //credit card of Home_GUI
        credit_button = new JButton();
        credit_button.setText("Credit Card");
        credit_button.setBounds(200, 400, 350, 130);
        credit_button.setOpaque(true);
        credit_button.setBorder(null);
        credit_button.setBackground(Color.PINK);
        credit_button.setForeground(Color.BLACK);
        credit_button. setFont(ff);
        credit_button.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame2.add(credit_button);
    
        //adding jpanel to jframe
        frame2.add(panel_frame2);
        //setting visible to jframe
        frame2.setVisible(true);
    }
    
    //creating a method for debit card
    public void DebitCard()
    {
        //creating a JFrame
        frame = new JFrame();
        frame.setTitle("DebitCard_GUI");
        frame.setBounds(205, 0,800,670);
        frame.setResizable(false);
        frame.setLayout(null);
        //creating a JPanel 
        panel_frame= new JPanel();
        panel_frame.setBounds(0, 0, 800, 660);
        panel_frame.setBackground(Color.LIGHT_GRAY);
        panel_frame.setLayout(null);
        
        //creating a JLabel of debit card method
        debit_label = new JLabel("Debit Card");
        debit_label.setBounds(350, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.BOLD,20);
        debit_label. setFont(hh);
        //adding jlabel to jpanel
        panel_frame.add(debit_label);
        
        // client name of debit card method
        debit_name = new JLabel("Client Name");
        debit_name.setBounds(50, 100, 100, 30);
        Font ff = new Font("Arial",Font.PLAIN,13);
        debit_name. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_name);
        
        Textfield_name= new JTextField();
        Textfield_name.setBounds(160, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_name);
        
        //bank account of debit card method
        debit_account = new JLabel("Bank Account");
        debit_account.setBounds(50, 150, 100, 30);
        debit_account. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_account);
        
        Textfield_account= new JTextField();
        Textfield_account.setBounds(160, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_account);
        
        //balance amount of debit card method
        debit_amount = new JLabel("Balance Amount");
        debit_amount.setBounds(50, 200, 130, 30);
        debit_amount. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_amount);
        
        Textfield_amount= new JTextField();
        Textfield_amount.setBounds(160, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_amount);
        
        //withdrawal amount of debit card method
        debit_withdrawal = new JLabel("Withdrawal Amount");
        debit_withdrawal.setBounds(50, 400, 150, 30);
        debit_withdrawal. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_withdrawal);
        
        Textfield_withdrawal= new JTextField();
        Textfield_withdrawal.setBounds(180, 400, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_withdrawal);
        
        //card_id of debit card method
        debit_ID = new JLabel("Card Id");
        debit_ID.setBounds(490, 100, 100, 30);
        debit_ID. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_ID);
        
        Textfield_Id= new JTextField();
        Textfield_Id.setBounds(580, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_Id);
        
        //card_id of debit card method for withdraw
        debit_ID_W = new JLabel("Card Id");
        debit_ID_W.setBounds(50, 350, 100, 30);
        debit_ID_W. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_ID_W);
        
        Textfield_Id_W= new JTextField();
        Textfield_Id_W.setBounds(180, 350, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_Id_W);
        
        //Issuer bank of debit card method
        debit_bank = new JLabel("Issuer Bank");
        debit_bank.setBounds(490, 150, 100, 30);
        debit_bank. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_bank);
        
        Textfield_bank= new JTextField();
        Textfield_bank.setBounds(580, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_bank);
        
        //PIN number of debit card method
        debit_number = new JLabel("PIN number");
        debit_number.setBounds(490, 200, 100, 30);
        debit_number. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_number);
        
        Textfield_number= new JTextField();
        Textfield_number.setBounds(580, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_number);
        
        //PIN number of debit card method for withdraw
        debit_number_W = new JLabel("PIN number");
        debit_number_W.setBounds(50, 450, 100, 30);
        debit_number_W. setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_number_W);
        
        Textfield_number_W= new JTextField();
        Textfield_number_W.setBounds(180, 450, 170, 25);
        //adding jtextfield to jpanel
        panel_frame.add(Textfield_number_W);
        
        //add button of debit card method
        JButton_add = new JButton();
        JButton_add.setText("Add Debit Card");
        JButton_add.setBounds(300, 250, 180, 40);
        JButton_add.setOpaque(true);
        JButton_add.setBorder(null);
        JButton_add.setBackground(Color.PINK);
        JButton_add.setForeground(Color.BLACK);
        Font gg = new Font("Times new Roman",Font.BOLD,18);
        JButton_add. setFont(gg);
        JButton_add.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(JButton_add);
        
        //display button of debit card method
        JButton_display = new JButton();
        JButton_display.setText("Display");
        JButton_display.setBounds(50, 570, 100, 50);
        JButton_display.setOpaque(true);
        JButton_display.setBorder(null);
        JButton_display.setBackground(Color.PINK);
        JButton_display.setForeground(Color.BLACK);
        JButton_display. setFont(gg);
        JButton_display.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(JButton_display);
        
        //withdraw button of debit card method
        JButton_withdraw = new JButton();
        JButton_withdraw.setText("Withdraw");
        JButton_withdraw.setBounds(620, 570, 130, 50);
        JButton_withdraw.setOpaque(true);
        JButton_withdraw.setBorder(null);
        JButton_withdraw.setBackground(Color.PINK);
        JButton_withdraw.setForeground(Color.BLACK);
        JButton_withdraw. setFont(gg);
        JButton_withdraw.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(JButton_withdraw);
        
        //clear button of debit card method
        JButton_clear = new JButton();
        JButton_clear.setText("Clear");
        JButton_clear.setBounds(360, 570, 100, 50);
        JButton_clear.setOpaque(true);
        JButton_clear.setBorder(null);
        JButton_clear.setBackground(Color.PINK);
        JButton_clear.setForeground(Color.BLACK);
        JButton_clear. setFont(gg);
        JButton_clear.addActionListener(this);
        //adding jlabel to jpanel
        panel_frame.add(JButton_clear);
        
        //go back button of debit card method
        JButton_back = new JButton();
        JButton_back.setText("Go Back");
        JButton_back.setBounds(650, 20, 100, 40);
        JButton_back.setOpaque(true);
        JButton_back.setBorder(null);
        JButton_back.setBackground(Color.PINK);
        JButton_back.setForeground(Color.BLACK);
        JButton_back. setFont(gg);
        JButton_back.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame.add(JButton_back);
        
        //date of withdrwal of debit card method
        debit_date = new JLabel();
        debit_date.setText("Date Of Withdrawal:");
        debit_date.setBounds(50,500,150,30);
        debit_date.setFont(ff);
        //adding jlabel to jpanel
        panel_frame.add(debit_date);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980 ;i--)
        {
            year.addElement(String.valueOf(i));
        }
        box1 = new JComboBox(year);
        box1.setBounds(370,500,100,30);
        //adding jcombobox to jpanel
        panel_frame.add(box1);
            
        String[] month = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        box2 = new JComboBox(month);
        box2.setBounds(250,500,120,30);
        panel_frame.add(box2);
        //adding jcombobox to jpanel
        panel_frame.add(box2);
        
        DefaultComboBoxModel<String> days = new DefaultComboBoxModel<>();
        for (int i = 1; i<=31 ;i++)
        {
            days.addElement(String.valueOf(i));
        }
        
        box3 = new JComboBox(days);
        box3.setBounds(180,500,70,30);
        panel_frame.add(box3);
        //adding jcombobox to jpanel
        panel_frame.add(box3);
        
    
        

        //adding jpanel in jframe
        frame.add(panel_frame);
        
        frame.setVisible(true);
    }
    
    public void CreditCard()
    {
        frame1 = new JFrame();
        frame1.setTitle("CreditCard_GUI");
        frame1.setBounds(205, 0,800,670);
        frame1.setResizable(false);
        frame1.setLayout(null);
        //JPanel of credit card method
        panel_frame1= new JPanel();
        panel_frame1.setBounds(0, 0, 800,660);
        panel_frame1.setBackground(Color.LIGHT_GRAY);
        panel_frame1.setLayout(null);
        
        //JLabel of credit card method 
        credit_label1 = new JLabel("Credit Card");
        credit_label1.setBounds(380, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.BOLD,20);
        credit_label1. setFont(hh);
        //adding jlabel to jpanel
        panel_frame1.add(credit_label1);
        
        //client name of credit card method
        credit_name1 = new JLabel("Client Name");
        credit_name1.setBounds(50, 100, 100, 30);
        Font ff = new Font("Arial",Font.PLAIN,13);
        credit_name1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_name1);
        
        Textfield_name1= new JTextField();
        Textfield_name1.setBounds(160, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_name1);
        
        //bank account of credit card method
        credit_account1 = new JLabel("Bank Account");
        credit_account1.setBounds(50, 150, 100, 30);
        credit_account1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_account1);
        
        Textfield_account1 = new JTextField();
        Textfield_account1.setBounds(160, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_account1);
        
        //balance amount of credit card method
        credit_amount1 = new JLabel("Balance Amount");
        credit_amount1.setBounds(50, 200, 130, 30);
        credit_amount1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_amount1);
        
        Textfield_amount1= new JTextField();
        Textfield_amount1.setBounds(160, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_amount1);
        
        //interest rate of credit card method
        credit_interest1 = new JLabel("Interest rate");
        credit_interest1.setBounds(490, 250, 150, 30);
        credit_interest1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_interest1);
        
        Textfield_interest1= new JTextField();
        Textfield_interest1.setBounds(580, 250, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_interest1);
        
        //credit limit of credit card method
        credit_limit1 = new JLabel("Credit limit");
        credit_limit1.setBounds(50, 440, 150, 30);
        credit_limit1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_limit1);
        
        Textfield_limit1= new JTextField();
        Textfield_limit1.setBounds(160, 440, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_limit1);
        
        //card id of credit card method
        credit_ID1 = new JLabel("Card Id");
        credit_ID1.setBounds(490, 100, 100, 30);
        credit_ID1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_ID1);
        
        Textfield_Id1= new JTextField();
        Textfield_Id1.setBounds(580, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_Id1);
        
        //issuer bank of credit card method
        credit_bank1 = new JLabel("Issuer Bank");
        credit_bank1.setBounds(490, 150, 100, 30);
        credit_bank1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_bank1);
        
        Textfield_bank1= new JTextField();
        Textfield_bank1.setBounds(580, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_bank1);
        
        //CVC number of credit card method
        credit_number1 = new JLabel("CVC number");
        credit_number1.setBounds(490, 200, 100, 30);
        credit_number1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_number1);
        
        Textfield_number1= new JTextField();
        Textfield_number1.setBounds(580, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_number1);
        
        //card id of credit card method for cancel
        credit_ID1_C = new JLabel("Card Id");
        credit_ID1_C.setBounds(50, 390, 100, 30);
        credit_ID1_C. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_ID1_C);
        
        Textfield_Id1_C = new JTextField();
        Textfield_Id1_C.setBounds(160, 390, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_Id1_C);
        
        //card id of credit card method for set
        credit_ID1_S = new JLabel("Card Id");
        credit_ID1_S.setBounds(490, 390, 100, 30);
        credit_ID1_S. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_ID1_S);
        
        Textfield_Id1_S = new JTextField();
        Textfield_Id1_S.setBounds(580, 390, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_Id1_S);
        
        //grace period of credit card method
        credit_grace1 = new JLabel("Grace period");
        credit_grace1.setBounds(50, 490, 100, 30);
        credit_grace1. setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_grace1);
        
        Textfield_grace1= new JTextField();
        Textfield_grace1.setBounds(160, 490, 170, 25);
        //adding jtextfield to jpanel
        panel_frame1.add(Textfield_grace1);
        
        //add button of credit card method
        JButton_add1 = new JButton();
        JButton_add1.setText("Add Credit Card");
        JButton_add1.setBounds(300, 320, 180, 40);
        JButton_add1.setOpaque(true);
        JButton_add1.setBorder(null);
        JButton_add1.setBackground(Color.PINK);
        JButton_add1.setForeground(Color.BLACK);
        Font gg = new Font("Times new Roman",Font.BOLD,16);
        JButton_add1. setFont(gg);
        JButton_add1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_add1);
        
        //cancel button of credit card method
        JButton_cancel1 = new JButton();
        JButton_cancel1.setText("Cancel Credit Card");
        JButton_cancel1.setBounds(570, 440, 180, 40);
        JButton_cancel1.setOpaque(true);
        JButton_cancel1.setBorder(null);
        JButton_cancel1.setBackground(Color.PINK);
        JButton_cancel1.setForeground(Color.BLACK);
        JButton_cancel1. setFont(gg);
        JButton_cancel1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_cancel1);
        
        //set button of credit card method
        JButton_set1 = new JButton();
        JButton_set1.setText("Set Credit Limit");
        JButton_set1.setBounds(50, 570, 150, 40);
        JButton_set1.setOpaque(true);
        JButton_set1.setBorder(null);
        JButton_set1.setBackground(Color.PINK);
        JButton_set1.setForeground(Color.BLACK);
        JButton_set1. setFont(gg);
        JButton_set1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_set1);
        
        //clear button of credit card method
        JButton_clear1 = new JButton();
        JButton_clear1.setText("Clear");
        JButton_clear1.setBounds(360, 570, 100, 40);
        JButton_clear1.setOpaque(true);
        JButton_clear1.setBorder(null);
        JButton_clear1.setBackground(Color.PINK);
        JButton_clear1.setForeground(Color.BLACK);
        JButton_clear1. setFont(gg);
        JButton_clear1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_clear1);
        
        //display button of credit card method
        JButton_display1 = new JButton();
        JButton_display1.setText("Display");
        JButton_display1.setBounds(650, 570, 100, 40);
        JButton_display1.setOpaque(true);
        JButton_display1.setBorder(null);
        JButton_display1.setBackground(Color.PINK);
        JButton_display1.setForeground(Color.BLACK);
        JButton_display1. setFont(gg);
        JButton_display1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_display1);
        
        //go back button of credit card method
        JButton_back1 = new JButton();
        JButton_back1.setText("Go Back");
        JButton_back1.setBounds(650, 20, 100, 40);
        JButton_back1.setOpaque(true);
        JButton_back1.setBorder(null);
        JButton_back1.setBackground(Color.PINK);
        JButton_back1.setForeground(Color.BLACK);
        JButton_back1. setFont(gg);
        JButton_back1.addActionListener(this);
        //adding jbutton to jpanel
        panel_frame1.add(JButton_back1);
        
        //expiration date of credit card method
        credit_date1 = new JLabel();
        credit_date1.setText("Expiration date:");
        credit_date1.setBounds(50,250,150,30);
        credit_date1.setFont(ff);
        //adding jlabel to jpanel
        panel_frame1.add(credit_date1);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980; i--)
        {
            year.addElement(String.valueOf(i));
        }
        box4 = new JComboBox(year);
        box4.setBounds(340,250,100,30);
        //adding combobox to jpanel
        panel_frame1.add(box4);
            
        String[] month = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        box5 = new JComboBox(month);
        box5.setBounds(225,250,120,30);   
        //adding combobox to jpanel
        panel_frame1.add(box5);
        
        DefaultComboBoxModel<String> days = new DefaultComboBoxModel<>();
        for (int i = 1; i<=31; i++)
        {
            days.addElement(String.valueOf(i));
        }
        box6 = new JComboBox(days);
        box6.setBounds(160,250,70,30);
        //adding combobox to jpanel
        panel_frame1.add(box6);
        
    
        
        //adding jpanel in jframe
        frame1.add(panel_frame1);
        //setting visible true to jframe
        frame1.setVisible(true);
    }
}
