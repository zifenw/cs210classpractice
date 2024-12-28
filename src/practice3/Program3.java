package practice3;

/*Zifeng Wang
202515718
10/3/2023
This program Write a java program Write a java program to calculate the sum between two numbers. 
I use the concept of parameter-passing and for loop.
*/

public class Program3 {

	public static void main(String[] args) {
		int num1 = 3;
		for (int i = 3; i <= 6; i++) {
			int num2 = i;
			System.out.println(sum(num1,num2));
		}
	}
	
	public static String sum(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++ ) {
			sum = sum + i;
		}
		return num1 + "~" + num2 + "=" + sum;
	}
	
}
