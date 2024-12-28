package Assignment1;
/* 
 * CS210 Assignment 01 (Methods - Sequence)
 * Zifeng Wang - zifeng.wang@bellevuecollege.edu
 * Student ID: 202515718
 * 2023.9.22 - fall quarter
 * This program draws a picture of a tower.
 */
public class Assg01_C_WriteTower {
	public static void main(String[] args) {
	    Top();
	    Body();
	    Body();	   	   
	    Bottom();
	}
	
	public static void Top() {
		System.out.println("        X");
	    System.out.println("       / \\");
	    System.out.println("      /   \\");
	    System.out.println("     /  O  \\");
	    System.out.println("    /  O O  \\");
	    Bodyline();
	}
	
	public static void Bodyline() {
		System.out.println("   |-|--|--|-|");
	}
	
	public static void Body() {
		System.out.println("    |\\     /|");
	    System.out.println("    | \\   / |");
	    System.out.println("    |  \\ /  |");
	    Bodyline();
		System.out.println("    |  / \\  |");
	    System.out.println("    | /   \\ |");
	    System.out.println("    |/     \\|");
	    Bodyline();
	}
	
	public static void Bottom() {
		System.out.println("   |    O    |");
	    System.out.println("   |  |   |  |");
	    System.out.println("------|   |------");
	}

}
