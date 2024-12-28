package Assignment2;

import java.util.*;
import java.io.*;

/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/6/2023
In this assignment, I create a rudimentary database(data file) for the storage of only the user generated identities.
I use the while-loop, for loop, type boolean, and array list.
*/

public class IDdata {
	public static ArrayList<String> ids = new ArrayList<>();
	public static ArrayList<String>errors = new ArrayList<>();
	public static void main(String[] args) throws FileNotFoundException{
		fileread();
		
		String newID = "";
		do {
			Scanner IDinput = new Scanner(System.in);
			System.out.println("Create a new ID:");
			newID = IDinput.next();
			if (!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID)) {
				System.out.println("Invalid ID.");
				errormessage(newID);
				for(int i = 0; i < errors.size(); i++) {
					System.out.println(errors.get(i));
				}
			}
		}while(!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID));
		System.out.printf("ID %s created successfully!",newID);
	}
	// a method to read the file.
	public static void fileread() throws FileNotFoundException{
		Scanner input = new Scanner(new File("IDs.txt")); 
		while(input.hasNext()){
			ids.add(input.next());
		}
		System.out.printf("List of User IDs (%d)\n",ids.size());
		for (int i = 0; i < ids.size(); i++) {
			System.out.println(ids.get(i));
		}
	}
	
	// a method to check the ID whether been used
	public static boolean samecheck(String newID) {
		for (int i = 0; i < ids.size(); i++) {
			if (newID.equals(ids.get(i))) {
				return false;
			}
		}
		return true;
	}
	// a method to check the length
	public static boolean lengthcheck(String newID) {
		int max = 9, min = 5;
		return(newID.length() >= min && newID.length() <= max);
	}
	// a method to check the ID have both lower-case and upper-case.
	public static boolean lettercheck(String newID) {
		boolean lowercase = false, uppercase = false;
		for (int i = 0; i < newID.length(); i++) {
			if(Character.isLowerCase(newID.charAt(i))) {
				lowercase = true;
			}
			if(Character.isUpperCase(newID.charAt(i))) {
				uppercase = true;
			}
		}
		return (lowercase && uppercase);
	}
	// a method to check ID must start with a letter.
	public static boolean startcheck(String newID) {
		return (Character.isLetter(newID.charAt(0)));
	}
	// a method to check the ID must have at least one number.
	public static boolean numbercheck(String newID) {
		for (int i = 0; i < newID.length(); i++) {
			if (Character.isDigit(newID.charAt(i))) {
				return true;
			}
		}                        
		return false;
	}
	// a method to check the ID must have at least two special characters.
	public static boolean twospecialcheck(String newID) {
		int count = 0;
		for (int i = 0; i < newID.length(); i++) {
			if (!Character.isDigit(newID.charAt(i)) && !Character.isLetter(newID.charAt(i))) {
				count++;
			}
		}                        
		return (count >=2);
	}
	// a method to return the error messages.
	public static List<String> errormessage (String newID) {
		if(!samecheck(newID)) {
			errors.add("ID already in use.") ;
		}
		if(!lengthcheck(newID)){
			errors.add("ID must be between 5 and 9 characters in length.");
		}
		if(!lettercheck(newID)){
			errors.add("ID must have lower-case and upper-case.");
		}
		if(!startcheck(newID)){
			errors.add("ID must start with a letter.");
		}
		if(!numbercheck(newID)){
			errors.add("ID must have at least one number.");
		}
		if(!twospecialcheck(newID)){
			errors.add("ID must have at least two special characters.");
		}
		return errors;
	}
	
}
