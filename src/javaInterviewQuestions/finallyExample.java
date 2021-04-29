package javaInterviewQuestions;

public class finallyExample {

	public static void main(String[] args) 
	{
		int i=10;
		try
		{
			System.out.println("Inside try block");
			int k = i/0;
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		

	}

}
