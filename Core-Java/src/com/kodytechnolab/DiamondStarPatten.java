package com.kodytechnolab;

/**
 * 
 * Developer : Dhruv 
 * Objective : This Program create a DiamondStar patten.
 * Date : Jun 2, 2022 
 * Time : 11:24:27 AM
 */
public class DiamondStarPatten {

	public static void main(String[] args) {

		// declare variable and initialize for print character
		int ascii = 65;
		// declare variable and initialize to perform operation
		int key = 2;
		for (int i = 0; i <= 10; i++) {
			int flag = 0;
			for (int j = 0; j <= 10; j++) {
				if (i + j == 5 || j - i == 5) {
					System.out.print((char) (ascii + i));
				} else if (i - j == 5 && i >= 6) {
					System.out.print(((char) (ascii + i - key)));
					flag++;
				} else if (i + j == 15 && i >= 6) {
					System.out.print(((char) (ascii + i - key)));
					flag++;
				} else
					System.out.print(" ");
			}
			if (flag == 2) {
				key = key + 2;
			}
			System.out.println("");
		}
	}
}
