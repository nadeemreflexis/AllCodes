package exceptions;

public class Demo5 {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		int[] a = {10,20,30};
		try
		{
			System.out.println(10/2);
			System.out.println(a[20]);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			System.out.println(e);
		}
		System.out.println("Stop of java program");
		

	}

}
