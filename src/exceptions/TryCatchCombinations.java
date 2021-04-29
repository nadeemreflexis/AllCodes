package exceptions;

public class TryCatchCombinations 
{

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			int[] a = {10,20,30};
			System.out.println(a[20]);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			try
			{
				System.out.println(10/0);
				//System.out.println("Inside inner try block");
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Alternative approach");
				System.out.println(10/2);
			}
		}
		
	}

}
