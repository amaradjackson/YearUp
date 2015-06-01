
public class LoopLab 
{


	public static void main(String[] args)
	{
		//sets up the array
		int[] array = {7,9,7,10,8,7,8,4,8,7,6};
		//sets the search value
		int foundNumber;
		
		//creates an object in order to call the method needed to find the number
		LoopLab newLoop = new LoopLab();
		//calls the method to find the number value, which is set to 7
		newLoop.searchNumber(array, 7);
		newLoop.countNumber(array, 8);
	}
	
	//setting up the method to find the search value
	//takes the two parameters
	public static void searchNumber(int[] array, int foundNumber)
	{
		//sets up the for loop
		for (int i = 0; i < array.length; i++)
		{
			//checks what index would equal the search value
			if (array[i] == foundNumber)
			{
				//prints out the search value
				System.out.println("the found number is " + foundNumber);
				//breaks the loop so it only counts the 1rst time the number appears
				break;
			}
		}
	}

	//sets up the method to count the number of time the found number occurs
	//takes the two parameters
	public static void countNumber(int[] array, int foundNumber)
	{
		//initializes the number of occurances to 0 so it can be used later
		int numberOfOccurences = 0;
		//sets up the for loop
		for (int i = 0; i < array.length; i++)
		{
			//checks if the index equals the found number (7)
			if (array[i] == foundNumber)
			{
				/*
				 * increments numberOfOccurences each time the index of the array equals to the 
				 * found number, then increments it up by 1 in a way to count the occurences
				 */
				numberOfOccurences++;				
			}
		}
		//puts print statement outside of loop so that it does not repeat each time the count increments
		System.out.println("The number shows " + numberOfOccurences + " times.");
	} 
}
