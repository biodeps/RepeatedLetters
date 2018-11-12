package phase3;

import java.util.*;

public class Main_Phase3 {

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
		// LinkedHashMap inserta en el HashMap los elementos en el orden que se insertan
		Map<String, Integer> mapName = new LinkedHashMap<String, Integer>();

		for (int j = 0; j < myname.length(); j++) {
			mynamelist.add(j, myname.charAt(j));

			if (!mapName.containsKey(Character.toString(myname.charAt(j)))) {
				mapName.put(Character.toString(myname.charAt(j)), 1);
			} else {
				mapName.put(Character.toString(myname.charAt(j)),
						mapName.get(Character.toString(myname.charAt(j))) + 1);
			}

		}

		for (int i = 0; i < mynamelist.size(); i++) {
			System.out.println(mynamelist.get(i) + " és " + WhatIAm(mynamelist.get(i)));
		}

		// Convertim les KEY del Map a una llista només per a tenir-les accessibles en
		// posicions i poder printar-les
		List<String> perPrintar = new ArrayList<String>(mapName.keySet());
		for (int k = 0; k < perPrintar.size(); k++) {
			// mapName.get(Object) requereix un objecte, una key de la qual tornarà el seu
			// value: MAI UN INDEX!
			System.out.print("La lletra " + perPrintar.get(k) + " surt " + mapName.get(perPrintar.get(k)));
			if (mapName.get(perPrintar.get(k)) == 1) {
				System.out.println(" vegada.");
			} else {
				System.out.println(" vegades.");
			}
		}
		inputData.close();
	}

}
