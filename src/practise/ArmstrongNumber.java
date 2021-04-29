package practise;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		
		// Check whether a number is armstrong
		armstrongCheck(8208);

	}
	
	public static void armstrongCheck(int n)
	{
		int temp,c=0,a;
		temp = n;
		while(n>0)
		{
			a = n%10;
			c = c+(a*a*a);
			n=n/10;
		}
		
		if(temp==c)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong");
		}
		
	}

}
