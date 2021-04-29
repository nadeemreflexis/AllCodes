package throwExample;

public class TestThrow 
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) 
	{
		
     TestThrow.validate(14);
     System.out.println("rest of code");
	}

}
