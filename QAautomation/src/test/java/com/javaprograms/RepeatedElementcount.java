package com.javaprograms;

public class RepeatedElementcount {

	public static void main(String[] args) {
		
	      //Declare and initialize the array elements
	       String  arr = "Qwertyasrrtry";
	       
	      //get the length of the array
	      char[] ch = arr.toCharArray();
	      int max_count = 0;
	      int maxfreq = 0;
	      
	       
	      //Logic implementation
	      for (int i = 0; i <arr.length()-1; i++)
	      {
	         int count = 0;
	         for (int j = 0; j <arr.length()-1; j++)
	         {
	            if (ch[i] == ch[j])
	            {
	               count++;
	            }
	         }
	        
	         if (count > max_count){
	            max_count = count;
	            maxfreq = ch[i];
	         }
	      }
	      //print the result
	      System.out.print("Most frequent element is: " + maxfreq);

	}

}
