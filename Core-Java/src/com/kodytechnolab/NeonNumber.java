package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program is find the User input Number is Neon Number or not.
 * Date      : Jun 2, 2022
 * Time      : 11:30:34 AM
 */
public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Taking the user input
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		// declare variable and initialize the square of no
		int square = no * no;
		int sum = 0;

		// iterate the loop for find the sum of digite
		while (square > 0) {
			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}

		// check condition no is Neon or not
		if (no == sum)
			System.out.println("Number is Neon Number");
		else
			System.out.println("Number is Not Neon Number");
		sc.close();
	}
}
