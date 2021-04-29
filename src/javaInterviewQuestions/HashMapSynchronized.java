package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSynchronized
{

	public static void main(String[] args) 
	{
		
		HashMap m = new HashMap();
		m.put(101,"Naveen");
		m.put(102, "Nadeem");
		System.out.println(m);
		
		Map m1= Collections.synchronizedMap(m);
		System.out.println(m1);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ABC");
		al.add("124");
		
		List l = Collections.synchronizedList(al);
		
		System.out.println(l);
		

	}

}
