package Practice5;

import java.util.*;

public class number10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean made = false;
		while (!made) {
			System.out.println("Input a number greater than 10:");
			int num = input.nextInt();
			if (num > 10) {
				System.out.println("You are a genius!");
				made = true;
			}else {
				System.out.println("Please input again.");
				num = input.nextInt();
			}
		}
		
	}

}
