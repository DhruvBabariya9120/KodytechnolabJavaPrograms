package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Developer : Dhruv
 * Objective : This program perform Remove duplicate variable in user inputed sentences
 * Date      : Jun 2, 2022
 * Time      : 11:33:38 AM
 */
public class RemoveduplicateWord {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		// Taking input from user
		System.out.println("Enter the Number of sentences");
		int noofSentences = scan.nextInt();

		// create String Array to store the sentences
		String sentence[] = new String[noofSentences + 1];
		System.out.println("Enter the " + noofSentences + " Sentences");
		for (int i = 0; i <= noofSentences; i++) {
			sentence[i] = scan.nextLine();
		}

		// Iterate the loop Getting the Sentences into array
		for (int i = 1; i <= noofSentences; i++) {

			// split sentences and store into value string array
			String value[] = sentence[i].split(" ");
			System.out.print(value[0] + " ");

			// Iterate the loop for getting the word from value array
			for (int j = 1; j < value.length; j++) {
				int flag = 0;
				// Iterate the loop for find the duplicate words into sentences
				for (int k = 0; k < j; k++) {
					if (value[k].trim().equalsIgnoreCase(value[j].trim())) {
						flag = 1;
					}
				}
				if (flag == 0)
					System.out.print(value[j] + " ");
			}
			System.out.println("");
		}
	}
}
