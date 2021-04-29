package exceptions;

public class Demo12 {

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
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Stop of java program");
		
	
	}


}
