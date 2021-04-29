package javaInterviewQuestions;

public class javaQuestionsRedBus {

	public static void main(String[] args) 
	{
		int x[] = {44,55,66,77,11,344,110};
		int n=x.length;
		int a=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(x[j-1]<x[j])
				{
					a=x[j-1];
					x[j-1]=x[j];
					x[j]=a;
				}
			}
		}
		System.out.println("Fourth highest number in given array is::"+x[3]);
		
		System.out.println("*******************");
	    int n1=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<i+1;j++)
			{
			    
				System.out.print(n1+" ");
				n1=n1+1;
				
			}
			System.out.println();
		}
		
	 
	}
}

