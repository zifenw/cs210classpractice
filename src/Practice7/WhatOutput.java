package Practice7;

class Super{
	int num = 1;
	int id = 2;
}
class Sub extends Super{
	int num = 3;  //num or this.num
//  int num = 1; super.num
//  int id = 2;
	public void display() {
		System.out.println(num); //3
		System.out.println(super.num);  //1
		System.out.println(id);  //2
	}
		
}

public class WhatOutput {

	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
	}

}
