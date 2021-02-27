package pkg1;

import java.util.Scanner;

public class Class8_8 //Factorial of a program 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		s.close();
		long a=1;
		
		for (int i=1;i<=num;i++)
		{
			a=a*i;
		}
		System.out.println("Factorial is " +a);
	}

}
