
public class ChineseYear 
{
	public void EvaluateChineseYear(int unknownYear)
	{
		int s_knownYear = 1900;
		if (unknownYear >= s_knownYear)
		{
			int yearDifference = unknownYear - s_knownYear;
			int remainder = yearDifference % 12;
			//% is the java operator to get the remainder from dividing
			switch(remainder)
			//this is the switch statement for the remainder to help find the year
			{
				case 0: System.out.println(unknownYear + " This is the year of the Rat");
				break;
				case 1: System.out.println(unknownYear + " This is the year of the Ox");
				break;
				case 2: System.out.println(unknownYear + " This is the year of the Tiger");
				break;
				case 3: System.out.println(unknownYear + " This is the year of the Rabbit");
				break;
				case 4: System.out.println(unknownYear + " This is the year of the Dragon");
				break;
				case 5: System.out.println(unknownYear + " This is the year of the Snake");
				break;
				case 6: System.out.println(unknownYear + " This is the year of the Horse");
				break;
				case 7: System.out.println(unknownYear + " This is the year of the Sheep");
				break;
				case 8: System.out.println(unknownYear + " This is the year of the Monkey");
				break;
				case 9: System.out.println(unknownYear + " This is the year of the Rooster");
				break; 
				case 10: System.out.println(unknownYear + " This is the year of the dog");
				break; 
				case 11: System.out.println(unknownYear + " This is the year of the Pig");
				break;
				default: System.out.println(unknownYear + " ERROR! The world of numbers exploded!");
			}
		}
	}
	public static void main(String[] args)
	{
		ChineseYear Mine = new ChineseYear();
		Mine.EvaluateChineseYear(1996 );

	}

}
