//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class Hangman_Chanana {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//1
		int[] a = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
		int[] b = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};

		//2
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			sum += b[i];
		}
		System.out.println(sum / (a.length + b. length));

		//3
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - b[i]) <= 2 && a[i] != b[i]) {
				count++;
			}
		}
		System.out.println(count);

		//4
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;	
			}
			if (b[i] % 2 == 0) {
				even++;
			} else {
				odd++;	
			}
		}
		if (even > odd) {
			System.out.println("More even than odd");
		} else {
			System.out.println("More odd than even");
		}

		//5
		boolean threeInARow = false;
		for (int i = 2; i < a.length; i++) {
			if (a[i] == a[i-1] && a[i-1] == a[i-2]) {
				threeInARow = true;
			}
			if (b[i] == b[i-1] && b[i-1] == b[i-2]) {
				threeInARow = true;
			}
		}
		if (threeInARow) {
			System.out.println("Found three in a row");
		} else {
			System.out.println("Didn't find three in a row");
		}

		//6
		boolean two = false;
		boolean four = false;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == 2 && a[i-1] == 2) {
				two = true;
			}
			if (a[i] == 4 && a[i-1] == 4) {
				four = true;
			}
		}
		if (!(two && four) && (two || four)) {
			System.out.println("Two / four");
		} else {
			System.out.println("Not two / four");
		}

		//7
		int[] c = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			c[a.length - 1 - i] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

		//8
		int maxA = 0;
		int minA = 0;
		int maxB = 0;
		int minB = 0;
		for (int i = 0; i < a.length; i++) {
			maxA = Math.max(maxA, a[i]);
			minA = Math.min(minA, a[i]);
			maxB = Math.max(maxB, b[i]);
			minB = Math.min(minB, a[i]);
		}
		System.out.println("Range of A: " + (maxA - minA));
		System.out.println("Range of B: " + (maxB - minB));

		//app
		String[] secretWord = {"s", "e", "c", "r", "e", "t"};
		String[] masked = {"_", "_", "_", "_", "_", "_"};
		int guesses = 5;
		while (guesses > 0 || secretWord.equals(masked)) {
			System.out.print("[");
			for (int i = 0; i < masked.length; i++) {
				if (i == masked.length - 1) {
					System.out.println(masked[i] + "]");
				} else {
					System.out.print(masked[i] + ", ");
				}
			}
			System.out.println("Enter your guess letter >> ");
			String guessLetter = console.next();
			boolean containsGuess = false;
			for (int i = 0; i < secretWord.length; i++) {
				if (secretWord[i].equals(guessLetter)) {
					masked[i] = secretWord[i];
					containsGuess = true;
				}
			}
			if (containsGuess) {
				System.out.println("Correct letter!");
			} else {
				guesses--;
				System.out.println("Miss! Guesses left >>> " + guesses);
			}
		}
		if (secretWord.equals(masked)) {
			System.out.println("Congratulations! you guessed correctly");
		} else {
			System.out.println("You ran out of guesses. The word was ");
			for (int i = 0; i < secretWord.length; i++) {
				System.out.print(secretWord[i]);
			}
		}
	}
}
