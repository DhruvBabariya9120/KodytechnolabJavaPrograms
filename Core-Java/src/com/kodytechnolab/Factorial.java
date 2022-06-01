package com.kodytechnolab;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Taking input from User
		System.out.println("Enter the Number");
		int no = scan.nextInt();
		int fact = 1;
		// Iterate Loop for perform the factorial of Number
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a " + no + " is " + fact);
		scan.close();
	}
}
