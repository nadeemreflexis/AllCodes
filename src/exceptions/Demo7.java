package exceptions;

public class Demo7 {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		int[] a = {10,20,30};
		try
		{		
			System.out.println(10/0);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block -- arithmetic exception");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block - Exception");
			System.out.println(e);
		}
		System.out.println("Stop of java program");
	}

}
