/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{  
   
   private double interestRate;
   
   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(int anAccountNumber, double rate) 
   {  
	  super(anAccountNumber);	
      interestRate = rate;
   }

   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }


}
