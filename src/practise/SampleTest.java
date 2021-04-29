package practise;

import java.util.Arrays;

public class SampleTest {

	public static void main(String[] args) 
	{
		String str = "My name is Nadeem";
		char ch[] = str.toCharArray();
		int x[] = new int[ch.length];
		int y;
		for(int i=0;i<ch.length;i++)
		{
			x[i] = ch[i];
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=1;j<x.length-i;j++)
			{
				if(x[j-1]>x[j])
				{
					y=x[j-1];
					x[j-1]=x[j];
					x[j]=y;
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			ch[i]=(char) x[i];
		}
		System.out.println(Arrays.toString(ch));
		String s = String.valueOf(ch);
		System.out.println(s);
		
	}
	
	

}
