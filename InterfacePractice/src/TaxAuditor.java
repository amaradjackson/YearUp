
public class TaxAuditor 
{ 
//implements tax payer so objects calling this can be put as tax payer 
		public void Audit(ITaxPayer taxPayer)
		{
			System.out.println("Audited: " + taxPayer.getClass());
		}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
