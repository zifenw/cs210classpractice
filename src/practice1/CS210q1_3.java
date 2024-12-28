package practice1;

/* 
Student Name:Zifeng Wang
Student ID:202515718
This program draw some diamonds.
*/

public class CS210q1_3 {

	public static void main(String[] args) {
		top();
		bottom();
		top();
		bottom();
		top();

	}
	public static void top() {
		System.out.println("  /\\");
		System.out.println(" /  \\");
		System.out.println("/    \\");
	}
	public static void bottom() {
		System.out.println("\\    /");
		System.out.println(" \\  /");
		System.out.println("  \\/");
	}
}
