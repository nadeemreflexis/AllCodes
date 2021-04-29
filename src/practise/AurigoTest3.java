package practise;

public class AurigoTest3 
{
	static final int MAX_CHAR = 256;

	public static void main(String[] args) 
	{
		
		String str = "abbbccbd";
		int count[] = new int[MAX_CHAR];
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		char ch[] = new char[len];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]= str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch[j])
				{
					find++;
				}
				
			}
			if(find==2)
			{
				System.out.println("Number of occurrence of "+ch[i]+" is::"+count[str.charAt(i)]);
			}
		}
		
		

	}

}
