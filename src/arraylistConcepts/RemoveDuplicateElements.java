package arraylistConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) 
	{
		//1 approach by using linkedhashset
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,6,7,7,8,9));
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(uniqueNumbers);
		
		//2 JDK 8- by using stream method
		
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,6,7,7,8,9));
		
		List<Integer> uniqueMarklist= markList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueMarklist);

	}

}
