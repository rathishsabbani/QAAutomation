package com.javaprograms;

public class RemoveduplicatesfromNumbers 
{

	public static void main(String[] args) 
	{
		int[] a= {3,1,2,5,4,1,3,2,6};
		
		 for(int i=0;i<a.length;i++)
		 {
			 int count =1;
			 for(int j=i+1;j<a.length;j++)
				 
			 {
				if(a[i]==a[j])
				{
					a[j]=0;
					count++;
				}
			 }
			 if(a[i]!=0 && count>=1)
			 {
				System.out.println(a[i]+" "+count); 
			 }
			 
		 }
	}

}
