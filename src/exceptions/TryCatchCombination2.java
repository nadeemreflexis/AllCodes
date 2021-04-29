package exceptions;

public class TryCatchCombination2 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Alternative approach");
				System.out.println(10/2);
			}
			int[] a = {10,20,30};
			System.out.println(a[20]);
		}
		catch(Exception e)
		{
			try
			{
				System.out.println(20/0);
			}
			catch(Exception e1)
			{
				System.out.println("Inside inner catch block");
			}
			System.out.println("Inside catch block");
		}
		System.out.println("Stop of java program");
		
	}

}
