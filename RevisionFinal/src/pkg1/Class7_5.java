package pkg1;

import java.util.Scanner;

public class Class7_5 extends Class7_1
{
	public void Arithmetic()
	{
		Scanner yuv =new Scanner(System.in);
		System.out.println("Enter the Value of a ");
		int a =yuv.nextInt();
		System.out.println("Enter the Value of b ");
		int b =yuv.nextInt();
		yuv.close();
		float c= a*b;
		System.out.println("Result of multiplication is "+c);

	}
	
	public static void main(String[] args) 
	{
		Class7_5 obj =new Class7_5();
		obj.Arithmetic();
		obj.Display1();
		
	}

}
