package Practice5;

import java.util.*;

/*Zifeng Wang
202515718
10/19/2023
This program to let user input a fit new ID 
I use the while-loop, if loop and type boolean.
*/

public class IDckeck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean made = false;
		int minlength = 3;
		int maxlength = 5;
		
		while(!made) {
			System.out.println("input your new ID:");
			String newID = input.nextLine();
			if (lengthcheck(newID, minlength, maxlength) && samecheck(newID) ) {
				System.out.printf("%s has created successfully.",newID);
				made = true;
			} 
			if(!lengthcheck(newID, minlength, maxlength)){
				System.out.printf("ID must be greater than or equal to %d and less than or equal to %d.\n",minlength ,maxlength);
			} 
			if(!samecheck(newID)) {
				System.out.println("The first character and the last character should be the same.");
			} 
		}
		
	}
	// the method check the length
	public static boolean lengthcheck(String newID, int minlength, int maxlength) {
		return(newID.length() <= maxlength && newID.length() >= minlength);
	}
	// the method check the same
	public static boolean samecheck(String newID) {
		int fChar = newID.charAt(0);
		int lChar = newID.charAt(newID.length() - 1);
		return(fChar == lChar);
	}

}
