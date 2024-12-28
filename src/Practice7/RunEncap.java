package Practice7;

import java.util.Scanner;

public class RunEncap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The User's Name:");
		String setName = input.next();
		System.out.println("The User's Age:");
		int setAge = input.nextInt();
		System.out.println("What player:");
		String setPlayer = input.next();
		EncapTest encap = new EncapTest(setName, setAge, setPlayer);
		/*
		encap.setName("Chloe");
		encap.setAge(20);
		encap.setPlayer("snowboarder");
		*/
		System.out.print("Name: " +encap.getName() + "\nAge: " + encap.getAge() + "\nPlayer: " + encap.getPlayer());

	}

}
