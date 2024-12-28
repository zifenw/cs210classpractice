package Assignment3;
/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
11/27/2023
This assignment creates a class to filter out qualified personnel from the input file, and a test main(). 
This is the test main().I create an instance of the People class, and calling the Overloading method in the People class.
*/
import java.io.*;
public class Assignment_ZifengWang {

	public static void main(String[] args) throws FileNotFoundException{
		People p = new People("people.txt");
		p.list("s"); // all students
		p.list("t"); // all teachers
		p.list("s","f", 18); // female students age>=18
		p.list("s","m", 20); // male students age>=20
		p.list("t","f", 30); // female teachers age>=30
		p.list("t","m", 35); // male teachers age>=35
		p.list("s","f", 15, 18); //female students age>=15 & age<=18
		p.list("s","m", 15, 20); //male students age>=15 & age<=20
		p.list("t","f", 30, 40); //female teachers age>=30 & age<=40
		p.list("t","m", 30, 40); //male teachers age>=30 and age<=40
	}

}

 