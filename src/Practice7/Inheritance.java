package Practice7;

class Parent{
	int num = 1;
}
class Child extends Parent{
	int num = 2;
//  int num = 1; from super-clss
	public void output() {
		System.out.println(this.num); //2
		System.out.println(super.num); //1  not num in the super class is the num from super-class which is also in the sub-class 
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.output(); //2\n1
		Parent p = new Parent();
		p.num = 3;  //just change the num in p method but not the num in Parent class
		System.out.println(p.num); //3
		c.output(); //2\n1

	}

}
