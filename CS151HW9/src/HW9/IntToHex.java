/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 5-15-22
 * 
 * IntToHex class
 * <p>
 *	This class takes a user input of an integer and then uses the Integer library function Integer.toHexString to convert it to a hex number and display it.
 *	This program accounts for faulty input and will prompt the user to try again if they enter improper input.
 * </p>
 */

package HW9;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class IntToHex {

	static Scanner stdin;
	
	public static void main(String[] args) throws IOException {
		
		stdin = new Scanner(System.in);
		
		System.out.println("Enter Integer value to be converted to Hexadecimal:");
		
			
		Convert();
			
			
	}
	
	/**
	 * This function uses a boolean flag to keep looping once the improper input has been given
	 * @throws IOException inputmismatchexception for improper input is thrown
	 */
	public static void Convert() throws IOException{
		
		Boolean keepTrying = true;
		do
		 try {
			keepTrying = false;
			int num = stdin.nextInt();
			
			System.out.println(Integer.toHexString(num).toUpperCase());
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Next time enter a valid number..");
			stdin.nextLine();
			keepTrying = true;
			
		} while(keepTrying);
	
	}
}
