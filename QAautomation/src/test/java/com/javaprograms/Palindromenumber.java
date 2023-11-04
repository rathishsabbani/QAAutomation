package com.javaprograms;

public class Palindromenumber {

	public static void main(String[] args) {

		int num = 5423, rev = 0, rem;
		int backup = num;
		while (num > 0) 
		{
			rem = num%10;
			num = num/10;
			rev = (rev * 10) + rem;

		}
		
		System.out.println("original num:" + backup);
		
		System.out.println("Reverse number:" + rev);
			
		if (backup == rev)
		{
			System.out.println("palindrome number");
		}
		else
		{

			System.out.println("Non palindrome");
		}
		}
	}

		

