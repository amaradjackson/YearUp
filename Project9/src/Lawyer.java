
public class Lawyer extends Work
{
	public void MyJob()
	{ 
		m_name = "Lawyer";
		m_work = "I punish/help people";
		m_location = "I work in a courthouse";
	}
	
	protected void DoWork()
	{
		System.out.println("I am a " + m_name);
		System.out.println(m_work);
		System.out.println(m_location);
	}
}
