package pkg1;

import java.util.Scanner;

public class Class7_4 extends Class7_1
{
	public void Arithmetic()
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the Value of a ");
		float a = abc.nextFloat();
		System.out.println("Enter the Value of b ");
		float b = abc.nextFloat();
		abc.close();
		float c = a/b;
		int d =(int)c;
		System.out.println("Result of divion is : "+d);
	}
	
	public static void main(String[] args) 
	{
		Class7_4 yuv= new Class7_4();
		yuv.Arithmetic();
		yuv.Display1();
	}

}
