package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program is perform User input number is spy number or not.
 * Date      : Jun 2, 2022
 * Time      : 11:34:54 AM
 */
public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();
		int sum = 0;
		int mul = 1;

		// Iterating loop for sum and multiplication of the digite
		while (no > 0) {
			int reminder = no % 10;
			sum = sum + reminder;
			mul = mul * reminder;
			no = no / 10;
		}
		if (sum == mul)
			System.out.println("Number is Spy Number");
		else
			System.out.println("Number is not a Spy Number");
		sc.close();
	}

}
