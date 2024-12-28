package Practice5;

import java.util.*;

/*Zifeng Wang
202515718
10/18/2023
This program to let user input three number num1 and num2 is not equal, num1 + num2 < num3 
I use the while-loop.
*/

public class whileloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean made = false;
		System.out.println("Please input three number that num1 and num2 is not equal, and num1 + num2 < num3");
		
		while (!made) {
			System.out.println("input first number:");
			int num1 = input.nextInt();
			System.out.println("input second number:");
			int num2 = input.nextInt();
			System.out.println("input third number:");
			int num3 = input.nextInt();
			if (num1 != num2 && num1 + num2 < num3) {
				System.out.println("You are a genius! Bye!");
				made = true;
			}else {
				System.out.println("input again!\n");
			}
		}

	}

}
