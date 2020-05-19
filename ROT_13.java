//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class ROT_13 {
	public static void main(String[] args) {
		//i
		System.out.println(encrypt("hello")); //Should return "uryyb"
		//i
		System.out.println(encrypt("hello")); //Should return "uryyb"
	}

	public static String encrypt(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (array[i] >= 'a' && array[i] <= 'm') {
				array[i] += 13;
			} else if (array[i] >= 'A' && array[i] <= 'M') {
				array[i] += 13;
			} else if (array[i] >= 'n' && array[i] <= 'z') {
				array[i] -= 13;
			} else if (array[i] >= 'N' && array[i] <= 'Z') {
				array[i] -= 13;
			}
		}
		return new String(array);
	}

	public static String decrypt(String s) {
		return encrypt(s);
	}
}
