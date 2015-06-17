
public class Instructor implements ITaxPayer
{

	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public Instructor(double income)
	{
		SetIncome(income);
	}
	
	public double GetIncome()
	{
		return m_income;
	}
	
	private void SetIncome(double income)
	{
		m_income = income;
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
			System.out.println("Instructor has filed tax return");
		}
		else
		{
			System.out.println("Instructor needs to pay taxes before filing return");
		} 
	}	
}
