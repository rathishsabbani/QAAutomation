package com.javaprograms;

public class IndexofCharacterPostion {

	public static void main(String[] args) {
		
		String s="Rathish Sabbani";
		 s=s.toLowerCase();
		 char[] c= s.toCharArray();
		 char b= 'h';
		  int index =0;
		         
		        int i = 0;
		        while(i < s.length()-1) 
		        {
		            if(c[i] == b) 
		            {
		                index = i;
		                break;
		            }
		            i++;
		        }
		         
		        System.out.println("Index of "+b+" : "+index);
		 /* for integer
		    int[] arr = {13, 74, 63, 25, 93}; 
        int element = 25;
        int index = -1;
         
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }
         
        System.out.println("Index of "+element+" : "+index);
		  
		  */

	}

}
