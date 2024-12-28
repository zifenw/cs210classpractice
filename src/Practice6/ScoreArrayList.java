package Practice6;

import java.io.*;
import java.util.*;

/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/7/2023
This program to check the data that find out the students whose grade is above the average. 
I used the while-loop and array list.
*/

public class ScoreArrayList {
	
	public static ArrayList<String> name = new ArrayList<>();
	public static ArrayList<Integer> mGrade = new ArrayList<>();
	public static ArrayList<Integer> pGrade = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("score.txt"));
		
		int studentN = 0; int mathSum = 0; int physicsSum = 0; 
		while (input.hasNext()) {
			name.add(input.next());
			mGrade.add(input.nextInt());
			pGrade.add(input.nextInt());
			mathSum += mGrade.get(studentN);
			physicsSum += pGrade.get(studentN);
			studentN++;
		}
		double mAverage = (double)mathSum / studentN;
		double pAverage = (double)physicsSum / studentN;
		
		Scanner choice = new Scanner(System.in);
		int subject = 0;
		do {
		System.out.println("Select a subject 1.Math 2.Pysics(Type 1 or 2)");
		subject = choice.nextInt();
		}while(subject != 1 && subject != 2);
		
		System.out.println("Name  Math  Physics");
		System.out.println("-------------------");
		 
		PrintStream out = new PrintStream(new File("output.txt"));
		if (subject == 1) {
			for (int i = 0; i < studentN; i++) {
				if (mGrade.get(i) > mAverage) {
					System.out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
					out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
				}
			}
			System.out.printf("Average of Math = %.1f", mAverage);
		}else {
			for (int i = 0; i < studentN; i++) {
				if (pGrade.get(i) > pAverage) {
					System.out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
					out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
				}
			}
			System.out.printf("Average of Physics = %.1f", pAverage);
		}
		
	}

}
