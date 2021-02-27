package pkg1;

public class Class1 
{
	int age;
	int roll_no;
	
	public void yuvraj()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void vijay()
	{
		System.out.println("Welcome guys");
	}
	
	public static void main(String[] args) 
	{
		Class1 yuv=new Class1();
		yuv.age=12;
		yuv.roll_no=23;
		System.out.println("Age ="+yuv.age);
		System.out.println("roll_no ="+yuv.roll_no);
		yuv.yuvraj();
		yuv.vijay();
		
	}

}
