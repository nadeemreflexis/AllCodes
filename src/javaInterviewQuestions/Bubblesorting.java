package javaInterviewQuestions;

public class Bubblesorting 
{
	
	static void bubbleSort(int[] x)
	{
		int n=x.length;
		int a=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(x[j-1]>x[j])
				{
					// swap elements
					a= x[j-1];
					x[j-1]=x[j];
					x[j]=a;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
	    int x[] = {23,245,332,18,29,302};         
		
		System.out.println("Array before bubble sort");
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
    System.out.println();
    
    bubbleSort(x); // sorting array elements using bubble sort
    
    System.out.println("Array after bubble sort");
    for(int i=0;i<x.length;i++)
    {
    	System.out.print(x[i]+" ");
    }
   
    
	}

}
