package Assignment3;
/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/27/2023
This assignment creates a class to filter out qualified personnel from the input file, and a test main(). 
This is the people class. I used the Constructor, Method Overloading, Method-calling, while-Loop, if-statement, file-read, and ArrayList.
*/
import java.io.*;
import java.util.*;
class PersonInfo{
	String identity;
	String name;
	String gender;
	int age;
}
public class People {
	static ArrayList<PersonInfo> person = new ArrayList<>();
	static String id, gen; 
	public int count;
	
	People(String file) throws FileNotFoundException{
		Scanner input = new Scanner(new File(file));
		while (input.hasNext()) {
			PersonInfo p = new PersonInfo();
			p.identity = input.next();
			p.name = input.next();
			p.gender = input.next();
			p.age = input.nextInt();
			person.add(p);
		}
	}
	public void list(String identity) {
		count = 0;
		AbridgeCancel(identity);
		System.out.printf("List of people\ntype:%s\n",id);
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).identity.equals(identity)) {
				System.out.println(person.get(i).name);
				count++;
			}
		}
		System.out.printf("The number of eligible individuals is %d\n\n",count);
	}
	public void list(String identity, String gender, int min) {
		count = 0;
		AbridgeCancel(identity);
		AbridgeCancel(gender);
		System.out.printf("List of people\ntype:%s gender: %s age: >= %d\n",id, gen, min);
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).identity.equals(identity) && person.get(i).gender.equals(gender) && person.get(i).age >= min) {
				System.out.println(person.get(i).name);
				count++;
			}
		}
		System.out.printf("The number of eligible individuals is %d\n\n",count);
	}
	public void list(String identity, String gender, int min, int max) {
		count = 0;
		AbridgeCancel(identity);
		AbridgeCancel(gender);
		System.out.printf("List of people\ntype:%s gender: %s age: >= %d & <= %d\n",id, gen, min, max);
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).identity.equals(identity) && person.get(i).gender.equals(gender) && person.get(i).age >= min && person.get(i).age <= max) {
				System.out.println(person.get(i).name);
				count++;
			}
		}
		System.out.printf("The number of eligible individuals is %d\n\n",count);
	}
	public static void AbridgeCancel(String choice) {
		if(choice.equals("t")) {
			id = "teacher";
		}
		if(choice.equals("s")){
			id = "student";
		}
		if(choice.equals("f")) {
			gen = "female";
		}
		if(choice.equals("m")){
			gen = "male";
		}
		
	}
	
}

