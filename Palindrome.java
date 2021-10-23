package test5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String Name = "";
		Palindrome obj = new Palindrome();
		Name = obj.inputString(sc);
		String rev = "";
		for (int i = Name.length() - 1; i >= 0; i--) {

			rev = rev + Name.charAt(i);

		}
		if (rev.equals(Name)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("The string is not Palindrome");

		}
	}

	public String inputString(Scanner sc) {
		String countName = "";
		String Name = sc.nextLine();
		for (int i = 0; i < Name.length(); i++) {
			if (Name.charAt(i) >= 'a' && Name.charAt(i) <= 'z') {
				countName = countName + Name.charAt(i);
			} else {
				System.out.println("Please enter small case letters ONLY.");
				Name = sc.nextLine();
				i--;
			}
		}
		return countName;
	}

}
// rev = 1. accept user input. 2. input should not contain capital letter & numbers