package javaInterviewQuestions;

public class ReverseFunction {

	public static void main(String[] args) 
	{
		reverseFunction(12345);
		

	}
	
	public static void reverseFunction(int x)
	{
		int rev=0;
		while(x>0)
		{
			rev = rev*10 + x%10;
			x =x/10;
		}
		System.out.println(rev);
	}

}
