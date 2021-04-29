package practise;

public class StringProgram {

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
//		
	     
//	    String str = "nadeem";
//	    char ch[] = str.toCharArray();
//	    LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
//	    Integer counter = null;
//	    for(Character c:ch)
//	    {
//	    	counter = hm.get(c);
//	    	if(counter==null)
//	    	{
//	    		hm.put(c, 1);
//	    	}
//	    	else
//	    	{
//	    		hm.put(c, ++counter);
//	    	}
//	    }
//	    System.out.println(hm);
	   
	    System.out.println("-------------------------");
	    
	    String str = "Nadeem";
	    int arr[] = new int[256];
	    int len = str.length();
	    for(int i=0;i<len;i++)
	    {
	    	arr[str.charAt(i)]++;
	    }
	    char ch1[] = str.toCharArray();
	    for(int i=0;i<ch1.length;i++)
	    {
	    	int count=0;
	    	for(int j=0;j<=i;j++)
	    	{
	    		if(ch1[i]==ch1[j])
	    		{
	    			count++;
	    		}
	    	}
	    	if(count==1)
	    	{
	    		System.out.println("Number of Occurence "+ch1[i]+" is:"+arr[ch1[i]]);
	    	}
	    }
	}
	
}


