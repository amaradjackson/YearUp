
public class Surgeon extends Doctor
{
	public void MyJob()
	{
		m_name = "Surgeon";
		m_work = "I cut people open";
		m_location = "I work in the emergency room";
	}
	
	protected void DoWork()
	{
		System.out.println("I am a " + m_name);
		System.out.println(m_work);
		System.out.println(m_location);
	}
}
