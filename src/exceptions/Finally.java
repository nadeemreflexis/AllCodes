package exceptions;

public class Finally {

	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Stop");
		

	}

}
