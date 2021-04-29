package practise;

public class ScientificGame {

	public static void main(String[] args) 
	{
		String str = "abbbccbd";
		int count[] = new int[256];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch[j])
				{
					find++;
				}
			}
			if(find>1)
			{
				System.out.println("Number of occurrence::"+ch[i]+"is::"+count[str.charAt(i)]);
			}
			    
		}
		
	}
	

}

	
      
   





















