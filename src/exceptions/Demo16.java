package exceptions;

public class Demo16 {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			try
			{
				int a []= {10,20,30};
				System.out.println(a[20]);
			}
			catch(Exception e)
			{
				System.out.println("Inside catch block -- finally block");
				
			}
			
		}
		System.out.println("Stop of java program");
	

	}

}
