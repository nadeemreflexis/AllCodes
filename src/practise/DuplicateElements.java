package practise;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		String s = "Nadeem";
		char ch[] = s.toCharArray();
       
		Set<Character> ls = new LinkedHashSet<>();
		for(Character ch1:ch)
		{
			ls.add(ch1);
			
		}
		
		System.out.println(ls);
		
	}

}
