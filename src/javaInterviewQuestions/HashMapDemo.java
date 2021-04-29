package javaInterviewQuestions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put(101,"Nadeem");
		hm.put(102, "Avinash");
		hm.put(103, "Mayur");
		hm.put(104, "Arif");
		System.out.println(hm);
		System.out.println(hm.put(102, "Anirban")); // print old value and replace with new object
		System.out.println(hm);
		Set keys = hm.keySet();
		System.out.println(keys);
		Collection values = hm.values();
		System.out.println(values);
	    Set<Entry> s1= hm.entrySet();
	    
	    for(Entry m1:s1)
	    {
	    	System.out.println(m1.getKey()+"----"+m1.getValue());
	    	if(m1.getKey().equals(104))
	    	{
	    		m1.setValue("Mahir");
	    	}
	    }
	    
	 /*   Iterator itr = s1.iterator();
	    while(itr.hasNext())
	    {
	    	Entry m1=(Entry) itr.next();
	    	System.out.println(m1.getKey()+"----"+m1.getValue());
	    	if(m1.getKey().equals(104))
	    	{
	    		m1.setValue("Mahir");
	    	}
	    }
	    */
	    System.out.println(hm);
		
		
		
		

	}

}
