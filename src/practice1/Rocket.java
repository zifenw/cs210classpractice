package practice1;

/* 
Student Name:Zifeng Wang
Student ID:202515718
This program draw the rocket remove any redundancy 
and apply the 'method-calling-method' concept.
*/

public class Rocket {

	public static void main(String[] args) {
		triangle();
		square();
		System.out.println("|  969  |");
		square();
		triangle();
	}
	
	public static void triangle(){
		System.out.println("   /|\\");
		System.out.println("  / | \\");
		System.out.println(" /  |  \\");
	}
	
	public static void square() {
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("+-------+");
	}
}
