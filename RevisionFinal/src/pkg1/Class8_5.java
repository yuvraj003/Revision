package pkg1;

import java.util.Scanner;

public class Class8_5  // palindrome
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a=s.nextInt();
		int z=a;
		s.close();
		
		int b=0;
		while(a>0)
		{
			int r=a%10;
			b=b*10+r;
			a=a/10;
		}
		
		if(z==b)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not palindrome");
		}
		
		
	}

}
