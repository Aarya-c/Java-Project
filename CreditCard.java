
/*Description : -The CreditCard class is a subclass of the BankCard class and has six attributes. 
                -They are CVCnumber, CreditLimit, InterestRate, ExpirationDate, GracePeriod and isGranted.
                -The constructor accepts eight parameters which are the CardID, ClientName, IssuerBank,BankAccount, BalanceAmount 
                 ,CVCnumber, InterestRate and ExpirationDate.
                -Each of the six attributes have private accessor modifier 
 *
 * @author : 22067120_Arya Chaudhary
 * 
 */
//A class named CreditCard is created which extends BankCard class
public class CreditCard extends BankCard
{     //Declaration of given attributes with suitable datatypes with all having private accessor modifier
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate; 
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;
      // defining constructor of CreditCard class
    public CreditCard(int CardID,String ClientName,String IssuerBank,String BankAccount,int BalanceAmount,int CVCnumber,double InterestRate,String ExpirationDate)
       {
           super(BalanceAmount,CardID,BankAccount,IssuerBank); 
           super.setClientName(ClientName);// call made to method setClientName in BankCard class with ClientName as parameter
           this.CVCnumber=CVCnumber;
           this.InterestRate=InterestRate;
           this.ExpirationDate=ExpirationDate;
           this.isGranted=false;
       }
      // creating Public accessor modifier for CVCnumber with int datatype
    public int getCVCnumber()
      {
           return this.CVCnumber; 
      }
      // creating Public accessor modifier for CreditLimit with double datatype
    public double getCreditLimit()
      {
           return this.CreditLimit; 
      } 
      // creating Public accessor modifier for InterestRate with double datatype
    public double getInterestRate()
      {
           return this.InterestRate; 
      }
      // creating Public accessor modifier for ExpirationDate with String datatype
    public String getExpirationDate()
      {
           return this.ExpirationDate; 
      }
      // creating Public accessor modifier for GracePeriod with int datatype
    public int getGracePeriod()
      {
           return this.GracePeriod; 
      }
      // creating Public accessor modifier for isGranted with boolean datatype
    public boolean getisGranted()
      {
           return this.isGranted; 
      }
    // defining setCreditLimit method
    public void setCreditLimit(double CreditLimit,int GracePeriod)
      {
           if(this.CreditLimit <= 2.5* super.getBalanceAmount()){    
               this.CreditLimit=CreditLimit;
               this.GracePeriod=GracePeriod;
               this.isGranted = true;
           }
           else{
               System.out.println("Credit cannot be issued.Please enter within the credit limit.");
           }
      }

    // defining cancelCreditCard method//
    public void cancelCreditCard()
      {
           this.CVCnumber = 0;
           this.CreditLimit = 0;
           this.GracePeriod = 0;
           this.isGranted = false;
      }
    // defining display method//
    public void display()
      {
           if(isGranted==true)
           {
               super.display();//call made to display method of BankCard class//
               System.out.println("The Credit limit is:" + this.CreditLimit);
               System.out.println("The Grace period is:" + this.GracePeriod);
           }
           else{
                System.out.println("The CVCnumber is :" + this.CVCnumber);
                System.out.println("The InterestRate :" + this.InterestRate);
                System.out.println("The ExpirationDate is :" + this.ExpirationDate);
                System.out.println("The isgranted is:" + this.isGranted);
           }
      }
}
