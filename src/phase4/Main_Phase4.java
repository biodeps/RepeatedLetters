package phase4;

import java.util.*;

public class Main_Phase4 {

	static List<String> stringToArrayList(String paraula) {
		List<String> llistaParaula = new ArrayList<String>(paraula.length());
		for (int i = 0; i < paraula.length(); i++) {
			llistaParaula.add(Character.toString(paraula.charAt(i)));
		}
		return llistaParaula;
	}
	
	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Good morning! Please, insert your name:");
		// Read my name as a String
		String mydata = inputData.nextLine();
		List<String> fullName = new ArrayList<String>();
		List<String> currentWord = new ArrayList<String>();
		currentWord = stringToArrayList(mydata);
		
		fullName.addAll(currentWord);
		fullName.add(" ");
		
		System.out.println("Now, please insert your surname:");
		
		mydata = inputData.nextLine();
		currentWord = stringToArrayList(mydata);
		fullName.addAll(currentWord);
		
		System.out.println("Your name and surname are " + fullName + ".");

		inputData.close();
	}

}
