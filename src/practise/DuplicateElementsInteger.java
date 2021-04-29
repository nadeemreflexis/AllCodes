package practise;

import java.util.Arrays;

public class DuplicateElementsInteger {

	public static void main(String[] args) 
	{
		int x[] = {1,2,3,3,2,4,5,2,2,6,7};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					x[j]=0;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	    

	}

}
