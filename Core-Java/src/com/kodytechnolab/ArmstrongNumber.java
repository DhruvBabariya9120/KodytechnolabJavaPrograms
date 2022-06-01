package com.kodytechnolab;

import java.util.Scanner;

public class ArmstrongNumber {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter the Number");
		int no = scan.nextInt();

		double ans = 0; // store answer in the variable
		int temp = no; // store user no in to temporary variable
		int tempno = no; // store user no in temporary no variable because check the original number
		int reminder;
		int cnt = 0;

		// count the digite of number
		for (; temp > 0; cnt++) {
			temp = temp / 10;
		}

		// Iterate the loop for find the reverse Number
		while (no > 0) {
			reminder = no % 10;
			ans = ans + Math.pow(reminder, cnt);
			no = no / 10;
		}

		// check condition reverse no and answer is same or not
		if (tempno == ans)
			System.out.println("Number is a Armstrong Number");
		else
			System.out.println("Number is not a Armstrong Number");

		scan.close();
	}
}
