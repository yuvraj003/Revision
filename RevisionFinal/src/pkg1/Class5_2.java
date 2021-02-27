package pkg1;

public class Class5_2 extends Class5_1
{
	public Class5_2()
	{
		this(6,7);
		System.out.println("Child Default Constructor");
	}
	
	public Class5_2(int a)
	{
		this();
		System.out.println("Child One Parametrized Constructor");
	}
	
	public Class5_2(int a, int b)
	{
		super(2,3);
		System.out.println("Child Two Parametrized Constructor");
	}
	
	public Class5_2(int a,int b,int c)
	{
		this(1);
		System.out.println("Child Three Parametrized Constructor");
	}

	public static void main(String[] args) 
	{
		Class5_2 obj =new Class5_2(2,3,4);
	}
}
