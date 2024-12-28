package Practice4;

import java.util.*;

/*Zifeng Wang
202515718
10/13/2023
This program to calculate the area of the rectangle and circle from user input and compare the area. 
I use the concept of parameter-passing, return, and if/else.
*/

public class AreaComparition {

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
		System.out.println("Rectangle area:" + recArea + "\nCircle area:" + cicArea);
		System.out.println(compare(recArea,cicArea));
	}
	
	//This is a method to find the rectangle area 
	public static double recArea(double width, double height){
		double recArea = width * height;
		return recArea;	
	}
	
	//This is a method to find the circle area
	public static double circleArea(double radius) {
		double cicArea = radius * radius * 3.1415;
		return cicArea;
	}
	
	//This is a method to compare the area use if/else
	public static String compare(double recArea,double cicArea) {
		if (recArea > cicArea) {
			return "The area of the rectangler seems " + recArea / cicArea + " times bigger than the area of the circle.";
		}else if(recArea == cicArea) {
			return "The area of the rectangler and circle are same.";
		}else {
			return "The area of the circle seems " + cicArea / recArea + " times bigger than the area of the rectangler.";
		}
	}
}
