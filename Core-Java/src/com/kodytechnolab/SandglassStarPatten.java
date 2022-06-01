/* This program Draw the paten of SandglassStar till user inputed Number */
package com.kodytechnolab;

import java.util.Scanner;

public class SandglassStarPatten {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Taking input from user
		System.out.println("Enter the Number : ");
		int no = sc.nextInt();

		// Iterating loop for Up SandglassStar
		for (int i = 1; i <= no; i++) {

			// Iterating loop for printing Spaces
			for (int l = 1; l < i; l++) {
				System.out.print(" ");
			}

			// Iterating loop for printing Number
			for (int j = i; j <= no; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		// Iterating loop for down SandglassStar
		for (int i = no - 1; i >= 1; i--) {

			// Iterating loop for printing Spaces
			for (int l = i; l > 1; l--) {
				System.out.print(" ");
			}

			// Iterating loop for printing Number
			for (int j = i; j <= no; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");

		}
		sc.close();
	}

}
