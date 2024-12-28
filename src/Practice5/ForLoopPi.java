package Practice5;

/*Zifeng Wang
202515718
10/17/2023
This program to show different digit decimal of pi symmetrically. 
I use the for-loop and the printf-method.
*/

public class ForLoopPi {

	public static void main(String[] args) {
		double pi = 3.14159265359;
		for(int i = 10; i >= 1; i--) {
			System.out.printf("%12." + i + "f\n", pi);
		}
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%12." + i + "f\n", pi);
		}
	}

}
