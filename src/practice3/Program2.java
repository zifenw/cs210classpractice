package practice3;

/*Zifeng Wang
202515718
10/3/2023
This program Write a java program Write a java program to calculate the average of two numbers. 
I use the concept of parameter-passing and return.
*/

public class Program2 {

	public static void main(String[] args) {
		int num1 = 3;
		double num2 = 5.6;
		
		System.out.println(average(num1,num2));
	}
	
	public static String average(int num1, double num2) {
		return  "Average of " + num1 + " and " + num2 + " = " + (num1 + num2)/2;
	}

}
