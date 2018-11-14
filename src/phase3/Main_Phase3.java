package phase3;

import java.util.*;

public class Main_Phase3 {

	static boolean isVowel(char vowel) {

		return ("aeiouAEIOU".indexOf(vowel) != -1);

	}

	static String whatIAm(char letter) {

		if (Character.isDigit(letter)) {
			return "un error: Els noms no poden contenir números!";
		}

		if (isVowel(letter)) {
			return "vocal.";
		}

		return "consonant.";
	}
	
	static void setMap (Map<String, Integer> myMap, String name, List<Character> list) {
		
		for (int j = 0; j < name.length(); j++) {
			list.add(j, name.charAt(j));

			if (!myMap.containsKey(Character.toString(name.charAt(j)))) {
				myMap.put(Character.toString(name.charAt(j)), 1);
			} else {
				myMap.put(Character.toString(name.charAt(j)),
						myMap.get(Character.toString(name.charAt(j))) + 1);
			}

		}
		
	}

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		System.out.println("Good morning! Please, insert your Name");
		String myname = inputData.nextLine();

		
		// LinkedHashMap inserta en el HashMap los elementos en el orden que se insertan
		Map<String, Integer> mapName = new LinkedHashMap<String, Integer>();
		List<Character> mynamelist = new ArrayList<Character>();
		setMap(mapName, myname, mynamelist);
	
		for (int i = 0; i < mynamelist.size(); i++) {
			System.out.println(mynamelist.get(i) + " és " + whatIAm(mynamelist.get(i)));
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
