package Practice4;

import java.util.*;

/*Zifeng Wang
202515718
10/3/2023
This program write a java program to show some information of the String user type on the keyboard.   
I use the concept of Scanner, String Parameters, and method return.
*/

public class PrintString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a string:");
		String worlds = input.nextLine();

		System.out.println(printString(worlds));
	}
	
	// This is a method to return some information of a one-line String 
	public static String printString(String worlds) {
		int length = worlds.length();
		String firstCharacter = worlds.substring(0,1);
		String lastCharacter = worlds.substring(length-1);
		return "String: " + worlds + "\nlength:" + length + "\nfirst character:" + firstCharacter + "\nlast character:" + lastCharacter;
		
	}
}
