package com.javaprograms;

import java.util.*;

public class Indexmethod {

	public static void main(String[] args) {

		String aut = "Automation using Java after lang";

		aut = aut.toLowerCase();

		System.out.println(aut.length());

		char ch[] = aut.toCharArray();

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the character");

		char u = sc1.next().charAt(0);

		for (int i = 0; i < ch.length; i++)

		{

			int counting = 1;


         if(aut.charAt(i)==u)
         {
        	 counting++;
        	 System.out.println("postion is"+i);
        	//  System.out.println("Count is"+ counting);
         }

		
		System.out.println("Number of times this '"+ u +"' character is repeated in string '"+ i +" " + counting );
		}
	}

}
