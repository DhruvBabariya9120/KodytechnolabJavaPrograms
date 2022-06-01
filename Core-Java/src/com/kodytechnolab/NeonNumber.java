package com.kodytechnolab;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Taking the user input
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		int square = no * no; // declare variable to store the square of no
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
