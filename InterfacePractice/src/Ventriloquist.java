
public class Ventriloquist implements ITaxPayer
{

	private double m_income;
	//sets the boolean for if they paid taxes
	private boolean m_donePayingTaxes = false;
	
	//sets constructor for the income so that income would have to be set when calling method 
	public Ventriloquist(double income)
	{
		SetIncome(income);
	}
	
	//sets up the getter for income
	public double GetIncome()
	{
		return m_income;
	}
	
  //makes setter private so that i can not be changed outside of the class
	private void SetIncome(double income)
	{
		//sets the instance variable to a value
		m_income = income;
	}
	
	//setting up method
	public void PayTaxes(double taxRate)
	{
  //if true, then do something; true because boolean is false. False that it is false = true
		if (!m_donePayingTaxes)
			//another way of saying the above
		//if (m_donePayingTaxes == false)
		{
		double taxes = taxRate * GetIncome();
		//takes the taxes out of the income
		double newIncome = GetIncome() - taxes;
		//sets the remainder as the new income
		SetIncome(newIncome);
		//sets paid taxes to true
		m_donePayingTaxes = true;
		}
		else
			//only come here is taxes are already paid
		{
			System.out.println("STOP TAKING MY MONEY YOU GREEDY COLLLECTOR!!!");
		}
	}
		
	public void FileTaxReturn()
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Ventroloquist has filed tax return");
		}
		else
		{
			System.out.println("Ventriloquist needs to pay taxes before filing return");
		}
	}
	public static void main(String[] args) 
	{
		Daredevil Roland = new Daredevil(5000000);
		Roland.PayTaxes(.33);
		Roland.FileTaxReturn();
		
		//sets interface variable to equal Ventriloquist and can call the methods with it
		Ventriloquist Ray = new Ventriloquist(30000);
		Ray.PayTaxes(.23);
		Ray.FileTaxReturn();
		
		Instructor Ryan = new Instructor(120000);
		Ryan.PayTaxes(.28);
		Ryan.FileTaxReturn();
		
		TaxAuditor tom = new TaxAuditor();
		tom.Audit(Ray);
		tom.Audit(Roland);
		tom.Audit(Ryan); 
	}

}
