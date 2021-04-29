package practise;

import java.util.ArrayList;
import java.util.Collections;

public class Demo123 {

	public static void main(String[] args) 
	{
		int x[] = {87,4,6,4,3,7,0,3};	
		
		ArrayList<Integer> al = new ArrayList<>();
		for(Integer i:x)
		{
			al.add(i);
		}
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("Sorted array ::"+al);
		
		
		System.out.println("Minimum number is::"+al.get(0));
		
		System.out.println("Maximum number is::"+al.get(al.size()-2));
		
		System.out.println("20"+10+20);	
	
		
		

	}

}
