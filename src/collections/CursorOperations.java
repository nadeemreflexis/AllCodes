package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorOperations 
{
	// remove heterogeneous elements using iterator cursor
	
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Success");
		al.add(20.5f);
		al.add(30.5);
		System.out.println(al);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
			if(o.equals(10))
			{
				i.remove();
			}
			
		}
		System.out.println("Removed element from iterator"+al);
		//After removal of element again iterate
		Iterator i1 = al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}

}
