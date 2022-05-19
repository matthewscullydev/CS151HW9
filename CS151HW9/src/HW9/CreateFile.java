/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 5-15-22
 * 
 * CreateFile class
 * <p>
	 * This is a class which utilizes the java io and scanner libraries in order to print whatever is typed to console to a text file
	 * output is sent to a file, "test.txt" which should appear in the program directory after being ran. 
 * </p>
 */


package HW9;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class CreateFile{

	static Scanner stdin;
	public static void main(String[] args) throws IOException {
		
		try {
		System.out.println("type text");
		stdin = new Scanner(System.in);
		FileWriter Writer = new FileWriter("test.txt");
		String text = stdin.nextLine();
		
		while(!text.contains("@q")) {
			Writer.write(text + "\n");
			text = stdin.nextLine();
		}
		//once @q is found we still want to print out the line with @q in it to the test.txt file so we write again then close the writer and scanner.
		Writer.write(text + "\n");
		stdin.close();
		Writer.close();
		
	}

		
		
       catch(IOException ioe){
    	   System.out.println("Exception occured:");
    	   ioe.printStackTrace();
       }
	}
}
