package exceptions;

public class Demo2 {

	public static void main(String[] args) 
	{
		System.out.println("Start @ java program");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
			System.out.println(10/0);
			
		}
		System.out.println("Stop @ java program");
		

	}

}
