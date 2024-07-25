
/*Description : -The DebitCard class is also a subclass of the BankCard class and has four attributes. 
                 -They are PINnumber, WithdrawalAmount, DateofWithdrawal and hasWithdrawn.
                 -The constructor accepts six parameters which are the BalanceAmount, CardID, BankAccount,IssuerBank, ClientName 
                   and PINnumber.
                 -Each of the four attributes have private accessor modifier 

 * @author : 22067120_Arya Chaudhary
 */
//A class named DebitCard is created which extends BankCard class
public class DebitCard extends BankCard
{     //Declaration of given attributes with suitable datatypes with all having private accessor modifier
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateofWithdrawal;
    private boolean hasWithdrawn;
    // defining constructor of DebitCard class
    public DebitCard(int BalanceAmount,int CardID,String BankAccount,String IssuerBank,String ClientName,int PINnumber)
    {
       super(BalanceAmount,CardID,BankAccount,IssuerBank);
       super.setClientName(ClientName);// call made to method setClientName in BankCard class with ClientName as parameter
       this.PINnumber = PINnumber;
       this.hasWithdrawn = false;
    }
    // creating Public accessor modifier for PINnumber with int datatype
    public int getPINnumber()
    {
       return this.PINnumber; 
    }
    // creating Public accessor modifier for WithdrawalAmount with int datatype
    public int getWithdrawalAmount()
    {
       return this.WithdrawalAmount; 
    }
    // creating Public accessor modifier for DateofWithdrawal with String datatype
    public String getDateofWithdrawal()
    {
       return this.DateofWithdrawal; 
    }
    // creating Public accessor modifier for hasWithdrawn with boolean datatype
    public boolean gethasWithdrawn()
    {
       return this.hasWithdrawn; 
    }
    //defining method set for WithdrawalAmount
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
       this.WithdrawalAmount = WithdrawalAmount;
    } 
    //defining Withdraw method
    public void Withdraw(int WithdrawalAmount,String DateofWithdrawal, int PINnumber)
    {  
        int Balance = super.getBalanceAmount();
        if(this.PINnumber == PINnumber){ 
          if(WithdrawalAmount<=Balance)
          {
              this.hasWithdrawn = true;
              Balance=Balance-WithdrawalAmount;
              super.setBalanceAmount(Balance);
              this.WithdrawalAmount=WithdrawalAmount;
              this.DateofWithdrawal=DateofWithdrawal;
              //call madeto method setBalanceAmount in BankCard class with Balance as parameter
          }
        }
        else{
            System.out.println("FAILED Transiction");
        }
       
    } 
    // defining display method
    public void display()
    {
        super.display();// call made to display method of BankCard class
        System.out.println("The PINnumber :" + this.PINnumber);
        System.out.println("The Withdrawal Amount :" + this.WithdrawalAmount);
        System.out.println("The Date of Withdrawal is :" + this.DateofWithdrawal);
         if(this.hasWithdrawn == false){
            System.out.println("The BalanceAmount is :" + super.getBalanceAmount());
        }
    }
}    


   

