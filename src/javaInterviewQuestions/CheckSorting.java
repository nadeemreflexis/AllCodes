package javaInterviewQuestions;

import java.util.Arrays;

public class CheckSorting {

	public static void main(String[] args) 
	{
		int x[] = {1,2,4,6,7,8,9,10};
		String temp = Arrays.toString(x);
	    int a=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=1;j<(x.length)-i;j++)
			{
				if(x[j-1]>x[j])
				{
					a=x[j-1];
					x[j-1]=x[j];
					x[j]=a;
				}
			}
		}
		
		String sorted = Arrays.toString(x);
		
		
		if(temp.equals(sorted))
		{
			System.out.println("sorted.....");
		}
		else
		{
			System.out.println("unsorted....");
		}
		

	}
	
}
