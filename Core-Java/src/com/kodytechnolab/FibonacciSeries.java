/* This program Perform Fibonacci series till number 100 */
package com.kodytechnolab;

public class FibonacciSeries {

	public static void main(String[] args) {

		int previous = 0; // Declare variable and initialize for storing previous value
		int next = 1; // Declare variable and initialize for storing next value
		int add = 1; // store the sum of two variable
		System.out.print(previous);
		do {
			System.out.print(" " + add);
			add = previous + next;
			previous = next;
			next = add;
		} while (add < 100);
	}
}
