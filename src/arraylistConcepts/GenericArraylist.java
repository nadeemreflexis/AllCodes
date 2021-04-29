package arraylistConcepts;

import java.util.ArrayList;

public class GenericArraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
	    
		System.out.println(number);
		
		System.out.println("-----");
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(12.0);
		arD.add(100.0);
		arD.add(20.33);
 	    
		System.out.println(arD);
	    
		

	}

}
