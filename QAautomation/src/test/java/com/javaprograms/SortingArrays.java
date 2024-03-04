package com.javaprograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortingArrays {
	
    @Test
    
	public  void UserDefinedLogic() {

		String[] countries = { "South-Africa", "India", "America", "Yugoslavia", "Italy", "Germany" };
		
		int size = countries.length;
		
		for (int i = 0; i <= countries.length - 1; i++)
		{
			for (int j = i + 1; j <= countries.length - 1; j++)

			{
				// compares each elements of the array to all the remaining elements
				
		    	if (countries[i].compareTo(countries[j]) > 0)
		
				{
					
					// swapping array elements
					
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			}
		}
	
		// prints the sorted array in ascending order
		
		System.out.println(Arrays.toString(countries));
     }	
		
		@Test
		public void AscendingOrderorAlphabeticalOrder()
		{
			String[] arr = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind"};
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));	
		}

		
		@Test
		
		public void DescendingOrderorReverseNaturalOrder()
		{
			
			String[] s = {" Australia", "Denmark","Yugoslavia",  "France", "Netherlands", "Italy", "Germany"};
			
			Arrays.sort(s, Collections.reverseOrder());
			
		  System.out.println(Arrays.toString(s));
			
			
		}
	

}
