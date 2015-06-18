
public class WebDeveloper extends Work
{
	public void MyJob()
	{
		m_name = "Web Developer";
		m_work = "I make things with computers";
		m_location = "I work in a business building";
	}
	
	protected void DoWork()
	{
		System.out.println("I am a " + m_name);
		System.out.println(m_work);
		System.out.println(m_location);
	}
}
