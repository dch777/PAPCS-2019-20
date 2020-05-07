import java.util.*;

//Name: Dhruv Chanana
//Period: 2A

public class PhoneNumber_Chanana {
	public static void main(String[] args) {
		//1
		question();
		//2
		System.out.println(daysInMonth(1, 2015)); 	//Should print 31
		System.out.println(daysInMonth(4, 2015)); 	//Should print 30
		System.out.println(daysInMonth(2, 2015)); 	//Should print 28
		System.out.println(daysInMonth(2, 2016)); 	//Should print 29
	}

	public static void question() {
		Scanner console = new Scanner(System.in);
		System.out.println("Which of the following is a variable declaration in Java?\n" +
					"\t1. int 1a = 4;\n" +
					"\t2. double circle-area = 5.78;\n" +
					"\t3. String s = 'hello';\n" +
					"\t4. boolean whoaNow = true;");
		int answer = console.nextInt();
		switch (answer) {
			case 1: 
			case 2: 
			case 3:
				System.out.println("Incorrect");
				break;
			case 4:
				System.out.println("Correct");
				break;
			default:
				System.out.println("Invalid Answer");
				break;
		}
	}

	public static int daysInMonth(int month, int year) {
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				if (year % 4 == 0) {
					return 29;
				} else {
					return 28;
				}
			default:
				System.out.println("Invalid month");
				return -1;
		}
	}
}
