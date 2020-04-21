//Name: Dhruv Chanana
//Period: 2A

import java.util.*;

public class ApproximatePi_Chanana {

	static Random rand = new Random();

	public static void main(String[] args) {
		//1
		System.out.println(isPositive(4));
		//2
		System.out.println(isOdd(3));
		//3
		System.out.println(getMax(1,4));
		//4
		System.out.println(rollDice());
		//5
		System.out.println(rollDice(10));
		//6
		System.out.println(capitalizeFirst("hello"));
		//7
		System.out.println(circleArea(5));
		//8
		System.out.println(isMultiple(6, 3));
		//9
		System.out.println(convertTime(60, false));
		//10
		printDiagonal("hello");
		//11
		System.out.println(approximatePi(10000000));
	}

	public static boolean isPositive(int a)
	{
		return a > 0;
	}

	public static boolean isOdd(int a)
	{
		return a % 2 == 1;
	}

	public static int getMax(int a, int b)
	{
		return Math.max(a, b);
	}

	public static int rollDice()
	{
		return rand.nextInt(6) + 1;
	}

	public static int rollDice(int numFaces)
	{
		return rand.nextInt(numFaces) + 1;
	}

	public static String capitalizeFirst(String name)
	{
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}

	public static double circleArea(double radius)
	{
		return Math.PI * Math.pow(radius, 2);
	}

	public static boolean isMultiple(int a, int b)
	{
		return b % a == 0;
	}

	public static String convertTime(double time, boolean isMinutes)
	{
		if(isMinutes)
		{
			return (time + " minutes is " + (time * 60) + " seconds");
		} else {
			return (time + " seconds is " + (time / 60) + " minutes");
		}
	}

	public static void printDiagonal(String s)
	{
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(" ");
			}
			System.out.println(s.substring(i, i+1));
		}
	}

	public static double approximatePi(int iterations)
	{
		double approximation = 0;
		boolean add = true;
		for (int i = 1; i <= iterations; i++) 
		{
			if (add) 
			{
				approximation += 1.0 / ((2.0 * i) - 1.0);
				add = false;
			} else {
				approximation -= 1.0 / ((2.0 * i) - 1.0);
				add = true;
			}
		}
		return approximation * 4;
	}
}
