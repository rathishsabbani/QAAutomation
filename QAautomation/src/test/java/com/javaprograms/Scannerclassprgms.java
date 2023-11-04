package com.javaprograms;
import java.util.*;

public class Scannerclassprgms {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
/*
		  //1.Printing the numbers from 1 to n
		
		// enter the value of " n ".
		System.out.print("Enter the value n : ");

		// read the value.
		int n = scanner.nextInt();

		System.out.println("Numbers are : " );
		for(int i=1; i<=n; i++)
		{
		System.out.print(i + " ");
		}
		*/
		//2. printing the numbers from n to 1
		/*
		// enter the value of " n ".
		System.out.print("Enter the value n : ");

		// read the value.
		int n = scanner.nextInt();

		System.out.println("Numbers are : " );
		for(int i=n; i>=1; i--)
		{
		System.out.print(i + " ");
		}
		      */
		/*
		//3.sum of 1ton
		// enter the value of " n ".
		System.out.print("Enter the value n : ");

		// read the value.
		int n = scanner.nextInt();
		                int sum=0;
		System.out.println("Numbers are : " );
		for(int i=1; i<=n; i++)
		{  sum=sum+i;
		System.out.print(sum+ " ");
		}
		System.out.println("  ");
		 System.out.println(sum);
		      
		      */
		//4.Multiplication with out multiply operator single
		/*
		int sum=0;
		int k=1;
		//i has to sum itself j times to get result
		int j=10,i=6;
		while(k<=j)
		{
		sum=sum+i;
		System.out.print(sum + " ");
		k++;
		}
		System.out.println(" ");
		System.out.println(sum);
		//using multiply operator  - single
		   int y=6;
		for(int l=1;l<=10;l++)
		{
		System.out.println(y+" * "+l+" = "+y*l);
		k=y*l;
		}
		System.out.println(" ");
		   System.out.println(k);

		//set of multiplication tables

		   for (int table = 1; table <= 20; table++)
		   {
		for (int a = 1; a <= 10; a++)
		{

		System.out.println(table + " * " + (a) + " = " + (table * (a)));
		}
		System.out.println("----------");
		   }
		   */
		
		//5.check given number is Even or odd and also adding numbers
		/*
		System.out.println("Enter the Array size");
		   int n=scanner.nextInt();
		   System.out.println("Enter array Elements:");
		   int a[]= new int[n];
		   int temp=0,temp1=0;
		   for(int i=0;i<n;i++)
		   {
		   a[i]=scanner.nextInt();
		   }

		    for(int j=0;j<n;j++)
		    {
		    if(a[j]%2==0)
		    {
		    System.out.println("Given Number : " +a[j] + " is Even");

		    temp=temp+a[j];
		    }

		    else
		    {
		    System.out.println("Given Number  : "+a[j] + " is Odd ");
		    temp1=temp1+a[j];
		    }
		    }
		    System.out.println("Even elements after adding:"+temp);
		    System.out.println("Odd elements after adding:" +temp1);
		    
		    */
		    
		//6. prime numbers single
		/*
		// int num=5;
		System.out.println("Enter the number : ");
		int num=scanner.nextInt();
		int count=0;
		for (int i=1;i<=num;i++)
		{
		if(num%i==0)
		{
		count++;
		}
		}
		  if(count==2)
		  {
		  System.out.println("It is prime number");
		  }
		  else
		  {
		  System.out.println("Not prime number");
		  }
		
		  */
		  //Group of prime number from array  -- sum of prime numbers
		/*
		  System.out.println("Enter the number : ");
		  int num=scanner.nextInt();
		int array[]=new int[num];
		int add=0;
		System.out.println("Enter Array Numbers : ");
		for(int i=0;i<num;i++)
		{
		array[i]=scanner.nextInt();
		}

		System.out.println("\nPrime Numbers");
		        for(int i=0; i<num; i++)
		        {
		           int c=0;
		            for(int j=1; j<=array[i]; j++)
		            {
		                if(array[i]%j==0)
		                {
		                    c++;
		                }
		            }

		            if(c==2)
		            {
		                System.out.println(array[i]+" " +"is prime number");
		                add=add+array[i];

		            }
		        }
		        System.out.println(add);

		  */

		//For set of numbers
		/*
		
		System.out.println("Enter the number : ");
		  int num=scanner.nextInt();


		for(int j=2;j<=num;j++)
		{
		int count=0;
		         for(int i=1;i<=j;i++)
		         {
		            if(j%i==0)
		            {
		               count++;
		            }
		         }
		         if(count==2)
		         System.out.println(j+" " +" is a prime number");
		      }

		       */

		//7.palindrome  - Reverse the num
		/*
		int num=121;
		int rev=0,rem;
		int orgnum=num;


		while(num!=0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		  System.out.println(rev);

		  if(rev==orgnum)
		  {
		  System.out.println("Given number is palindrome");
		  }

		  else
		  {
		  System.out.println("Not palindrome");
		  }

		//For String
		String s="Ramar";
		String s1=""; //Dont give space when declaring s1
		char c[]=s.toCharArray();
		for(int i=(s.length()-1);i>=0;i--)
		{
		s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.toLowerCase().equals(s1.toLowerCase()))
		{
		System.out.println("palindrome for string");
		}
		else
		{
		System.out.println("No palindrome");
		}

	*/

		//8.Factorial
		           //For single number
		/*
		  int i,fact=1;
		  int number=5;//It is the number to calculate factorial
		  for(i=1;i<=number;i++)
		  {
		      fact=fact*i;
		  }
		  System.out.println("Factorial of "+number+" is: "+fact);
		*/
         /*
		//9.Fibonacci
		
		  int n1=0,n2=1,n3,i,count=10;
		  System.out.print(n1+" "+n2);//printing 0 and 1

		  for(i=2;i<=count;i++)//loop starts from 2 because 0 and 1 are already printed
		  {
		   n3=n1+n2;
		   System.out.print(" "+n3);
		   n1=n2;
		   n2=n3;
		  }

		*/


		//10.Perfect number
		/*
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
		if(num%i==0)
		{
		sum=sum+i;
		}
		}
		if(sum==num)
		{
		System.out.println("Given number is perfect ");
		}
		else
		{
		System.out.println("Not a perfect number");
		}
		*/

		//11.Strong number
		//1,2,145,40585
		//logic ===1!+4!+5! should be equal to 145 ==> 1+24+120
		/*
		int n,b,c,lastdig;
		System.out.println("Enter the number");
		n=scanner.nextInt();
		int total=0;
		int backup=n;
		while(n!=0)
		{
		b=1;
		c=1;
		lastdig=n%10;
		while(b<=lastdig)
		{
		c=c*b;
		b++;
		}
		  total=total+c;
		  n=n/10;
		}
		if(total==backup)
		{
		System.out.println(backup+" is a Strong number");
		}
		else
		{
		System.out.println(backup+"is not a strong number");
		}
		System.out.println(" ");
		*/
		//12.Swapping with variable
		/*
		int a=5;
		int b=6,c;
		c=b;
		b=a;
		System.out.println(c+ " "+ b);
		//without variable
		int d=7,e=8;
		d=d+e;
		e=d-e;
		d=d-e;
		System.out.println("d value is :" +d+"  "+ "e value is: "+e);
		*/
		//13.Armstrong
		/*
		
		//0, 1, 153, 370, 371 and 407
		        int n = 370;
		        int temp = n;
		        int p = 0;


		        while (n > 0)
		        {

		            int rem = n % 10;
		            p = (p) + (rem * rem * rem);
		            n = n / 10;
		        }

		        if (temp == p)
		        {
		            System.out.println("Yes. It is Armstrong No.");
		        }
		        else
		        {
		            System.out.println("No. It is not an Armstrong No.");
		        }
		        
		        */
		
		     //14.prime palindrome
		        //11, 101, 131, 151,
		//declare and initialize variables
		      /*
		        int number, temp, rem, i;
		        int count = 0;
		        int sum = 0;

		        System.out.println("Enter number to check");
		        //get input from user
		        number = scanner.nextInt();

		        temp = number;

		        for(i = 1; i <= temp; i++)
		        {
		            if(temp%i == 0)
		            {
		                count++;
		            }
		        }

		        while(number > 0)
		        {
		            rem = number%10;
		            sum = sum*10+rem;
		            number = number/10;
		        }


		        if(temp == sum && count == 2)
		        {
		            System.out.println(temp +" is a PalPrime number");
		        }
		        else
		        {
		            System.out.println(temp +" is not a PalPrime number");
		        }
		*/
	}

}
