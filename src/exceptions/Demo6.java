package exceptions;

public class Demo6 {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae1)
		{
			System.out.println("Inside catch block--ae1");
		}
		catch(ArithmeticException ae2)
		{
			System.out.println("Inside catch block--ae2");
		}
		
	}

}
