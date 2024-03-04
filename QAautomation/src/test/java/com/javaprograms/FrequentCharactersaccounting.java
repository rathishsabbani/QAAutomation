package com.javaprograms;

public class FrequentCharactersaccounting {

	public static void main(String[] args) {

		char s[] = { 'a', 'a', 'b', 'b', 'a', 'a' };
		
		int length = s.length;
		int count = 0;
		int finalcount = 2;

		for (int i = 0; i < s.length; i++)
		{

			for (int j = i + 1; j < s.length; j++)
			{
				if (s[i] == s[j])

				{
					count = count + finalcount;
					break;

				} 
				else 
				{
					count = count + 1;

				}
			}

		}
		System.out.println(count);

}
}

