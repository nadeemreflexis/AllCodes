package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveSameCharacterInString {

	public static void main(String[] args) 
	{
		String str = "Nadeem";
		char ch[] = str.toCharArray();
	    HashSet s = new HashSet();
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(s.add(ch[i]))
	    	{
	    		
	    	}
	    	s.add(ch[i]);
	    }
	    System.out.println(s);
	    
		
		

	}

}
