package practice3;

/*Zifeng Wang
202515718
10/3/2023
This program Write a java program using the following code to produce the expected output. 
I use the concept of parameter-passing and for loop(s).
*/

public class Program1 {

	public static void main(String[] args) {
		 String s = "#";
         int row = 5;
         int col = 4;

         DrawSymbols( row, col, s );
   }

	public static void DrawSymbols( int row, int col, String s) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(s);
			}
			System.out.println();
		}

	}

}
