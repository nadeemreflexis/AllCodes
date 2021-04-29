package javaInterviewQuestions;

public class PrintNumbersWithoutUsingNumbers 
{
	// Print numbers from 1 to 100 without using numbers in your code

	public static void main(String[] args) 
	{
		//1st approach
		int one = 'A'/'A';
		String s = "..........";
		System.out.println("Numbers with 1st Approach");
		for(int i=one;i<=(s.length()*s.length());i++)
		{
			System.out.print(i+" ");
		}
	    System.out.println();
		//2nd approach ASCII value a=97,b=98,c=99,d=100
		System.out.println("Numbers with 2nd Approach");
		for(int i=one;i<='d';i++)
		{
			System.out.print(i+" ");
		}
		
				
		
	}

}
