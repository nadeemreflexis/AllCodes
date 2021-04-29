package practise;

public class AurigoTest2 {

	public static void main(String[] args) 
	{
		int x= 123;
		int rev =0;
		
		while(x>0)
		{
			rev = rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		

		
		

	}

}
