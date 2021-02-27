package pkg1;

public class Class5_4 extends Class5_3
{
	public void m2()
	{
		this.m2(2,3,4);
		System.out.println("Child Default Method");
	}
	
	public void m2(int a)
	{
		this.m2();
		this.m2(1,2);
		System.out.println("Child 1 Para Method");
	}
	
	public void m2(int a,int b)
	{
		System.out.println("Child 2 Para Method");
	}
	
	public void m2(int a,int b,int c)
	{
		super.m1(2,3,9);
		super.m1();
		super.m1(3,45);
		super.m1(2);
		System.out.println("Child 3 Para Method");
	}

	public static void main(String[] args) 
	{
		Class5_4 obj = new Class5_4();
		obj.m2(1);
	}

}
