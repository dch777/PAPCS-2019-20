//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class ChangeMaker_Chanana {
	public static void main(String[] args) {
		//1
		System.out.println(simpleSearch(new int[] {8, 6, 7, 4, 3, 6, 5}, 7));
		//2
		squareBoard(3);
		//3
		checkerBoard(3);
		//4
		printPow2(5);
		//5
		System.out.println(convertTemp(0, false));
		System.out.println(convertTemp(32, true));
		//6
		System.out.println(isArmstrong(371));
		//7
		System.out.println(contains(new int[] {1, 2, 1, 2, 3}, new int[] {1, 2, 3}));
		//app
		makeChange(20.0, 13.44);
	}

	public static int simpleSearch(int[] nums, int value) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void squareBoard(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void checkerBoard(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println();
			if (i % 2 == 0) {
				System.out.print(" ");
			}
		}
	}

	public static void printPow2(int n) {
		System.out.println("Here are the first " + n + " powers of 2");
		for (int i = 0; i < n; i++) {
			System.out.println("\t2^" + i + " = " + Math.pow(2,i));
		}
	}

	public static double convertTemp(double temp, boolean isF) {
		if (isF) {
			return (temp - 32) / 1.8;
		} else {
			return (temp * 1.8) + 32;
		}
	}

	public static boolean isArmstrong(int num) {
		int sum = 0;
		int original = num;
		for (int i = 1; num > 0; i++) {
			double digit = (num % Math.pow(10, i)) / Math.pow(10, i - 1);
			num -= num % Math.pow(10, i);
			sum += Math.pow(digit, 3);
		}
		System.out.println(sum);
		return (original == sum);
	}

	public static boolean contains(int[] a, int[] b)
	{
		int[] sub = new int[b.length];
		for (int i = 0; i < (a.length - b.length) + 1; i++) {
			for (int j = 0; j < sub.length; j++) {
				sub[j] = a[i + j];
			}
			if(Arrays.equals(sub, b)) {
				return true;
			}
		}
		return false;
	}

	public static void makeChange(double paid, double cost)
	{
		double[] denom = {20.0, 10.0, 5.0, 1.0, .25, .10, .05, .01};
		int[] bills = new int[denom.length];
		double change = (int) paid - cost;
		while (change > .01) {
			for (int i = 0; i < denom.length; i++) {
				if (denom[i] <= change) {
					change -= denom[i];
					bills[i]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < bills.length; i++) {
			System.out.println("$" + denom[i] + ": " + bills[i]);
		}
	}
}
