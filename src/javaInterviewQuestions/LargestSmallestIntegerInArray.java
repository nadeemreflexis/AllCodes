package javaInterviewQuestions;

import java.util.Arrays;

public class LargestSmallestIntegerInArray 
{

	public static void main(String[] args) 
	{
       int num[] = {-9,1,3,4,5,81,99999};
       
       int largestInteger = num[0];
       int smallestInteger = num[0];
       
       for(int i=0;i<num.length;i++)
       {
    	   if(largestInteger < num[i])
    	   {
    		   largestInteger=num[i];
    	   }
    	   else if(smallestInteger > num[i])
    	   {
    		   smallestInteger = num[i];
    	   }
       }
       System.out.println("\nGiven array is: "+Arrays.toString(num));
       System.out.println("Largest interger in given array is:" +largestInteger);
       System.out.println("Smallest interger in given array is:" +smallestInteger);
       
		
	}

}
