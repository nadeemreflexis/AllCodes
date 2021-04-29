package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort 
{
	public static void main(String[] args) 
	{
	     //	String[] inputlist = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
		//		"aug", "Sep", "Oct", "nov", "Dec" };
		Integer[] x= {23,245,332,18,29,302};
		
		System.out.println("----Input list-----");
		showlist(x);
		
		Arrays.sort(x);
		
		System.out.println("\n---Sorted list in ascending order-----");
		showlist(x);
		
		Arrays.sort(x, Collections.reverseOrder());
		
		System.out.println("\n---Sorted list in descending order-----");
		showlist(x);
		
		
		/*System.out.println("----Input list-----");
		showlist(inputlist);
		
		Arrays.sort(inputlist);
		
		System.out.println("\n---Sorted list-----");
		showlist(inputlist);
		
		System.out.println("\n----Sorted list(case sensitive)----");
		Arrays.sort(inputlist, String.CASE_INSENSITIVE_ORDER);
		showlist(inputlist);
		*/
	
	}
	public static void showlist(Integer[] x)
	{
		for(Integer str:x)
		{
			System.out.print(str+" ");
		}
	System.out.println();	
	}
}