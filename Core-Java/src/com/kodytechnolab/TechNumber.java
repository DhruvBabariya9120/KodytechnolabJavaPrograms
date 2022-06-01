/* This Program perform user inputed number is Tech number or not*/
package com.kodytechnolab;

import java.util.Scanner;

public class TechNumber {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		// Taking input from User
		System.out.println("Enter the Number: ");
		int no = scan.nextInt();
		int temp = no; // Store no into temporary variable
		int tempno = no;
		int cnt = 0;
		int sum = 0;
		String str = "";

		// Iterate the loop for count the digite
		for (; temp > 0; cnt++) {
			temp = temp / 10;
		}

		// Check the condition Number of digite is not odd
		if (cnt % 2 != 0)
			System.out.println("Enter the Even Digite");
		else {
			System.out.println("Number = " + no);

			// Iterating loop for two times because number having only two parts
			for (int i = 0; i < 2; i++) {
				str = "";
				for (int j = 0; j < cnt / 2; j++) {
					int reminder = no % 10;
					str = str.concat(String.valueOf(reminder));
					no = no / 10;
				}
				String Revstr = "";
				for (int k = str.length() - 1; k >= 0; k--) {
					char ch = str.charAt(k);
					Revstr = Revstr.concat(Character.toString(ch));
				}
				int ans = Integer.parseInt(Revstr);
				sum = sum + ans;
			}
			if ((sum * sum) == tempno)
				System.out.println(tempno + " Number is Tech Number");
			else
				System.out.println(tempno + " Number is Not a tech Number");
		}
	}
}
