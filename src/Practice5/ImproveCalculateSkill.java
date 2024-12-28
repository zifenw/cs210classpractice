package Practice5;

import java.util.*;

/*Zifeng Wang
202515718
10/20/2023
This is a program help you improve your calculate skill.
I use the while-loop, if loop and type boolean.
*/

public class ImproveCalculateSkill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		boolean made = false;
		int min = 0;
		int max = 0;
		while (!made) {
			System.out.println("Type a positive minimum of random:");
			min = input.nextInt();
			System.out.println("Type a positive maximum of random:");
			max = input.nextInt();
			if (Ncheck(min, max)&&Pcheck(min,max)) {
				made = true;
			}
			if (!Ncheck(min, max)) {
				System.out.println("minimum should be less than maximum!");
			}
			if (!Pcheck(min,max)) {
				System.out.println("minmunber and maxnumber should be both positive!");
			}
		}
		int randomN1 = rand.nextInt(max - min + 1)+ min;
		int randomN2 = rand.nextInt(max - min + 1)+ min;
		
		System.out.println("Choose the one operator from + and -:");
		String op = input.next();
		made = false;
		
		 
		while(!made) {
			System.out.printf("%d %s %d = ?",randomN1, op, randomN2);
			int answer = input.nextInt();	
			if (answer == math(op, randomN1, randomN2)) {
				System.out.println("You are a math genius! Bye");
				made = true;
			}else {
				System.out.println("Wrong answer, try again.");
			}
		}
		
	}
	
	// a method check minimum is smaller than maximum
	public static boolean Ncheck(int min, int max) {
		return (min < max);
	}
	// a method check the positive number
	public static boolean Pcheck(int min, int max) {
		return (min > 0 && max > 0);
	}
	// a method give back the result
	public static int math(String op,int randomN1, int randomN2) {
		int result = 0;
		if (op.equals("+")) {
			result = randomN1 + randomN2;
		}
		if (op.equals("-")) {
			result = randomN1 - randomN2;
		}
		return result;
	}
}
