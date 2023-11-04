package com.javaprograms;

import java.util.*;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		
		String r = "Rathish Sabbani";
 // 		r = r.replaceAll("\\s", "");
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the character");

		char u = sc1.next().charAt(0);

		char[] s = r.toCharArray();
		for (int i = 0; i < r.length(); i++)
		{
			int count = 1;
			for (int j = i + 1; j < r.length(); j++) 
			{
	
				if (s[i] == (s[j]))
				{
				count++;
				 s[j] = 0;
				}
				
			}
			if (s[i] != 0 && count>=1 && s[i]==u) 
			{
				System.out.println("count of number" + " " + s[i] + " " + count);

			}

		}
//
//		
//		String s="RemoveDuplicatess";
//		char c[]=s.toCharArray();
//		for(int i=0;i<c.length;i++)
//
//		{
//		int count=1;
//		for(int j=i+1;j<c.length;j++)
//
//		{
//		if(c[i]==c[j])
//		{
//		count++;
//		c[j]=0;
//		}
//		}
//		if(c[i]!=0)
//		{
//		System.out.println("Original string: "+"  "+c[i]+"  "+count);
//		}
//		
//		String s6="Something";
//		int a=Integer.parseInt(s6);  
//		System.out.println(a);
//
		}
	
		}

