package exceptions;

public class Demo14 
{
	public static void main(String[] args) 
	{
				System.out.println("Start of java program");
				System.out.println(10/0);
				try
				{
					System.out.println("Inside try block");
					System.out.println(10/0);
				}
				catch(ArithmeticException ae)
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
