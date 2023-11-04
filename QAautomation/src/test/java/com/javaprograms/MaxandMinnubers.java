package com.javaprograms;

import java.util.*;


public class MaxandMinnubers {
	
	public static void main(String args[])
	{

//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter the first number");
//	int s1 = sc.nextInt();
//	int temp=0;
//	int s2[]=new int [s1];
//	System.out.println("enter elemenets:");
//	for(int i=0;i<s1;i++)
//	{
//	 s2[i] = sc.nextInt();   
//	}
//
//	System.out.println(Arrays.toString(s2));
//	System.out.println(" ");
//	int max = s2[0];
//	int min = s2[0];
//	for(int i=0;i<s2.length;i++)
//	{
//	    if(s2[i]>max)
//	    {
//	        max=s2[i];
//	        
//	    }
//	    else if(s2[i]<min)
//	    {
//	        min=s2[i];
//	    }
//	}
//
//	System.out.println("Max number :" + max);
//	System.out.println("min number :" + min);
		
		
		
		
		int[] s1 = new int[] {10,85,30,54};
		
		int largest = s1[0];
		int smallest = s1[0];
		
		for(int i=1;i<s1.length;i++)
		{
			
			if(s1[i] > largest)
				
				largest =s1[i];
			
			else if(s1[i] < smallest)
				
				smallest=s1[i];
		}
		
		System.out.println("max number : "+ largest);
		
		System.out.println("Min number :"+smallest);
		
		
	}

}
