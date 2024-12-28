package Assignment4;
/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/28/2023
In this assignment, I create a program that check the input string.
I used the calling method, while-loop, for loop, and type boolean.
*/
import java.util.*;
public class Assignment4_ZifengWang {
	
	static public int uppernum, lowernum;
	static public String s;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("input a string:");
			s = input.next();
			uppernum = UppercaseNumber(s);
			lowernum = LowercaseNumber(s);
		}while(!lengthCheck(s) || !LetterCheck(uppernum, lowernum));
		System.out.println("bye!");
	}
	
	
	//the method return a boolean that the length of the string whether even or not
	public static boolean lengthCheck(String s) {
		return(s.length()%2 == 0);
	}
	//the method to count the number of the uppercase.
	public static int UppercaseNumber(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	} 
	// method to count the number of the lowercase.
	public static int LowercaseNumber(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	} 
	//the method return a boolean that the uppernum and lowernum whether same or not
	public static boolean LetterCheck(int uppernum, int lowernum) {
		return(uppernum == lowernum);
	}
}
