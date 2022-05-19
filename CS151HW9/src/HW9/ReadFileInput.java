/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 5-15-22
 * 
 * ReadFileInput class
 * <p>
 *	This is the ReadFileInput class which directs the program to a given file that is read and then output to the console.
 *	In this program a bufferedReader is created using a fileReader with the given file as an input parameter. After, a string is 
 *	compared to the read in input of the file, as long as a string is read, print it out. 
 * </p>
 */


package HW9;
import java.io.*;

public class ReadFileInput {

	public static void main(String[] args) throws Exception {
	
		
		//Before running this program make sure to drag the quote.txt into your eclipse directory, and then rename this new File line to match
		// the directory where your quote.txt will be located.
		//can change this line under to your directory for eclipse in order for it to work for your computer.
		
		File file = new File("C:\\Users\\Casual\\eclipse-workspace\\CS151HW9\\src\\HW9\\quote.txt");
	
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String str;
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
	}
	
}
