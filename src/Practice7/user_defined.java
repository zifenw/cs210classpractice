package Practice7;

/*Zifeng Wang
202515718
11/17/2023
This is a class to calculate the different shape and other program can use it.
*/

public class user_defined {
	public static double base, height, radius, result;
	
	public double triangleArea(double w, double h) {
		return w * h / 2;
	}
	public double circleArea(double r) {
		return 3.1415926 * r * r;
	}
	public double rectangleArea(double w, double h) {
		return w * h;
	}
}
