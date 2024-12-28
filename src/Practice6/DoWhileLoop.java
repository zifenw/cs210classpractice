package Practice6;

import java.util.*;

/*Zifeng Wang
202515718
10/24/2023
This is a program to compare three number.
I used the do-while-loop and type boolean.
*/


public class DoWhileLoop {

	public static void main(String[] args) {
		int first;
		int second;
		int third;
		Scanner input = new Scanner(System.in);		
		
		do {
			System.out.println("input first number: ");
			first=input.nextInt();
			System.out.println("input second number: ");
			second=input.nextInt();
			System.out.println("input third number: ");
			third=input.nextInt();
			
			if (!checkNumbers(first, second, third)) {
				System.out.println("Please try again. First two numbers must be equal and their sum should be less than the third number.");
			}
			
		} while(!checkNumbers(first, second, third));
		System.out.println("you are genius, Bye!");
	}
	// a boolean test
	public static boolean checkNumbers(int first, int second, int third) {
		return ((first==second) && (first+second<third));
	}

}
