package exceptions;

public class StackTrace {

	public void m1()
	{
		m2();
	}
	public void m2()
	{
		m3();
	}
	public void m3()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block -- AE");
			//System.out.println(ae);
			//1st approach
			System.out.println(ae.toString());
			System.out.println("-----------------------------------");
			//2nd approach
			System.out.println(ae.getMessage());
			System.out.println("-----------------------------------");
			//3rd approach
			ae.printStackTrace(); // this is not returning anything thats why not put in sopln,
			//within method printing will be happening
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		new StackTrace().m1();
		System.out.println("Stop of java program");
		
	}
	

}
