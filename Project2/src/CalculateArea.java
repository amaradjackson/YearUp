
public class CalculateArea 
{

	public static void main(String[] args) 
	{
		// calculate the area of a circle.
		double CircleArea = calculateCircleArea(2,5);
		System.out.println("The area of the circle is: "+ CircleArea);
		
		//calculate the area of a rectangle.
		double RectangleArea = CalculateRectangleArea(3,6);	
		System.out.println("The area of the rectangle is this: "+ RectangleArea);
	}
	    
	//write method that returns a double and takes integer called radius as a parameter.  
	static double calculateCircleArea(int radius1,int radius2){
		double area = 3.14*radius1*radius2;
		return area;
		}
	
	//write method that returns a double an takes integers called length and breadth as a parameter
	static double CalculateRectangleArea(int length,int breadth){
		double area = length*breadth;
		return area;
		}
}
