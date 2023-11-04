package com.javaprograms;

public class ReverseofArrayandNumber {

	public static void main(String[] args) {
		
		int num=345,rev=0,rem;
		
		while(num>0)
		{ 
			rem= num%10;
			num=num/10;
			rev=(rev*10)+rem;
			
		}
		System.out.println("Reverse of a number:"+" "+rev);
		
	
		
	
	}
}
