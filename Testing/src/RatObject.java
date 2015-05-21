
public class RatObject {

	public static void main(String[] args) 
	{
//Rat 1
		Rat John = new Rat("John", "red", "four inches", 6);
		John.printName();
		John.printColor();
		John.printSize();
		John.printSpots();

		
		Rat Brody = new Rat("Brody","white");
		Brody.printName();
		Brody.printColor();
		Brody.printSize();
		Brody.printSpots(); 
	}

}
