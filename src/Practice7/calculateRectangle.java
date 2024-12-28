package Practice7;

/*Zifeng Wang
202515718
11/17/2023
This is a class to calculate the rectangle area 
everyone can use it. have concept of 'constructor'
*/

public class calculateRectangle {
	public static double width, height;
	calculateRectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return width * height;
	}
}
