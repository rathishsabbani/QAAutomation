package com.javaprograms;

import org.testng.annotations.Test;

public class AllPrograms {

	public static void main(String[] args) {
		


		// Reverse String

//		String s = "qwerty";
//		String rev = " ";
//		 for(int i=s.length()-1;i>=0;i--)
//		 {
//			 rev= rev+s.charAt(i);
//			 }
//		System.out.println("reverse string : "+rev);
//		 }

		// Reverse Number

//		int num = 12546, rev = 0, rem=0;
//
//		while (num > 0) {
//			
//			rem= num%10;
//			num = num/10;
//			rev = (rev * 10) + rem;
//
//		}
//		System.out.println("reverse of number: " + rev);
	}
			
//		@Test
//		
//		public void Pali() {
//		
//			int num =3456,rem=0,rev=0;
//			int backup =num;
//			
//			
//			 while(num>0)
//			 {
//				rem = num%10;
//				num = num/10;
//				rev = (rev*10)+rem;
//				
//			 }
//			 
//			 System.out.println("Actual num"+" "+backup);
//			 System.out.println("Expected num"+" "+rev);
//			 
//			 if(backup == rev){
//				 System.out.println(" palindrome");
//			 }
//			 else
//			 {
//				 System.out.println("not palindrome");
//			 }
//		}
//			 
//			 @Test
//			  public void zeromethod(){
//				 
//				 String i = "630850470902";
//				  String j = "";
//				  String k ="";
//				  
//				  for( int s =0;s<=i.length()-1;s++)
//				  {
//					  if(i.charAt(s)>='1' && i.charAt(s)<='9')
//					  {
//						  j=j+i.charAt(s);
//						  
//					  }
//					  else {
//						  k=k+i.charAt(s);
//					  }
//				  }
//				  System.out.println(j);
//				  System.out.println(k);
//				 
//			 
//		}



@Test

public void Occurancewords()
{
	String src = "ytrewqqwerty";
	String s1 = src.toLowerCase();
	String s2 = s1.replaceAll("\\s", "");
	
	 char[] c =s2.toCharArray();
	
	
	for(int i =0;i<s2.length();i++)
	{
		int count =1;
	for(int j=i+1;j<s2.length();j++)
	{
		
		if(c[i]==c[j])
		{
			count++;
			c[j]=0;
		}
	}
		
	if(c[i]!=0 && count>=1)
		
	{
		System.out.println(c[i]+ count);
	}
	}
}
}
		


