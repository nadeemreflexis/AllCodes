package practise;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) 
	{
		
		Integer x[] = {6,13,21,2,13,36,21,11,7,12};
		
	
		Set<Integer> s = new LinkedHashSet<>();  //O(n)
		for(Integer ss:x)
		{
			s.add(ss);
		}
		System.out.println(s);
		
		

		
		

	}

}
