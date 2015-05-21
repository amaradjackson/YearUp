
public class Person 
{
	
	private String m_name;
	private int m_age;
	private String m_phoneNumber;
	private String m_address;
	
	public Person(String name, String phoneNumber, String address, int age)
	{
		m_name = name;
		m_age = age;
		m_phoneNumber = phoneNumber;
		m_address = address;
	}
	public Person(String name)
	{
		m_name = name;
		m_age = 20;
		m_phoneNumber = "678-243-7098";
		m_address = "2342 Deercross Rd Decatur, GA, 20032";
	}
	public Person(String address, String phoneNumber, int age, String name)
	{
		SetAge(age);
		SetName(name);
		SetAddress("5576 Hampton Creek Decatur, GA, 30032 ");
		SetPhoneNumber("678-344-1903");
	}
 
	 int GetAge()
		{
		return m_age;
		}
	
	private void SetAge(int age)
		{
		m_age = age;
		}
	
	 String GetName()
		{
		return m_name;
		}
	
	private void SetName(String name)
		{
		m_name = name;
		}
	
	 String GetPhoneNumber()
		{
		return m_phoneNumber;
		}
	
	private void SetPhoneNumber(String phoneNumber)
		{
		m_phoneNumber = phoneNumber;
		}
	
	 String GetAddress()
		{
		return m_address;
		}
	
	private void SetAddress(String address)
		{
		m_address = address;
		}
	
	void printName()
	{
		System.out.println("This is " + m_name);
	}
	void printAge()
	{
		System.out.println("She is " + m_age + " years old.");
	}
	void printContact()
	{
		System.out.println("You can reach her by this address: " + m_address + " or this "
				+ "number: " + m_phoneNumber);
	}
	public void GrowOlder() 
	{
		m_age++;
		System.out.println("When her birthday comes, she will be " + m_age++ + " years old.");	
	}
}
