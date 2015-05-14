
public class PersonObject {

	public static void main(String[] args)
	{
		//create a new person object
		Person Lola = new Person("Lola");
		//call the getters in a print
		Lola.printName();
		Lola.printAge();
		Lola.printContact();
		Lola.GrowOlder();
		
		//create person object that prints the getters
		Person Devin = new Person("Devin");
		System.out.println("This is " + Devin.GetName());
		System.out.println("She is " + Devin.GetAge());
		System.out.println("She lives at " + Devin.GetAddress());
		System.out.println("Her phone number is " + Devin.GetPhoneNumber());
		Devin.GrowOlder();
		}

}
