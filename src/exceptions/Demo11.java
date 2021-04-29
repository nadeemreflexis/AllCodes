package exceptions;

public class Demo11 {


	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
	    Demo11.Mymethod();
		System.out.println("Stop of java program");	
	}
	public static int Mymethod()
	{
		try 
		{
			System.out.println("Inside try block-- MyMethod");
			return 999 ;
		}
		finally
		{
			System.out.println("Inside finally block");
			System.out.println("Finally block ran even after return statement");
		}
		
	}

}
