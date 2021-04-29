package arraylistConcepts;

import java.util.ArrayList;

public class ArrayListVirtualCapacity {

	public static void main(String[] args) 
	{
		// Default capacity =10
		
		ArrayList<Object> arr = new ArrayList<Object>();
		
		System.out.println(arr.size()); // Physical capacity=0 
		
		arr.add(100);  
		
		System.out.println(arr.size()); // Physical capacity=1
		
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		System.out.println(arr.size()); // Physical capacity=4
		
		
		
	

	}

}
