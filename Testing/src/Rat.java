
public class Rat 
{
	String m_name;
	String m_color;
	String m_size;
	int m_spots;
	
	public Rat(String name, String color, String size, int spots)
	{
		m_name = name;
		m_color = color;
		m_size = size;
		m_spots = spots;
	}
	public Rat(String name, String color)
	{
		m_size = "five inches";
		m_spots = 5;
	}
	public Rat(String name, int spots)
	{
		m_size = "three inches";
		m_color = "brown";
	}
	
	void printName()
	{
		System.out.println("The rat's name is " + m_name);
	}
	void printColor()
	{
		System.out.println("It has " + m_color + " colored fur");
	}
	void printSize()
	{
		System.out.println("It is only " + m_size + "big");
	}
	void printSpots()
	{
		System.out.println("And it has " + m_spots + " spots on its back");
	} 
}
