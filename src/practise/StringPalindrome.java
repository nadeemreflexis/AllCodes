package practise;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		// Check a string is palindrome or not
		palindromeCheck("Kalak");

	}
	
	public static void palindromeCheck(String str)
	{
		int n = str.length();
		boolean flag = true;
		
		str = str.toLowerCase();
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i)!=str.charAt(n-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
