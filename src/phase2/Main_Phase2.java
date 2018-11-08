package phase2;

import java.util.*;

public class Main_Phase2 {
	
	static boolean IsVowel(char vowel) {
		
		return ("aeiouAEIOU".indexOf(vowel) != -1);
		
	}

	static String WhatIAm(char letter) {

		if (Character.isDigit(letter)) {
			return "un error: Els noms no poden contenir números!";
		}

		if (IsVowel(letter)) {
			return "vocal.";
		}

		return "consonant.";
	}

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Good morning! Please, insert your Name");
		String myname = inputData.nextLine();

		List<Character> mynamelist = new ArrayList<Character>();

		for (int j = 0; j < myname.length(); j++) {
			mynamelist.add(j, myname.charAt(j));
		}

		for (int i = 0; i < mynamelist.size(); i++) {
			System.out.println(mynamelist.get(i) + " és " + WhatIAm(mynamelist.get(i)));
		}
		inputData.close();

	}

}
