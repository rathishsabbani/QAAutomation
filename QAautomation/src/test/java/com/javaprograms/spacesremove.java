package com.javaprograms;

public class spacesremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Qwerty numeric";
		
        s = s.toLowerCase();
        
         s =s.replace(" ","");
         
     char[] c = s.toCharArray();
     
     for(int i =0;i<=s.length()-1;i++)
    
     {
    	 int count =1;
         for (int j =i+1;j<=s.length()-1;j++)
         {
             
             if(c[i]==c[j])
             {
                 count++;
                 c[j]=0;
             }
         }
         if(c[i]!=0 && count>=1)
         
         {
             System.out.println(c[i]+" "+ "count is" +" "+count);
         }
         }
	}

}
