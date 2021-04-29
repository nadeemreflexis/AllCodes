package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(50);
		al.add(10);
		al.add(40);
		System.out.println(al.size());
		ListIterator<Integer> li = al.listIterator(al.size());
		System.out.println("************************");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		// hasPrevious() will search last element in any collection , so listIterator(int index) will be used and listIterator() will not use in this case
		

		
		
		
	}

}
