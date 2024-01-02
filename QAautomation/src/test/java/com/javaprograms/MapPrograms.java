package com.javaprograms;

public class MapPrograms {

	public static void  main(String args[])
	{
		String s1= "qwerty ball bowler bat";
		String[] s= s1.split(" ");
		String s2 = " ";
		
		for(int i=0;i<s.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					count++;
					s[j]="0";
					
				}
			}
				
				if(s[i]!="0" &&count>=1)
				{
					s2= s2+""+s[i];
					System.out.println("count of word: "+s[i]+" "+count);
					
				}
				
				System.out.println(s2+" ");

		}
	
	}
	}

