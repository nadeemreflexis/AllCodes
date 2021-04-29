package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByjusProgram {

	public static void main(String[] args) 
	{
		String str[] = {"India", "Korea", "china", "canada", "japan"};
	
		for(int i=0;i<str.length;i++)
		{

			char[] ch = str[i].toLowerCase().toCharArray();
			Set<Character> s = new HashSet<Character>();
			for(Character c: ch)
			{
				if(s.add(c)==false)
				{
					str[i] = ""; 
				}
			}
			
		}
		System.out.println(Arrays.toString(str));
		
		
		

	}

}
