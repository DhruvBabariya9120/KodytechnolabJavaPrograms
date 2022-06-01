package com.kodytechnolab;

import java.util.Scanner;

public class WeirdNumberCondition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Taking Input from user
		System.out.println("Enter the Number : ");
		int no = scan.nextInt();

		// check condition for user number
		if (no % 2 != 0)
			System.out.println("Weird");
		else if (no >= 2 && no <= 5)
			System.out.println("Not Weird");
		else if (no >= 6 && no <= 20)
			System.out.println("Weird");
		else
			System.out.println("Not Weird");

		scan.close();
	}
}
