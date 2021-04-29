package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumberOfProductMax {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int x[] = {-1, -3, -4, 2, 0, -5};
		

//		int a = x[0], b = x[1] , c;
//		for(int i=0;i<x.length;i++)
//		{
//		for(int j=i+1;j<x.length;j++)
//		{
//		c = a*b;
//		try{
//		if(c < x[i]*x[j])
//		{
//		   c = x[i]*x[j];
//		   a=x[i];
//		   b=x[j];
//		}
//		}
//		catch(Exception e)
//		{
//		System.out.println("Exception handle for array out of bound exception");
//		}
//		}
//		}
//		System.out.println("Two numbers are:"+a+","+b);
        
		int n = x.length;
		Arrays.sort(x);
		// Calculate the product of two smallest numbers
		int product1 = x[0]*x[1];
		// Calculate the product of two largest numbers
		int product2 = x[n-1]*x[n-2];
		
		if(product1>product2)
		{
			num1=x[0];
			num2=x[1];
		}
		else
		{
			num1=x[n-1];
			num2=x[n-2];
		}
		
		System.out.println("Two numbers are::"+num1+" "+num2);
		

	}

}
