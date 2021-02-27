package pkg1;

public class Class2_1 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	public int mul(int l,int m)
	{
		int n;
		n=l*m;
		return n;
	}
	public void div(int d,int e)
	{
		int f;
		f=d/e;
		System.out.println("Final result is "+f);
	}
	public static void main(String[] args) 
	{
		Class2_1 yuv=new Class2_1();
		int sum1 = yuv.sum(10, 2);
		int sub1 = yuv.sub(sum1, 2);
		int sum2 = yuv.sum(sub1, 2);
		int mul1 = yuv.mul(sum2, 2);
		yuv.div(mul1, 2);
	}

}
