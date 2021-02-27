package pkg1;

import java.util.Scanner;

public class Class4_2 
{
	public static void main(String[] args) 
	{
		Scanner yuv = new Scanner(System.in);
		
		System.out.println("Value of x1:- ");
		int a= yuv.nextInt();
		
		System.out.println("Value of x2:- ");
		int b = yuv.nextInt();
		
		System.out.println("Value of x3:- ");
		int c =yuv.nextInt();
		
		System.out.println("Value of x4:- ");
		int d =yuv.nextInt();
		
		System.out.println("Value of x5:- ");
		int e =yuv.nextInt();
		
		System.out.println("Value of x6:- ");
		int f =yuv.nextInt();
		yuv.close();
		
		int g= (((((a-b)+c)*d)+e)/f);
		System.out.println("Final Value is "+g);
		
	}

}
