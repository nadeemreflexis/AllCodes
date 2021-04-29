package practise;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) 
	{
		int[] inp = {1,2,3,4,5,6,7,8,4,10,11,12,4};
        int n = inp.length;
        int loc=5,k=0,j=0,l=0;
        int[] a = new int[loc];
        int[] b = new int[loc];
        int[] c = new int[n-(a.length+b.length)];

        for (int i = 0; i < loc; i++)
        {
            a[k]=inp[i];
            k++;
        }
        for(int i=loc;i<2*loc;i++)
        {
        	b[j]=inp[i];
        	j++;
        }
        for(int i=2*loc;i<n;i++)
        {
        	c[l]=inp[i];
        	l++;
        }
 
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        
 
		

	}

}
