package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program perform the Calculator Operation.
 * Date      : Jun 2, 2022
 * Time      : 11:23:52 AM
 */
public class Calculater {

	private static Scanner sc;

	public static void main(String[] args) {

		// Taking Input from User
		sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int firstno = sc.nextInt();
		System.out.println("Enter the First Number : ");
		int secondno = sc.nextInt();

		System.out.println("1) + \n2) -\n3) *\n4) / \n5) Exit");

		// Iterate loop while if user can't be put input Exit
		while (true) {

			// Taking user input
			System.out.println("Enter Operator : ");
			String ans = sc.next();

			// Performing Operation based number user input
			switch (ans) {
			case "+":
				System.out.println("Sum of two Number : " + (firstno + secondno));
				break;
			case "-":
				System.out.println("Subtraction of two Number : " + (firstno - secondno));
				break;
			case "*":
				System.out.println("multiplication of two Number : " + (firstno * secondno));
				break;
			case "/":
				if (secondno == 0) {
					System.out.println("Division By Zero is Not possible");
				} else {
					System.out.println("Division = " + (firstno / secondno));
				}
				break;
			case "Exit":
				System.exit(0);

			default:
				System.out.println("Enter Valid Operator");
			}
		}
	}
}
