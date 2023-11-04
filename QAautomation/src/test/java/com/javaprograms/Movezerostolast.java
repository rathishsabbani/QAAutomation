package com.javaprograms;

public class Movezerostolast {

	public static void main(String[] args) {

      String s = "950230140410";
      String r = "";
      String t = "";
      for(int i =0;i<s.length()-1;i++)
      {
    	  if(s.charAt(i)>='1' && s.charAt(i)<='9')
    	  {
    		  r =r+s.charAt(i);
    	  }
    	  else
    	  {
    		  t =t+s.charAt(i);
    		  
    	  }
      }
      System.out.print(r);
      System.out.print(t);
	
		
		
	}

}
