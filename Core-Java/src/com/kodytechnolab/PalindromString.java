package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program is find the User input Number is Neon Number or not.
 * Date      : Jun 2, 2022
 * Time      : 11:31:07 AM
 */
public class PalindromString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter the String : ");
		String value = scan.next();

		// store reverse string value
		String Reverse = ""; 

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
