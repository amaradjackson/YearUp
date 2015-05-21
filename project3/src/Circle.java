public class Circle {
	String m_color;
	double m_radius;
	// Above are listed attributes that will be called later in the constructors
	
	//here are the parameters for the constructors used in the other file
	public Circle( String color, double radius){
		m_color = color;
		m_radius = radius;
	}
 	
	public Circle(double radius){
		m_color = "Red";
		m_radius = radius;
	}
	//here is the method used to calculate the area
	double CalculateArea(){
		double area = 3.14 * m_radius * m_radius;
		return area;
		
	}
	//Print method for the circle color
	void printColor(){
		System.out.println("This is a circle. The color is : " + m_color);
	}
	//print method for the radius
	void printRadius(){
		System.out.println("My radius is : " + m_radius);
	}
}


