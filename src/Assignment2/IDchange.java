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

public class IDchange {
	public static ArrayList<String> ids = new ArrayList<>();
	public static void main(String[] args) throws FileNotFoundException{
		fileread();
		
		String newID = "";
		do {
			errorcheck();
/*			Scanner IDinput = new Scanner(System.in);
			System.out.println("Create a new ID:");
			newID = IDinput.next();
			if (!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID)) {
				System.out.println("Invalid ID.");
				if(!samecheck(newID)) {
					System.out.println("ID already in use.");
				}
				if(!lengthcheck(newID)){
					System.out.println("ID must be between 5 and 9 characters in length.");
				}
				if(!lettercheck(newID)){
					System.out.println("ID must have lower-case and upper-case.");
				}
				if(!startcheck(newID)){
					System.out.println("ID must start with a letter.");
				}
				if(!numbercheck(newID)){
					System.out.println("ID must have at least one number.");
				}
				if(!twospecialcheck(newID)){
					System.out.println("ID must have at least two special characters.");
				}
				System.out.println();
			}
*/		}while(!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID));
		System.out.printf("ID %s created successfully!",newID);
		outputfile(newID);
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
	public static int max = 9, min = 5;
	public static boolean lengthcheck(String newID) {
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
	// a method to get the newID and give the error message.
	public static void errorcheck() {
		String newID = "";
		Scanner IDinput = new Scanner(System.in);
		System.out.println("Create a new ID:");
		newID = IDinput.next();
		if (!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID)) {
			System.out.println("Invalid ID.");
			if(!samecheck(newID)) {
				System.out.println("ID already in use.");
			}
			if(!lengthcheck(newID)){
				System.out.printf("ID must be between %d and %d characters in length.",min,max);
			}
			if(!lettercheck(newID)){
				System.out.println("ID must have lower-case and upper-case.");
			}
			if(!startcheck(newID)){
				System.out.println("ID must start with a letter.");
			}
			if(!numbercheck(newID)){
				System.out.println("ID must have at least one number.");
			}
			if(!twospecialcheck(newID)){
				System.out.println("ID must have at least two special characters.");
			}
			System.out.println();
		}
	}
	// a method to show file output
	public static void outputfile(String newID) {
		ids.add(newID);
		System.out.printf("List of User IDs (%d)\n",ids.size());
		for (int i = 0; i < ids.size(); i++) {
			System.out.println(ids.get(i));
		}
	}

}
