package arraylistConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) 
	{
		// 1. Use synchronizedList method to achieve synchronized arraylist
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Tom");
		nameList.add("Steve");
		nameList.add("Lisa");
		
		// for add and remove, we don't need explicit synchronization
		
		// to fetch or traverse object from list, we have to need explicit synchronization
		synchronized (nameList) 
		{
			Iterator<String> itr=nameList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		System.out.println("-------------------");
		
		// 2. Use CopyOnWriteArraylist class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>(Arrays.asList("Avinash","Nadeem","Mahir"));
		Iterator<String> itr=empList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
