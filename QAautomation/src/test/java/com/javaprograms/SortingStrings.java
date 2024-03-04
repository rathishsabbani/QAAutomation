package com.javaprograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortingStrings

{
@Test

	public  void ReverseString()
	
	{
	String s = "given word";
	int length= s.length();
	
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev= rev+s.charAt(i);
		
	}
	System.out.println("Word is reversed : "+rev);	
	}


   @Test
   
   public void CountCharactersinsString()
   {
	   String a = "Given string is example";
	   
	   String l = a.toLowerCase();
	   
	 
	   
   }

}
