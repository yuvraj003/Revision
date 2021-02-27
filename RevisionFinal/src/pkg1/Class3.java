package pkg1;

public class Class3 
{
	public Class3() 
	{
		this(5,6,7);
		System.out.println("Default Constructor");
	}
	
	public Class3(int a)
	{
		this(2,3);
		System.out.println("One Parametrized Constructor");
	}
	
	public Class3(int a,int b)
	{
		this();
		System.out.println("Two Paramterized Constructor");
	}
	
	public Class3(int a,int b,int c)
	{
		System.out.println("Three Parametrized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Class3 yuv =new Class3(10);
	}

}
