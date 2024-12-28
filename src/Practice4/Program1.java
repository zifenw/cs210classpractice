package Practice4;

import java.util.*;

/*Zifeng Wang
202515718
10/3/2023
This program write a java program to draw the user's input symbol.  
I use the concept of Scanner, Parameters, and for loop.
*/

public class Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a symbol:");
		String symbol = input.next();
		
		System.out.println("How many " + symbol + "would you like to draw?");
		int times = input.nextInt();
		
		draw(symbol,times);
	}
	
	//This is a method use for loop to println the symbol 
	public static void draw(String symbol, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println(symbol);
		}
		
	}

}
