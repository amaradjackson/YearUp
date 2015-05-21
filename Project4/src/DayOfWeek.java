import java.util.Scanner;
//this will be used in the class

public class DayOfWeek 
{ 

	public static void main(String[] args) 
	{
		//reads to the console
		//object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a new day of week:\n");
		// :/n tells program to go down one line
		String day = scanner.next();
		//tells the program to read on to the next line
		System.out.println("I read this day of the week: " + day);
		//prints out this statement, plus the day that as typed in by the user
		
		DayOfWeek dayOfWeekEvaluator = new DayOfWeek();
		dayOfWeekEvaluator.EvaluateDayOfWeek(day);
		
		scanner.close();
		//closes the scanner so the resource is being used and doesn't leak
	}
	
	void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null) 
		{
			//if it is Saturday or Sunday, print that it is a weekend
			if ((dayOfWeek.equalsIgnoreCase("Saturday"))
				||dayOfWeek.equalsIgnoreCase("Sunday"))
				//null reference exception, must check for null first
				{
				System.out.println(dayOfWeek + " is the weekend");
				}
			else if (dayOfWeek.equalsIgnoreCase("Monday")
					||dayOfWeek.equalsIgnoreCase("Tuesday")
					||dayOfWeek.equalsIgnoreCase("Wednesday")
					||dayOfWeek.equalsIgnoreCase("Thurdsay")
					||dayOfWeek.equalsIgnoreCase("Friday"))
				//if any of the above names are inputed, it will print it as a weekday
				//fixes issue if something that isn't a day is inputed
					{
				System.out.println(dayOfWeek + " is a week day, I have to go to work");
					}
			else
			{
				System.out.println(dayOfWeek + " is not even a valid day");
			}
		}
	}
		

}