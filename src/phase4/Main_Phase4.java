package phase4;

import java.util.*;

public class Main_Phase4 {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Good morning! Please, insert your name:");
		// Read my name as a String
		String mydata = inputData.nextLine();

		// List<String> auxList = Arrays.asList(mydata);
		List<String> fullName = new ArrayList<String>();
		// Convert the String to an ArrayList
		for (int i = 0; i < mydata.length(); i++) {
			fullName.add(Character.toString(mydata.charAt(i)));
		}
		fullName.add(" ");
		System.out.println("Now, please insert your surname:");
		mydata = inputData.nextLine();
		for (int j = 0; j < mydata.length(); j++) {
			fullName.add(Character.toString(mydata.charAt(j)));
		}

		System.out.println("Your name and surname are " + fullName + ".");

		inputData.close();
	}

}
