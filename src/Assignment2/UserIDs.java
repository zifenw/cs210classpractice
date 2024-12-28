package Assignment2;
import java.util.*;
import java.io.*;
/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/6/2023
In this assignment, I create a rudimentary database(data file) for the storage of only the user generated identities.
I used the calling method, while-loop, for loop, type boolean, and array list.
Update: I update the methods of error message and read file. 
*/
public class UserIDs {
	static final String FILENAME = "IDs.txt";
	static final int max = 9, min = 5;
	public static ArrayList<String> ids = new ArrayList<>();  
	public static String[] errorMsg = new String[10];
	public static void main(String[] args) throws FileNotFoundException{
		loadErrorMsg();
		fileread(FILENAME);
		String newID = "";
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Create a new ID:");
			newID = input.next();
			ErrorMessege(newID);                              
		}while(containerror(newID));
		System.out.printf("ID %s created successfully!\n",newID);
		outputfile(newID);
	}
	// a method to read the file.
	public static void fileread(String filename) throws FileNotFoundException{
		Scanner readfile = new Scanner(new File(filename));      
		while(readfile.hasNext()){
			ids.add(readfile.next());
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
	// few methods to give the error message.
	public static void ErrorMessege(String newID) {
		if (containerror(newID)) {
			System.out.println("Invalid ID.");
			if(!samecheck(newID)) {errorMsg(0);}
			if(!lengthcheck(newID)){errorMsg(1);}
			if(!lettercheck(newID)){errorMsg(2);}
			if(!startcheck(newID)){errorMsg(3);}
			if(!numbercheck(newID)){errorMsg(4);}
			if(!twospecialcheck(newID)){errorMsg(5);}
			System.out.println();
		}
	}	
	public static void errorMsg(int errorNumber){
		System.out.println(errorMsg[errorNumber]);
	} 
	public static void loadErrorMsg(){
		errorMsg[0] = "ID already in use.";
		errorMsg[1] = "ID must be between " + min + " and " + max + " characters in length.";
		errorMsg[2] = "ID must have lower-case and upper-case.";
		errorMsg[3] = "ID must start with a letter.";
		errorMsg[4] = "ID must have at least one number.";
		errorMsg[5] = "ID must have at least two special characters.";
	}
	// a method to show file output, and update the old file
	public static void outputfile(String newID) throws FileNotFoundException{
		PrintStream out = new PrintStream(new File("IDs.txt")); 
		ids.add(newID);
		System.out.printf("List of User IDs (%d)\n",ids.size());				
		for (int i = 0; i < ids.size(); i++) {
			System.out.println(ids.get(i));
			out.println(ids.get(i));
		}
	}
	// a boolean method to check whether the newID contains error 
	public static boolean containerror(String newID) {
		return (!samecheck(newID)||!lengthcheck(newID)||!lettercheck(newID)||!startcheck(newID)||!numbercheck(newID)||!twospecialcheck(newID));
	}

}
