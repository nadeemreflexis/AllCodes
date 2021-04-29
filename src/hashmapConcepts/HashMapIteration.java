package hashmapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) 
	{
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("null", "Berlin");
		capitalMap.put("France", "null");
		capitalMap.put("Italy", "null");
		capitalMap.remove("France");
		
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap);
		
		//1. using  iterator and use KeySet() method
		Iterator<String> keyValueSet = capitalMap.keySet().iterator();
		while(keyValueSet.hasNext())
		{
			String key = keyValueSet.next();
			String value = capitalMap.get(key);
			System.out.println("Key="+key +" and Value="+value);
			
		}
		
		System.out.println("----------------");
		//2. using iterator and use entrySet() method of Entry class
		Iterator<Entry<String, String>> entry= capitalMap.entrySet().iterator();
		while(entry.hasNext())
		{
			Entry<String,String> entry1 = entry.next();
			System.out.println("Key= "+entry1.getKey()+" Value= "+entry1.getValue());
		}
		
		//3. using Java 8 foreach method and lamba expression
		System.out.println("----------------");
		capitalMap.forEach((k,v)-> System.out.println("key = "+k+" value ="+v));
	}

}
