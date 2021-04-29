package arraylistConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistComparison {

	public static void main(String[] args) 
	{
		//1. Sort and compare
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		Collections.sort(l3);
		
		System.out.println(l1.equals(l3));
		
		//2. find out additional element
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		
		l4.removeAll(l5);
		System.out.println("Additional Element in l4::"+l4);
		
		//3. find out missing element
		
        ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		
		l7.removeAll(l6);
		System.out.println("Missing Element in L6::"+l7);
		
		//4. find common elements 
		 ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA","Python","C#","JS","Ruby"));
			
		 ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA","Python","C#","JS","PHP"));
		
		 lang1.retainAll(lang2);
		 
		 System.out.println(lang1);

	}

}
