package arraylistConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistMethods {

	public static void main(String[] args) 
	{
		ArrayList<String> languages1 = new ArrayList<String>();
		languages1.add("Java");
		languages1.add("Python");
		languages1.add("JavaScript");
		languages1.add("Ruby");
		
		System.out.println(languages1);
		
//		ArrayList<String> languages2 = new ArrayList<String>();
//		languages2.add("Testing");
//		languages2.add("Selenium");
//		
//		languages1.addAll(languages2);
//		System.out.println(languages1);
//		
//		languages1.addAll(2, languages2);
//		System.out.println(languages1);
//		
//		languages1.clear();
//		System.out.println(languages1);
		
		ArrayList<String> cloneList =(ArrayList<String>)languages1.clone();
		System.out.println("Clone arraylist ::"+cloneList);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Naveen","Steve","Tom","Lisa","Naveen","Tom"));
		names.remove(1);
		System.out.println(names);
		names.remove("Lisa");
		System.out.println(names);
		names.retainAll(Collections.singleton("Tom"));
		System.out.println(names);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num -> num%2==0);
		System.out.println("Odd numbers::"+numbers1);
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers2.removeIf(num -> num%2!=0);
		System.out.println("Even numbers::"+numbers2);
		
		
		ArrayList<Integer> mainList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(mainList.subList(2, 6));
		System.out.println(sublist);
		
		
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Selenium","Tosca","QTP","UFT"));
		Object o[] = newList.toArray();
		System.out.println(Arrays.toString(o));
		for(Object oo:o)
		{
			System.out.println((String)oo);
		}
		

	}

}
