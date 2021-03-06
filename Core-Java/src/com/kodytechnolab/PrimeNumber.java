package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program perform Prime Number Series till the user input number.
 * Date      : Jun 2, 2022
 * Time      : 11:32:50 AM
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter the number you want to perform Prime Number : ");
		int no = sc.nextInt();

		// iterate loop for find the Prime Number
		for (int i = 2; i < no; i++) {
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
				}
			}
			if (flag == 1) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}
}
