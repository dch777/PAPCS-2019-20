import java.util.*;

public class RomanNumerals_Chanana {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		
		//1
		String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
		
		//2
		System.out.println(s.length);

		//3
		for (int i = 0; i < s.length; i++)
		{
			System.out.print(s[i].substring(0,1) + " ");
		}
		System.out.println();

		//4
		int count = 0;
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].substring(s[i].length()-1).equals("e")) 
			{
				count++;
			}
		}
		System.out.println(count);

		//5
		count = 0;
		for (int i = 0; i < s.length; i++) 
		{
			count+=s[i].length();
		}
		System.out.println(count);

		//6
		count = 0;
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].length() > 7)
			{
				count++;
			}
		}
		if (count >= 7) 
		{
			System.out.println("Two length 7!");
		} else {
			System.out.println("Under two length 7");
		}
		
		//8
		count = 0;
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].contains("e")) 
			{
				count++;
			}
		}
		System.out.println(count);
		
		//9
		boolean hasO = false;
		for (int i = 0; i < s.length; i++) 
		{
			if (s[i].contains("o"))
			{
				hasO = true;
			}
		}
		if (!hasO) 
		{
			System.out.println("No o's!");	
		} else {
			System.out.println("At least one o");
		}

		//10
		String[] answers = {
			"As I see it, yes.",  
			"Concentrate and ask again.",
			"Don’t count on it.",
			"It is certain.",
			"It is decidedly so.",
			"Most likely.",
			"My reply is no.",
			"My sources say no.",
			"Outlook not so good.",
			"Outlook good."
		};
		System.out.println("What is your question?");
		console.nextLine();
		System.out.println(answers[rand.nextInt(answers.length)]);

		//app
		final int[] NUMBERS = {  1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,  1};
		final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		System.out.println("Enter an integer less than 4000");
		int original = console.nextInt();
		int decimal = original;
		String roman = "";
		for (int i = 0; i < NUMBERS.length; i++) 
		{
			int currentVal = NUMBERS[i];
			while (decimal >= currentVal) 
			{
				decimal -= currentVal;
				roman += LETTERS[i];
			}
		}
		System.out.println(original + " is " + roman);
	}
}
