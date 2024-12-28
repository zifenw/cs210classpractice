package Practice5;

import java.util.*;

/*Zifeng Wang
202515718
10/17/2023
This program to calculate the area of the rectangle and circle from user input and compare the area. 
I use the concept of parameter-passing, return, if/else, and update the printf-method.
*/

public class TwoArea {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input rectangle width:");
		double width = input.nextDouble();
		System.out.println("Input ractangle height:");
		double height = input.nextDouble();
		System.out.println("Input circle radius:");
		double radius = input.nextDouble();
		
		double recArea = recArea(width,height); 
		double cicArea = circleArea(radius);
		System.out.printf("Rectangle area: %.2f\nCircle area: %.2f\n", recArea, cicArea );
		//System.out.println(compare(recArea,cicArea));
		
		if (recArea > cicArea) {
		    double ratio = recArea / cicArea;
			System.out.printf("The area of the rectangle seems %.2f times bigger than the area of the circle.", ratio);
		}else if(recArea == cicArea) {
			System.out.printf("The area of the rectangle and circle are same.");
		}else {
			double ratio = cicArea / recArea;
			System.out.printf("The area of the circle seems %.2f times bigger than the area of the rectangle.", ratio);
		}
		
	}
	
	//This is a method to find the rectangle area 
	public static double recArea(double width, double height){
		double recArea = width * height;
		return recArea;	
	}
		
	//This is a method to find the circle area
	public static double circleArea(double radius) {
		double cicArea = radius * radius * 3.1415926;
		return cicArea;
		}
}
