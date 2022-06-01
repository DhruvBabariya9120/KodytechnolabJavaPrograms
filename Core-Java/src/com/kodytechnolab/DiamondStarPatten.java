package com.kodytechnolab;

public class DiamondStarPatten {

	public static void main(String[] args) {

		int ascii = 65; // declare variable for print character
		int key = 2; // declare variable to perform operation
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
