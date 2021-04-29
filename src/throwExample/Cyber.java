package throwExample;

public class Cyber 
{
	void m1()
	{
		System.out.println("Inside m1 method");
		try
		{
			throw new ArithmeticException("This is an arithmetic error");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception of type arithmetic has been handled");
		}
	}
	public static void main(String[] args) 
	{
      		
		Cyber c = new Cyber();
		c.m1();
	}

}
