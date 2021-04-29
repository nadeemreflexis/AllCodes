package exceptions;

public class HandleArithmeticException {

	public static void main(String[] args) 
	{
		System.out.println("Start of java program");
		try
		{
			System.out.println(10/0); // internally jvm will create an object new ArithmeticException()
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second approach");
			System.out.println(10/2);
		}
		System.out.println("Stop of java program"); 
	}

}
