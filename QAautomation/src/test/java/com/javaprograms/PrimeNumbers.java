package com.javaprograms;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PrimeNumbers {

	public static void main(String[] args) {

		
		/* 
		 * This code is for Set of numbers in array
		 */
//		int num[] = {17,19,25,68,101};
//		
//		int sample =0;
//		for (int i = 0; i <=num.length-1; i++) 
//		{
//			int count = 0;
//			for (int j = 1; j <= num[i]; j++)
//
//			{
//				if (num[i]%j == 0)
//				{
//					count++;
//
//				}
//			}
//		
//			if (count == 2)
//			{
//				System.out.println(num[i] + "prime number");
//
//			}
//		
//		}
		
		/*
		 * This code is for lis of prime numbers
		 */
//		
//		for(int j=2;j<=num;j++)
//        {
//            int count1=0;
//            for(int i=1;i<=j;i++)
//            {
//               if(j%i==0)
//               {
//                  count1++;
//               }
//            }
//            if(count1==2)
//            {
//            System.out.println(j+" " +" is a prime number");
//            sample=sample+j;
//            
//            }
//         }
//           System.out.println(sample);  
		
		
		/*
		 * this code is for single  prime  number
		 */
		
        int num =22;
		for(int j=2;j<=num;j++)
	        {
	            int count1=0;
	            for(int i=1;i<=j;i++)
	            {
	               if(j%i==0)
	               {
	                  count1++;
	               }
	            }
	            if(count1==2)
	            {
	            System.out.println(j+" " +" is a prime number");
	            
	            
	            }
	         }
	           


//		// Java Program to find the occurrence
//		// of words in a String using HashMap.
//		
//		
//		 
//		        // Declaring the String
//		        String str = "Alice is girl and Bob is boy";
//		        // Declaring a HashMap of <String, Integer>
//		        Map<String, Integer> hashMap = new HashMap<>();
//		 
//		        // Splitting the words of string
//		        // and storing them in the array.
//		        String[] words = str.split(" ");
//		 
//		        for (String word : words) {
//		 
//		            // Asking whether the HashMap contains the key or not. Will return null if not.
//		           
//		            Integer integer = hashMap.get(word);
//		 
//		            if (integer == null)
//		                // Storing the word as key and its
//		                // occurrence as value in the HashMap.
//		                hashMap.put(word, 1);
//		 
//		            else {
//		                // Incrementing the value if the word
//		                // is already present in the HashMap.
//		                hashMap.put(word, integer + 1);
//		            }
//		        }
//		        System.out.println(hashMap);

	}

}
