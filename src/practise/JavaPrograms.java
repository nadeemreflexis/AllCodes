package practise;

import java.util.HashSet;
import java.util.Set;

public class JavaPrograms {

	public static void main(String[] args) 
	{
		String[] sample = {"0,1,0,3,4,3"};
		String s = sample[0];
		String s1 = s.replaceAll(",","");
		char[] ch = s1.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		for(Character c:ch)
		{
			charSet.add(c);
		}
		System.out.println(charSet);
		
	}

}
