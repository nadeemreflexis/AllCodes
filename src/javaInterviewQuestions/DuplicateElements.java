package javaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		// 1. Comparing each element with other elements. -- worst solution -- O(n*n)
		String names[] = {"Java","JavaScript","Ruby","Python","C","Java"};
		for(int i=0;i<names.length;i++) 
		{
			for(int j=i+1;j<names.length;j++) 
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element is:: "+names[i]);
				}
			}
		
		}
		
		System.out.println("****************");
		// 2. Using HashSet -- It stores unique value -- O(n)
		Set<String> stores = new HashSet<String>();
		for(String name:names)
		{
			if(stores.add(name)==false)
			{
				System.out.println("Duplicate Element is:: "+name);
			}
		}
		System.out.println("****************");
		// 3. Using HashMap -- It stores duplicate element 
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name:names)
		{
		  Integer count = storeMap.get(name);
		  if(count == null)
		  {
			  storeMap.put(name, 1);
		  }
		  else
		  {
			  storeMap.put(name, ++count);
		  }
	    } 
      Set<Entry<String, Integer>> entryset =  storeMap.entrySet();
      for(Entry<String, Integer> entry:entryset)
      {
    	  if(entry.getValue()>1)
    	  {
    		  System.out.println("Duplicate element:: "+entry.getKey());
    	  }
      }
      
}
}
