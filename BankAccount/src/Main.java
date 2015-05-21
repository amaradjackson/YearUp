
public class Main {

	public static void main(String[] args)
	{
		//constructors for the account information
		Account savingsAccount = new Account(123, "Savings", 456);
		// adds money adds to the account and the password
		savingsAccount.UpdateAmountSecurely(500, "admin");
		//if this were to run, the print line would show calling the police
		savingsAccount.UpdateAmountSecurely(0, "thief");
		//savingsAccount.m_amount = 0;
System.out.println("Updated amount in account id " + savingsAccount.GetAccountId() + " to " + savingsAccount.GetAmount());
	//change the variables above to also match the getter and setters
	}
} 
