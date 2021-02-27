package pkg1;

public class Class5_1 
{
	public Class5_1()
	{
		this(65,85,42);
		System.out.println("Parent Default constructor");
	}

	public Class5_1(int a)
	{
		this();
		System.out.println("Parent one Paramterized Constructor");
	}
	
	public Class5_1(int a,int b)
	{
		this(3);
		System.out.println("Parent two Parametrized Constructor");
	}
	
	public Class5_1(int a,int b,int c)
	{
		System.out.println("Parent three Parametrized Constructor");
	}
	
}
