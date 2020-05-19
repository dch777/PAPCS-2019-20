//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class CaesarCipher {
	public static void main(String[] args) {
		//i
		System.out.println(encrypt("what is this", 6)); //Should return "uryyb"
		//ii
		System.out.println(decrypt("q lwv'b mdmv", 8)); //Should return "uryyb"
	}

	public static String encrypt(String s, int key) {
		char[] array = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (array[i] >= 'a' && array[i] <= 'z' - key) {
				array[i] += key;
			} else if (array[i] >= 'A' && array[i] <= 'Z' - key) {
				array[i] += key;
			} else if (array[i] > 'z' - key && array[i] <= 'z') {
				array[i] -= (26 - key);
			} else if (array[i] > 'Z' - key && array[i] <= 'Z') {
				array[i] -= (26 - key);
			}
		}
		return new String(array);
	}

	public static String decrypt(String s, int key) {
		char[] array = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (array[i] >= 'a' + key && array[i] <= 'z') {
				array[i] -= key;
			} else if (array[i] >= 'A' + key && array[i] <= 'Z') {
				array[i] -= key;
			} else if (array[i] >= 'a' && array[i] < 'a' + key) {
				array[i] += (26 - key);
			} else if (array[i] >= 'A' && array[i] < 'A' + key) {
				array[i] += (26 - key);
			}
		}
		return new String(array);
	}
}

