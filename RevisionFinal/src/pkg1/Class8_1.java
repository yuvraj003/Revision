package pkg1;

import java.util.Scanner;

public class Class8_1 //Swap two numbers without using third variable
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Value of a");
		int a = s.nextInt();
		System.out.println("Enter the Value of b");
		int b = s.nextInt();
		s.close();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped a with b is " +a);
		System.out.println("Swaaped b with a is " +b);
		
	}

}
