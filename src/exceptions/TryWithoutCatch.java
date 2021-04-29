package exceptions;

public class TryWithoutCatch {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			System.out.println("Inside try block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Stop of java program");
	}

}
