package practise;

public class StringPattern {

	public static void main(String[] args) 
	{
		 char ch= 'a';
		 int x = ch;
	     for(int i=1;i<=26;i++)
	     { 
	    	for(int j=1;j<=i;j++)
	    	{
	    		if(x%2==0)
	    		{
	    		System.out.print(Character.toUpperCase((char)x));
	    		}
	    		else
	    		{
	    			System.out.print((char)x);
	    		}
	    	}
	    	x++;
	     }
		

	}

}
