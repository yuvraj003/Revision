package pkg1;

import java.util.Scanner;

public class Class8_6 //Armstrong number
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = s.nextInt();
		s.close();
		int z=a;
		int b=0;
		
		while(a>0)
		{
			int r=a%10;
			b=b+(r*r*r);
			a=a/10;
		}
		
		if(z==b)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
		
	}

}
