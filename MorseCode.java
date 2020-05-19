//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class MorseCode {
	static final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789 ";
	static final String[] morse = {".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ", ".. ", ".--- ", "-.- ", 
					".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ", "...- ", 
					".-- ", "-..- ", "-.-- ", "--.. ", "----- ",".----- ", "..--- ", "...-- ", "....- ", 
					"..... ", "-.... ", "--... ", "---.. ","----. ", "| "};

	public static void main(String[] args) {
		System.out.println(encrypt("try this"));;
		System.out.println(decrypt("--- -- --. | .. - | .-- --- .-. -.- . -.."));
	}

	public static String encrypt(String s) {
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			output += morse[alphabet.indexOf(s.charAt(i))];
		}
		return output;
	}

	public static String decrypt(String s) {
		String[] letters = s.split(" ");
		String output = "";
		for (int i = 0; i < letters.length; i++) {
			output += alphabet.charAt(Arrays.asList(morse).indexOf(letters[i] + " "));
		}
		return output;
	}
}
