package Practice4;

import java.util.*;

/*Zifeng Wang
202515718
10/3/2023
This program write a java program to calculate the average of two numbers.   
I use the concept of Scanner, Parameters, and method return.
*/

public class Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first number (integer):");
		int num1 = input.nextInt();
		
		System.out.println("Input second number (real):");
		double num2 = input.nextDouble();
		
		System.out.println(Average(num1,num2));

	}
	
	//This is a method I calculate the average and return a string. 
	public static String Average(int num1, double num2) {
		double average = (num1 + num2)/2;
	    return "Average of " + num1 + " and " + num2 + " = " + average;
	}
}
