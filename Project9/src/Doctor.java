
public class Doctor extends Work
{
	public void MyJob()
	{
		m_name = "Doctor";
		m_work = "I fix people";
		m_location = "I work in the General Hospital";
	}
	
	protected void DoWork()
	{
		System.out.println("I am a " + m_name);
		System.out.println(m_work);
		System.out.println(m_location);
		
	}
}
