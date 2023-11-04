package com.javaprograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class practicepurpose {

	public static void main(String[] args)

	{

//
//		@Test
//		 public void reveresestring()
//		 {
//			String s = "qwerty";
//			String rev = " ";
//			
//			for(int i=s.length()-1;i>=0;i--)
//			{
//				rev = rev+s.charAt(i);
//			}
//			System.out.println("reverse string:"+ rev);
//		 }

//	{
//		String[] arr= {"qwertyuiop","asdfgh","words","upper","lower","side","right","left","top","bottom"};
//       
////		String[] arr1={"qwertyuiop","asdfgh","words","upper","lower","side","right","left","top","bottom"};
//		
//		 String[] rev = new String[arr.length];
//    	 int a= 0;
//		 
//		 for(int i= arr.length-1;i>=0;i--)
//		 {
//			rev[a] = arr[i];
//			
////	       arr1[a] = arr1[i];			
////      	System.out.println("Reverse"+ " " +arr1[a] );
//			
//			System.out.println("reverese of a"+" "+rev[a]);
//			 System.out.println(a);
//			 a= a+1;
//		 }
//		 
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 System.out.println(rev[i]);
////		 System.out.println(arr[i]);
//			 
//		 }
//		 
//		 
//		 System.out.println(Arrays.toString(rev));
////		 System.out.println(Arrays.toString(arr1));
//		
//		
//	}
//	
//	
//		int[] arr = {4,5,5,5,7,3,8,2,9,7};
//		for( int i=0;i<arr.length;i++)
//		{
//			int count =1;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					
//					arr[j]=0;
//					count++;
//				}
//			}
//			if(arr[i]!=0 && count>=1)
//			{
//				System.out.println(arr[i]+" "+"is repeated times "+count);
//			}
//		}

//		String src = "qwertyasdfdsertc";
//		String s1 = src.toLowerCase();
//		String s2 = s1.replaceAll("\\s", "");
//
//		char[] c = s1.toCharArray();
//
//		for (int i = 0; i < s1.length(); i++) {
//			int count = 1;
//			for (int j = i + 1; j < s1.length(); j++) {
//
//				if (c[i] == c[j]) {
//					count++;
//					c[j] = 0;
//				}
//			}
//
//			if (c[i] != 0 && count >= 1)
//
//			{
//				System.out.println(c[i] +" "+count);
//			}
		
		
		
//		{
//		int []s = new int[]{9,8,5,7,60};
//		int temp =0;
//
//		{
//		for(int i=0;i<=s.length-1;i++)
//		{
//		for(int j=i+1;j<=s.length-1;j++)
//		{
//		if(s[i]<s[j])
//		{
//		temp=s[i];
//		s[i]=s[j];
//		s[j]=temp;
//
//		}
//		}
//		}
//		System.out.println("Elements in assending order");
//		for(int i=0;i<=s.length-1;i++)
//		{
//		System.out.println(s[i]+" ");
//		}
//		}
//		}
		
		 for(int i=1;i<=5;i++)
         {
        	 System.out.print("[");
        	 for(int j=i+1;j<=5;j++);
        	 {
        		 System.out.print("3");
        	 }
        	 System.out.print("]");
        	 System.out.println(" ");
         }
		
		
	    }
		}
