package javaInterviewQuestions;

public class NumberDivideByZeroOutput {

	public static void main(String[] args) 
	{
		
		System.out.println(9.0/0); // It will print Infinity not throwing arithmetic exception
		System.out.println(12.33f/0);
		System.out.println(12.0d/0);
		System.out.println(9/0.0);
		System.out.println(0.0/0);  // NaN -- it means null
		System.out.println(0.0/0.0); // NaN
		
	}
}
