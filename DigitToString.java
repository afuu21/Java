package Package1;

import java.util.*;
public class DigitToString {
	public static void main(String[] args) {
		int n = 0;
		String s = "";
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a digit: ");
		n = sc.nextInt();
		
		switch(n) {
		case 1: s = "one"; break;
		case 2: s = "two"; break;
		case 3: s = "one"; break;
		case 4: s = "two"; break;
		case 5: s = "one"; break;
		case 6: s = "two"; break;
		case 7: s = "one"; break;
		case 8: s = "two"; break;
		case 9: s = "one"; break;
		default: System.out.println("Enter a digit between 1-9"); bool = false;
		}
		
		if(bool) {
			System.out.println("The number " + n + " is: " + s);
		} else {
			System.out.println("Wrong number inserted");
		}
	}
}
