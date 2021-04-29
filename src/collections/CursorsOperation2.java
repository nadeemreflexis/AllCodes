package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsOperation2 
{
	// remove homogeneous elements using iterator cursor

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Cyber");
		al.add("Success");
		al.add("Droid");
		al.add("Trident");
		System.out.println(al);
		Iterator<String> i = al.iterator();
		while(i.hasNext())
		{
			String s = i.next();
			System.out.println(s);
		if(s.equals("Cyber"))
			{
				i.remove();
			}
		}
		System.out.println("After remove string from arraylist by iterator:" +al);

	}

}
