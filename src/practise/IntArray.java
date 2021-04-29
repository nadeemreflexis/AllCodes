package practise;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) 
	{
		//int x[] = {2,7,11,13,9};
		int[] x = new int[] {5,7,11,13,4};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				int sum = x[i]+x[j];
				if(sum==9)
				{
					int[] y = {x[i],x[j]};
					System.out.println(Arrays.toString(y));
				}
			}
		}
		

	}

}
