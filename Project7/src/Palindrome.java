
public class Palindrome 
{

	
	
	public static void main(String[] args) 
	{
	
		String String1 = "wow";
		String String2 ="hair";
		String String3 = null;
		
		/*using the boolean to call the method and then check is the returned
		 * values match the boolean statement, then prints is it matched or not
		 */
		boolean isString1Palindrome = IsPalindrome(String1);
		 if (isString1Palindrome)
		 {
			 System.out.println(String1 + " is a palindrome");
		 }
		 else
		 {
			 System.out.println(String1 + " Is not a palindrome");
		 }
		 
		 boolean isString2Palindrome = IsPalindrome(String2);
		 if (isString2Palindrome)
		 {
			 System.out.println(String2 + " is a palindrome");
		 }
		 else
		 {
			 System.out.println(String2 + " is not a palindrome");
		 }
		boolean isString3Palindrome = IsPalindrome(String3);
		if (isString3Palindrome)
		{
			System.out.println(String3 + " is palindrome");
		}
		else
		{
			System.out.println(String3 + " is not a palindrome");
		}
		 
	}

	public static boolean IsPalindrome(String wordInput)
	{
		boolean isPalindrome = true;
		
		if (wordInput != null)
		{
			//replace spaces with empty string
			String wordInputNoSpaceAndLowerCase = wordInput.replace(" ", "").toLowerCase();
			//says the input characters of the array equal that of the string turned array
			char[] wordInputChars = wordInputNoSpaceAndLowerCase.toCharArray();
			
			for (int i = 0, k = wordInputChars.length - 1; i < wordInputChars.length/2; i++, k--)
			{
				if (wordInputChars[i] != wordInputChars[k])
				{
					isPalindrome = false;
					break;
				}
			}
		}
		else
		{
			System.out.println("This is a null string :");
			/*changes boolean to false here so if null is put in, it is not
			 * printed out to be a palindrome
			 */
			isPalindrome = false;
		}
		return isPalindrome; 
	}
	
}
