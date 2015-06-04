public class ReversedString 
{
	public static void main(String[] args)
	{
		//sets up the objects to be called (original strung value)  
		String test = "Greetings";
		String test1 = "supercalifragilisticexpialidocious";
		String test2 ="My name is Amara";
		
		String test3 = "Blue";
		String test4 = "Optimus Prime";
		String test5 = "na nahnahnahnahnahnah nahnahnah nahnah nah nahnah nahnahnahnah";
		//creates an object in order to call the reversal method
		ReversedString inplace = new ReversedString();
		//sets the parameter to the word that will be used by the object
		System.out.println(test);
		inplace.ReverseInPlace(test);
		
		ReversedString inplace1 = new ReversedString();
		System.out.println(test1);
		inplace1.ReverseInPlace(test1);
		
		ReversedString inplace2 = new ReversedString();
		System.out.println(test2);
		inplace2.ReverseInPlace(test2);
		
		
		ReversedString inplace3 = new ReversedString();
		System.out.println(ReverseOutOfPlace(test3));
		//here is another way of printing and calling the method
		
		ReversedString inplace4 = new ReversedString();
		System.out.println(ReverseOutOfPlace(test4));
		
		ReversedString inplace5 = new ReversedString();
		System.out.println(ReverseOutOfPlace(test5));
		
	}
	public static String ReverseInPlace(String originalString)
	{
		 
		String reversedString = null;
		
		if (originalString != null)
			//changing hello to olleh
		{
			char[] originalStringChars = originalString.toCharArray();
			
			//declares two variables that iterate through opposite directions.
			for (int i = 0, j = originalStringChars.length - 1; i < originalStringChars.length/2; i++, j--)
				//does it for half because they will equal out at that point since j-- is incrementing backwards
			{
				//declares a temporary variable
				char temp = originalStringChars[j];
				//works to reverse each index's value, while moving one into temp so that it won't be lost
				originalStringChars[j] = originalStringChars[i];
				originalStringChars[i] = temp; 
			}
			reversedString = new String(originalStringChars);
			System.out.println(reversedString);
		}
		//returns the result to the method
		/* makes it so the returned value becoomes the "answer
		 * 
		 */
		return reversedString;
		
}
	public static String ReverseOutOfPlace(String originalString)
	{
		//null check for the method
		String reversedString = null;
		
		//null check for the string
		if (originalString != null)
		{
			//setting up the string to turn into an array
			//tells the program where to start in each array
			char[] originalStringChars = originalString.toCharArray();
			//sets the array to equal the length of the array we turned the string into
			char[] reversedStringChars = new char[originalStringChars.length];
			
			//setting up the work the program will do to the arrays
			for (int i = 0, j = originalStringChars.length-1; i < originalStringChars.length; i++, j--)
				//originalStringChars.length-1 tells it to start at the end of the array
				//j-- increments from end of the array, basically to subtract one index and move backwards
			{
				//tells  to take the processes happening to "j" and apply it to the reversed array
				//Tells to take the processes happening to "i" and apply it to the original array
				reversedStringChars[j] = originalStringChars[i];
			}
			//sets the new array made to turn into a new string to be printed
			reversedString = new String(reversedStringChars);
			//prints the result
		}
		//returns the result
		return reversedString;
	}
}
