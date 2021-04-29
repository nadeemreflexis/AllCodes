package javaInterviewQuestions;

public class FinalVariableAccessStaticBlock {

	public static void main(String[] args) 
	{
		System.out.println(Main.x); // Output: 100 , it will not execute static block reason is :: Main class is not executed because Main.x is 
		                             //  treated like 100 , like this:: System.out.print(100);
		
	}
	
}
class Main
{
	public static final int x=100;
	
	static
	{
		System.out.println("Main--static block");
	}
}
