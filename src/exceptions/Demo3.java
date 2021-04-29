package exceptions;

public class Demo3 {

	public static void main(String[] args) 
	{
		System.out.println("Start");
		int a[] = {10,20,30};
		try 
		{
			System.out.println(10/0);
			System.out.println(a[20]);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block -- handle arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside catch block -- handle array exception");
		}
		System.out.println("Stop");
	}
}
