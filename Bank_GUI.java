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
/*Description: - The Bank_GUI class is for the creation of GUI: Home_GUI, DebitCard and CreditCard.This class will be responsible for creating
 *               a graphical user interface (GUI) that enables users to interact with a system designed to store and manage Bank Card 
 *               information within an ArrayList. 
 *
 * @author : 22067120_Arya Chaudhary
 * 
 */
public class Bank_GUI implements ActionListener
{
    //declairing instance variable of Debit Card
    private JFrame obj;
    private JPanel panel_obj;
    private JLabel label_debit;
    private JLabel label_name;
    private JLabel label_account;
    private JLabel label_Id;
    private JLabel label_Id_W;
    private JLabel label_bank;
    private JLabel label_amount;
    private JLabel label_number;
    private JLabel label_number_W;
    private JLabel label_Withdrawal;
    private JLabel label_date;
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
    private JFrame obj1;
    private JPanel panel_obj1;
    private JLabel label_debit1;
    private JLabel label_name1;
    private JLabel label_account1;
    private JLabel label_Id1;
    private JLabel label_Id1_S;
    private JLabel label_Id1_C;
    private JLabel label_interest1;
    private JLabel label_limit1;
    private JLabel label_bank1;
    private JLabel label_amount1;
    private JLabel label_number1;
    private JLabel label_Withdrawal1;
    private JLabel label_date1;
    private JLabel label_grace1;
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
    private JFrame obj2;
    private JPanel panel_obj2;
    private JButton JButton_credit;
    private JButton JButton_debit;
    
    
    //making a arraylist for the BankCard class type
    ArrayList<BankCard> Alist = new ArrayList<BankCard>();
    
    //BUTTON FUNCTIONING
    /**
     * Method actionPerformed
     *
     * @param e A parameter
     */
    //creating a main method
    public static void main(String [] args)
    {
        Bank_GUI obj = new Bank_GUI();
        obj.Home_GUI();
    }
    public void actionPerformed(ActionEvent e)
    {
        //Add debit card button    
        if(e.getSource() == JButton_add)
        {
            try
            {
                
                //logic for add debitcard button
           
                //changing string value into integer of balance amount
                int balance_amount = Integer.valueOf(Textfield_amount.getText() );
           
                //changing string value into integer of card id
                int card_id = Integer.valueOf(Textfield_Id.getText() );
            
                //text field of pin number
                int pin_number = Integer.valueOf(Textfield_number.getText());
           
                //text field of bank account
                String bank_account = Textfield_account.getText();
           
                //text field of issuer bank
                String issuer_bank = Textfield_bank.getText();
           
                //text field of client name
                String client_name = Textfield_name.getText();
        
                boolean b = true;
            
                //Arraylist
                for (BankCard object :Alist )
                {
                    //instance operator og getting the value of DebitCard only
                    if (object instanceof DebitCard)
                    {
                        //downcasting
                        DebitCard obj_debit = (DebitCard) object;
                    
                        if(obj_debit.getCardID() == card_id)
                        {
                            b = false;
                        }   
                    }   
                }
           
                if (b == true)
                {
                    //Bank account
                    if(Textfield_account.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj, "Please enter Bank account."); 
                    }
                    // Issuer bank
                    if(Textfield_bank.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj, "Please enter  Issuer bank."); 
                    }
                    //client name
                    if(Textfield_name.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj, "Please enter Client name."); 
                    }
                    else
                    {
                        //object of debitcard
                        DebitCard obj = new DebitCard(balance_amount,card_id,bank_account,issuer_bank,client_name,pin_number);
                           
                        String message_add = "Client name is: " + client_name + "\n" + " Card ID is: " +card_id + "\n" + " Issuer Bank is: " + issuer_bank+ "\n" +
                                             " Bank Account is: " +bank_account + "\n" + "Balance Amount is: " + balance_amount +"\n"+ "Pin number is: " + pin_number;
                                                    
                        //displaying messages
                        JOptionPane.showMessageDialog(panel_obj, "Debit card is successfully added" + "\n" + message_add); 
        
                        //adding the object of debit card
                        Alist.add(obj);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj, "Card ID is already added."); 
                }
            }catch(NumberFormatException exception)
            {
                //balance amount
                if(Textfield_amount.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Balance amount."); 
                }
                //card id
                if(Textfield_Id.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Card ID."); 
                }
                // pin number
                if(Textfield_number.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Pin number."); 
                }
                //Bank account
                if(Textfield_account.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Bank account."); 
                }
                // Issuer bank
                if(Textfield_bank.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter  Issuer bank."); 
                }
                //client name
                if(Textfield_name.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Client name."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter valid input."); 
                }
            }
        }
        //Display of debit card
        else if(e.getSource() == JButton_display)
        {
            //logic for display button
        
            for(BankCard DC: Alist)
            {
                //instance operator for getting the value of DebitCard only
                if(DC instanceof DebitCard)
                {
                    //Downcasting
                    DebitCard obj1 = (DebitCard) DC;
                    obj1.display();
                    if (obj1.gethasWithdrawn() == true)
                    {
                        String message2 =  "The withdraw was successful." + "\n" + "The client name is: " +obj1.getClientName() +"\n" + "The IssuerBank is: " +obj1.getIssuerBank()+ "\n" + "The BankAccount is: "+obj1.getBankAccount()+"\n" 
                        + "The BalanceAmount is: "+ obj1.getBalanceAmount()+"\n" + "The CardID is: "+obj1.getCardID() +"\n" + "The PINnumber is: " + obj1.getPINnumber()+"\n" + "The Withdrawal Amount is: " + 
                        obj1.getWithdrawalAmount()+"\n" + "The Date of Withdrawal is: "+ obj1.getDateofWithdrawal() ;
                        
                        JOptionPane.showMessageDialog(panel_obj ,message2 );

                    }
                    else
                    {
                        String message3 = "The client name is: " +obj1.getClientName() +"\n" + "The IssuerBank is: " +obj1.getIssuerBank()+ "\n" + "The BankAccount is: "+obj1.getBankAccount()+"\n" 
                        + "The BalanceAmount is: "+ obj1.getBalanceAmount()+"\n" + "The CardID is: "+obj1.getCardID() +"\n" + "The PINnumber is: " + obj1.getPINnumber();
                        
                        JOptionPane.showMessageDialog(panel_obj ,message3 );
                    }
                }
            }
                   
        }
        //Withdraw of debit card
        else if(e.getSource() == JButton_withdraw)
        {
            try
            {
                //logic for withdraw button
            
                //changing string value into integer of card id
                int card_id_w = Integer.valueOf(Textfield_Id_W.getText() );
            
                //changing string value into integer of pin number
                int pin_number_w = Integer.valueOf(Textfield_number_W.getText());
            
                //text field of balance amount
                int withdrawal_amount = Integer.valueOf(Textfield_withdrawal.getText() );
            
                // date of withdrawal 
                String box_1 = box1.getSelectedItem().toString();
                String box_2 = box2.getSelectedItem().toString();
                String box_3 = box3.getSelectedItem().toString();

                String Cbox = box_1 + "/" + box_2 +"/" +box_3;
            
            
                for(BankCard object1 : Alist)
                {
                    //instanceof operator for getting the value of DebitCard only.
                    if (object1 instanceof DebitCard)
                    {
                        //Downcasting
                        DebitCard DC = (DebitCard) object1;
                    
                        //comparision the value of Card id are same or not
                        if(DC.getCardID()== card_id_w)
                        {  
                            String message =  "The card id is:" + card_id_w + "\n" + "The withdrawal amount is:" + withdrawal_amount
                                            + "\n" + "The Date of withdrawal is:" + Cbox + "\n "+ "The PIN number is:"  + pin_number_w ;
                            JOptionPane.showMessageDialog(panel_obj ,message );
                            DC.Withdraw(withdrawal_amount, Cbox, pin_number_w);
                            //withdraw method
                            if(pin_number_w == DC.getPINnumber())
                            {
                                if(withdrawal_amount <= DC.getBalanceAmount())
                                {
                                    String message1 = "The withdraw was successful." + "\n" + "The card id is:" + card_id_w + "\n" + "The withdrawal amount is:" + withdrawal_amount
                                            + "\n" + "The Date of withdrawal is:" + Cbox + "\n "+ "Your new balance amount is :" + DC.getBalanceAmount();
                                    JOptionPane.showMessageDialog(panel_obj ,message1 );
                                    break;
                                }
                                else
                                {
                                    //message dialog
                                    JOptionPane.showMessageDialog(panel_obj ,"Your balance amount is insufficient." );
                                    break;
                                }
                            }
                            else
                            {
                                //message dialog
                                JOptionPane.showMessageDialog(panel_obj ,"Your pin number is incorrect." );
                            
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(panel_obj ,"Your Card ID does not match." );
                        }
                    
                    }
                }
            }catch(NumberFormatException exception)
            {
                // card_id_w
                if(Textfield_Id_W.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Card ID."); 
                }
                // withdrawal_amount
                if(Textfield_withdrawal.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter Withdrawal amount."); 
                }
                // pin_number_w
                if(Textfield_number_W.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter PIN Number."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj, "Please enter valid input."); 
    
                }
            }
        }
        
        //Clear of debit card
        else if(e.getSource() == JButton_clear)
        {
            //logic for clear button
           
            Textfield_name.setText("");
            Textfield_account.setText("");
            Textfield_Id.setText("");
            Textfield_Id_W.setText("");
            Textfield_amount.setText("");
            Textfield_bank.setText("");
            Textfield_number.setText("");
            Textfield_number_W.setText("");
            Textfield_withdrawal.setText("");
        }
        //Go back of debit card
        else if(e.getSource() == JButton_back)
        {
            //logic for go back button
            Home_GUI();
          
        }
        //Add credit card 
        else if(e.getSource() == JButton_add1)
        {
            try
            {
                //logic for add creditcard button
            
                //changing string value into integer of card id
                int card_id1 = Integer.valueOf(Textfield_Id1.getText());
            
                //text field of balance amount
                int balane_amount1 = Integer.valueOf(Textfield_amount1.getText());
            
                //text field of CVC number
                int CVC_number1 = Integer.valueOf(Textfield_number1.getText());
            
                //text field of interest rate
                double interest_rate1 = Double.valueOf(Textfield_interest1.getText());
            
                //text field of client name
                String client_name1 = Textfield_name1.getText();
            
                //text field of issuer bank
                String issuer_bank1 = Textfield_bank1.getText();
            
                //text field of bank account
                String bank_account1 = Textfield_account1.getText();
            
            
                //expiration date
            
                String box_4 = box4.getSelectedItem().toString();
                String box_5 = box5.getSelectedItem().toString();
                String box_6 = box6.getSelectedItem().toString();

                String box_c = box_4 +"/" + box_5 +"/"+box_6;
                boolean a = true;
                //Arraylist
                for (BankCard object1 :Alist )
                {
                    if (object1 instanceof CreditCard)
                    {
                        CreditCard obj_credit = (CreditCard) object1;
                        if(obj_credit.getCardID() == card_id1)
                        {
                            a = false;
                        }
                    
                    }
                }
            
                if (a == true)
                {
                    // Client name
                    if(Textfield_name1.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj1, "Please enter Client name."); 
                    }
                    // Issuer bank
                    if(Textfield_bank1.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj1, "Please enter Issuer bank."); 
                    }
                    // Bank Account
                    if(Textfield_account1.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(panel_obj1, "Please enter Bank Account."); 
                    }
                    else
                    {
                        //object of credit card
                        CreditCard obj1 = new CreditCard(card_id1,client_name1,issuer_bank1,bank_account1,balane_amount1,CVC_number1,
                                               interest_rate1,box_c);
                        //displaying messages 
                        
                        String messages_de_add = "Client Name is: "+client_name1+"\n"+"Card ID is: "+card_id1+"\n"+"Issuer Bank is: "+issuer_bank1+"\n"+"Bank Account is: "+bank_account1+"\n"+
                                            "Balance Amount is: "+balane_amount1+"\n"+ "CVC number is: "+CVC_number1+"\n"+"Interest rate is: "+interest_rate1+"\n"+"Expiration date is: " + box_c;
                        JOptionPane.showMessageDialog(panel_obj1, "Credit card is successfully added "+"\n" + messages_de_add); 
            
                
                        //adding the object of credit card
                       Alist.add(obj1);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Card ID is already added."); 
                }
            }catch(NumberFormatException exception)
            {
                //  Card ID
                if(Textfield_Id1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Card ID."); 
                }
                //Balance amount
                if(Textfield_amount1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Balance amount."); 
                }
                //CVC number
                if(Textfield_number1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter CVC number."); 
                }
                // Interest Rate
                if(Textfield_interest1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Interest Rate."); 
                }
                // Client name
                if(Textfield_name1.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Client name."); 
                }
                // Issuer bank
                if(Textfield_bank1.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Issuer bank."); 
                }
                // Bank Account
                if(Textfield_account1.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter Bank Account."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter valid input."); 
                }
            }
        }
        //Cancel credit card
        else if(e.getSource() == JButton_cancel1)
        {
            try
            {
                //logic for cancel creditcard button
            
                //changing string value into integer of card id
            
                int CardID_C = Integer.valueOf(Textfield_Id1_S.getText());
                for(BankCard object2 : Alist)
                {
                    //instanceof operator for getting the value of CreditCard only.
                    if (object2 instanceof CreditCard)
                    {
                        //Downcasting
                        CreditCard CC = (CreditCard) object2;
                    
                        if (CC.getCardID() == CardID_C)
                        {   
                            CC.cancelCreditCard();
                            JOptionPane.showMessageDialog(panel_obj1, "The  card has been canceled."); 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(panel_obj1, "Card ID is incorrect."); 
                        }
                    }
                }
            
            }catch(NumberFormatException exception)
            {
                //Card ID
                if(Textfield_Id1_S.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter in Card ID."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter valid input."); 
                }
            }
        } 
        //Set credit card
        else if(e.getSource() == JButton_set1)
        {
            try
            {
                //logic for set creditcard button
                double CreditLimit_S = Double.valueOf(Textfield_limit1.getText());
                int Grace_S = Integer.valueOf(Textfield_grace1.getText());
                int card_id1_S = Integer.valueOf(Textfield_Id1_C.getText());
            
                for(BankCard object3 : Alist)
                {
                    //instanceof operator for getting the value of CreditCard only.
                    if (object3 instanceof CreditCard)
                    {
                        //Downcasting
                        CreditCard CC1 = (CreditCard) object3;
                    
                        if (CC1.getCardID() == card_id1_S)
                        {   
                            
                            CC1.setCreditLimit(CreditLimit_S, Grace_S);
                        
                            String message_for_CancelCreditLimit = "The Card ID is: "   + CC1.getCardID()+ "\n" + "The Credit limit is: " +CC1.getCreditLimit() + "\n" + 
                                                               "The Grace period is: " + CC1.getGracePeriod();
                            JOptionPane.showMessageDialog(panel_obj1,message_for_CancelCreditLimit ); 
                        
                            if(CreditLimit_S <= 2.5* CC1.getBalanceAmount())
                            {
                               JOptionPane.showMessageDialog(panel_obj1, "The credit limit has been garanted.");  
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel_obj1, "Credit cannot be issued.Please enter within the credit limit."); 
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(panel_obj1, "The credit card is incorrect."); 
                        }
                    }
                }
            
            }catch(NumberFormatException exception)
            {
                //Card ID
                if(Textfield_Id1_C.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter in Card ID."); 
                }
                //Card ID
                if(Textfield_grace1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter in Grace Period."); 
                }
                //Card ID
                if(Textfield_limit1.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter in Credit Limit."); 
                }
                else
                {
                    JOptionPane.showMessageDialog(panel_obj1, "Please enter valid input."); 
                }
            }
        }
        //Clear of credit card 
        else if(e.getSource() == JButton_clear1)
        {
            //logic for clear  button
           
            Textfield_name1.setText("");
            Textfield_account1.setText("");
            Textfield_amount1.setText("");
            Textfield_interest1.setText("");
            Textfield_limit1.setText("");
            Textfield_Id1.setText("");
            Textfield_bank1.setText("");
            Textfield_number1.setText("");
            Textfield_grace1.setText("");
            Textfield_Id1_S.setText("");
            Textfield_Id1_C.setText("");
        }
        //Display of credit card
        else if(e.getSource() == JButton_display1)
        {
            //logic for display button
            for(BankCard CC3: Alist)
            {
                //instanceof operator for getting the value of CreditCard only.
                if(CC3 instanceof CreditCard)
                {
                    CreditCard obj1 = (CreditCard) CC3;
                    obj1.display();
                    if(obj1.getisGranted() ==  true)
                    {
                        
                        //MESSAGE DIALOG;
                        String message_display1 ="The Client name is : " + obj1.getClientName() +"\n" + " The IssuerBank is : " + obj1.getIssuerBank()+"\n" + "The BankAccount is : " + obj1.getBankAccount() +"\n" + "The BalanceAmount is : " + obj1.getBalanceAmount()  +"\n" 
                                            +"The CardID is : " + obj1.getCardID() +"\n"  +  "The Credit limit is: " + obj1.getCreditLimit() +"\n" + " The Grace period is: " + obj1.getGracePeriod();
                                                
                        JOptionPane.showMessageDialog(panel_obj1,message_display1 ); 
                    }
                     else
                    {

                        //MESSAGE DIALOG
                        
                        String message_display2 = "The CVCnumber is :" + obj1.getCVCnumber() +"\n" + "The InterestRate :" + obj1.getInterestRate() + "\n" + "The ExpirationDate is :" + obj1.getExpirationDate() + "\n" + "The isgranted is:" + obj1.getisGranted();
                                        
                        JOptionPane.showMessageDialog(panel_obj1,message_display2 ); 
                    }
                }  
            }
        }
        //Go back of credit card
        else if(e.getSource() == JButton_back1)
        {
            //logic for go back button
            Home_GUI();
            
        }
        //Debit card
        else if(e.getSource() == JButton_debit)
        {
            //logic for debitcard button
            DebitCard ();
            
        }
        //Credit card
        else if(e.getSource() == JButton_credit)
        {
            //logic for creditcard button
            CreditCard();
            
        }
    }
    
    public void Home_GUI()
    {
        //jframe of Home_GUI
        obj2 = new JFrame();
        obj2.setTitle("CourseWork2_GUI");
        obj2.setBounds(205, 100,750,600);
        obj2.setResizable(false);
        obj2.setLayout(null);
        
        //JPanel of Home_GUI
        panel_obj2= new JPanel();
        panel_obj2.setBounds(0, 0, 740, 590);
        panel_obj2.setBackground(Color.LIGHT_GRAY);
        //setting layout null of jpanel
        panel_obj2.setLayout(null);
        
        //debit card of Home_GUI
        JButton_debit = new JButton();
        JButton_debit.setText("Debit Card");
        JButton_debit.setBounds(200, 200, 350, 130);
        JButton_debit.setOpaque(true);
        JButton_debit.setBorder(null);
        JButton_debit.setBackground(Color.PINK);
        JButton_debit.setForeground(Color.BLACK);
        Font ff = new Font("Times new Roman",Font.BOLD,40);
        JButton_debit. setFont(ff);
        JButton_debit.addActionListener(this);
        //adding jbutton to jpanel
        panel_obj2.add(JButton_debit);
        
        //credit card of Home_GUI
        JButton_credit = new JButton();
        JButton_credit.setText("Credit Card");
        JButton_credit.setBounds(200, 400, 350, 130);
        JButton_credit.setOpaque(true);
        JButton_credit.setBorder(null);
        JButton_credit.setBackground(Color.PINK);
        JButton_credit.setForeground(Color.BLACK);
        JButton_credit. setFont(ff);
        JButton_credit.addActionListener(this);
        //adding jbutton to jpanel
        panel_obj2.add(JButton_credit);
    
        //adding jpanel to jframe
        obj2.add(panel_obj2);
        //setting visible to jframe
        obj2.setVisible(true);
    }
    
    //creating a method for debit card
    public void DebitCard()
    {
        //creating a JFrame
        obj = new JFrame();
        obj.setTitle("DebitCard_GUI");
        obj.setBounds(205, 0,800,670);
        obj.setResizable(false);
        obj.setLayout(null);
        //creating a JPanel 
        panel_obj= new JPanel();
        panel_obj.setBounds(0, 0, 800, 660);
        panel_obj.setBackground(Color.LIGHT_GRAY);
        panel_obj.setLayout(null);
        
        //creating a JLabel of debit card method
        label_debit = new JLabel("Debit Card");
        label_debit.setBounds(350, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.BOLD,20);
        label_debit. setFont(hh);
        //adding jlabel to jpanel
        panel_obj.add(label_debit);
        
        // client name of debit card method
        label_name = new JLabel("Client Name");
        label_name.setBounds(50, 100, 100, 30);
        Font ff = new Font("Arial",Font.PLAIN,13);
        label_name. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_name);
        
        Textfield_name= new JTextField();
        Textfield_name.setBounds(160, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_name);
        
        //bank account of debit card method
        label_account = new JLabel("Bank Account");
        label_account.setBounds(50, 150, 100, 30);
        label_account. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_account);
        
        Textfield_account= new JTextField();
        Textfield_account.setBounds(160, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_account);
        
        //balance amount of debit card method
        label_amount = new JLabel("Balance Amount");
        label_amount.setBounds(50, 200, 130, 30);
        label_amount. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_amount);
        
        Textfield_amount= new JTextField();
        Textfield_amount.setBounds(160, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_amount);
        
        //withdrawal amount of debit card method
        label_Withdrawal = new JLabel("Withdrawal Amount");
        label_Withdrawal.setBounds(50, 400, 150, 30);
        label_Withdrawal. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_Withdrawal);
        
        Textfield_withdrawal= new JTextField();
        Textfield_withdrawal.setBounds(180, 400, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_withdrawal);
        
        //card_id of debit card method
        label_Id = new JLabel("Card Id");
        label_Id.setBounds(490, 100, 100, 30);
        label_Id. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_Id);
        
        Textfield_Id= new JTextField();
        Textfield_Id.setBounds(580, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_Id);
        
        //card_id of debit card method for withdraw
        label_Id_W = new JLabel("Card Id");
        label_Id_W.setBounds(50, 350, 100, 30);
        label_Id_W. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_Id_W);
        
        Textfield_Id_W= new JTextField();
        Textfield_Id_W.setBounds(180, 350, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_Id_W);
        
        //Issuer bank of debit card method
        label_bank = new JLabel("Issuer Bank");
        label_bank.setBounds(490, 150, 100, 30);
        label_bank. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_bank);
        
        Textfield_bank= new JTextField();
        Textfield_bank.setBounds(580, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_bank);
        
        //PIN number of debit card method
        label_number = new JLabel("PIN number");
        label_number.setBounds(490, 200, 100, 30);
        label_number. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_number);
        
        Textfield_number= new JTextField();
        Textfield_number.setBounds(580, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_number);
        
        //PIN number of debit card method for withdraw
        label_number_W = new JLabel("PIN number");
        label_number_W.setBounds(50, 450, 100, 30);
        label_number_W. setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_number_W);
        
        Textfield_number_W= new JTextField();
        Textfield_number_W.setBounds(180, 450, 170, 25);
        //adding jtextfield to jpanel
        panel_obj.add(Textfield_number_W);
        
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
        panel_obj.add(JButton_add);
        
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
        panel_obj.add(JButton_display);
        
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
        panel_obj.add(JButton_withdraw);
        
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
        panel_obj.add(JButton_clear);
        
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
        panel_obj.add(JButton_back);
        
        //date of withdrwal of debit card method
        label_date = new JLabel();
        label_date.setText("Date Of Withdrawal:");
        label_date.setBounds(50,500,150,30);
        label_date.setFont(ff);
        //adding jlabel to jpanel
        panel_obj.add(label_date);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980 ;i--)
        {
            year.addElement(String.valueOf(i));
        }
        box1 = new JComboBox(year);
        box1.setBounds(370,500,100,30);
        //adding jcombobox to jpanel
        panel_obj.add(box1);
            
        String[] month = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        box2 = new JComboBox(month);
        box2.setBounds(250,500,120,30);
        panel_obj.add(box2);
        //adding jcombobox to jpanel
        panel_obj.add(box2);
        
        DefaultComboBoxModel<String> days = new DefaultComboBoxModel<>();
        for (int i = 1; i<=31 ;i++)
        {
            days.addElement(String.valueOf(i));
        }
        
        box3 = new JComboBox(days);
        box3.setBounds(180,500,70,30);
        panel_obj.add(box3);
        //adding jcombobox to jpanel
        panel_obj.add(box3);
        
    
        

        //adding jpanel in jframe
        obj.add(panel_obj);
        
        obj.setVisible(true);
    }
    
    public void CreditCard()
    {
        obj1 = new JFrame();
        obj1.setTitle("CreditCard_GUI");
        obj1.setBounds(205, 0,800,670);
        obj1.setResizable(false);
        obj1.setLayout(null);
        //JPanel of credit card method
        panel_obj1= new JPanel();
        panel_obj1.setBounds(0, 0, 800,660);
        panel_obj1.setBackground(Color.LIGHT_GRAY);
        panel_obj1.setLayout(null);
        
        //JLabel of credit card method 
        label_debit1 = new JLabel("Credit Card");
        label_debit1.setBounds(380, 5, 400, 60);
        Font hh = new Font("Times new Roman",Font.BOLD,20);
        label_debit1. setFont(hh);
        //adding jlabel to jpanel
        panel_obj1.add(label_debit1);
        
        //client name of credit card method
        label_name1 = new JLabel("Client Name");
        label_name1.setBounds(50, 100, 100, 30);
        Font ff = new Font("Arial",Font.PLAIN,13);
        label_name1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_name1);
        
        Textfield_name1= new JTextField();
        Textfield_name1.setBounds(160, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_name1);
        
        //bank account of credit card method
        label_account1 = new JLabel("Bank Account");
        label_account1.setBounds(50, 150, 100, 30);
        label_account1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_account1);
        
        Textfield_account1 = new JTextField();
        Textfield_account1.setBounds(160, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_account1);
        
        //balance amount of credit card method
        label_amount1 = new JLabel("Balance Amount");
        label_amount1.setBounds(50, 200, 130, 30);
        label_amount1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_amount1);
        
        Textfield_amount1= new JTextField();
        Textfield_amount1.setBounds(160, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_amount1);
        
        //interest rate of credit card method
        label_interest1 = new JLabel("Interest rate");
        label_interest1.setBounds(490, 250, 150, 30);
        label_interest1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_interest1);
        
        Textfield_interest1= new JTextField();
        Textfield_interest1.setBounds(580, 250, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_interest1);
        
        //credit limit of credit card method
        label_limit1 = new JLabel("Credit limit");
        label_limit1.setBounds(50, 440, 150, 30);
        label_limit1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_limit1);
        
        Textfield_limit1= new JTextField();
        Textfield_limit1.setBounds(160, 440, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_limit1);
        
        //card id of credit card method
        label_Id1 = new JLabel("Card Id");
        label_Id1.setBounds(490, 100, 100, 30);
        label_Id1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_Id1);
        
        Textfield_Id1= new JTextField();
        Textfield_Id1.setBounds(580, 100, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_Id1);
        
        //issuer bank of credit card method
        label_bank1 = new JLabel("Issuer Bank");
        label_bank1.setBounds(490, 150, 100, 30);
        label_bank1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_bank1);
        
        Textfield_bank1= new JTextField();
        Textfield_bank1.setBounds(580, 150, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_bank1);
        
        //CVC number of credit card method
        label_number1 = new JLabel("CVC number");
        label_number1.setBounds(490, 200, 100, 30);
        label_number1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_number1);
        
        Textfield_number1= new JTextField();
        Textfield_number1.setBounds(580, 200, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_number1);
        
        //card id of credit card method for cancel
        label_Id1_C = new JLabel("Card Id");
        label_Id1_C.setBounds(50, 390, 100, 30);
        label_Id1_C. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_Id1_C);
        
        Textfield_Id1_C = new JTextField();
        Textfield_Id1_C.setBounds(160, 390, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_Id1_C);
        
        //card id of credit card method for set
        label_Id1_S = new JLabel("Card Id");
        label_Id1_S.setBounds(490, 390, 100, 30);
        label_Id1_S. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_Id1_S);
        
        Textfield_Id1_S = new JTextField();
        Textfield_Id1_S.setBounds(580, 390, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_Id1_S);
        
        //grace period of credit card method
        label_grace1 = new JLabel("Grace period");
        label_grace1.setBounds(50, 490, 100, 30);
        label_grace1. setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_grace1);
        
        Textfield_grace1= new JTextField();
        Textfield_grace1.setBounds(160, 490, 170, 25);
        //adding jtextfield to jpanel
        panel_obj1.add(Textfield_grace1);
        
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
        panel_obj1.add(JButton_add1);
        
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
        panel_obj1.add(JButton_cancel1);
        
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
        panel_obj1.add(JButton_set1);
        
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
        panel_obj1.add(JButton_clear1);
        
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
        panel_obj1.add(JButton_display1);
        
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
        panel_obj1.add(JButton_back1);
        
        //expiration date of credit card method
        label_date1 = new JLabel();
        label_date1.setText("Expiration date:");
        label_date1.setBounds(50,250,150,30);
        label_date1.setFont(ff);
        //adding jlabel to jpanel
        panel_obj1.add(label_date1);
        
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for (int i = 2023; i>=1980; i--)
        {
            year.addElement(String.valueOf(i));
        }
        box4 = new JComboBox(year);
        box4.setBounds(340,250,100,30);
        //adding combobox to jpanel
        panel_obj1.add(box4);
            
        String[] month = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        box5 = new JComboBox(month);
        box5.setBounds(225,250,120,30);   
        //adding combobox to jpanel
        panel_obj1.add(box5);
        
        DefaultComboBoxModel<String> days = new DefaultComboBoxModel<>();
        for (int i = 1; i<=31; i++)
        {
            days.addElement(String.valueOf(i));
        }
        box6 = new JComboBox(days);
        box6.setBounds(160,250,70,30);
        //adding combobox to jpanel
        panel_obj1.add(box6);
        
    
        
        //adding jpanel in jframe
        obj1.add(panel_obj1);
        //setting visible true to jframe
        obj1.setVisible(true);
    }
    
    
}
