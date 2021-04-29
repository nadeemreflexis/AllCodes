package practise;

public class Sample1 
{
	public static void m1(Exception e)
	{
		System.out.println("Exception method");
	}
	
	public static void m1(ArithmeticException ae)
	{
		System.out.println("Arithmetic Exception method");
	}
	
	public static void m1(Object o)
	{
		System.out.println("Object");
	}

	public static void main(String[] args) 
	{
		Sample1.m1(null);

	}

}
