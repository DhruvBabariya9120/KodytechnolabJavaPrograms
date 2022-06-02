package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program is perform User input Number is Armstrong Number or Not.
 * Date      : Jun 2, 2022
 * Time      : 11:23:20 AM
 */
public class ArmstrongNumber {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter the Number");
		int no = scan.nextInt();

		// store answer in the variable
		double ans = 0;
		// store user number temporary variable
		int temp = no;
		// store user number in temporary number variable because check the original
		// number
		int tempno = no;
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

		// check condition reverse number and answer is same or not
		if (tempno == ans)
			System.out.println("Number is a Armstrong Number");
		else
			System.out.println("Number is not a Armstrong Number");

		scan.close();
	}
}
