//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class WordScramble_Chanana {
	public static void main(String[] args) {
		//1
		System.out.println(isLetterA('a')); 				  //should return true
		System.out.println(isLetterA('b')); 				  //should return false
		//2
		System.out.println(hasTwoA("apples are red")); 			  //should return true
		System.out.println(hasTwoA("this sentence only includes one a")); //should return false
		//3
		System.out.println(isVowel('a')); 				  //should return true
		System.out.println(isVowel('b')); 				  //should return false
		//4
		System.out.println(numVowels("this is a test")); 		  //should return 4
		//5
		System.out.println(evenChars("aabb", 'a', 'b')); 		  //should return true
		System.out.println(evenChars("abb", 'a', 'b'));  		  //should return false
		//6
		System.out.println(twoInARow("aa", 'a')); 			  //should return true
		System.out.println(twoInARow("Aa", 'a')); 	 		  //should return false
		//7
		System.out.println(capitalizeVowels("hello")); 	 		  //should return hEllO
		//8
		System.out.println(longestWord("Hello how are you")); 		  //should return Hello
		//9
		System.out.println(containsPrefix("abXYabc", 1)); 		  //should return true
		System.out.println(containsPrefix("abXYabc", 2)); 		  //should return true
		System.out.println(containsPrefix("abXYabc", 3)); 		  //should return false
		//app
		wordScramble("Bygones!");
	}

	public static boolean isLetterA(char letter) {
		return letter == 'a' || letter == 'A';
	}

	public static boolean hasTwoA(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				count++;
			}
		}
		return count >= 2;
	}

	public static boolean isVowel(char letter) {
		return "AEIOUaeiou".indexOf(letter) != -1;
	}

	public static int numVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

	public static boolean evenChars(String s, char a, char b) {
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == a) {
				countA++;
			}
			if (s.charAt(i) == b) {
				countB++;
			}
		}
		return countA == countB;
	}

	public static boolean twoInARow(String s, char a) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}

	public static String capitalizeVowels(String s) {
		String end = "";
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				end += Character.toUpperCase(s.charAt(i));
			} else {
				end += s.charAt(i);
			}
		}
		return end;
	}

	public static String longestWord(String s) {
		String[] words = s.split(" ");
		String longest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		return longest;
	}

	public static boolean containsPrefix(String s, int n) {
		return s.substring(n).indexOf(s.substring(0, n)) != -1;
	}

	static Random rand = new Random();
	public static void wordScramble(String line) {
		String[] words = line.split(" ");
		String inner = "";
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i].charAt(0));
			inner = "";
			for (int j = 1; j < words[i].length() - 1; j++) {
				if (rand.nextBoolean()) {
					inner = inner + words[i].charAt(j);
				} else {
					inner = words[i].charAt(j) + inner;
				}
			}
			System.out.print(inner + words[i].charAt(words[i].length() - 1) + " ");
		}
		System.out.println();
	}
}
