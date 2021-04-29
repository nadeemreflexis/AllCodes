package arraylistConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo {

	public static void main(String[] args) 
	{
		// Default class
		// Dynamic array
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add(12.33);
		ar.add('A');
		
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		System.out.println("LI = "+0);
		System.out.println("HI = "+(ar.size()-1));
		//System.out.println(ar.get(6)); // IndexOutOfBoundsException
		
		ar.add(400);
		ar.add(500);
		ar.add("Selenium");
		System.out.println(ar.size());
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#"));
		System.out.println(ar2);

	}

}
