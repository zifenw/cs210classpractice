package Practice6;

import java.io.*;
import java.util.*;
class studentInfo{
	String name;
	String gender;
	int age;
}

public class ClassAndArray {

	public static ArrayList<studentInfo> InfoArray = new ArrayList<>();
	public static int count, sum;
	public static double average; 
	public static String gender;
	public static void main(String[] args) throws FileNotFoundException{
		readfile();
		
		Scanner genderInput = new Scanner(System.in);
		String choice = "";
		do {
		System.out.println("Select a gender F(f) or M(m)");
		choice = genderInput.next();
		}while(!choice.equalsIgnoreCase("f") && !choice.equalsIgnoreCase("m"));
		
		output(choice);
		
	}
	// the method to read the file
	public static void readfile()throws FileNotFoundException{
		Scanner input = new Scanner(new File("member.txt"));
		while (input.hasNext()) {
			studentInfo s = new studentInfo();
			s.name = input.next();
			s.gender = input.next();
			s.age = input.nextInt();
			InfoArray.add(s);
		}
	}
	public static void ChoiceToGender(String choice) {
		if(choice.equalsIgnoreCase("f")) {
			gender = "female";
		}else {
			gender = "male";
		}
	}
	public static void output(String choice) {
		ChoiceToGender(choice);
		System.out.printf("All %s-age data:\n", gender);
		for(int i = 0; i < InfoArray.size(); i++) {
			if (InfoArray.get(i).gender.equalsIgnoreCase(choice)) {
				System.out.printf("%s %s %d\n", InfoArray.get(i).name, InfoArray.get(i).gender, InfoArray.get(i).age);
				count++;
				sum += InfoArray.get(i).age;
			}
		}
		average = (double)sum / count;
		System.out.printf("%d %s in total.\n", count, gender);
		System.out.printf("The average age of these %s is %.2f.", gender, average);
	}
	
}
