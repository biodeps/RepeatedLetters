package phase1;

import java.util.Scanner;

public class Main_Phase1 {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Good morning! Please, insert your Name");
		String myname = inputData.nextLine();
		System.out.print(myname.charAt(0));
		for (int i = 1; i < myname.length(); i++) {
			System.out.print(" " + myname.charAt(i));
		}
		
	}

}
