
public class CircleObject {
	
		public static void main(String[] args) 
		{
			//Big circle
			
			Circle bigCircle = new Circle("grey", 10);
			bigCircle.CalculateArea();
			bigCircle.printColor();
			bigCircle.printRadius();
			
			//Small circle
			Circle smallCircle= new Circle(5);
			smallCircle.CalculateArea();
			smallCircle.printColor();
			smallCircle.printRadius();
		}
		
}
