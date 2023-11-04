package com.javaprograms;

import java.util.*;

public class RemoveDuplicatesfromNumber

{

	public static void main(String[] args) 
	
	{
		
		
//		int[] a = { 9, 6, 6, 8, 8, 9, 9, 4, 5 };
//		int j =0;
//		for (int i = 0; i < a.length - 1; i++)
//		{
//        if (a[i] != a[i + 1]) 			
//			{
//				a[j] = a[i];
//				j++;
//			}
//		}
//		a[j] = a[a.length - 1];
//		for (int i = 0; i< j; i++)
//		{
//			System.out.print(a[i] + " ");
//		}
//		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=s.nextInt();
		int c[]=new int[num];
		System.out.println("Enter Array Numbers : ");
		for(int i=0;i<num;i++)
		{
		c[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		for(int j=i+1;j<c.length;j++)
		{
		if(c[i]==c[j])
		{
		count++;
		c[j]=0;
		}
		}
		if(c[i]!=0)
		{
		System.out.print(c[i] + " ");
		}
		}
		
		
	}
}
