package practise;

import java.util.HashMap;

public class StringOccurrence123 {

	public static void main(String[] args) 
	{
		String str = "aaabbccccdd";
		
		char ch[] = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		Integer counter;
		for(Character c:ch)
		{
			counter =hm.get(c);
			if(counter==null)
			{
				hm.put(c, 1);
			}
			else
			{
				hm.put(c,++counter);
			}
				
		}
		System.out.println(hm);
		

	}

}
