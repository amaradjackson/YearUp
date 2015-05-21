
public class Account
{
	//make this secure by making it private
	private int m_accountId = -1;
	private String m_accountName;
	private int m_customerId = -1;
	//making this private adds an error because the amount on the other file can't be shown
	private double m_amount = 0.0;

	public Account(int accountId, String accountName, int customerId)
	{
		//change the constructors to match the getter and setter commands
		SetAccountId(accountId);
		SetAccountName(accountName);
		SetCustomerId(customerId);
	}

	public int GetAccountId()
	{
		return m_accountId;
	}

	private void SetAccountId(int accountId)
	{
		m_accountId = accountId;
	}

	public String GetAccountName()
	{
		return m_accountName;
	}

	private void SetAccountName(String accountName)
	{
		m_accountName = accountName;
	}

	
	private  void UpdateAmount(double newAmount)
	{
		m_amount = newAmount;
	}
	
	public int GetCustomerId()
	{
		return m_customerId;
	}
	private void SetCustomerId(int customerId)
	{
		m_customerId = customerId;
	}
	
	public double GetAmount()
	{ 
		return m_amount;
	}
	
	private void SetAmount(double amount)
	{
		m_amount = amount; 
	}
	
	public void UpdateAmountSecurely(double newAmount, String password)
	{
		if (password != null) //always do a null check
		{
			if (password.equals("admin"))
			{
				UpdateAmount(newAmount);
System.out.println("Updated amount in account id " + m_accountId + " to " + m_amount);
			}
			else
			{
				System.out.println("Null password submitted, please check and resubmit!!");
			}

		}
	}
}
