package Practice7;

import java.util.Scanner;

/*Zifeng Wang
202515718
11/17/2023
This is a program to calculate the rectangle area use other class.
I used the scanner and use another class I crate.
*/

public class UseCalculateRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Rectangle Width:");
		double w = input.nextDouble();
		System.out.println("Rectangle Height:");
		double h = input.nextInt();
		calculateRectangle a = new calculateRectangle(w, h);
		double output = a.area();
		System.out.println("The area of the rectangle is " + output);
	}

}
