package com.javaprograms;

import java.util.*;

public class LongestWordProgram {

	public static void main(String[] args) {
		
		String s="This is are practice programes";
		
		String[] a= s.split(" ");
		String min=a[4];
		
//		String max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i].length()>max.length())
//			{
//				max=a[i];
//				
//			}
//		}
//		System.out.println("Longest Element is max:  "+ max);
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<min.length())
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
