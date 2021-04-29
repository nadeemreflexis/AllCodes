package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class practise {

	public static void main(String[] args) 
	{
		// WAP to count words of string using hashmap
		
		String str= "I am an automation engineer";
		String str1[] = str.trim().split(" ");
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String s:str1)
		{
			if(storeMap.containsKey(s))
			{
				int count = storeMap.get(s);
				storeMap.put(s, ++count);
			}
			else
			{
				storeMap.put(s, 1);
			}		
		}
		System.out.println(storeMap);
		
		// fibonacci series
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for fibonacci series");
		int n=sc.nextInt();
		int a=0, b =1 , c;
		
		for(int i=0;i<n;i++)
		{
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		System.out.println();
		
	   Integer[] x = {23,45,67,12,34,788};
	   
	   
	   System.out.println("Before sorting:"+Arrays.toString(x));
	   
	   Arrays.sort(x);
	   
	   System.out.println("After sorting in ascending order:"+Arrays.toString(x));
	   
	   Arrays.sort(x,Collections.reverseOrder());
	   
	   System.out.println("After sorting in descending order:"+Arrays.toString(x));
	   
	   System.out.println(x[3]);
	   
	   // Bubble sort
	   
	   int x1[] = {23,45,67,12,34,788};
	   int n1=x1.length;
	   int a1=0;
	   for(int i=0;i<n1;i++)
	   {
		   for(int j=1;j<(n1-i);j++)
		   {
			   
			   if(x1[j-1]>x1[j])
			   {
				 //swap elements:
				   a1=x1[j-1];
				   x1[j-1]=x1[j];
				   x1[j]=a1;
				   
			   }
		   }
	   }
	   
	   System.out.println(Arrays.toString(x1));
	   
	   
		
	   Integer y[] = {1,2,3,4,2,5,6};
	   
	   Set<Integer> s = new HashSet<Integer>();
	   for(Integer y1:y)
	   {
		  if(s.add(y1)==false)
		  {
			  System.out.println("Duplicate element ::"+y1);
		  }
		  else
		  {
			  s.add(y1);
		  }
	   }
	   System.out.println(s);
	 
	   
	}
	
	

	
		
	
}
