package exceptions;

public class Demo8 {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			System.out.println("Inside try block");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Stop of java program");
		

	}

}
