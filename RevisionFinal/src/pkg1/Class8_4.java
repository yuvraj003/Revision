package pkg1;

import java.util.Scanner;

public class Class8_4 //Prime or not
{
	public static void main(String[] args) 
	{
		boolean isPrime=true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a= s.nextInt();
		s.close();
		for(int i=2;i<=a-1;i++)
		{
		   if(a%i==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(a + " is a Prime Number");
		else
		   System.out.println(a + " is not a Prime Number");
		
	}

}
