package arraylistConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) 
	{
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Sam");
		studentList.add("Lisa");
		
		// typical for loop
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
		
		System.out.println("----------------------");
		
		// for each loop
		for(String s:studentList)
		{
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
		// JDK 8 - streams with lamba
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("----------------------");
		
		// Iterator
		Iterator<String> itr=studentList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
