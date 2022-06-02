
package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program is find the User input Number is Keith Number or not.
 * Date      : Jun 2, 2022
 * Time      : 11:29:29 AM
 */
public class KeithNumber {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		// Taking number from User
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		// store the number into temporary variable
		int temp = no;
		// count the digite of number
		int cnt = 0;
		// store number into temporary number for condition check
		int tempno = no;
		int flag = 0;

		// Iterate loop for count the digite of number
		for (; temp > 0; cnt++) {
			temp = temp / 10;
		}

		// Declare the number of digite size Array
		int no_array[] = new int[cnt];
		int ans = 0;

		// Iterate the loop for store digite into array
		for (int i = cnt - 1; i >= 0; i--) {
			int rem = no % 10;
			no_array[i] = rem;
			no = no / 10;
		}

		// Iterate loop for find the Number is keith or not
		while (ans <= tempno) {
			ans = 0;
			for (int i = 0; i < cnt; i++) {
				ans = ans + no_array[i];
			}
			if (ans == tempno) {
				flag = 1;
				break;
			}
			for (int i = 0; i < cnt - 1; i++) {
				no_array[i] = no_array[i + 1];
			}
			no_array[cnt - 1] = ans;
		}
		if (flag == 1)
			System.out.println(tempno + " Number is keith Number");
		else
			System.out.println(tempno + " Number is not keith Number");
	}
}
