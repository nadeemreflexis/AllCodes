package practise;

public class AurigoTest 
{
	public void Add(int a, int b)
	{
		System.out.println("Inside parent add -- a and b");
	}

	public void Add(int a, int b, int c)
	{
		System.out.println("Inside add -- a,b and c ");
	}

	public int Add(int a,float b)
	{
		return 0;
	}


}

class A extends AurigoTest
{
	public void Add(int a, int b)
	{
		System.out.println("Inside child add -- a and b");
	}

	public static void main(String[] args) 
	{
		
		AurigoTest a = new AurigoTest();
		a.Add(10, 20);
	}
	
}
