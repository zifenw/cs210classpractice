package Practice6;
import java.io.*;
import java.util.*;
/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/7/2023
This program to check the data that find out the students whose grade is above the average.
This version further simplifies the main method and reduces redundancy by using calling methods.
This version also improves the outlook of the output file. 
I used the calling method, while-loop and array list.
*/
public class ScoreArrayListPlus {
	public static ArrayList<String> name = new ArrayList<>();
	public static ArrayList<Integer> mGrade = new ArrayList<>();
	public static ArrayList<Integer> pGrade = new ArrayList<>();
	public static void main(String[] args) throws FileNotFoundException{
		readfile();
		Scanner choice = new Scanner(System.in);
		int subject = 0;
		do {
		System.out.println("Select a subject 1.Math 2.Pysics(Type 1 or 2)");
		subject = choice.nextInt();
		}while(subject != 1 && subject != 2);
		
		double average = 0;
		String course = "";
		if(subject == 1) {
			average = average(mGrade);
			course = "Math";
			Output(mGrade, average, course);
		}else {
			average = average(pGrade);
			course = "Physics";
			Output(pGrade, average, course);
		}
		
	}
	public static void readfile() throws FileNotFoundException{
		Scanner input = new Scanner(new File("score.txt"));
		while (input.hasNext()) {
			name.add(input.next());
			mGrade.add(input.nextInt());
			pGrade.add(input.nextInt());
		}
	}
	public static double average(ArrayList<Integer> grade) throws FileNotFoundException{
		int Sum = 0; 
		for (int i = 0; i < grade.size();i++) {
			Sum += grade.get(i);
		}
		return (double)Sum / grade.size();
	}
	public static void Output(ArrayList<Integer> grade, double average, String course) throws FileNotFoundException{
		PrintStream out = new PrintStream(new File("output.txt"));
		System.out.println("Name  Math  Physics");
		System.out.println("-------------------");
		out.println("Name  Math  Physics");
		out.println("-------------------");
		for (int i = 0; i < grade.size(); i++) {
			if (grade.get(i) > average) {
				System.out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
				out.println(name.get(i) + "\t" + mGrade.get(i) + "\t" + pGrade.get(i));
			}
		}
		System.out.printf("\nAverage of %s = %.1f",course, average);
		out.printf("\nAverage of %s = %.1f",course, average);
	}

}
