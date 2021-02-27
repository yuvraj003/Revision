package pkg1;

import java.util.Scanner;

public class Class7_3 extends Class7_1
{
	public void Arithmetic()
	{
		System.out.println("Please Enter the Value of a");
		Scanner dis = new Scanner(System.in);
		int a = dis.nextInt();
		System.out.println("Please Enter the Value of b");
		int b = dis.nextInt();
		dis.close();
		int c;
		c=a-b;
		System.out.println("Result of Substraction is "+c);
	}
	
	
	public static void main(String[] args) 
	{
		Class7_3 ref = new Class7_3();
		ref.Arithmetic();
		ref.Display1();
		
	}

}
