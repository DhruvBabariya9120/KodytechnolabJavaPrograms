/* This program perform user input string is palindrom or not */
package com.kodytechnolab;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter the String : ");
		String value = scan.next();

		String Reverse = ""; // store reverse string value

		// Iterate the loop for find The Reverse a string
		for (int i = value.length() - 1; i >= 0; i--) {
			char ch = value.charAt(i);
			Reverse = Reverse.concat(Character.toString(ch));
		}

		// check condition String is palindrom or not
		if (value.equals(Reverse))
			System.out.println("String is Palindrom");
		else
			System.out.println("String is Not Palindrom");

		scan.close();
	}

}
