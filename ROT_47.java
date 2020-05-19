//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class ROT_47 {
	public static void main(String[] args) {
		//i
		System.out.println(encrypt("something")); //Should return "D@>6E9:?8"
		//ii
		System.out.println(encrypt("D@>6E9:?8")); //Should return "something"
	}

	public static String encrypt(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (array[i] >= 33 && array[i] <= 80) {
				array[i] += 47;
			} else if (array[i] >= 81 && array[i] <= 126) {
				array[i] -= 47;
			}
		}
		return new String(array);
	}

	public static String decrypt(String s) {
		return encrypt(s);
	}
}
