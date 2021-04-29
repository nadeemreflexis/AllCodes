package javaInterviewQuestions;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of count for fibonacci series:");
		int count = s.nextInt();
		int n1=0,n2=1,n3;
		for(int i=0;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	

	}

}
