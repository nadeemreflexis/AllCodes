package practise;

import java.util.Arrays;

public class BalanceBrackets {

	public static void main(String[] args) 
	{
		String str = "Graduate with almost 3 years of work-experience in Automation & Manual Testing";
		
		char ch1[] = str.toCharArray();
		//System.out.println(Arrays.toString(str1));
		char ch2[] = {'a','e','i','o','u'};
  
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				
				if(ch1[j]==ch2[i])
				{
					ch1[j] = ' ';
				}
			}
			
		}
		System.out.println(Arrays.toString(ch1));
		String str2 = String.valueOf(ch1);
		System.out.println(str2);
		
		
		
	
		
		

	}
	
	

}
