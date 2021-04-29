package Abstraction;

public class BankTest 
{

	public static void main(String[] args) 
	{
	   
		HDFC hb = new HDFC();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.theftsafe();
		
		//Dynamic polymorphism
		Bank b = new HDFC();
		b.credit();
		b.debit();
		

		
		
	}

}
