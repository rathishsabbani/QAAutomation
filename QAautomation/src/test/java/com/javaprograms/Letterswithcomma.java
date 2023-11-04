package com.javaprograms;
import java.util.*;

public class Letterswithcomma {

	public static void main(String[] args) {
//		Scanner Scan = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String Str1 = Scan.next();
//
//       String newString="";
//       String Str2 ="";
//        for (int i=0; i < Str1.length(); i++)
//        {
//                newString = Str1.charAt(i) + ",";
//
//                Str2 = Str2 + newString;  
//
//        }
//       System.out.print(Str2);
		
		
		Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String Str1 = Scan.next();

       String newString="";
       String Str2 ="";
        for (int i=0; i < Str1.length(); i++)
        {
                newString = Str1.charAt(i) +"a"+",";

                Str2 = Str2 + newString;  

        }
       System.out.print(Str2);

	}

}
