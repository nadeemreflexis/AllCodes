package exceptions;

public class Try_Catch {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try 
		{
			System.out.println("Inside try block ----1");
			System.out.println(10/0);
			System.out.println("Inside try block ----2");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		System.out.println("Stop of java program");
		

	}

}
