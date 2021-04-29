package practise;

import java.util.Scanner;

public class Palindrome
{
	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number for palindrome");
	int n = sc.nextInt();
	int n1=n;
	int rev=0;
	while(n1>0)
	{
	rev = rev*10+n1%10;
	n1=n1/10;
	}
	if(n==rev)
	{
	System.out.println("Palindrome number::"+n);
	}
	else
	{
		System.err.println("It is not palindrome number");
	}
	sc.close();
	}
	

}
