package Practice7;

import java.util.*;

/*Zifeng Wang
202515718
11/17/2023
This is a program to calculate the different shape area use other class.
I used the scanner and use another class I crate.
*/

public class endUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		user_defined area = new user_defined();
		System.out.println("Difine a shape 1)triangle, 2)circle, 3)rectangle:");
		int choice = input.nextInt();
		if (choice ==1) {
			System.out.println("Triangle Base:");
			area.base = input.nextDouble();
			System.out.println("Triangle Height:");
			area.height = input.nextInt();
			area.result = area.triangleArea(area.base,area.height);
			System.out.printf("Triangle area: %.2f", area.result);
		}else if(choice == 2){
			System.out.println("Circle radius:");
			area.radius = input.nextDouble();
			area.result = area.circleArea(area.radius);
			System.out.printf("Circle area: %.2f", area.result);
		}else {
			System.out.println("Rectangle Base:");
			area.base = input.nextDouble();
			System.out.println("Rectangle Height:");
			area.height = input.nextInt();
			area.result = area.rectangleArea(area.base,area.height);
			System.out.printf("Rectangle area: %.2f", area.result);
		}
		
		  
	}

}
