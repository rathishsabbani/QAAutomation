package com.javaprograms;

public class RevereseString {

	public static void main(String[] args) {

		String s = "Qwerty";
		
		 int l= s.length();
		String r =" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r = r+s.charAt(i);
		}
		System.out.println(r);
	}

}
