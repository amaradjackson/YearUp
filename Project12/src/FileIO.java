import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO   
{ 


	public static void main(String[] args)  
	{ 
		try 
		{ 
			//sets the path where the file will be imported from 
			String filePath = "C:\\Users\\ajackson116\\OOP_week15.txt"; 
			//read method that calls to the file in the path set above  
			String iReadThis = Read(filePath); 
			String originalWord = "dolor"; 
			String replacedWord = "hedon"; 
			//says to replace those two words in the string from the file that will be read 
			String replacedString = Replace(iReadThis, originalWord, replacedWord); 
			//need file path to tell where to get the file 
			Write(replacedString, filePath); 
		} 
		catch (IOException ex) 
		{ 
			System.out.println("Error while reading or writing from file"); 
			//only do this when the reader would want to see this 
			ex.printStackTrace(); 
		} 
		catch (NullPointerException nullEx) 
		{ 
			System.out.println("Error!! File Path Not Valid"); 
			nullEx.printStackTrace(); 
		} 
	} 


	//throws exception in case writing the file goes wrong 
	private static void Write(String replacedString, String filePath) throws IOException 
	{ 
		//makes a file writer to write the replaced words into the file itself 
		FileWriter writer = null; 
		try  
		{ 
			//sets a writer object that calls on the path the file is in 
			writer = new FileWriter(filePath); 
			//tells the object to cll the write method 
			writer.write(replacedString); 
		} 
		finally 
		{ 
			if (writer != null) 
			{ 
				//is the writer is null, the file will close 
				writer.close(); 
			} 
		} 
	} 


	//iRead this is representing the file the words come from 
	private static String Replace(String iReadThis, String originalWord, String replacedWord)  
	{ 
		String replacedString = null; 


		if (iReadThis != null) 
		{ 
			//if the replaced string is null and the iReadThis is null, replace the words 
			replacedString = iReadThis.replace(originalWord, replacedWord); 
		} 


		return replacedString; 
	} 


	public static String Read(String filePath) throws NullPointerException, IOException  
	{ 
		FileReader fileReader = null; 
		//read returns a string 
		String fullFile = null; 
		//moved outside of the try block because the finally block can't see it 
		BufferedReader bufferedReader = null; 
		try 
		{ 
			if (filePath == null) 
			{ 
				throw new NullPointerException(); 
			} 
			//file reader obj will read the file we will import 
			fileReader = new FileReader(filePath); 
			//type of read import that will read it line by lie, not letter by letter  
			//System.out.println("I read this line: " + iReadThis); 
			StringBuilder builder = new StringBuilder(); 
			//.readLine will read the file through the buffered reader 
			String iReadThis = bufferedReader.readLine(); 


			while(iReadThis != null) 
			{ 
				//append is adding something to the end 
				builder.append(iReadThis); 
				//sets the iReadThis string to what is read in the bufferedReader 
				iReadThis = bufferedReader.readLine(); 


			} 


			fullFile = builder.toString(); 
		} 


		//finally block is like the ending to trying to do something, like fixing what you changed 
		finally 
		{ 
			if (fileReader != null) 
			{ 
				//closes the file instead of leaving it open 
				fileReader.close(); 
			} 
			if (bufferedReader != null) 
			{ 
				bufferedReader.close(); 
			} 
		} 


		return fullFile; 
	}  


} 