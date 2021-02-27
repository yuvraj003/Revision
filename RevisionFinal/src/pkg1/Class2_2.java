package pkg1;

public class Class2_2 
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
	public int div1(int d,int e)
	{
		int f;
		f=d/e;
		return f;
	}
	public static void main(String[] args) 
	{
		Class2_2 yuv=new Class2_2();
		int div12 = yuv.div1(10, 2);
		int sum1 = yuv.sum(div12, 2);
		int sub1 = yuv.sub(sum1, 2);
		int mul1 = yuv.mul(sub1, 2);
		int sum2 = yuv.sum(mul1, 2);
		System.out.println("Final Answer is "+sum2);
	}

}
