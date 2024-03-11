package com.javaprograms;

public class Addtoematrices {

	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int b[][] = { { 1, 6, 3 }, { 5, 3, 4 }, { 2, 4, 3 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++)
		{

			for (int j = 0; j < 3; j++) 
			{

				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}
	}
}
