package Practice6;

/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/15/2023
This program to check the data that find out the students whose grade is above the average.
I used the calling method, while-loop, array list, and class object.
*/

import java.io.*;
import java.util.*;

class student{
	String name;
	int mathGrade;
	int physicsGrade;
}

public class ClassObject {
	public static ArrayList<student> GradeArray = new ArrayList<>();
	public static ArrayList<Integer> tempArray = new ArrayList<>();
	public static double average; 
	public static String course;
	public static void main(String[] args) throws FileNotFoundException{
		readfile();
		
		Scanner choice = new Scanner(System.in);
		int subject = 0;
		do {
		System.out.println("Select a subject 1.Math 2.Pysics(Type 1 or 2)");
		subject = choice.nextInt();
		}while(subject != 1 && subject != 2);
		
		tempArray(subject);
		average = average(subject);
		Output(average, subject, tempArray);
	}  
	
	//This method reads the file.
	public static void readfile()throws FileNotFoundException{
		Scanner input = new Scanner(new File("score.txt"));
		while (input.hasNext()) {
			student s = new student();
			s.name = input.next();
			s.mathGrade = input.nextInt();
			s.physicsGrade = input.nextInt();
			GradeArray.add(s);
		}
	}
	
	//This method saves the grade of the choose course to the tempArray.
	public static void tempArray(int subject) {
	   	if (subject == 1) {
    		for(int i = 0; i < GradeArray.size(); i++)
    			tempArray.add(GradeArray.get(i).mathGrade);
	    	}else {
	    		for(int i = 0; i < GradeArray.size(); i++)
	    			tempArray.add(GradeArray.get(i).physicsGrade);
	    	}
	}
	
	//This method calculates and returns the average of the chosen course. 
	public static double average(int subject) {
		int sum = 0; 
		for (int i = 0; i < GradeArray.size();i++) {
			if (subject == 1) {
				sum += GradeArray.get(i).mathGrade;
			}else {
				sum += GradeArray.get(i).physicsGrade;
			}
		}
		return (double)sum / GradeArray.size();
	}
	
	// this method prints and gives a new file output the students whose grade is above the average.
	public static void Output(double average, int subject, ArrayList<Integer> grade) throws FileNotFoundException{
		PrintStream out = new PrintStream(new File("output.txt"));
		System.out.println("Name  Math  Physics");
		System.out.println("-------------------");
		out.println("Name  Math  Physics");
		out.println("-------------------");
		
		if (subject == 1) {
			course = "Math";
		}else{
			course = "Physics";
		}
		
		for (int i = 0; i < grade.size(); i++) {
			if (grade.get(i) > average) {
				System.out.println(GradeArray.get(i).name + "\t" + GradeArray.get(i).mathGrade + "\t" + GradeArray.get(i).physicsGrade);
				out.println(GradeArray.get(i).name + "\t" + GradeArray.get(i).mathGrade + "\t" + GradeArray.get(i).physicsGrade);
			}
		}
		System.out.printf("\nAverage of %s = %.1f",course, average);
		out.printf("\nAverage of %s = %.1f",course, average);
	}

}
