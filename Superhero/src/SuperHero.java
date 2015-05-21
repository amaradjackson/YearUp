
public class SuperHero 
{
	SuperHero hulk = new SuperHero("Hulk");
	SuperHero Batman = new SuperHero("Batman");
	SuperHero Flash = new SuperHero("Flash");
	public static void main(String[] args) 
	{
		// can add this in the main method. This is also an array
		superHeros = new SuperHero[3];
		superHeros[0] = hulk;
		superHeros[1] = Batman;
		superHeros[2] = Flash;
		
		int index = 0;
		while(index < superHeros.length)
		{
			System.out.println(superHeros[index].getName);
			index++;
		}

	}

}
