package com.javaprograms;

import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		

//		int s = 2025;
//		if ((s % 4 == 0) && (s % 100 != 0) || (s % 400 == 0)) {
//			System.out.println("This is a leap year ");
//
//		} else {
//			System.out.println("This is not a lear year");
//		}
		
		
		// By Using Scanner class
		
		int year;
		 System.out.println("Enter the year : ");
		 
		 Scanner sc = new Scanner(System.in);
		 year = sc.nextInt();
		 
		 if(( year%4==0)&&(year%100!=0) || (year%400==0))
				 
			 {
				 System.out.println("It's leap year");
			 }
		 else
		 {
			 System.out.println("Not a lear year");
		 }
		 	 
	}
}