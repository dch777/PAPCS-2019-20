import java.util.*;

//Name: Dhruv Chanana
//Period: 2A

public class PhoneNumber_Chanana {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//1
		question();
		//2
		System.out.println(daysInMonth(1, 2015)); 	//Should print 31
		System.out.println(daysInMonth(4, 2015)); 	//Should print 30
		System.out.println(daysInMonth(2, 2015)); 	//Should print 28
		System.out.println(daysInMonth(2, 2016)); 	//Should print 29
		//app
		System.out.print("Enter phone String >> ");
		String phone = console.nextLine();
		System.out.print("Actual Number >> ");
		System.out.println(phoneNumber(phone));
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

	public static String phoneNumber(String phone) {
		char[] original = phone.toCharArray();
		String newPhone = "";
		String code = "";
		for (int i = 0; i < original.length; i++) {
			switch (original[i]) {
				case 'A': case 'B': case 'C':
				case 'a': case 'b': case 'c':
					newPhone += "2";
					break;
				case 'D': case 'E': case 'F':
				case 'd': case 'e': case 'f':
					newPhone += "3";
					break;
				case 'G': case 'H': case 'I':
				case 'g': case 'h': case 'i':
					newPhone += "4";
					break;
				case 'J': case 'K': case 'L':
				case 'j': case 'k': case 'l':
					newPhone += "5";
					break;
				case 'M': case 'N': case 'O':
				case 'm': case 'n': case 'o':
					newPhone += "6";
					break;
				case 'P': case 'Q': case 'R': case 'S':
				case 'p': case 'q': case 'r': case 's':
					newPhone += "7";
					break;
				case 'T': case 'U': case 'V':
				case 't': case 'u': case 'v':
					newPhone += "8";
					break;
				case 'W': case 'X': case 'Y': case 'Z':
				case 'w': case 'x': case 'y': case 'z':
					newPhone += "9";
					break;
				default:
					code += original[i];
					break;
			}
		}
		return code + newPhone.substring(0,3) + "-" + newPhone.substring(3);
	}
}
