/* Here is the second class needed for the assignment. It is named "CircleObject"
 * because it is in a separate file and can not have the same name as "Circle"
 */
public class CircleObject {
	/*The main method is not located in the other file, thusly is has been put
	 * here. The program cannot run without this.
	 */
		public static void main(String[] args) 
		{
			//Big circle
			//Below is the constructor for the big circle. It takes 
			 
			Circle bigCircle = new Circle("grey", 10);
			// takes double radius and string color as a parameter
			bigCircle.CalculateArea();
			bigCircle.printColor();
			bigCircle.printRadius();
			// Calls the methods for CalculateArea, printColor, and printRadius
			//methods are listed in the other file
			
			//Small circle
			
			Circle smallCircle= new Circle(5);
			smallCircle.CalculateArea();
			smallCircle.printColor();
			smallCircle.printRadius();
		}
		
}
