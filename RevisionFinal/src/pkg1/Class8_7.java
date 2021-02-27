package pkg1;

import java.util.Scanner;

public class Class8_7 // fibonacci series
{
	public static void main(String[] args) 
	{	
		int t1 = 0, t2 = 1;
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		s.close();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
		
		
	}

}
