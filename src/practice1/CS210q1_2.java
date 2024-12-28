package practice1;

/* 
Student Name:Zifeng Wang
Student ID:202515718
This program produce the following song using “method calling method” to reduce redundancy.
*/
public class CS210q1_2 {

	public static void main(String[] args) {
		System.out.println("*Leaves are Falling*");
		System.out.println("");
		LeavsAreFalling();
		System.out.println("One fell on my nose!");
		System.out.println("");
		LeavsAreFalling();
		System.out.println("One fell on my toes!");
		System.out.println("");
		LeavsAreFalling();
		System.out.println("One fell on my head!");
		System.out.println("");
		LeavsAreFalling();
		System.out.println("Yellow, Orange and red!");
	}
	public static void LeavsAreFalling() {
		System.out.println("Leaves are falling,\nLeaves are falling,");
	}
	
}
