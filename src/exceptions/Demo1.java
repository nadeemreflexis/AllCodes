package exceptions;

public class Demo1 
{
	static void m1(Demo1 d)
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args) 
	{
		Demo1.m1(new Demo1());
		

	}

}
