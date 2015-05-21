
public class Dog {
	// instance variable (variable defined in a class)
	//instance variables belong to an object
	int m_numberOfPaws = -1;
	String m_furColor = null;
	//"null" declares the value of the fur color as empty or unspecified
	
	// This is a constructor because it starts with the class name
	Dog(int pawCount) {
		// This is an assignment operator while == is a comparison
		m_numberOfPaws = pawCount;
		m_furColor = "Black";
		/* When using "static", it declares all types of an object to have the
		 * same basic attributes/values. Example: Use static when declaring that all
		 * dogs have a brain. Do not put static when wanting to be specific, such 
		 * as saying a dog does not have a brain.
		 */
		
	}
	// another constructor dealing with dog
	//write with camel case
	Dog(int pawCount, String colorOfFur) {
		m_numberOfPaws = pawCount;
		m_furColor = colorOfFur;
	}
	
	// round brackets "()" set parameters
	// this is setting the sound the dog will make
	void Bark(String barkSound) {
		System.out.println(barkSound);
		//string: value is in a text
	}
	
	public static void main(String[] args) {
		//making an object "dog"

		int laylaPawCount = 4;
		Dog layla = new Dog(laylaPawCount);
		
	//making another object for "dog"	
		int sparkyPawCount = 3;
		String sparkyFurColor = "blue";
		Dog sparky = new Dog(sparkyPawCount, sparkyFurColor);
		
		//calling the objects to "bark" and printing a text with it
		System.out.println("layla will bark now");
		//us the bark method inside the layla object below
		layla.Bark("ruff ruff");
		
		System.out.println("sparky will bark now");
		// the period to call the bark method inside the object
		sparky.Bark("squad");
		//use the bark method inside the sparky object

	}

}
