
public class Daredevil implements ITaxPayer
{

	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public Daredevil(double income)
	{
		SetIncome(income);
	}
	
	public double GetIncome()
	{
		return m_income;
	}
	
	public double SetIncome(double income)
	{
		return m_income;
	}
	
	
	public void PayTaxes(double taxRate)
	{	  
		if (!m_donePayingTaxes)				
		{
		double taxes = taxRate * GetIncome();			
		double newIncome = GetIncome() - taxes;
		SetIncome(newIncome);
		m_donePayingTaxes = true;
		}
		else
		{
			System.out.println("STOP TAKING MY MONEY YOU GREEDY COLLLECTOR!!!");
		}
	}
	public void FileTaxReturn()
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Daredevil has filed tax return");
		}
		else
		{
			System.out.println("Daredevil  needs to pay taxes before filing return");
		}
	}
}

