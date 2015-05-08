public class Circle {
	String m_color;
	double m_radius;
	
	
	public Circle( String color, double radius){
		m_color = color;
		m_radius = radius;
	}
	
	public Circle(double radius){
		m_color = "Red";
		m_radius = radius;
	}
	
	double CalculateArea(){
		double area = 3.14 * m_radius * m_radius;
		return area;
		
	}
	
	void printColor(){
		System.out.println("This is a circle. The color is : " + m_color);
	}
	
	void printRadius(){
		System.out.println("My radius is : " + m_radius);
	}
}


