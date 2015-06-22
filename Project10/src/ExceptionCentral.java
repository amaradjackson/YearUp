
public class ExceptionCentral 
{

	public static void main(String[] args) 
	{
		ExceptionCentral ExampleException = new ExceptionCentral();
		try
		{
			ExampleException.Divide();
		}
		catch(Exception ex)
		{
			System.out.println("Cannot divide");
		}

		/*catch(Exception exception)
		{
			exception
		}
		 */

		//exceptionalCentral.ShowAnswer(null);
		//int[] array = {1,2,3};
		int [] array = null;
		ExampleException.PrintArrayValues(array);

	}

	int Divide() throws ArithmeticException
	{
		int answer = 555/0;
		return answer;
	}
	void ShowAnswer(String words) throws NullPointerException
	{
		String WordString = words.toLowerCase();
		System.out.println(WordString);

		//int[] a = null;
		//int fifth = a[4];
	}

	void PrintArrayValues(int[] array)
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexEx)
		{
			System.out.println("This does not have 1o slots");
			//System.out.println(arrayIndexEx.getMessage());
			//System.out.println(arrayIndexEx.toString());
			//arrayIndexEx.printStackTrace();
		}
		catch(NullPointerException nullPtrEX)
		{
			System.out.println("Null");
			nullPtrEX.printStackTrace();
		}
	}
}
