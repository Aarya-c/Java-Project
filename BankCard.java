
/*Description: -The BankCard class has five attributes, which correspond to the CardID, ClientName, IssuerBank, BankAccount
                 and BalanceAmount.
                -The ClientName,IssuerBank and BankAccount are each represented as a string of text and CardID,BalanceAmount as
                 a number.
                -The BalanceAmount, CardID,BankAccount and IssuerBank are initialized in the constructor by being assigned
                 the value of the constructor parameters. 
                -The ClientName is initialized with empty string in the constructor.
 *
 * @author : 22067120_Arya Chaudhary
 * 
 */
//A class named BankCard is created
public class BankCard
{   //Declaration of given attributes with suitable datatypes with all having private accessor modifier
    private int CardID;
    private String ClientName;
    private String IssuerBank;
    private String BankAccount;
    private int BalanceAmount;
    // defining constructor of BankCard class
    public BankCard(int BalanceAmount,int CardID,String BankAccount,String IssuerBank)
      {
         this.ClientName = "";
         this.BalanceAmount=BalanceAmount;
         this.CardID= CardID;
         this. BankAccount=BankAccount;
         this.IssuerBank=IssuerBank; 
     }
    // creating Public accessor modifier for CardID with int datatype 
    public int getCardID()
     {
         return this.CardID;
     }
     // creating Public accessor modifier for BalanceAmount with int datatype
    public int getBalanceAmount()
     {
         return this.BalanceAmount; 
     }
      // creating Public accessor modifier for BankAccount with String datatype
    public String getBankAccount()
     {
          return this.BankAccount; 
     }
      // creating Public accessor modifier for ClientName with String datatype
    public String getClientName()
     {
          return this.ClientName; 
     }
      // creating Public accessor modifier for IssuerBank with String datatype
    public String getIssuerBank()
     {
          return this.IssuerBank; 
     }
     //defining method set for ClientName
    public void setClientName(String ClientName)
     {
          this.ClientName = ClientName;
     }
     //defining method set for BalanceAmount
    public void setBalanceAmount(int BalanceAmount)
     {
          this.BalanceAmount = BalanceAmount;
     }
     //defining BankCard method
    public void BankCard()
     {
          System.out.println(this.ClientName);
          System.out.println(this.IssuerBank);
          System.out.println(this.BankAccount);
          System.out.println(this.BalanceAmount);
          System.out.println(this.CardID);
     }
     // defining display method
    public void display()
     {
        System.out.println("The Client name is :" + this.ClientName);
        System.out.println("The IssuerBank is :" + this.IssuerBank);
        System.out.println("The BankAccount is :" + this.BankAccount);
        System.out.println("The BalanceAmount is :" + this.BalanceAmount);
        System.out.println("The CardID is :" + this.CardID); 
        if(this.ClientName== ""){
            System.out.println("ClientName is empty.Please enter the Client name");
        }
        else{
            System.out.println("Client name is :" + ClientName);
        }
     }
}   
