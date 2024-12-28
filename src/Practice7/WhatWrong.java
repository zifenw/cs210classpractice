package Practice7;

class shape{
	private int width;
	private int height;
	
	shape(int width, int height){
		this.width=width;     //miss the this method
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
}

public class WhatWrong {

	public static void main(String[] args) {
		shape s1 = new shape(2,3);		//since the conductor
		//s1.width=2;				//since the private
		//s1.height=3;
		shape s2 = new shape(4,5); 
		//s2.width=4;
		//s2.height=5;
		System.out.println(s1.getArea()); 
		System.out.println(s2.getArea());//will get the same Area since the static error

	}

}
