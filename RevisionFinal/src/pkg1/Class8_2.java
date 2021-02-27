package pkg1;

import java.util.Scanner;

public class Class8_2 //Swap two number using third variable
{
	public static void main(String[] args) 
	{
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Value of a");
		int a = s.nextInt();
		System.out.println("Enter the Value of b");
		int b = s.nextInt();
		s.close();
		
		int c = a;
		a=b;
		b=c;
		
		System.out.println("Swapped a with b is " +a);
		System.out.println("Swapped b with a is " +b);
	
	}
	
}
