package javaInterviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) 
	{
		int num[] = {-1,0,1,2,3,5,6};
		int sum =0;
		for(int i=0;i<num.length;i++)
		{
			sum = sum + num[i];
		}
		
		int sum1=0;
		for(int i=-1;i<=6;i++)
		{
			sum1 = sum1+i;
		}
		int diff = sum1-sum;
     System.out.println("MissingNumber in an array is:: "+diff);
	}

}
