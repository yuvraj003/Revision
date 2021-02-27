package pkg1;

import java.util.Scanner;

public class Class7_2 extends Class7_1
{
	public void Arithmetic()
	{
		System.out.println("Please Enter the Value of a and b ");
		Scanner yuv= new Scanner(System.in);
		int a = yuv.nextInt();
		int b=yuv.nextInt();
		yuv.close();
		int c;
		c=a+b;
		System.out.println("Sum is "+c);
	}

	public static void main(String[] args) 
	{
		Class7_2 obj =new Class7_2();
		obj.Arithmetic();
		obj.Display1();
		
	}
}
