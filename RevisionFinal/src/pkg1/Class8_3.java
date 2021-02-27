package pkg1;

import java.util.Scanner;

public class Class8_3 //to print a table of a given number
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of which you want to print the table");
		int a = s.nextInt();
		s.close();
		for (int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
		
	}

}
