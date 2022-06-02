
package com.kodytechnolab;

/**
 * 
 * Developer : Dhruv
 * Objective : This program Perform Fibonacci series till number 100.
 * Date      : Jun 2, 2022
 * Time      : 11:27:32 AM
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		// Declare variable and initialize for storing previous value
		int previous = 0;
		// Declare variable and initialize for storing next value
		int next = 1; 
		// store the sum of two variable
		int add = 1; 
		
		System.out.print(previous);
		
		do {
			System.out.print(" " + add);
			add = previous + next;
			previous = next;
			next = add;
		} while (add < 100);
	}
}
