package Assignment1;
/* 
 * CS210 Assignment 01 (Methods - Sequence)
 * Zifeng Wang - zifeng.wang@bellevuecollege.edu
 * Student ID: 202515718
 * 2023.9.22 - fall quarter
 * This program is a short puzzle.
 */
public class Assg01_A_Methords {
	public static void first() {
        System.out.println("first method");
        third();
        second();
        second();            
    }

    public static void second() {
        System.out.println("second method");         
    }
 
    public static void third() {
        System.out.println("third method");
        second();                
    } 
 
    public static void main(String[] args) {
    // DO NOT change this main method
       first();
       third();
       second();
       third();;
    // DO NOT change this main method
    }

}

