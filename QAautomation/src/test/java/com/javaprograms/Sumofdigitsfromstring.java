package com.javaprograms;



public class Sumofdigitsfromstring {

	public static void main(String[] args) {
//		String s = "abc12def34g";
//		String num="";
//		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(Character.isDigit(s.charAt(i)))
//			{
//				num=num+s.charAt(i);
//			}
//			else
//			{
//				if(!num.equals(""))
//				{
//					sum=sum+Integer.parseInt(num);
//					num="";
//					
//				}
//			}
//		}
//  System.out.println(sum);		
//			
//	}
//
//}
//
//	
//	static void splitString(String str) {
//		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();
//		for (int i = 0; i < str.length(); i++) {
//			if (Character.isDigit(str.charAt(i)))
//				num.append(str.charAt(i));
//			else if (Character.isAlphabetic(str.charAt(i)))
//				alpha.append(str.charAt(i));
//			else
//				special.append(str.charAt(i));
//		}
//		System.out.println(alpha);
//		System.out.println(num);
//		System.out.println(special);
//	}
//
//	// Driver method
//	public static void main(String args[]) {
//		String str = "Java234T567point890@#!!";
//		splitString(str);
//	}
//}

//	public static void main(String[] args)
	{
		String a = "java123point456";  
	    int i; 
	    String result ="";
	    String str1="";  
	    String str2="";  
	    for(i = 0; i < a.length(); i++)
	         {  
	             char c = a.charAt(i);  
	                if( '0' <= c && c <= '9' )  
	                	
	                        str1=str1+c;  
	                
	                
	                result =""+result;
	               System.out.println(result);
	                
	                if( 'a' <= c && c <= 'z' )
	                	
	                         str2=str2+c;  
	       }  
	   System.out.println(str1);  
	   System.out.println(str2);
	}
	
	
	}
}
	
	