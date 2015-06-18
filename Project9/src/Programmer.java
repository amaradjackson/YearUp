
public class Programmer extends WebDeveloper
{
	public void Myjob()
	{
		m_name = "Programmer";
		m_work = "I write codes";
		m_location = "I work in an office";
	}
	
	protected void DoWork()
	{
		System.out.println("I am a " + m_name);
		System.out.println(m_work);
		System.out.println(m_location);
	}
}
