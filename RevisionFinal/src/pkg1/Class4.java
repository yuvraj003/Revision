package pkg1;

public class Class4 
{
	public void Method()
	{
		System.out.println("Default Method");
	}
	
	public void Method(int a)
	{
		System.out.println("One Paramterized Method");
	}
	
	public void Method(int a,int b)
	{
		this.Method(34,35,36);
		this.Method();
		this.Method(32);
		this.Method(10, 20, 30, 40);
		System.out.println("Two Paramterized Method");
	}
	
	public void Method(int a,int b,int c)
	{
		System.out.println("this is Three Parametrized Method");
	}
	
	public void Method(int a,int b,int c,int d)
	{
		System.out.println("This is Four Paramterized Method");
	}
	
	public static void main(String[] args) 
	{
		Class4 yuv=new Class4();
		yuv.Method(10, 20);	
	}

}
